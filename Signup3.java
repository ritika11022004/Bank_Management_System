package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6;
    JButton s, c;
    String formno;
    Signup3( String formno){
        this.formno = formno;

        JLabel l1 = new JLabel("Page3 : ");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(200, 50, 600,30);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(300, 50, 600,30);
        add(l2);

        JLabel l3 = new JLabel("Account Type : ");
        l3.setFont(new Font("Raleway", Font.BOLD, 20));
        l3.setBounds(100, 140, 200,30);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(100, 170, 250, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(350, 170, 250, 30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(100, 200, 250, 30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBounds(350, 200, 250, 30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100, 250, 200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway", Font.ITALIC, 14));
        l5.setBounds(100, 270, 200,30);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-XXXX ");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(350, 250, 300,30);
        add(l6);

        JLabel l7 = new JLabel("(It would appear on atm card/cheque Book & Statement)");
        l7.setFont(new Font("Raleway", Font.ITALIC, 14));
        l7.setBounds(350, 270, 500,30);
        add(l7);

        JLabel l8 = new JLabel("PIN : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100, 320, 200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(350, 320, 200,30);
        add(l9);

        JLabel l10 = new JLabel("(Enter 4-digit Password)");
        l10.setFont(new Font("Raleway", Font.ITALIC, 14));
        l10.setBounds(100, 340, 200,30);
        add(l10);

        JLabel l11 = new JLabel("Services Required : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100, 390, 200,30);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        c1.setBounds(100, 420, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        c2.setBounds(300, 420, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Bankikg");
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        c3.setBounds(100, 450, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email Alerts");
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        c4.setBounds(300, 450, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
        c5.setBounds(100, 480, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setFont(new Font("Raleway", Font.BOLD, 14));
        c6.setBounds(300, 480, 200, 30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by declares that the above entired details correct to the best of my knowledge.", true);
        c7.setFont(new Font("Raleway", Font.BOLD, 14));
        c7.setBounds(100, 600, 650, 30);
        add(c7);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 16));
        l12.setBounds(650, 10, 120, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 16));
        l13.setBounds(760, 10, 120, 30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD, 14));
        s.setBackground(Color.WHITE);
        s.setForeground(Color.BLACK);
        s.setBounds(300, 650, 130, 30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD, 14));
        c.setBackground(Color.WHITE);
        c.setForeground(Color.BLACK);
        c.setBounds(460, 650, 130, 30);
        c.addActionListener(this);
        add(c);



        setSize(850, 800);
        setLayout(null);
        setLocation(400, 20);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()) {
            atype = "Saving Account";
        }else if (r2.isSelected()) {
            atype = "Fixed Deposit Account";
        }else if (r3.isSelected()) {
            atype = "Current Account";
        }else if (r4.isSelected()) {
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String card_no = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()) {
            fac = fac+"ATM CARD";
        }
        else if(c2.isSelected()) {
            fac = fac+"Internet Banking";
        }
        else if(c3.isSelected()) {
            fac = fac+"Mobile Banking";
        }
        else if(c4.isSelected()) {
            fac = fac+"Email Alerts";
        }
        else if(c5.isSelected()) {
            fac = fac+"Cheque Book";
        }
        else if(c6.isSelected()) {
            fac = fac+"E-Statement";
        }

        try{
            if (e.getSource()==s) {
                if (atype.equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill all the fields");
                }
                else{
                    Con c1 = new Con();
                    String q1 = "insert into signupthree values ('"+formno+"', '"+atype+"', '"+card_no+"', '"+pin+"', '"+fac+"')";
                    String q2 = "insert into login values('"+formno+"', '"+card_no+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card number : "+card_no+"\n Pin : "+pin );
                    new Deposit(pin);
                    setVisible(false);

                }
            }
            else if(e.getSource()==c) {
                System.exit(0);
            }

        }catch (Exception E) {
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup3("");

    }
}
