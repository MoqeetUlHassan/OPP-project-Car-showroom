import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Update extends JFrame {
    Border emptyBorder = BorderFactory.createEmptyBorder();
    JRadioButton manual = new JRadioButton();
    JRadioButton   auto = new JRadioButton();
    ButtonGroup trans;
    JLabel L1,L2,L3,L4,L5,L6,L7,name,make;
    JTextField T1,T2,T3,T4,T5,T7,Name,Make;
    JButton B1,B2;
    String transm;
    Car update;
    int check=0;

    Update(){
        super("Update Car");
        ArrayList<Car> read = Helper.readAllDataCar();
        ImageLabel background = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\update.jpg"), 600, 400, Image.SCALE_SMOOTH, new Rectangle(0,0,600,400));
        add(background);

        setBounds(420,200,600,400);
        setBackground(Color.BLACK);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        L1=new JLabel("New Make: ");
        L1.setForeground(Color.white);
        L1.setBounds(30,30,200,25);
        L2=new JLabel("New Model:");
        L2.setForeground(Color.white);
        L2.setBounds(30,60,200,25);
        L3=new JLabel("New Colour:");
        L3.setForeground(Color.white);
        L3.setBounds(30,90,200,25);
        L4=new JLabel("New Registration year:");
        L4.setForeground(Color.white);
        L4.setBounds(30,120,200,25);
        L5=new JLabel("New Horse Power:");
        L5.setForeground(Color.white);
        L5.setBounds(30,150,200,25);
        L6=new JLabel("New Car Transmission:");
        L6.setForeground(Color.white);
        L6.setBounds(30,180,200,25);
        L7=new JLabel("New Price:");
        L7.setForeground(Color.white);
        L7.setBounds(30,210,200,25);
        name=new JLabel("Name of car to be updated:");
        name.setForeground(Color.white);
        name.setBounds(30,240,200,25);
        make=new JLabel("Make of car to be updated");
        make.setForeground(Color.white);
        make.setBounds(30,270,200,25);


        T1=new JTextField(10);
        T1.setBounds(330,30,200,25);
        T2=new JTextField(10);
        T2.setBounds(330,60,200,25);
        T3=new JTextField(10);
        T3.setBounds(330,90,200,25);
        T4=new JTextField(10);
        T4.setBounds(330,120,200,25);
        T5=new JTextField(10);
        T5.setBounds(330,150,200,25);
        trans = new ButtonGroup();
        manual.setText("manual");
        manual.setBounds(330,180,70,25);
        auto.setText("automatic");
        auto.setBounds(400,180,100,25);
        trans.add(manual);
        trans.add(auto);
        T7=new JTextField(10);
        T7.setBounds(330,210,200,25);
        Name=new JTextField(10);
        Name.setBounds(330,240,200,25);
        Make=new JTextField(10);
        Make.setBounds(330,270,200,25);

        B1=new JButton("Update Car");
        B1.setForeground(Color.white);
        B1.setBounds(30,300,200,50);
        B2=new JButton("Back");
        B2.setForeground(Color.white);
        B2.setBounds(330,300,200,50);
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
        background.add(Name);
        background.add(name);
        background.add(Make);
        background.add(make);
        B1.setBackground(Color.black);
        B1.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\edit.png"));
        B1.setBorder(emptyBorder);
        B1.setOpaque(false);
        background.add(B2);
        B2.setBackground(Color.black);
        B2.setOpaque(false);
        B2.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\bacc.png"));
        B2.setBorder(emptyBorder);

    }


    public class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent ae) {
            if(manual.isSelected()){
                transm = "manual"; }
            else if(auto.isSelected()){transm = "automatic";}

            if(ae.getActionCommand().equals("Update Car")) {

                try{
                    Car c =new Car(T1.getText(),T2.getText(),T3.getText(),T4.getText(),T5.getText(),
                            transm,Double.parseDouble(T7.getText()));

                    ArrayList<Car> CarList=Helper.readAllDataCar();
                    for(int i=0;i<=CarList.size();i++) {
                        try{if(CarList.get(i).getCarModel().equalsIgnoreCase(Name.getText())&& CarList.get(i).getCarMake().equalsIgnoreCase(Make.getText())) {
                            CarList.set(i, c);
                            Helper.addArrayListToCarFile(CarList);
                            check= 1;
                            JOptionPane.showMessageDialog(new JFrame(),"Car updated successfully");
                            dispose();


                        }

                        }

                    catch(IndexOutOfBoundsException ioe1){break;}
                    }
                    if(check==0){
                        JOptionPane.showMessageDialog(new JFrame(), "Car not found ");
                    }


                }
                catch (NumberFormatException aa){
                    JOptionPane.showMessageDialog(new JFrame(),"Kindly Fill All the Fields Correctly");
                }

            }
            if(ae.getActionCommand().equals("Back")) {
                dispose();
            }
        }



    }
}





