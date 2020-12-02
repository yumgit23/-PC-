import java.awt.*;
import java.awt.event.*;
import java.awt.BorderLayout;
import javax.swing.*;
import java.util.Arrays;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Date;
import java.text.ParseException;

class MyActionListener extends Thread implements ActionListener{
	App app;
	Lay l1;
	LoginView lv;
	SimpleDateFormat f;
	Date d0,d1, d2, d3, d4, d5, d6, d7, d8,d9,d10,d11,d12,d13,d14,d15,d16,d17,d18,d19,d20,d21,d22,d23,d24,d25,d26,d27,d28,d29,d30,d31,d32;
	long y0,y1,y2,y3,y4,y5,y6,y7,y8,y9,y10,y11,y12,y13,y14,y15,y16,y17,y18,y19,y20,y21,y22,y23,y24,y25,y26,y27,y28,y29,y30,y31,y32;
	int sn = 0;
	MyActionListener(Lay l1) throws ParseException {
		this.l1 =l1;

	}
	class IntTime0 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d0 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y0 = d0.getTime();
				//int i=0;
				while(true){
					l1.lSeat[0].setText("<html>이용 시간:<br>"+ f.format(new Date(y0))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y0= y0-1000;

					if(y0 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime1 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d1 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y1 = d1.getTime();
				//int i=0;
				while(true){
					l1.lSeat[1].setText("<html>이용 시간:<br>"+ f.format(new Date(y1))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y1= y1-1000;

					if(y1 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime2 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d2 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y2 = d2.getTime();
				//int i=0;
				while(true){
					l1.lSeat[2].setText("<html>이용 시간:<br>"+ f.format(new Date(y2))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y2= y2-1000;

					if(y2 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime3 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d3 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y3 = d3.getTime();
				//int i=0;
				while(true){
					l1.lSeat[3].setText("<html>이용 시간:<br>"+ f.format(new Date(y3))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y3= y3-1000;

					if(y3 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime4 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d4 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y4 = d4.getTime();
				//int i=0;
				while(true){
					l1.lSeat[4].setText("<html>이용 시간:<br>"+ f.format(new Date(y4))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y4 = y4 -1000;

					if(y4 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime5 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d5 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y5 = d5.getTime();
				//int i=0;
				while(true){
					l1.lSeat[5].setText("<html>이용 시간:<br>"+ f.format(new Date(y5))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y5= y5-1000;

					if(y5 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime6 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d6 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y6 = d6.getTime();
				//int i=0;
				while(true){
					l1.lSeat[6].setText("<html>이용 시간:<br>"+ f.format(new Date(y6))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y6= y6-1000;

					if(y6 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime7 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d7 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y7 = d7.getTime();
				//int i=0;
				while(true){
					l1.lSeat[7].setText("<html>이용 시간:<br>"+ f.format(new Date(y7))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y7= y7-1000;

					if(y7 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime8 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d8 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y8 = d8.getTime();
				//int i=0;
				while(true){
					l1.lSeat[8].setText("<html>이용 시간:<br>"+ f.format(new Date(y8))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y8= y8-1000;

					if(y8 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime9 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d9 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y9 = d9.getTime();
				//int i=0;
				while(true){
					l1.lSeat[9].setText("<html>이용 시간:<br>"+ f.format(new Date(y9))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y9= y9-1000;

					if(y9 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime10 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d10 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y10 = d10.getTime();
				//int i=0;
				while(true){
					l1.lSeat[10].setText("<html>이용 시간:<br>"+ f.format(new Date(y10))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y10= y10-1000;

					if(y10 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime11 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d11 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y11 = d11.getTime();
				//int i=0;
				while(true){
					l1.lSeat[11].setText("<html>이용 시간:<br>"+ f.format(new Date(y11))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y11= y11-1000;

					if(y11 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime12 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d12 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y12 = d12.getTime();
				//int i=0;
				while(true){
					l1.lSeat[12].setText("<html>이용 시간:<br>"+ f.format(new Date(y12))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y12= y12-1000;

					if(y12 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime13 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d13 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y13 = d13.getTime();
				//int i=0;
				while(true){
					l1.lSeat[13].setText("<html>이용 시간:<br>"+ f.format(new Date(y13))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y13= y13-1000;

					if(y13 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime14 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d14 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y14= d14.getTime();
				//int i=0;
				while(true){
					l1.lSeat[14].setText("<html>이용 시간:<br>"+ f.format(new Date(y14))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y14= y14 -1000;

					if(y14 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime15 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d15 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y15 = d15.getTime();
				//int i=0;
				while(true){
					l1.lSeat[15].setText("<html>이용 시간:<br>"+ f.format(new Date(y15))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y15= y15-1000;

					if(y15 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime16 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d16 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y16 = d16.getTime();
				//int i=0;
				while(true){
					l1.lSeat[16].setText("<html>이용 시간:<br>"+ f.format(new Date(y16))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y16= y16 -1000;

					if(y16 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime17 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d17 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y17 = d17.getTime();
				//int i=0;
				while(true){
					l1.lSeat[17].setText("<html>이용 시간:<br>"+ f.format(new Date(y17))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y17= y17-1000;

					if(y17 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime18 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d18 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y18 = d18.getTime();
				//int i=0;
				while(true){
					l1.lSeat[18].setText("<html>이용 시간:<br>"+ f.format(new Date(y18))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y18= y18-1000;

					if(y18 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime19 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d19 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y19 = d19.getTime();
				//int i=0;
				while(true){
					l1.lSeat[19].setText("<html>이용 시간:<br>"+ f.format(new Date(y19))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y19 = y19 -1000;

					if(y19 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime20 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d20 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y20 = d20.getTime();
				//int i=0;
				while(true){
					l1.lSeat[20].setText("<html>이용 시간:<br>"+ f.format(new Date(y20))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y20 = y20 -1000;

					if(y20 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime21 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d21 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y21 = d21.getTime();
				//int i=0;
				while(true){
					l1.lSeat[21].setText("<html>이용 시간:<br>"+ f.format(new Date(y21))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y21 = y21 -1000;

					if(y21 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime22 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d22 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y22 = d22.getTime();
				//int i=0;
				while(true){
					l1.lSeat[22].setText("<html>이용 시간:<br>"+ f.format(new Date(y22))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y22 = y22 -1000;

					if(y22 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime23 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d23 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y23 = d23.getTime();
				//int i=0;
				while(true){
					l1.lSeat[23].setText("<html>이용 시간:<br>"+ f.format(new Date(y23))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y23 = y23 -1000;

					if(y23 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime24 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d24 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y24 = d24.getTime();
				//int i=0;
				while(true){
					l1.lSeat[24].setText("<html>이용 시간:<br>"+ f.format(new Date(y24))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y24 = y24 -1000;

					if(y24 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime25 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d25 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y25 = d25.getTime();
				//int i=0;
				while(true){
					l1.lSeat[25].setText("<html>이용 시간:<br>"+ f.format(new Date(y25))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y25 = y25 -1000;

					if(y25 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime26 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d26 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y26 = d26.getTime();
				//int i=0;
				while(true){
					l1.lSeat[26].setText("<html>이용 시간:<br>"+ f.format(new Date(y26))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y26 = y26-1000;

					if(y26 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime27 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d27 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y27 = d27.getTime();
				//int i=0;
				while(true){
					l1.lSeat[27].setText("<html>이용 시간:<br>"+ f.format(new Date(y27))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y27 = y27 - 1000;

					if(y27 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime28 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d28 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y28 = d28.getTime();
				//int i=0;
				while(true){
					l1.lSeat[28].setText("<html>이용 시간:<br>"+ f.format(new Date(y28))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y28 = y28 - 1000;

					if(y28 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime29 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d29 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y29 = d29.getTime();
				while(true){
					l1.lSeat[29].setText("<html>이용 시간:<br>"+ f.format(new Date(y29))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					y29 = y29 -1000;

					if(y29 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime30 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d30 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y30 = d30.getTime();
				//int i=0;
				while(true){
					l1.lSeat[30].setText("<html>이용 시간:<br>"+ f.format(new Date(y30))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y30 = y30 -1000;

					if(y30 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	class IntTime31 extends Thread{
		public void run(){
			try{
				f = new SimpleDateFormat("HH:mm:ss",Locale.KOREA);
				d31 = f.parse("01:00:00"); //이게 타이머 시작 시간
				y31 = d31.getTime();
				//int i=0;
				while(true){
					l1.lSeat[31].setText("<html>이용 시간:<br>"+ f.format(new Date(y31))+"</html>");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					//i +=1;
					y31 = y31 -1000;

					if(y31 == -1){
						return;
					}
				}
			}catch(ParseException pe){}
		}
	}
	public void actionPerformed(ActionEvent e){
		try{
			Object obj = e.getSource();
			if(obj == l1.menu[1]){ //음식창
				this.app = new App();
			}else if(obj == l1.menu[2]){ //로그아웃 안돼
					//System.out.println("눌렀엉2");
					this.lv = new LoginView();
					l1.dispose();
			}else if(obj == l1.popF[0]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "1번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[0].setVisible(true);
					l1.lSeat2[0].setVisible(false);
					new IntTime0().start(); // 이게 타이머				
			}else if(obj == l1.popS[0]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "1번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[0].setVisible(false);
					l1.lSeat2[0].setVisible(true);
			}else if(obj == l1.popF[1]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "2번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[1].setVisible(true);
					l1.lSeat2[1].setVisible(false);
					new IntTime1().start(); // 이게 타이머				
			}else if(obj == l1.popS[1]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "2번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[1].setVisible(false);
					l1.lSeat2[1].setVisible(true);
			}else if(obj == l1.popF[2]) {
					Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "3번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[2].setVisible(true);
					l1.lSeat2[2].setVisible(false);
					new IntTime2().start(); // 이게 타이머				
			}else if(obj == l1.bGuest){ //음식창
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "모든 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
				for (int i=0;i<l1.lSeat.length ;i++ ){
				   l1.lSeat[i].setVisible(false);
				   l1.lSeat2[i].setVisible(true);
				}
            }else if(obj == l1.popS[2]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "3번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[2].setVisible(false);
					l1.lSeat2[2].setVisible(true);
			}else if(obj == l1.popF[3]) {
					Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "4번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[3].setVisible(true);
					l1.lSeat2[3].setVisible(false);
					new IntTime3().start(); // 이게 타이머				
			}else if(obj == l1.popS[3]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "4번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[3].setVisible(false);
					l1.lSeat2[3].setVisible(true);
			}else if(obj == l1.popF[4]) {
					Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "5번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[4].setVisible(true);
					l1.lSeat2[4].setVisible(false);
					new IntTime4().start(); // 이게 타이머				
			}else if(obj == l1.popS[4]) {
					Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "5번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[4].setVisible(false);
					l1.lSeat2[4].setVisible(true);
			}else if(obj == l1.popF[5]) {
					Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "6번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[5].setVisible(true);
					l1.lSeat2[5].setVisible(false);
					new IntTime5().start(); // 이게 타이머				
			}else if(obj == l1.popS[5]) {
					Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "6번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[5].setVisible(false);
					l1.lSeat2[5].setVisible(true);
			}else if(obj == l1.popF[6]) {
					Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "7번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[6].setVisible(true);
					l1.lSeat2[6].setVisible(false);
					new IntTime6().start(); // 이게 타이머				
			}else if(obj == l1.popS[6]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "7번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[6].setVisible(false);
					l1.lSeat2[6].setVisible(true);
			}else if(obj == l1.popF[7]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "8번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[7].setVisible(true);
					l1.lSeat2[7].setVisible(false);
					new IntTime7().start(); // 이게 타이머				
			}else if(obj == l1.popS[7]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "8번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[7].setVisible(false);
					l1.lSeat2[7].setVisible(true);
			}else if(obj == l1.popF[8]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "9번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[8].setVisible(true);
					l1.lSeat2[8].setVisible(false);
					new IntTime8().start(); // 이게 타이머				
			}else if(obj == l1.popS[8]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "9번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[8].setVisible(false);
					l1.lSeat2[8].setVisible(true);
			}else if(obj == l1.popF[9]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "10번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[9].setVisible(true);
					l1.lSeat2[9].setVisible(false);
					new IntTime9().start(); // 이게 타이머				
			}else if(obj == l1.popS[9]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "10번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[9].setVisible(false);
					l1.lSeat2[9].setVisible(true);
			}else if(obj == l1.popF[10]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "11번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[10].setVisible(true);
					l1.lSeat2[10].setVisible(false);
					new IntTime10().start(); // 이게 타이머				
			}else if(obj == l1.popS[10]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "11번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[10].setVisible(false);
					l1.lSeat2[10].setVisible(true);
			}else if(obj == l1.popF[11]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "12번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[11].setVisible(true);
					l1.lSeat2[11].setVisible(false);
					new IntTime11().start(); // 이게 타이머				
			}else if(obj == l1.popS[11]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "12번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[11].setVisible(false);
					l1.lSeat2[11].setVisible(true);
			}else if(obj == l1.popF[12]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "13번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[12].setVisible(true);
					l1.lSeat2[12].setVisible(false);
					new IntTime12().start(); // 이게 타이머				
			}else if(obj == l1.popS[12]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "13번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[12].setVisible(false);
					l1.lSeat2[12].setVisible(true);
			}else if(obj == l1.popF[13]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "14번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[13].setVisible(true);
					l1.lSeat2[13].setVisible(false);
					new IntTime13().start(); // 이게 타이머				
			}else if(obj == l1.popS[13]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "14번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[13].setVisible(false);
					l1.lSeat2[13].setVisible(true);
			}else if(obj == l1.popF[14]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "15번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[14].setVisible(true);
					l1.lSeat2[14].setVisible(false);
					new IntTime14().start(); // 이게 타이머				
			}else if(obj == l1.popS[14]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "15번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[14].setVisible(false);
					l1.lSeat2[14].setVisible(true);
			}else if(obj == l1.popF[15]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "16번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[15].setVisible(true);
					l1.lSeat2[15].setVisible(false);
					new IntTime15().start(); // 이게 타이머				
			}else if(obj == l1.popS[15]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "16번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[15].setVisible(false);
					l1.lSeat2[15].setVisible(true);
			}else if(obj == l1.popF[16]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "17번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[16].setVisible(true);
					l1.lSeat2[16].setVisible(false);
					new IntTime16().start(); // 이게 타이머				
			}else if(obj == l1.popS[16]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "17번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[16].setVisible(false);
					l1.lSeat2[16].setVisible(true);
			}else if(obj == l1.popF[17]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "18번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[17].setVisible(true);
					l1.lSeat2[17].setVisible(false);
					new IntTime17().start(); // 이게 타이머				
			}else if(obj == l1.popS[17]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "18번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[17].setVisible(false);
					l1.lSeat2[17].setVisible(true);
			}else if(obj == l1.popF[18]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "19번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[18].setVisible(true);
					l1.lSeat2[18].setVisible(false);
					new IntTime18().start(); // 이게 타이머				
			}else if(obj == l1.popS[18]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "19번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[18].setVisible(false);
					l1.lSeat2[18].setVisible(true);
			}else if(obj == l1.popF[19]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "20번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[19].setVisible(true);
					l1.lSeat2[19].setVisible(false);
					new IntTime19().start(); // 이게 타이머				
			}else if(obj == l1.popS[19]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "20번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[19].setVisible(false);
					l1.lSeat2[19].setVisible(true);
			}else if(obj == l1.popF[20]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "21번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[20].setVisible(true);
					l1.lSeat2[20].setVisible(false);
					new IntTime20().start(); // 이게 타이머				
			}else if(obj == l1.popS[20]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "21번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[20].setVisible(false);
					l1.lSeat2[20].setVisible(true);
			}else if(obj == l1.popF[21]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "22번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[21].setVisible(true);
					l1.lSeat2[21].setVisible(false);
					new IntTime21().start(); // 이게 타이머				
			}else if(obj == l1.popS[21]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "22번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[21].setVisible(false);
					l1.lSeat2[21].setVisible(true);
			}else if(obj == l1.popF[22]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "23번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[22].setVisible(true);
					l1.lSeat2[22].setVisible(false);
					new IntTime22().start(); // 이게 타이머				
			}else if(obj == l1.popS[22]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "23번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[22].setVisible(false);
					l1.lSeat2[22].setVisible(true);
			}else if(obj == l1.popF[23]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "24번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[23].setVisible(true);
					l1.lSeat2[23].setVisible(false);
					new IntTime23().start(); // 이게 타이머				
			}else if(obj == l1.popS[23]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "24번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[23].setVisible(false);
					l1.lSeat2[23].setVisible(true);
			}else if(obj == l1.popF[24]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "25번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[24].setVisible(true);
					l1.lSeat2[24].setVisible(false);
					new IntTime24().start(); // 이게 타이머				
			}else if(obj == l1.popS[24]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "25번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[24].setVisible(false);
					l1.lSeat2[24].setVisible(true);
			}else if(obj == l1.popF[25]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "26번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[25].setVisible(true);
					l1.lSeat2[25].setVisible(false);
					new IntTime25().start(); // 이게 타이머				
			}else if(obj == l1.popS[25]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "26번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[25].setVisible(false);
					l1.lSeat2[25].setVisible(true);
			}else if(obj == l1.popF[26]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "27번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[26].setVisible(true);
					l1.lSeat2[26].setVisible(false);
					new IntTime26().start(); // 이게 타이머				
			}else if(obj == l1.popS[26]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "27번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[26].setVisible(false);
					l1.lSeat2[26].setVisible(true);
			}else if(obj == l1.popF[27]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "28번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[27].setVisible(true);
					l1.lSeat2[27].setVisible(false);
					new IntTime27().start(); // 이게 타이머				
			}else if(obj == l1.popS[27]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "28번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[27].setVisible(false);
					l1.lSeat2[27].setVisible(true);
			}else if(obj == l1.popF[28]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "29번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[28].setVisible(true);
					l1.lSeat2[28].setVisible(false);
					new IntTime28().start(); // 이게 타이머				
			}else if(obj == l1.popS[28]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "29번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[28].setVisible(false);
					l1.lSeat2[28].setVisible(true);
			}else if(obj == l1.popF[29]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "30번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[29].setVisible(true);
					l1.lSeat2[29].setVisible(false);
					new IntTime29().start(); // 이게 타이머				
			}else if(obj == l1.popS[29]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "30번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[29].setVisible(false);
					l1.lSeat2[29].setVisible(true);
			}else if(obj == l1.popF[30]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "31번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[30].setVisible(true);
					l1.lSeat2[30].setVisible(false);
					new IntTime30().start(); // 이게 타이머				
			}else if(obj == l1.popS[30]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "31번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[30].setVisible(false);
					l1.lSeat2[30].setVisible(true);
			}else if(obj == l1.popF[31]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "32번 PC 이용 시작: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[31].setVisible(true);
					l1.lSeat2[31].setVisible(false);
					new IntTime31().start(); // 이게 타이머				
			}else if(obj == l1.popS[31]) {
				Date date1 = new Date(System.currentTimeMillis());
				String nowtime = "32번 PC 이용 종료: "+ date1;
				l1.addLog(nowtime);
					l1.lSeat[31].setVisible(false);
					l1.lSeat2[31].setVisible(true);
			}
		}catch(ParseException pe){}
	}
		
}
class MyMouseListener extends Thread implements MouseListener, MouseMotionListener{
	Lay l1;
	
	MyMouseListener(Lay l1){
		this.l1 =l1;
	}
	public void mouseMoved(MouseEvent e){}
	public void mouseExited(MouseEvent e){}
	public void mouseClicked(MouseEvent e){
		Object obj = e.getSource();
		if(obj == (JButton)l1.seat[0]) {
			l1.popup[0].show(l1.seat[0], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[1]) {
			l1.popup[1].show(l1.seat[1], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[2]) {
			l1.popup[2].show(l1.seat[2], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[3]) {
			l1.popup[3].show(l1.seat[3], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[4]) {
			l1.popup[4].show(l1.seat[4], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[5]) {
			l1.popup[5].show(l1.seat[5], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[6]) {
			l1.popup[6].show(l1.seat[6], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[7]) {
			l1.popup[7].show(l1.seat[7], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[8]) {
			l1.popup[8].show(l1.seat[8], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[9]) {
			l1.popup[9].show(l1.seat[9], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[10]) {
			l1.popup[10].show(l1.seat[10], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[11]) {
			l1.popup[11].show(l1.seat[11], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[12]) {
			l1.popup[12].show(l1.seat[12], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[13]) {
			l1.popup[13].show(l1.seat[13], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[14]) {
			l1.popup[14].show(l1.seat[14], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[15]) {
			l1.popup[15].show(l1.seat[15], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[16]) {
			l1.popup[16].show(l1.seat[16], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[17]) {
			l1.popup[17].show(l1.seat[17], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[18]) {
			l1.popup[18].show(l1.seat[18], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[19]) {
			l1.popup[19].show(l1.seat[19], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[20]) {
			l1.popup[20].show(l1.seat[20], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[21]) {
			l1.popup[21].show(l1.seat[21], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[22]) {
			l1.popup[22].show(l1.seat[22], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[23]) {
			l1.popup[23].show(l1.seat[23], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[24]) {
			l1.popup[24].show(l1.seat[24], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[25]) {
			l1.popup[25].show(l1.seat[25], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[26]) {
			l1.popup[26].show(l1.seat[26], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[27]) {
			l1.popup[27].show(l1.seat[27], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[28]) {
			l1.popup[28].show(l1.seat[28], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[29]) {
			l1.popup[29].show(l1.seat[29], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[30]) {
			l1.popup[30].show(l1.seat[30], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[31]) {
			l1.popup[31].show(l1.seat[31], e.getX(), e.getY());
		}else if(obj == (JButton)l1.seat[32]) {
			l1.popup[32].show(l1.seat[32], e.getX(), e.getY());
		}
	}
	public void mouseReleased(MouseEvent e){}
	public void mousePressed(MouseEvent e){}
	public void mouseDragged(MouseEvent e){}
	public void mouseEntered(MouseEvent e){}
}
/*while(true){
			
				l1.lSeat[0].setText("<html>이용 시간: <br></html>"+ f.format(new Date(y)));
				try {
					Thread.sleep(1000);
				} catch (InterruptedException ine) {
					ine.printStackTrace();
				}
				y= y-1000;
				if(y == -1){
					return;
				}
			}*/