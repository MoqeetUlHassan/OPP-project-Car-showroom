import jdk.nashorn.internal.objects.Global;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class MainFrame implements ActionListener {



        public Person per;
        JFrame fff =new JFrame("CAR SHOWROOM");
        JPanel j3 = new JPanel();
        JPanel j1 = new JPanel();
        JPanel j2 = new JPanel();
        JCheckBox showPassword = new JCheckBox("Show Password");


        JFrame wrong = new JFrame();
        JLabel pass = new JLabel("Password: ");
        JLabel nam = new JLabel("Username: ");
        JTextField un = new JTextField();
        JPasswordField pw = new JPasswordField();
        JButton logout = new JButton("logout");
        JButton delete = new JButton("Delete");
        JButton SIGNUP = new JButton("Sign up?");
        JButton close = new JButton();
        JButton min = new JButton();
        JButton display = new JButton("Display Vehicals");
        JButton update = new JButton("Update Vehical");
        JButton bac = new JButton("Back");
        JButton LOGIN = new JButton("Login");
        JButton SEARCH = new JButton("Search");
        JButton ADD = new JButton("Sell");
        JButton BOOKo = new JButton("book");
        Backimage mainback = new Backimage();
        Border emptyBorder = BorderFactory.createEmptyBorder();

        JLabel text = new JLabel("WELCOME TO SHOWROOM", SwingConstants.CENTER);

    MainFrame(){
        ImageLabel background = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\backmain.jpg"), 800, 600, Image.SCALE_SMOOTH, new Rectangle(0,0,800,600));
        j1.add(background);
        j1.setLayout(null);
        j1.add(mainback);
        mainback.setVisible(true);
        pass.setFont(new Font("Lucida Handwriting", Font.CENTER_BASELINE, 20));
        nam.setFont(new Font("Lucida Handwriting", Font.CENTER_BASELINE, 20));
        un.setBounds(247,180,120,25);
        background.add(un);
        nam.setForeground(Color.white);
        nam.setBounds(240,150,140,25);
       background.add(nam);
       pass.setBounds(240,210,140,25);
        background.add(pass);
        pass.setForeground(Color.white);
        pw.setBounds(247,240,120,25);
        background.add(pw);
        SIGNUP.setBounds(20,500,120,20);
        SIGNUP.setBackground(Color.green);
        SIGNUP.validate();
        SIGNUP.setVisible(true);
        SIGNUP.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\info.png"));
        background.add(SIGNUP);

        LOGIN.setBounds(250,300,110,20);
        LOGIN.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\login.png"));
        LOGIN.setBackground(Color.GREEN);
        LOGIN.validate();

        background.add(LOGIN);


        showPassword.setForeground(Color.decode("#CEF8F5"));
        showPassword.setBounds(245,280,150,20);
        showPassword.setOpaque(false);
         background.add(showPassword);

       j1.setBackground(Color.black);

//------------------------------------------------------------------------------------------------------
        ImageLabel menuback = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\menuback.jpg"), 600, 600, Image.SCALE_SMOOTH, new Rectangle(0,0,600,600));
        j2.add(menuback);
        menuback.setBackground(Color.BLACK);
        JLabel menue = new JLabel("MENU");
        menue.setBackground(new Color(128,128,128,100));
        menue.setOpaque(true);
        menue.setForeground(Color.white);
        menue.setFont(new Font("Book Antiqua", Font.BOLD, 70));
        menuback.setLayout(null);
        menue.setBounds(180,100,230,80);
        menuback.add(menue);
        SEARCH.setBounds(200,315,210,100);
        SEARCH.setOpaque(false);
        SEARCH.setForeground(Color.black);
        SEARCH.setContentAreaFilled(false);
        SEARCH.setBorderPainted(false);
        SEARCH.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\car2.png"));
        menuback.add(SEARCH);
        ADD.setOpaque(false);
        ADD.setContentAreaFilled(false);
        ADD.setBorderPainted(false);
        ADD.setBounds(365,295,210,128);
        ADD.setForeground(Color.black);
        ADD.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\Car.png"));
        menuback.add(ADD);
        BOOKo.setOpaque(false);
        BOOKo.setContentAreaFilled(false);
        BOOKo.setBorderPainted(false);
        BOOKo.setBounds(20,300,200,128);
        BOOKo.setForeground(Color.black);
        BOOKo.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\Car.png"));
        menuback.add(BOOKo);
        BOOKo.addActionListener(this);
        bac.setBackground(Color.black);
        bac.setBounds(100,450,400,110);
        bac.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\back.png"));
        bac.setOpaque(false);
        bac.setContentAreaFilled(false);
        bac.setBorderPainted(false);


        display.setForeground(Color.black);
        display.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\show2.png"));
        display.setBounds(110, 270, 130, 35);
        display.setOpaque(true);
        display.setBackground(new Color(150,150,150 ));
        display.setBorder(BorderFactory.createEmptyBorder());
        display.addActionListener(this);
        menuback.add(display);

        update.setForeground(Color.black);
        update.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\edit.png"));
        update.setBounds(280, 270, 130, 35);
        update.setOpaque(true);
        update.setBackground(new Color(150,150,150 ));
        update.setBorder(BorderFactory.createEmptyBorder());
        update.addActionListener(this);
        menuback.add(update);

        delete.setForeground(Color.black);
        delete.setBounds(280, 220, 130, 35);
        delete.setOpaque(true);
        delete.setBackground(new Color(150,150,150 ));
        delete.setBorder(BorderFactory.createEmptyBorder());
        delete.addActionListener(this);
        menuback.add(delete);





        menuback.add(bac);
        menuback.setBackground(Color.black);
        text.setForeground(Color.cyan);
       j2.setVisible(false);



//------------------------------------------------------------------------------------------------------------------------
        text.setFont(new Font("Lucida Calligraphy", Font.BOLD, 26));
        close.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\erase.png"));
        close.setBounds(565,2,30,30);
        close.setBackground(Color.decode("#005DFF"));
        j3.add(close);
        close.validate();
        min.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\min.png" ));
        min.setBounds(540,10,22,22);
        min.setBackground(Color.BLUE);
        j3.add(min);
        min.validate();
        logout.setBorder(emptyBorder);
        logout.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\logout.png" ));
        logout.setBounds(0,1,100,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.white);
        j3.add(logout);
        logout.validate();
        j3.setLayout(new BorderLayout());
        j3.add(text,BorderLayout.NORTH);
        j3.setBackground(Color.BLACK);


        fff.setUndecorated(true);
        fff.setLayout(new BorderLayout());
        fff.add(j3 , BorderLayout.NORTH);
        fff.add(j1 , BorderLayout.CENTER);
        fff.setBounds(420,65,600,600);
        fff.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        fff.setVisible(true);


        LOGIN.addActionListener(this);
        showPassword.addActionListener(this);
        SIGNUP.addActionListener(this);
        SEARCH.addActionListener(this);
        ADD.addActionListener(this);
        min.addActionListener(this);
        close.addActionListener(this);
        bac.addActionListener(this);
        logout.addActionListener(this);

    }

    public Person Isusernamematched(String username){
        ArrayList<Person> CustomerList=Helper.readAllDataCustomer();
        for (Person p : CustomerList){
            if (p.getUsername().equalsIgnoreCase(username)){
                return p;
            }
        }
        return null;
    }

    public boolean IsPasswordmatched( Person customer ,char[] inputpass){
        char[] pass = customer.getPassword();
        if (inputpass.length == pass.length){
            for ( int i = 0 ; i < inputpass.length ; i++){
                if(pass[i] != inputpass[i])
                    return false;
            }
            return true;
        }
        return false;
    }


    @Override
public void actionPerformed(ActionEvent aa ){

        String pwdText = pw.toString();
        if(aa.getSource() == SIGNUP){
            Signup s = new Signup();
        }

        if(aa.getSource() == LOGIN){
            if (Isusernamematched(un.getText()) != null){
                per = Isusernamematched(un.getText());
                if (IsPasswordmatched(per, pw.getPassword())){
                    fff.remove(j1);
                    fff.add(j2);
                    j2.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(wrong,"WRONG PASSWORD");}
            }else
                JOptionPane.showMessageDialog(wrong,"Wrong Username");
                SIGNUP.setBackground(Color.RED);

        }



        if(aa.getSource()==bac){
        j2.setVisible(false);
        fff.remove(j2);
        fff.add(j1);

    }
        if (aa.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                pw.setEchoChar((char) 0);
            } else {
                pw.setEchoChar('*');
            }
        }
        if(aa.getSource()==BOOKo){
            UIManager.put("OptionPane.okButtonText","Find");
            String sss = JOptionPane.showInputDialog(null,"Enter vehicle name: ");
            if(sss!=null){
           book boking = new book(sss);}}

        if(aa.getSource()==SEARCH){SEARCH search = new SEARCH(); }
        if(aa.getSource() == delete)
        {
            UIManager.put("OptionPane.okButtonText","Find");
            String sss = JOptionPane.showInputDialog(null,"Enter vehicle name: ");
            Delete ddd = new Delete(sss);}
        if(aa.getSource()==ADD){AddCarFrame add = new AddCarFrame(); }
        if(aa.getSource()==min){fff.setState(fff.ICONIFIED);}
        if(aa.getSource()==close){ fff.dispose(); System.exit(0);  }
        if(aa.getSource()==logout){     fff.dispose();    MainFrame m = new MainFrame(); }
        if(aa.getSource()== display){Display d = new Display();}
        if(aa.getSource()== update){Update u = new Update();}

    }
}
