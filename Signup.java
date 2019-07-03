import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Signup extends JFrame {
    JLabel a1, a2, a3, a5, a6;
    JTextField Username, CNIC, Phone, Name;
    JPasswordField password;
    JButton submit,back;
    private ArrayList<Person> name;

    public Signup() {
        setLayout(new GridLayout(6, 2));
        setBounds(420,65,400, 400);
        setVisible(true);
        JLabel a1 = new JLabel("Enter Username:");
        add(a1);
        Username = new JTextField();
        add(Username);
        JLabel a5 = new JLabel("Enter Phone:");
        add(a5);
        Phone = new JTextField();
        add(Phone);
        JLabel a2 = new JLabel("Enter CNIC:");
        add(a2);
        CNIC = new JTextField();
        add(CNIC);
        JLabel a3 = new JLabel("Enter Password:");
        add(a3);
        password = new JPasswordField();
        add(password);
        JLabel a6 = new JLabel("Enter Name:");
        add(a6);
        Name = new JTextField();
        add(Name);
        submit = new JButton("submit");
        add(submit);
        MyActionListener a = new MyActionListener();
        submit.addActionListener(a);
        back = new JButton("back");
        add(back);
        back.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\bacc.png"));
        back.addActionListener(a);


    }

    public class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            name = new ArrayList<Person>();
            if(e.getSource() == submit){
                try{
                    System.out.println(password.getName());
                Person ss = new Person(Name.getText(),password.getPassword() ,Username.getText(),CNIC.getText(),Integer.parseInt(Phone.getText()));
                name = Helper.readAllDataCustomer();
                name.add(ss);
                Helper.addArrayListToCustomerFile(name);
                dispose();
            } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(new JFrame(),"kindly fill all the field correctly");
                }
            }
            if(e.getSource() == back){
                dispose();
            }



        }
    }
}



