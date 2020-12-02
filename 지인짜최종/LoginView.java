import java.awt.*;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.*;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.JTextArea;
import java.io.*;
import java.net.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import java.text.ParseException;

 
public class LoginView extends JFrame{
    MainProcess main;//TestFrm testFrm;
	Color color = new Color(3,239,192);
    JButton btnLogin;
    JButton btnInit;
    JPasswordField passText;
    JTextField userText;
	ImageIcon LoginImg = new ImageIcon(getClass().getResource("user.PNG"));
	JButton image;
    boolean bLoginCheck;
	JPanel panel;
	FlowLayout f1 = new FlowLayout(FlowLayout.CENTER,0,10);
    public static void main(String[] args) {
    }
 
    public LoginView() throws ParseException{
        // setting
        setTitle("Login");
        setSize(366, 400);
        setResizable(false);
        setLocation(800, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       
        // panel
        panel = new JPanel();
        placeLoginPanel(panel);
       
		setImage();
        // add
        add(panel);
       
        // visiible
        setVisible(true);
    }
	void setImage(){
		image = new JButton();
		image.setBounds(133, 80, 95, 95);
		image.setBorderPainted(false);
		image.setContentAreaFilled(false);
		image.setFocusPainted(false);
		int offset = image.getInsets().left;
		image.setIcon(resizeIcon(LoginImg, image.getWidth() - offset, image.getHeight() - offset));
		panel.add(image);
	}
	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
       Image img = icon.getImage();  
       Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_SMOOTH);  
       return new ImageIcon(resizedImage);
	}
    public void placeLoginPanel(JPanel panel)throws ParseException{
        panel.setLayout(null);
		panel.setBackground(Color.black);
		panel.setBounds(0, 0, 380, 450);
		//panel.setFont(new Font("LAB������",Font.BOLD, 15));

        JLabel userLabel = new JLabel("User : ");
		userLabel.setForeground(color);
		userLabel.setFont(new Font("LAB������",Font.BOLD, 20));
        userLabel.setBounds(60, 200, 80, 25);
        panel.add(userLabel,BorderLayout.CENTER);
       
        JLabel passLabel = new JLabel("Pass : ");
		passLabel.setForeground(color);
		passLabel.setFont(new Font("LAB������",Font.BOLD, 20));
        passLabel.setBounds(60, 230, 80, 25);
        panel.add(passLabel,BorderLayout.CENTER);
       
        userText = new JTextField(20);
		userText.setBackground(Color.black);
		userText.setForeground(Color.white);
		userText.setBorder(new TitledBorder(new LineBorder(color,3),""));
        userText.setBounds(125, 200, 160, 25);
        panel.add(userText,BorderLayout.CENTER);
       
        passText = new JPasswordField(20);
		passText.setBackground(Color.black);
		passText.setForeground(Color.white);
		passText.setBorder(new TitledBorder(new LineBorder(color,3),""));
        passText.setBounds(125, 230, 160, 25);
        panel.add(passText,BorderLayout.CENTER);
        passText.addActionListener(new ActionListener() {          
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
					isLoginCheck();
				}catch(ParseException pe){}
            }
        });
       
        btnInit = new JButton("Reset");
		btnInit.setBackground(Color.black);
		btnInit.setForeground(Color.white);
		btnInit.setBorder(new TitledBorder(new LineBorder(color,3),""));
		btnInit.setFont(new Font("LAB������",Font.BOLD, 15));
        btnInit.setBounds(60, 270, 100, 25);
        panel.add(btnInit);
        btnInit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                userText.setText("");
                passText.setText("");
            }
        });
       
        btnLogin = new JButton("Login");
		btnLogin.setBackground(Color.black);
		btnLogin.setForeground(Color.white);
		btnLogin.setBorder(new TitledBorder(new LineBorder(color,3),""));
		btnLogin.setFont(new Font("LAB������",Font.BOLD, 15));
        btnLogin.setBounds(183, 270, 100, 25);
        panel.add(btnLogin);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
					isLoginCheck();
				}catch(ParseException pe){}
            }
        });
    }
   
    public void isLoginCheck()throws ParseException{
		String id = "����";
		String id2 = "����";
		String id3 = "����";
		String id4 = "����";

		String pass = "1234";
        if((userText.getText().equals(id) && new String(passText.getPassword()).equals(pass))
			||(userText.getText().equals(id2) && new String(passText.getPassword()).equals(pass))
			||(userText.getText().equals(id3) && new String(passText.getPassword()).equals(pass))
			||(userText.getText().equals(id4) && new String(passText.getPassword()).equals(pass))){
            JOptionPane.showMessageDialog(null, "�α��ο� �����ϼ̽��ϴ�.");
            bLoginCheck = true;
           
            // �α��� �����̶�� �Ŵ���â �ٿ��
            if(isLogin()){
                main.showFrameTest(); // ����â �޼ҵ带 �̿��� â�ٿ��
            }                  
        }else{
            JOptionPane.showMessageDialog(null, "Faild");
        }
    }
 
   
    // mainProcess�� ����
    public void setMain(MainProcess main) {
        this.main = main;
    }
   
 
    public boolean isLogin() {     
        return bLoginCheck;
    }
 
}
class MainProcess{
    LoginView loginView;
	Lay lay;
	
    public static void main(String[] args)throws ParseException{  
        // ����Ŭ���� ����
        MainProcess main = new MainProcess();
        main.loginView = new LoginView(); // �α���â ���̱�
        main.loginView.setMain(main); // �α���â���� ���� Ŭ����������
    }  
    // �׽�Ʈ������â
    public void showFrameTest()throws ParseException{   
        loginView.dispose(); // �α���â�ݱ�
        this.lay = new Lay(); // �׽�Ʈ������ ����
		lay.init();	
		//�α��� �� layâ���� 
    }
}