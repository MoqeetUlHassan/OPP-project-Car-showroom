

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

public class AddCarFrame extends JFrame {
    /**
     *
     */
    Border emptyBorder = BorderFactory.createEmptyBorder();
    JRadioButton manual = new JRadioButton();
     JRadioButton   auto = new JRadioButton();
    ButtonGroup trans;
    JLabel L1,L2,L3,L4,L5,L6,L7;
    JTextField T1,T2,T3,T4,T5,T7;
    JButton B1,B2;
    String transm;


    AddCarFrame(){
        super("Add Car");
        ImageLabel background = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\add.jpg"), 600, 400, Image.SCALE_SMOOTH, new Rectangle(0,0,600,400));
        add(background);

        setBounds(420,200,600,400);
        setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        L1=new JLabel("Car Make: ");
        L1.setBounds(30,40,200,25);
        L2=new JLabel("Car Model:");
        L2.setBounds(30,70,200,25);
        L3=new JLabel("Car Colour:");
        L3.setBounds(30,100,200,25);
        L4=new JLabel("Car Registration year:");
        L4.setBounds(30,130,200,25);
        L5=new JLabel("Horse Power:");
        L5.setBounds(30,160,200,25);
        L6=new JLabel("Car Transmission:");
        L6.setBounds(30,190,200,25);
        L7=new JLabel("Car Price:");
        L7.setBounds(30,220,200,25);

        T1=new JTextField(10);
        T1.setBounds(330,40,200,25);
        T2=new JTextField(10);
        T2.setBounds(330,70,200,25);
        T3=new JTextField(10);
        T3.setBounds(330,100,200,25);
        T4=new JTextField(10);
        T4.setBounds(330,130,200,25);
        T5=new JTextField(10);
        T5.setBounds(330,160,200,25);
        trans = new ButtonGroup();
         manual.setText("manual");
        manual.setBounds(330,190,70,25);
        auto.setText("automatic");
        auto.setBounds(400,190,100,25);
        trans.add(manual);
        trans.add(auto);
        T7=new JTextField(10);
        T7.setBounds(330,220,200,25);

        B1=new JButton("Add Car");
        B1.setBounds(30,260,200,50);
        B2=new JButton("Back");
        B2.setBounds(330,260,200,50);
        MyActionListener A=new MyActionListener();
        B1.addActionListener(A);
        B2.addActionListener(A);
        background.add(L1);
        background.add(T1);
        background.add(L2);
        background.add(T2);
        background.add(L3);
        background.add(T3);
        background.add(L4);
        background.add(T4);
        background.add(L5);
        background.add(T5);
        background.add(L6);
        background.add(auto);
        background.add(manual);
        background.add(L7);
        background.add(T7);
        background.add(B1);
        B1.setBackground(Color.black);
        B1.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\add.png"));
        B1.setBorder(emptyBorder);
        B1.setOpaque(false);
        background.add(B2);
        B2.setBackground(Color.black);
        B2.setOpaque(false);
        B2.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\bacc.png"));
        B2.setBorder(emptyBorder);


    }


    public class MyActionListener implements ActionListener{
        public void actionPerformed(ActionEvent ae) {
            if(manual.isSelected()){
                transm = "manual"; }
            else if(auto.isSelected()){transm = "automatic";}

            if(ae.getActionCommand().equals("Add Car")) {

try{
                Car c=new Car(T1.getText(),T2.getText(),T3.getText(),T4.getText(),T5.getText(),
                        transm,Double.parseDouble(T7.getText()));

                ArrayList<Car> CarList=Helper.readAllDataCar();
                CarList.add(c);
                Helper.addArrayListToCarFile(CarList);
                JOptionPane.showMessageDialog(new JFrame(),"Car added sucessfully");
                dispose();}
catch (NumberFormatException aa){
    JOptionPane.showMessageDialog(new JFrame(),"Kindly Fill All the Fields Correctly");
}

            }
            if(ae.getActionCommand().equals("Back")) {
                dispose();
                //f.setVisible(true);
            }
        }
    }
}