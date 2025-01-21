package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox1, comboBox2, comboBox3, comboBox4, comboBox5;
    JTextField textPan, textAadhar;
    JRadioButton r1, r2, e1, e2;
    JButton next;
    String formno;
    Signup2(String formno){
        super("APPLICATION FORM");

        this.formno = formno;

        JLabel l1 = new JLabel("Page2 : ");
        l1.setBounds(200, 50, 600,30);
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(l1);

        JLabel l2 = new JLabel("Addition Details");
        l2.setFont(new Font("Relaway", Font.BOLD, 22));
        l2.setBounds(300, 50, 600, 30);
        add(l2);

        JLabel l3 = new JLabel("Religion : ");
        l3.setFont(new Font("Ralaway", Font.BOLD, 20));
        l3.setBounds(100, 150, 100, 30);
        add(l3);

        String religion [] = {"Hindu", "Muslim", "Sikh", "Christion", "Other"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(Color.WHITE);
        comboBox1.setForeground(Color.BLACK);
        comboBox1.setFont(new Font("Calibri", Font.BOLD, 16));
        comboBox1.setBounds(300, 150, 300, 30);
        add(comboBox1);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD, 20));
        l4.setBounds(100, 190, 200, 30);
        add(l4);

        String category [] = {"General","OBC", "SC", "ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setForeground(Color.BLACK);
        comboBox2.setFont(new Font("Calibri", Font.BOLD, 16));
        comboBox2.setBounds(300, 190, 300, 30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD, 20));
        l5.setBounds(100, 240, 200, 30);
        add(l5);

        String income [] = {"Null", "<1,50,000>", "<2,50,000>","5,50,000","Uptp 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setForeground(Color.BLACK);
        comboBox3.setFont(new Font("Calibri", Font.BOLD, 16));
        comboBox3.setBounds(300, 240, 300, 30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD, 20));
        l6.setBounds(100, 290, 200, 30);
        add(l6);

        String educational [] = {"Non-graduate", "Graduate", "Post-Graduate","Doctrate","Other",};
        comboBox4 = new JComboBox(educational);
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setForeground(Color.BLACK);
        comboBox4.setFont(new Font("Calibri", Font.BOLD, 16));
        comboBox4.setBounds(300, 290, 300, 30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD, 20));
        l7.setBounds(100, 340, 200, 30);
        add(l7);

        String occupationa [] = {"Salaried", "Self-Employed", "Business","Student", "Retired", "Other",};
        comboBox5 = new JComboBox(occupationa);
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setForeground(Color.BLACK);
        comboBox5.setFont(new Font("Calibri", Font.BOLD, 16));
        comboBox5.setBounds(300, 340, 300, 30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD, 20));
        l8.setBounds(100, 390, 200, 30);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD, 14));
        textPan.setBounds(300, 390, 300, 30);
        add(textPan);

        JLabel l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD, 20));
        l9.setBounds(100, 440, 200, 30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD, 14));
        textAadhar.setBounds(300, 440, 300, 30);
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD, 20));
        l10.setBounds(100, 490, 200, 30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(300, 490, 100, 30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 490, 100, 30);
        add(r2);

        JLabel l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD, 20));
        l11.setBounds(100, 540, 200, 30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD, 14));
        e1.setBounds(300, 540, 100, 30);
        add(e1);

        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD, 14));
        e2.setBounds(450, 540, 100, 30);
        add(e2);

        JLabel l12 = new JLabel("Form No : ");
        l12.setFont(new Font("Raleway", Font.BOLD, 16));
        l12.setBounds(650, 10, 120, 30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway", Font.BOLD, 16));
        l13.setBounds(730, 10, 120, 30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(620, 650, 100, 30);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(850,800);
        setLocation(450,80);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox1.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = " ";
        if(r1.isSelected()) {
            scitizen = "Yes";
        }
        else if(r2.isSelected()) {
            scitizen = "No";
        }
        String eAccount = " ";
        if(r1.isSelected()) {
            eAccount = "Yes";
        }
        else if(r2.isSelected()) {
            eAccount = "No";
        }

        try{
            if (textPan.getText().equals("") || textAadhar.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            }
            else {
                Con c1 = new Con();
                String q = "Insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"', '"+occ+"', '"+pan+"', '"+aadhar+"', '"+scitizen+"', '"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("");

    }
}
