import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ClientGui extends JFrame implements ActionListener {

	JTextArea jta = new JTextArea();
	JTextField jtf = new JTextField(15);
	JButton btnTransfer = new JButton("����");
	JButton btnExit = new JButton("�ݱ�");
	JPanel p1 = new JPanel();
	ClientBackground client = new ClientBackground();
	static String nickName;

	public ClientGui() {
		add("Center", jta);
		p1.add(jtf);
		p1.add(btnTransfer);
		p1.add(btnExit);
		add("South", p1);
		btnTransfer.addActionListener(this);
		btnExit.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(200, 100, 400, 600);
		setVisible(true);
		setTitle("�մ�");

		client.setGui(this);
		client.setNickname(nickName);
		client.connet();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� �г��Ӻ��� �����ϼ��� : ");
		nickName = scanner.nextLine();
		scanner.close();

		new ClientGui();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTransfer){//���۹�ư ������ ���
			//�޼��� �Է¾��� ���۹�ư�� ������ ���
			if(jtf.getText().equals("")){
				return;
			}
			String msg = nickName+ ":" + jtf.getText() + "\n";
			client.sendMessage(msg);
			jtf.setText("");
			}else{
			this.dispose();
		}
	}
	public void appendMsg(String msg) {
		jta.append(msg);
	}
}
