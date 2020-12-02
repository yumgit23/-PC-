import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class App {
	Color color = new Color(3,239,192);
    JPanel panel1 = new JPanel();
    String[] menu = {"라면","짜파게티","불닭볶음면","핫도그","1시간","아.아",
	"콜라","사이다","환타","아침햇살","군만두","물만두","케이크"};
    int[] price = {3000,3500,3500,10000,2000,4500,1500,1500,1500,2000,3000,3000,5000};
    int[] cnt = {0,0,0,0,0,0,0,0,0,0,0,0,0};
    int total_price = 0;

    public App() {
        JFrame frame = new JFrame("Food Menu");
		//frame.setFont(new Font("위메프",Font.BOLD, 13));
        frame.setSize(850, 850);
        frame.setResizable(false);
        frame.getContentPane().setBackground(Color.black);
        frame.getContentPane().setLayout(null);

        JLabel main = new JLabel("Food Menu");
		main.setFont(new Font("LAB디지털",Font.BOLD, 30));
		main.setForeground(Color.white);
        main.setHorizontalAlignment(SwingConstants.CENTER);
        main.setBounds(212, 10, 460, 29);
        frame.getContentPane().add(main);

        JButton[] minus = new JButton[13];
        JButton[] plus = new JButton[13];
        JTextField[] cnt_in = new JTextField[13];

        ImageIcon tmp1 = new ImageIcon("imgs/라면.png");
        ImageIcon img1 = imageSetSize(tmp1, 120, 142);
        JLabel imglabel_1 = new JLabel(img1);
		imglabel_1.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_1.setBackground(color);
        imglabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_1.setBounds(31, 50, 120, 142);
        frame.getContentPane().add(imglabel_1);

        JLabel name_1 = new JLabel("라면: 3000원");
		name_1.setForeground(Color.white);
		name_1.setFont(new Font("위메프",Font.BOLD, 15));
        name_1.setBounds(31,205,119,15);
        frame.getContentPane().add(name_1);

        JLabel cnt_1 = new JLabel("수량 >");
		cnt_1.setForeground(Color.white);
		cnt_1.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_1.setBounds(31, 233, 57, 15);
        frame.getContentPane().add(cnt_1);

        cnt_in[0] = new JTextField("0");
		cnt_in[0].setForeground(Color.black);
		cnt_in[0].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[0].setBounds(72, 230, 79, 21);
        cnt_in[0].setEditable(false);
        frame.getContentPane().add(cnt_in[0]);

        minus[0] = new JButton("-");
		minus[0].setForeground(Color.black);
		minus[0].setFont(new Font("위메프",Font.BOLD, 15));
        minus[0].setBounds(31, 257, 55, 25);
        minus[0].setEnabled(false);
        frame.getContentPane().add(minus[0]);

        plus[0] = new JButton("+");
		plus[0].setForeground(Color.black);
		plus[0].setFont(new Font("위메프",Font.BOLD, 15));
        plus[0].setBounds(96, 257, 55, 25);
        frame.getContentPane().add(plus[0]);



        ImageIcon tmp2 = new ImageIcon("imgs/짜장라면.png");
        ImageIcon img2 = imageSetSize(tmp2, 120, 142);
        JLabel imglabel_2 = new JLabel(img2);
		imglabel_2.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_2.setBackground(color);
        imglabel_2.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_2.setBounds(182, 50, 120, 142);
        frame.getContentPane().add(imglabel_2);

        JLabel name_2 = new JLabel("짜파게티: 3500원");
		name_2.setForeground(Color.white);
		name_2.setFont(new Font("위메프",Font.BOLD, 15));
        name_2.setBounds(182,205,119,15);
        frame.getContentPane().add(name_2);

        JLabel cnt_2 = new JLabel("수량 >");
		cnt_2.setForeground(Color.white);
		cnt_2.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_2.setBounds(182, 232, 57, 15);
        frame.getContentPane().add(cnt_2);

        cnt_in[1] = new JTextField("0");
		cnt_in[1].setForeground(Color.black);
		cnt_in[1].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[1].setEditable(false);
        cnt_in[1].setBounds(223, 229, 79, 21);
        frame.getContentPane().add(cnt_in[1]);

        minus[1] = new JButton("-");
        minus[1].setBounds(182, 256, 55, 25);
        minus[1].setEnabled(false);
        frame.getContentPane().add(minus[1]);

        plus[1] = new JButton("+");
        plus[1].setBounds(247, 256, 55, 25);
        frame.getContentPane().add(plus[1]);



        ImageIcon tmp3 = new ImageIcon("imgs/불닭볶음면.png");
        ImageIcon img3 = imageSetSize(tmp3, 120, 142);
        JLabel imglabel_3 = new JLabel(img3);
		imglabel_3.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_3.setBackground(color);
        imglabel_3.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_3.setBounds(333, 50, 120, 142);
        frame.getContentPane().add(imglabel_3);

        JLabel name_3 = new JLabel("불닭면: 3500원");
		name_3.setForeground(Color.white);
		name_3.setFont(new Font("위메프",Font.BOLD, 15));
        name_3.setBounds(333,205,119,15);
        frame.getContentPane().add(name_3);

        JLabel cnt_3 = new JLabel("수량 >");
		cnt_3.setForeground(Color.white);
		cnt_3.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_3.setBounds(333, 232, 57, 15);
        frame.getContentPane().add(cnt_3);

        cnt_in[2] = new JTextField("0");
		cnt_in[2].setForeground(Color.black);
		cnt_in[2].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[2].setEditable(false);
        cnt_in[2].setBounds(374, 229, 79, 21);
        frame.getContentPane().add(cnt_in[2]);

        minus[2] = new JButton("-");
        minus[2].setBounds(333, 256, 55, 25);
        minus[2].setEnabled(false);
        frame.getContentPane().add(minus[2]);

        plus[2] = new JButton("+");
        plus[2].setBounds(398, 256, 55, 25);
        frame.getContentPane().add(plus[2]);

		ImageIcon tmp4 = new ImageIcon("imgs/핫도그.png");
        ImageIcon img4 = imageSetSize(tmp4, 120, 142);
        JLabel imglabel_4 = new JLabel(img4);
		imglabel_4.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_4.setBackground(color);
        imglabel_4.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_4.setBounds(484, 50, 120, 142);
        frame.getContentPane().add(imglabel_4);

        JLabel name_4 = new JLabel("핫도그: 10000원");
		name_4.setForeground(Color.white);
		name_4.setFont(new Font("위메프",Font.BOLD, 15));
        name_4.setBounds(484,205,119,15);
        frame.getContentPane().add(name_4);

        JLabel cnt_4 = new JLabel("수량 >");
		cnt_4.setForeground(Color.white);
		cnt_4.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_4.setBounds(484, 233, 57, 15);
        frame.getContentPane().add(cnt_4);

        cnt_in[3] = new JTextField("0");
		cnt_in[3].setForeground(Color.black);
		cnt_in[3].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[3].setBounds(524, 230, 79, 21);
        cnt_in[3].setEditable(false);
        frame.getContentPane().add(cnt_in[3]);

        minus[3] = new JButton("-");
        minus[3].setBounds(484, 257, 55, 25);
        minus[3].setEnabled(false);
        frame.getContentPane().add(minus[3]);

        plus[3] = new JButton("+");
        plus[3].setBounds(549, 257, 55, 25);
        frame.getContentPane().add(plus[3]);
		

		ImageIcon tmp5 = new ImageIcon("imgs/soldout.png");
        ImageIcon img5 = imageSetSize(tmp5, 120, 142);
        JLabel imglabel_5 = new JLabel(img5);
		imglabel_5.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_5.setBackground(color);
        imglabel_5.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_5.setBounds(635, 50, 120, 142);
        frame.getContentPane().add(imglabel_5);

        JLabel name_5 = new JLabel("1시간: 2000원");
		name_5.setForeground(Color.white);
		name_5.setFont(new Font("위메프",Font.BOLD, 15));
        name_5.setBounds(635,205,119,15);
        frame.getContentPane().add(name_5);

        JLabel cnt_5 = new JLabel("수량 >");
		cnt_5.setForeground(Color.white);
		cnt_5.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_5.setBounds(635, 233, 57, 15);
        frame.getContentPane().add(cnt_5);

        cnt_in[4] = new JTextField("0");
		cnt_in[4].setForeground(Color.black);
		cnt_in[4].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[4].setBounds(675, 230, 79, 21);
        cnt_in[4].setEditable(false);
        frame.getContentPane().add(cnt_in[4]);

        minus[4] = new JButton("-");
        minus[4].setBounds(635, 257, 55, 25);
        minus[4].setEnabled(false);
        frame.getContentPane().add(minus[4]);

        plus[4] = new JButton("+");
        plus[4].setBounds(700, 257, 55, 25);
        frame.getContentPane().add(plus[4]);

		ImageIcon tmp6 = new ImageIcon("imgs/아아.png");
        ImageIcon img6 = imageSetSize(tmp6, 120, 102);
        JLabel imglabel_6 = new JLabel(img6);
		imglabel_6.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_6.setBackground(color);
        imglabel_6.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_6.setBounds(31, 300, 120, 142);
        frame.getContentPane().add(imglabel_6);

        JLabel name_6 = new JLabel("아.아: 4500원");
		name_6.setForeground(Color.white);
		name_6.setFont(new Font("위메프",Font.BOLD, 15));
        name_6.setBounds(31,455,119,15);
        frame.getContentPane().add(name_6);

        JLabel cnt_6 = new JLabel("수량 >");
		cnt_6.setForeground(Color.white);
		cnt_6.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_6.setBounds(31, 483, 57, 15);
        frame.getContentPane().add(cnt_6);

        cnt_in[5] = new JTextField("0");
		cnt_in[5].setForeground(Color.black);
		cnt_in[5].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[5].setBounds(72, 480, 79, 21);
        cnt_in[5].setEditable(false);
        frame.getContentPane().add(cnt_in[5]);

        minus[5] = new JButton("-");
        minus[5].setBounds(31, 507, 55, 25);
        minus[5].setEnabled(false);
        frame.getContentPane().add(minus[5]);

        plus[5] = new JButton("+");
        plus[5].setBounds(96, 507, 55, 25);
        frame.getContentPane().add(plus[5]);



        ImageIcon tmp7 = new ImageIcon("imgs/콜라.png");
        ImageIcon img7 = imageSetSize(tmp7, 120, 102);
        JLabel imglabel_7 = new JLabel(img7);
		imglabel_7.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_7.setBackground(color);
        imglabel_7.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_7.setBounds(182, 300, 120, 142);
        frame.getContentPane().add(imglabel_7);

        JLabel name_7 = new JLabel("콜라: 1500원");
		name_7.setForeground(Color.white);
		name_7.setFont(new Font("위메프",Font.BOLD, 15));
        name_7.setBounds(182,455,119,15);
        frame.getContentPane().add(name_7);

        JLabel cnt_7 = new JLabel("수량 >");
		cnt_7.setForeground(Color.white);
		cnt_7.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_7.setBounds(182, 482, 57, 15);
        frame.getContentPane().add(cnt_7);

        cnt_in[6] = new JTextField("0");
		cnt_in[6].setForeground(Color.black);
		cnt_in[6].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[6].setEditable(false);
        cnt_in[6].setBounds(223, 479, 79, 21);
        frame.getContentPane().add(cnt_in[6]);

        minus[6] = new JButton("-");
        minus[6].setBounds(182, 506, 55, 25);
        minus[6].setEnabled(false);
        frame.getContentPane().add(minus[6]);

        plus[6] = new JButton("+");
        plus[6].setBounds(247, 506, 55, 25);
        frame.getContentPane().add(plus[6]);



        ImageIcon tmp8 = new ImageIcon("imgs/사이다.png");
        ImageIcon img8 = imageSetSize(tmp8, 120, 102);
        JLabel imglabel_8 = new JLabel(img8);
		imglabel_8.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_8.setBackground(color);
        imglabel_8.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_8.setBounds(333, 300, 120, 142);
        frame.getContentPane().add(imglabel_8);

        JLabel name_8 = new JLabel("사이다: 1500원");
		name_8.setForeground(Color.white);
		name_8.setFont(new Font("위메프",Font.BOLD, 15));
        name_8.setBounds(333,455,119,15);
        frame.getContentPane().add(name_8);

        JLabel cnt_8 = new JLabel("수량 >");
		cnt_8.setForeground(Color.white);
		cnt_8.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_8.setBounds(333, 482, 57, 15);
        frame.getContentPane().add(cnt_8);

        cnt_in[7] = new JTextField("0");
		cnt_in[7].setForeground(Color.black);
		cnt_in[7].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[7].setEditable(false);
        cnt_in[7].setBounds(374, 479, 79, 21);
        frame.getContentPane().add(cnt_in[7]);

        minus[7] = new JButton("-");
        minus[7].setBounds(333, 506, 55, 25);
        minus[7].setEnabled(false);
        frame.getContentPane().add(minus[7]);

        plus[7] = new JButton("+");
        plus[7].setBounds(398, 506, 55, 25);
        frame.getContentPane().add(plus[7]);

		ImageIcon tmp9 = new ImageIcon("imgs/환타.png");
        ImageIcon img9 = imageSetSize(tmp9, 120, 102);
        JLabel imglabel_9 = new JLabel(img9);
		imglabel_9.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_9.setBackground(color);
        imglabel_9.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_9.setBounds(484, 300, 120, 142);
        frame.getContentPane().add(imglabel_9);

        JLabel name_9 = new JLabel("환타: 1500원");
		name_9.setForeground(Color.white);
		name_9.setFont(new Font("위메프",Font.BOLD, 15));
        name_9.setBounds(484,455,119,15);
        frame.getContentPane().add(name_9);

        JLabel cnt_9 = new JLabel("수량 >");
		cnt_9.setForeground(Color.white);
		cnt_9.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_9.setBounds(484, 483, 57, 15);
        frame.getContentPane().add(cnt_9);

        cnt_in[8] = new JTextField("0");
		cnt_in[8].setForeground(Color.black);
		cnt_in[8].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[8].setBounds(524, 480, 79, 21);
        cnt_in[8].setEditable(false);
        frame.getContentPane().add(cnt_in[8]);

        minus[8] = new JButton("-");
        minus[8].setBounds(484, 507, 55, 25);
        minus[8].setEnabled(false);
        frame.getContentPane().add(minus[8]);

        plus[8] = new JButton("+");
        plus[8].setBounds(549, 507, 55, 25);
        frame.getContentPane().add(plus[8]);
		

		ImageIcon tmp10 = new ImageIcon("imgs/아침햇살.png");
        ImageIcon img10 = imageSetSize(tmp10, 120, 142);
        JLabel imglabel_10 = new JLabel(img10);
		imglabel_10.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_10.setBackground(color);
        imglabel_10.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_10.setBounds(635, 300, 120, 142);
        frame.getContentPane().add(imglabel_10);

        JLabel name_10 = new JLabel("아침햇살: 2000원");
		name_10.setForeground(Color.white);
		name_10.setFont(new Font("위메프",Font.BOLD, 15));
        name_10.setBounds(635,455,119,15);
        frame.getContentPane().add(name_10);

        JLabel cnt_10 = new JLabel("수량 >");
		cnt_10.setForeground(Color.white);
		cnt_10.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_10.setBounds(635, 483, 57, 15);
        frame.getContentPane().add(cnt_10);

        cnt_in[9] = new JTextField("0");
		cnt_in[9].setForeground(Color.black);
		cnt_in[9].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[9].setBounds(675, 480, 79, 21);
        cnt_in[9].setEditable(false);
        frame.getContentPane().add(cnt_in[9]);

        minus[9] = new JButton("-");
        minus[9].setBounds(635, 507, 55, 25);
        minus[9].setEnabled(false);
        frame.getContentPane().add(minus[9]);

        plus[9] = new JButton("+");
        plus[9].setBounds(700, 507, 55, 25);
        frame.getContentPane().add(plus[9]);
		
		ImageIcon tmp11 = new ImageIcon("imgs/군만두.png");
        ImageIcon img11 = imageSetSize(tmp11, 120, 142);
        JLabel imglabel_11 = new JLabel(img11);
		imglabel_11.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_11.setBackground(color);
        imglabel_11.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_11.setBounds(31, 550, 120, 142);
        frame.getContentPane().add(imglabel_11);

        JLabel name_11 = new JLabel("군만두: 3000원");
		name_11.setForeground(Color.white);
		name_11.setFont(new Font("위메프",Font.BOLD, 15));
        name_11.setBounds(31,705,119,15);
        frame.getContentPane().add(name_11);

        JLabel cnt_11 = new JLabel("수량 >");
		cnt_11.setForeground(Color.white);
		cnt_11.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_11.setBounds(31, 733, 57, 15);
        frame.getContentPane().add(cnt_11);

        cnt_in[10] = new JTextField("0");
		cnt_in[10].setForeground(Color.black);
		cnt_in[10].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[10].setBounds(72, 730, 79, 21);
        cnt_in[10].setEditable(false);
        frame.getContentPane().add(cnt_in[10]);

        minus[10] = new JButton("-");
        minus[10].setBounds(31, 757, 55, 25);
        minus[10].setEnabled(false);
        frame.getContentPane().add(minus[10]);

        plus[10] = new JButton("+");
        plus[10].setBounds(96, 757, 55, 25);
        frame.getContentPane().add(plus[10]);



        ImageIcon tmp12 = new ImageIcon("imgs/물만두.png");
        ImageIcon img12 = imageSetSize(tmp12, 120, 142);
        JLabel imglabel_12 = new JLabel(img12);
		imglabel_12.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_12.setBackground(color);
        imglabel_12.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_12.setBounds(182, 550, 120, 142);
        frame.getContentPane().add(imglabel_12);

        JLabel name_12 = new JLabel("물만두: 3000원");
		name_12.setForeground(Color.white);
		name_12.setFont(new Font("위메프",Font.BOLD, 15));
        name_12.setBounds(182,705,119,15);
        frame.getContentPane().add(name_12);

        JLabel cnt_12 = new JLabel("수량 >");
		cnt_12.setForeground(Color.white);
		cnt_12.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_12.setBounds(182, 732, 57, 15);
        frame.getContentPane().add(cnt_12);

        cnt_in[11] = new JTextField("0");
		cnt_in[11].setForeground(Color.black);
		cnt_in[11].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[11].setEditable(false);
        cnt_in[11].setBounds(223, 730, 79, 21);
        frame.getContentPane().add(cnt_in[11]);

        minus[11] = new JButton("-");
        minus[11].setBounds(182, 756, 55, 25);
        minus[11].setEnabled(false);
        frame.getContentPane().add(minus[11]);

        plus[11] = new JButton("+");
        plus[11].setBounds(247, 756, 55, 25);
        frame.getContentPane().add(plus[11]);



        ImageIcon tmp13 = new ImageIcon("imgs/조각케이크.jpg");
        ImageIcon img13 = imageSetSize(tmp13, 120, 142);
        JLabel imglabel_13 = new JLabel(img13);
		imglabel_13.setBorder(new TitledBorder(new LineBorder(color,4),""));
		imglabel_13.setBackground(color);
        imglabel_13.setHorizontalAlignment(SwingConstants.CENTER);
        imglabel_13.setBounds(333, 550, 120, 142);
        frame.getContentPane().add(imglabel_13);

        JLabel name_13 = new JLabel("케이크: 5000원");
		name_13.setForeground(Color.white);
		name_13.setFont(new Font("위메프",Font.BOLD, 15));
        name_13.setBounds(333,705,119,15);
        frame.getContentPane().add(name_13);

        JLabel cnt_13 = new JLabel("수량 >");
		cnt_13.setForeground(Color.white);
		cnt_13.setFont(new Font("위메프",Font.BOLD, 15));
        cnt_13.setBounds(333, 732, 57, 15);
        frame.getContentPane().add(cnt_13);

        cnt_in[12] = new JTextField("0");
		cnt_in[12].setForeground(Color.black);
		cnt_in[12].setFont(new Font("위메프",Font.BOLD, 15));
        cnt_in[12].setEditable(false);
        cnt_in[12].setBounds(374, 730, 79, 21);
        frame.getContentPane().add(cnt_in[12]);

        minus[12] = new JButton("-");
        minus[12].setBounds(333, 756, 55, 25);
        minus[12].setEnabled(false);
        frame.getContentPane().add(minus[12]);

        plus[12] = new JButton("+");
        plus[12].setBounds(398, 756, 55, 25);
        frame.getContentPane().add(plus[12]);


        JLabel money = new JLabel("현재금액 > ");
		money.setForeground(Color.white);
		money.setFont(new Font("위메프",Font.BOLD, 15));
        money.setBounds(530, 638, 92, 15);
        frame.getContentPane().add(money);

        JTextField money_in = new JTextField("");
        money_in.setColumns(10);
        money_in.setBounds(603, 635, 79, 21);
        frame.getContentPane().add(money_in);

        JLabel total = new JLabel("총액 > ");
		total.setForeground(Color.white);
		total.setFont(new Font("위메프",Font.BOLD, 15));
        total.setBounds(530, 666, 92, 15);
        frame.getContentPane().add(total);

        JTextField total_out = new JTextField();
        total_out.setColumns(10);
        total_out.setEditable(false);
        total_out.setBounds(603, 663, 79, 21);
        frame.getContentPane().add(total_out);

        JButton calc = new JButton("계산");
		calc.setFont(new Font("위메프",Font.BOLD, 15));
        calc.setBounds(694, 634, 65, 50);
        frame.getContentPane().add(calc);

        frame.setVisible(true);

        for(int i = 0 ; i < 13 ; i++ ){
            int j = i;

            minus[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if (cnt[j] > 0) {
                        cnt[j] = cnt[j] - 1;
                        cnt_in[j].setText(cnt[j] + "");
                        total_price -= price[j];
                        total_out.setText(total_price + "");
                    } 
                    else {
                        minus[j].setEnabled(false);
                    }
                }
            });

            plus[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    if(cnt[j] == 0) {
                        minus[j].setEnabled(true);
                    }
                    cnt[j] =cnt[j] + 1;
                    cnt_in[j].setText(cnt[j] + "");
                    total_price += price[j];
                    total_out.setText(total_price + "");
                    if (cnt[j] > 0) {
                        minus[j].setEnabled(true);
                    }
                }
            });
        }

        calc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Integer.parseInt(money_in.getText()) < total_price) {
                    JOptionPane result = new JOptionPane();
                    result.showMessageDialog(null, "잔액이 부족해 주문할 수 없습니다.", "잔액 부족", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    int coin[] = {10000, 5000, 1000, 500, 100};
                    int coin_cnt[] = {0, 0, 0, 0, 0};
                    int change = Integer.parseInt(money_in.getText()) - total_price;

                    for(int i = 0 ; i < coin.length ; i++){
                        coin_cnt[i] = change/coin[i];
                        change = change - (coin[i] * coin_cnt[i]);
                    }

                    JOptionPane result = new JOptionPane();
                    result.showMessageDialog(null, "거스름돈은" + (Integer.parseInt(money_in.getText()) - total_price) + "원 입니다.\n" +
                            "10000원권 : " + coin_cnt[0] + "장\n" + "5000원권 : " + coin_cnt[1] + "장\n" + "1000원권 : " + coin_cnt[2] + "장\n" +
                            "500원 : " + coin_cnt[3] + "개\n" + "100원 : " + coin_cnt[4] + "개\n" , "거스름돈 반환", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public ImageIcon imageSetSize(ImageIcon icon, int i, int j){
        Image ximg = icon.getImage();
        Image yimg = ximg.getScaledInstance(i, j, Image.SCALE_SMOOTH);
        ImageIcon xyimg = new ImageIcon(yimg);
        return xyimg;
    }

    public static void main(String args[]){
        App app = new App();
    }
}
