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
	JButton btnTransfer = new JButton("전송");
	JButton btnExit = new JButton("닫기");
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
		setTitle("손님");

		client.setGui(this);
		client.setNickname(nickName);
		client.connet();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 닉네임부터 설정하세요 : ");
		nickName = scanner.nextLine();
		scanner.close();

		new ClientGui();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTransfer){//전송버튼 눌렀을 경우
			//메세지 입력없이 전송버튼만 눌렀을 경우
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
