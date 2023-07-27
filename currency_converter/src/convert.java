import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class convert implements ActionListener {
    JLabel Display;
    JButton btn_info,btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_dot,btn_us_inr,btn_inr_usd,btn_clr;
    convert(){
        JFrame jf=new JFrame("Currency Converter");
        jf.setSize(400,300);
        jf.setLayout(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);

        //jlabel---------------------------------------------------
        Display=new JLabel("");
        Display.setBounds(0,20,400,50);
        Display.setHorizontalAlignment(SwingConstants.CENTER);
        Display.setBackground(Color.gray);
        Display.setForeground(Color.WHITE);
        Display.setOpaque(true);
        jf.add(Display);

        ///btns----------------------------------------------------
        btn_9=new JButton("9");
        btn_9.setBounds(100,110,50,50);
        btn_9.addActionListener(this);
        jf.add(btn_9);

        btn_8=new JButton("8");
        btn_8.setBounds(50,110,50,50);
        btn_8.addActionListener(this);
        jf.add(btn_8);

        btn_7=new JButton("7");
        btn_7.setBounds(0,110,50,50);
        btn_7.addActionListener(this);
        jf.add(btn_7);

        btn_4=new JButton("4");
        btn_4.setBounds(0,160,50,50);
        btn_4.addActionListener(this);
        jf.add(btn_4);

        btn_5=new JButton("5");
        btn_5.setBounds(50,160,50,50);
        btn_5.addActionListener(this);
        jf.add(btn_5);

        btn_6=new JButton("6");
        btn_6.setBounds(100,160,50,50);
        btn_6.addActionListener(this);
        jf.add(btn_6);

        btn_1=new JButton("1");
        btn_1.setBounds(0,210,50,50);
        btn_1.addActionListener(this);
        jf.add(btn_1);

        btn_2=new JButton("2");
        btn_2.setBounds(50,210,50,50);
        btn_2.addActionListener(this);
        jf.add(btn_2);

        btn_3=new JButton("3");
        btn_3.setBounds(100,210,50,50);
        btn_3.addActionListener(this);
        jf.add(btn_3);

        btn_0=new JButton("0");
        btn_0.setBounds(150,110,50,75);
        btn_0.addActionListener(this);
        jf.add(btn_0);

        btn_dot=new JButton(".");
        btn_dot.setBounds(150,185,50,75);
        btn_dot.addActionListener(this);
        jf.add(btn_dot);

        btn_info=new JButton("Info");
        btn_info.setBounds(275,80,75,30);
        btn_info.addActionListener(this);
        jf.add(btn_info);

        //btn_us_inr,btn_inr_usd,btn_clr-------------------
        btn_us_inr=new JButton("USD to INR");
        btn_us_inr.setBounds(200,160,150,50);
        btn_us_inr.addActionListener(this);
        jf.add(btn_us_inr);

        btn_inr_usd=new JButton("INR to USD");
        btn_inr_usd.setBounds(200,110,150,50);
        btn_inr_usd.addActionListener(this);
        jf.add(btn_inr_usd);

        btn_clr=new JButton("Clear");
        btn_clr.setBounds(200,210,150,50);
        btn_clr.addActionListener(this);
        jf.add(btn_clr);


    }
    public static void main(String[] args) {
        new convert();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_1){
            Display.getText();
            Display.setText(Display.getText()+"1");
        }
        else if(e.getSource()==btn_2){
            Display.getText();
            Display.setText(Display.getText()+"2");
        }
        else if(e.getSource()==btn_3){
            Display.getText();
            Display.setText(Display.getText()+"3");
        }
        else if(e.getSource()==btn_4){
            Display.getText();
            Display.setText(Display.getText()+"4");
        }
        else if(e.getSource()==btn_5){
            Display.getText();
            Display.setText(Display.getText()+"5");
        }
        else if(e.getSource()==btn_6){
            Display.getText();
            Display.setText(Display.getText()+"6");
        }
        else if(e.getSource()==btn_7){
            Display.getText();
            Display.setText(Display.getText()+"7");
        }
        else if(e.getSource()==btn_8){
            Display.getText();
            Display.setText(Display.getText()+"8");
        }
        else if(e.getSource()==btn_9){
            Display.getText();
            Display.setText(Display.getText()+"9");
        }
        else if(e.getSource()==btn_0){
            Display.getText();
            Display.setText(Display.getText()+"0");
        }
        else if(e.getSource()==btn_dot){
            Display.getText();
            Display.setText(Display.getText()+".");
        }
        else if(e.getSource()==btn_info){
            Display.setText("Developed By Sanju !!!");
        }
        else if(e.getSource()==btn_us_inr){
            String oldval=Display.getText();
            Double newval=Double.parseDouble(oldval);
            Double result=newval*82.22;
            Display.setText(result+" "+"Indian Rupees");
        }
        else if(e.getSource()==btn_inr_usd){
            String oldval=Display.getText();
            Double newval=Double.parseDouble(oldval);
            Double result=newval/82.22;
            Display.setText(result+" "+"Us Dollars");
        }

        else{
            Display.setText("");
        }
    }
}
