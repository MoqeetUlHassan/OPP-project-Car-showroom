import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.*;

public class SEARCH implements ActionListener {
    ImageLabel background = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\add.jpg"), 600, 400, Image.SCALE_SMOOTH, new Rectangle(0,0,600,400));
    ImageLabel background2 = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\add.jpg"), 600, 400, Image.SCALE_SMOOTH, new Rectangle(0,0,600,400));
    ImageLabel background3 = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\add.jpg"), 600, 400, Image.SCALE_SMOOTH, new Rectangle(0,0,600,400));

    JFrame SEARCH;
    JLabel Carname, Carmake;
    JTextField T1,T2;
    JButton searchByName, searchByMake, search, search1, back, back1 , bac;
    JPanel P1= new JPanel();
    JPanel P2 = new JPanel();
    JPanel P3 = new JPanel();

    SEARCH(){
        SEARCH = new JFrame();
        SEARCH.setBounds(420,65,600,400);
        SEARCH.setVisible(true);
        SEARCH.setLayout(null);

        //setResizable(false);
        P1.setBounds(0,00,600, 400);
        P2.setBounds(00,00,600, 400);
        P3.setBounds(00,00,600, 400);

        Carname =new JLabel("Enter Car Name:");
        Carmake = new JLabel("Enter Car Make:");
        T1=new JTextField();
        T2=new JTextField();
        search=new JButton("Search");
        search1 = new JButton("search");
        back=new JButton("Back");
        back1 = new JButton("Back");
        searchByName = new JButton("Search By Name");
        searchByName.setBackground(Color.black);
        searchByName.setForeground(Color.white);
        searchByMake = new JButton("Search By Make");
        searchByMake.setBackground(Color.black);
        searchByMake.setForeground(Color.white);


        //	--------------------------------P1----------------------------------------------------

        searchByName.setBounds(80,150,200,80);
        searchByMake.setBounds(320,150,200,80);
        bac = new JButton("back");
        bac.setBounds(170, 270,200,70 );
        bac.setBackground(Color.black);
        bac.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\bacc.png"));
        bac.setOpaque(false);
        bac.setContentAreaFilled(false);
        bac.setBorderPainted(false);
        bac.addActionListener(this);


        P1.add(background);
        background.add(searchByName);
        background.add(bac);
        background.add(searchByMake);
        SEARCH.add(P1);
        P1.setVisible(true);

        searchByName.addActionListener(this);
        searchByMake.addActionListener(this);
//-------------------------------------------------P2------------------------------------------------------
        Carname.setBounds(70,100,100,100);
        T1.setBounds( 200, 130, 200, 40);
        search.setBounds(110,260,200,70 );
        search.setBackground(Color.black);
        search.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\search.png"));
        search.setOpaque(false);
        search.setContentAreaFilled(false);
        search.setBorderPainted(false);
        back.setBounds(380, 260,200,70 );
        back.setBackground(Color.black);
        back.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\bacc.png"));
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);


        search.addActionListener(this);
        back.addActionListener(this);
        P2.add(background2);
        background2.add(Carname);
        background2.add(T1);
        background2.add(search);
        background2.add(back);

        //-------------------------------------------------P3------------------------------------------------------
        Carmake.setBounds(70,100,100,100);
        T2.setBounds(200, 130, 200, 40);
        search1.setBounds(110,260,200,70 );
        search1.setBackground(Color.black);
        search1.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\search.png"));
        search1.setOpaque(false);
        search1.setContentAreaFilled(false);
        search1.setBorderPainted(false);
        back1.setBounds(380, 260,200,70 );
        back1.setBackground(Color.black);
        back1.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\bacc.png"));
        back1.setOpaque(false);
        back1.setContentAreaFilled(false);
        back1.setBorderPainted(false);

        //MyActionListener A=new MyActionListener();
        search1.addActionListener(this);
        back1.addActionListener(this);
        P3.add(background3);
        background3.add(Carmake);
        background3.add(T2);
        background3.add(search1);
        background3.add(back1);


    }
    @Override
    public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==searchByName) {
                P1.setVisible(false);
                SEARCH.remove(P1);
                SEARCH.add(P2);
                P2.setVisible(true);

            }

            if(ae.getSource() == searchByMake) {
                P1.setVisible(false);
                SEARCH.remove(P1);
                SEARCH.add(P3);
                P3.setVisible(true);
            }

            if(ae.getActionCommand().equals("Search") ) {
                ArrayList<Car> CarList=Helper.readAllDataCar();
                for(int i=0;i<=CarList.size();i++) {
                    try{if(CarList.get(i).getCarModel().equalsIgnoreCase(T1.getText())) {
                        JOptionPane.showMessageDialog(new JFrame(),"Car details:  \nMake: "+CarList.get(i).getCarMake()+
                                "\nName :"+CarList.get(i).getCarModel()+"\nColor: "+CarList.get(i).getCarColour()+
                                "\nCar Year: "+CarList.get(i).getCarColour()+"\nHorse Power: "+CarList.get(i).getHorsePower()+
                                "\nCar Transmission (i.e Automatic or Manual?) :"+CarList.get(i).getCarTransmission()+
                                "\nPrice of Car: "+CarList.get(i).getCarPrice());}

                    }catch(IndexOutOfBoundsException ioe1){break;}
                }

            }

            if(ae.getSource() == search1) {
                ArrayList<Car> CarList=Helper.readAllDataCar();
                for(int i=0;i<=CarList.size();i++) {
                    try{if(CarList.get(i).getCarMake().equalsIgnoreCase(T2.getText())) {
                        JOptionPane.showMessageDialog(new JFrame(),"Car details:  \nMake: "+CarList.get(i).getCarMake()+
                                "\nName :"+CarList.get(i).getCarModel()+"\nColor: "+CarList.get(i).getCarColour()+
                                "\nCar Year: "+CarList.get(i).getCarColour()+"\nHorse Power: "+CarList.get(i).getHorsePower()+
                                "\nCar Transmission (i.e Automatic or Manual?) :"+CarList.get(i).getCarTransmission()+
                                "\nPrice of Car: "+CarList.get(i).getCarPrice());}
                    }
                    catch (IndexOutOfBoundsException ieo12){

                        System.out.println("not found");break;}
                }

            }

            if(ae.getSource()==back){
                SEARCH.remove(P2);
                SEARCH.add(P1);
                P2.setVisible(false);
                P1.setVisible(true);

            }

            if(ae.getSource()==back1){
                SEARCH.remove(P3);
                P3.setVisible(false);
                SEARCH.add(P1);
                P1.setVisible(true);

            }
            if(ae.getSource()== bac){SEARCH.dispose();}
        }
    }
