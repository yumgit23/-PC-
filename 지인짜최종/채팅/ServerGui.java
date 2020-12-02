import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import javax.swing.*;
import javax.swing.border.*;
import java.util.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ServerGui extends JFrame implements ActionListener {
	Color color = new Color(3,239,192);
	JTextArea jta = new JTextArea();
	JTextField jtf = new JTextField(35);
	JButton btnTransfer = new JButton("전송");
	JButton btnExit = new JButton("닫기");
	JPanel p1 = new JPanel();
	ServerBackground server = new ServerBackground();
	String nickName;

	public ServerGui() throws IOException {
		add("Center", jta);
		p1.add(jtf);
		p1.add(btnTransfer);
		p1.add(btnExit);
		add("South", p1);
		btnTransfer.addActionListener(this);
		btnExit.addActionListener(this);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(1300,228,568,770);
		setVisible(true);	
		setTitle("해보조 PC방");
		p1.setBackground(Color.black);
		p1.setBorder(new TitledBorder(new LineBorder(color,3),""));
		jta.setFont(new Font("위메프",Font.BOLD, 20));
		jta.setBorder(new TitledBorder(new LineBorder(color,4),""));
		btnTransfer.setFont(new Font("위메프",Font.BOLD, 20));
		btnTransfer.setForeground(Color.white);
		btnTransfer.setBorder(new TitledBorder(new LineBorder(color,3),""));
		//btnTransfer.setBorderPainted(false);
		btnTransfer.setContentAreaFilled(false);
		btnTransfer.setFocusPainted(false);

		btnExit.setFont(new Font("위메프",Font.BOLD, 20));
		btnExit.setForeground(Color.white);
		btnExit.setBorder(new TitledBorder(new LineBorder(color,3),""));
		//btnTransfer.setBorderPainted(false);
		btnExit.setContentAreaFilled(false);
		btnExit.setFocusPainted(false);
		server.setGui(this);
		server.setting();
	}

	public static void main(String[] args) throws IOException {
		new ServerGui();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==btnTransfer){//전송버튼 눌렀을 경우
			//메세지 입력없이 전송버튼만 눌렀을 경우
			if(jtf.getText().equals("")){
				return;
			}
			String msg = "프론트 >> "+ jtf.getText()+"\n";
			System.out.print(msg);
			jta.append(msg);
			server.sendMessage(msg);
			jtf.setText("");
			}else{
			this.dispose();
		}
	}
	public void appendMsg(String msg) {
		jta.append(msg);
		//System.out.print("날라온 메시지 :"+   msg);
	}	
}
