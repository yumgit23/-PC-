import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.util.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.text.SimpleDateFormat;
import java.text.ParseException;
public class  Lay extends JFrame {

	Dimension dimen = Toolkit.getDefaultToolkit().getScreenSize(); //사용자 화면 크기에 맞게~
	Dimension dimen1 = getSize();
	int xSize = (int)(dimen.getWidth()); 
	int ySize = (int)(dimen.getHeight()-30); ////사용자 화면 크기에 맞게
	Color color = new Color(3,239,192);
	Container cp;
	JPopupMenu popup[];
	JMenuItem popF[];
	JMenuItem popS[];
	JTextArea txtLog;
	JScrollPane scrLog;
	ImageIcon seatImg = new ImageIcon(getClass().getResource("Btn.PNG"));
	ImageIcon clockImg;
	JLabel dclabel;
	JPanel pAll, pSeat, pFood, pMenuBar, pLog, pOrder, pChat, pHost;
	JPanel pSeatLB[];
	JLabel lSeat[], lSeat2[];
	String seatNum[] = {"1번 PC","2번 PC","3번 PC","4번 PC","5번 PC","6번 PC","7번 PC","8번 PC","9번 PC","10번 PC","11번 PC","12번 PC","13번 PC","14번 PC","15번 PC"
	,"16번 PC","17번 PC","18번 PC","19번 PC","20번 PC","21번 PC","22번 PC","23번 PC","24번 PC","25번 PC","26번 PC","27번 PC","28번 PC","29번 PC","30번 PC","31번 PC","32번 PC"};
	JButton seat[], menu[],bGuest;
	String menuTitle[] = {"HOME","FOOD","LOGOUT"};
	int xSeat = 30; int ySeat = 28;
	int xFood = 30; int yFood = 28;
	int xMenu = 0; int yMenu = 0;
	
	void init()throws ParseException{
		cp = getContentPane();
		cp.setLayout(null);

		setAllP();
		setMenuBtn();
		setPopup();
		setSeatP();
		setLogP();
		setChatP();
		new DigitalClock().start();
		setClock();
		
		//setFoodP();
		setUI();
	}
	void setAllP(){
		pAll = new JPanel();
		pAll.setLayout(null);
		pAll.setBounds(0,0,xSize,ySize);		
		pAll.setBackground(Color.black);
		cp.add(pAll);
	}
	void setSeatP()throws ParseException{
		MyActionListener listener = new MyActionListener(this);
		pSeat = new JPanel();
		pSeat.setBorder(new TitledBorder(new LineBorder(color,3),""));
		pSeat.setLayout(null);
		pSeat.setBounds(50,80,1200,586);		
		pSeat.setBackground(Color.black);
		
		pSeatLB = new JPanel[seatNum.length];
		for(int i=0; i<pSeatLB.length; i++){
			pSeatLB[i] = new JPanel();
			pSeatLB[i].setBorder(new TitledBorder(new LineBorder(color,5),""));
			if (i % 8== 0 && i != 0){
				xSeat = 30;
				ySeat +=140;
			}
			pSeatLB[i].setBounds(xSeat,ySeat,115,115);
			xSeat += 130;
			pSeatLB[i].setBackground(Color.black);
			pSeat.add(pSeatLB[i]);
		}

		xSeat = 30; ySeat = 28;
		lSeat = new JLabel[seatNum.length];
		for(int i=0; i<lSeat.length; i++){
			//lSeat[i].setFont(new Font("Gothic",Font.ITALIC,20));
			lSeat[i] = new JLabel("빈 좌석");
			lSeat[i].setFont(new Font("LAB디지털",Font.BOLD, 20));
			lSeat[i].setForeground(color);
			if (i % 8== 0 && i != 0){
				xSeat = 30;
				ySeat +=140;
			}
			lSeat[i].setBounds(xSeat,ySeat,110,70);
			xSeat += 130;
			lSeat[i].setBackground(Color.white);
			pSeatLB[i].add(lSeat[i]);
		}
		xSeat = 30; ySeat = 28;
		lSeat2 = new JLabel[seatNum.length];
		for(int i=0; i<lSeat2.length; i++){
			//lSeat[i].setFont(new Font("Gothic",Font.ITALIC,20));
			lSeat2[i] = new JLabel("빈 좌석");
			lSeat2[i].setFont(new Font("LAB디지털",Font.BOLD, 20));
			if (i % 8== 0 && i != 0){
				xSeat = 30;
				ySeat +=140;
			}
			lSeat2[i].setBounds(xSeat,ySeat,110,70);
			xSeat += 130;
			lSeat2[i].setForeground(color);
			lSeat2[i].setVisible(false);
			pSeatLB[i].add(lSeat2[i]);
		}
		MyMouseListener mlistener = new MyMouseListener(this);
		int xSeat = 30; int ySeat = 78;
		seat = new JButton[seatNum.length];
		for(int i=0; i<seat.length; i++){
			seat[i] = new JButton(seatNum[i]);
			seat[i].setPreferredSize(new Dimension(110,30));
			seat[i].setFont(new Font("LAB디지털",Font.BOLD, 20));
			seat[i].setForeground(Color.white);
			seat[i].setBorderPainted(false);
			seat[i].setContentAreaFilled(false);
			seat[i].setFocusPainted(false);
			if (i % 8== 0 && i != 0){
				xSeat = 30;
				ySeat +=140;
			}
			seat[i].setBounds(xSeat,ySeat,110,30);
			xSeat += 130;
			pSeatLB[i].add(seat[i]);
			seat[i].add(popup[i]);
			seat[i].addMouseListener(mlistener);
		}
		seat[31].setBounds(xSeat,ySeat,110,30);
		bGuest = new JButton("<html>전체 <br>종료</html>");
		bGuest.addActionListener(listener);
		bGuest.setBorder(new TitledBorder(new LineBorder(color,5),""));
		bGuest.setFont(new Font("LAB디지털",Font.BOLD, 30));
		bGuest.setForeground(Color.white);
		//bGuest.setBorderPainted(false);
		bGuest.setContentAreaFilled(false);
		bGuest.setFocusPainted(false);
		bGuest.setBounds(xSeat,28,110,240);
		pSeat.add(bGuest);
		pAll.add(pSeat);
	}
	/*void setFoodP(){
		pFood = new JPanel();
		pFood.setBorder(new TitledBorder(new LineBorder(Color.black,2),"메뉴관리"));
		pFood.setLayout(null);
		pFood.setBounds(50,80,1200,586);		
		pFood.setBackground(Color.white);
		pFood.setVisible(false);
		pAll.add(pFood);
	}*/
	void setMenuBtn()throws ParseException{
		MyActionListener listener = new MyActionListener(this);
		pMenuBar = new JPanel();
		pMenuBar.setLayout(null);
		pMenuBar.setBounds(0,0,xSize,50);		
		pMenuBar.setBackground(color);
		menu = new JButton[menuTitle.length];
		for(int i=0; i<menuTitle.length; i++){
			menu[i] = new JButton(menuTitle[i]);
			menu[i].setFont(new Font("LAB디지털",Font.BOLD, 20));
			menu[i].setBorder(new TitledBorder(new LineBorder(Color.black,2),""));
			menu[i].setForeground(Color.black);
			menu[i].setBackground(Color.black);
			//menu[i].setBorderPainted(false);
			menu[i].setContentAreaFilled(false);
			menu[i].setFocusPainted(false);
			menu[i].setBounds(xMenu,yMenu,100,50);
			xMenu += 100;
			pMenuBar.add(menu[i]);	
		}
		
		menu[0].addActionListener(listener);
		menu[1].addActionListener(listener);
		menu[2].addActionListener(listener);
		
		pAll.add(pMenuBar);
	}
	void setLogP(){
		txtLog = new JTextArea();
		scrLog = new JScrollPane(txtLog);
		scrLog.setBorder(new TitledBorder(new LineBorder(color,4),""));
		scrLog.setBackground(Color.black);
		scrLog.setBounds(50,690,1200,270);
		pLog = new JPanel();
		pAll.add(scrLog);
		txtLog.setBackground(Color.white);
		txtLog.setBounds(50,690,1200,280);
		//txtLog.setForeground(Color.white);
		txtLog.setFont(new Font("위메프",Font.BOLD, 25));
		pLog.setBorder(new TitledBorder(new LineBorder(Color.black,2),""));
		pLog.setLayout(null);
		pLog.setBounds(50,690,590,270);		
		pLog.setBackground(Color.green);
	}
	void addLog(String log){
		txtLog.append(log+"\n");
		txtLog.setCaretPosition(txtLog.getDocument().getLength());
	}
	void setChatP(){
		pChat = new JPanel();
		pChat.setBorder(new TitledBorder(new LineBorder(Color.black,2),"채팅창"));
		pChat.setLayout(null);
		pChat.setBounds(1300,200,550,758);		
		pChat.setBackground(color);
		pAll.add(pChat);
	}
	void setClock(){
		clockImg = new ImageIcon(getClass().getResource("clockImg.PNG"));
		dclabel = new JLabel("",clockImg,SwingConstants.LEFT);
		pHost = new JPanel();
		//dclabel.setBorder(new TitledBorder(new LineBorder(Color.white,3),""));
		dclabel.setBounds(1300,80,550,100);
		pHost.setLayout(new BorderLayout());
		dclabel.setFont(new Font("LAB디지털",Font.BOLD, 45));
		dclabel.setForeground(color);
		//dclabel.setLayout(new BorderLayout());
		pHost.setBounds(1300,80,550,100);		
		pHost.setBackground(Color.black);
		pHost.add(dclabel,"Center");
		pAll.add(pHost);
	}
	class DigitalClock extends Thread{
		public void run(){
			while(true){
				Calendar cal = Calendar.getInstance();
				String now = " "+cal.get(Calendar.YEAR)+"-"+
						(cal.get(Calendar.MONTH)+1)+"-"+
						cal.get(Calendar.DATE)+"  "+
						cal.get(Calendar.HOUR)+":"+
						cal.get(Calendar.MINUTE)+":"+
						cal.get(Calendar.SECOND)+"  ";
				dclabel.setText(now);
				try{
					Thread.sleep(1000);
				}catch(InterruptedException e3){
					e3.printStackTrace();
				}
			}
		}
	}
	void setUI(){
		setTitle("UI Test");
		setSize(xSize,ySize);
		setLocationRelativeTo(null);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	void setPopup()throws ParseException{
		MyActionListener listener = new MyActionListener(this);
		popup = new JPopupMenu[seatNum.length];
		for (int i=0;i<popup.length;i++ ){
			popup[i] = new JPopupMenu();
		} 
		popF = new JMenuItem[seatNum.length];
		for (int i=0;i<popF.length;i++ ){
			popF[i] = new JMenuItem("이용 시작");
			popF[i].addActionListener(listener);
			popup[i].add(popF[i]);
		} 
		popS= new JMenuItem[seatNum.length];
		for (int i=0;i<popS.length;i++ ){
			popS[i] = new JMenuItem("이용 종료");
			popS[i].addActionListener(listener);
			popup[i].add(popS[i]);
		
		}
	}
	public static void main(String[] args) throws ParseException{
		Lay l1 = new Lay();
		l1.init();
	}
}
/*{
				public void paintComponent(Graphics g) {
					Dimension d = getSize();
					ImageIcon seatImg = new ImageIcon(getClass().getResource("Btn.PNG"));
					g.drawImage(seatImg.getImage(), 0, 0,d.width,d.height, null);
				}
			}*/
