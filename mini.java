package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {

    String pin;
    JButton button;
    mini(String pin){
        this.pin = pin;

        setSize(400,600);
        setLocation(0,0);
        setLayout(null);

        JLabel label1 = new JLabel();
        label1.setBounds(100,140,400,200);
        add(label1);

        JLabel label2 = new JLabel("State Bank of India");
        label2.setFont(new Font("System",Font.BOLD,20));
        label2.setBounds(110,20,200,20);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20,80,300,20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20,400,300,20);
        add(label4);

        try{
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from login where pin = '"+pin+"' ");
            while (resultSet.next()) {
                label3.setText("Card Number : "+resultSet.getString("card_no").substring(0,4)+ "XXXXXXXX"+resultSet.getString("card_no").substring(12));
            }

        }catch (Exception e) {
            e.printStackTrace();
        }

        try {
            int balance =0;
            Con c = new Con();
            ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while (resultSet.next())
            {
                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+"<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs. "+balance);
            label4.setBounds(20,450,500,30);
            label4.setFont(new Font("Raleway",Font.BOLD,20));

        }catch (Exception e) {
            e.printStackTrace();
        }
        button = new JButton("Exit");
        button.setFont(new Font("Raleway",Font.BOLD,15));
        button.setBounds(200,500,180,35);
        button.addActionListener(this);
        button.setBackground(Color.WHITE);
        button.setForeground(Color.BLACK);
        add(button);



        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }

    public static void main(String[] args) {
        new mini("");

    }
}
