import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class book extends JFrame implements ActionListener {
JButton next, back;
JLabel data;
String nexts;
JFrame info;
String message = "vehical not found";
    Border emptyBorder = BorderFactory.createEmptyBorder();
ArrayList<Car> Carlist2 = Helper.readAllDataCar();
    public String show(String input) {
        Car carbooking;
        if (IsCarmodelmatched(input) != null) {
            carbooking = IsCarmodelmatched(input);
            carbooking = IsCarmodelmatched(input);
            if (Ismakematched(carbooking)) {

                message = "     Model:" + carbooking.getCarModel() +
                        "\n     Make: " + carbooking.getCarMake() +
                        "\n     Color: " + carbooking.getCarColour() +
                        "\n     Transmission: " + carbooking.getCarTransmission() +
                        "\n     Year: " + carbooking.getCarYear() +
                        "\n     Price: " + carbooking.getCarPrice();

                Carlist2.remove(input);

            }

        }

        return message;
    }
    public book(String input){
        ImageLabel background = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\update.jpg"), 600, 400, Image.SCALE_SMOOTH, new Rectangle(0,0,600,400));

        nexts = input;
        next = new JButton("Display and Book");
        next.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\show.png"));
        next.setBounds(50,300,200,50);
        next.setOpaque(false);
        next.setBackground(Color.black);
        next.setBorder(emptyBorder);
        next.addActionListener(this);
        next.validate();

        info = new JFrame();
        info.setVisible(true);
        info.setLayout(null);
        info.setBounds(300,160,600,400);

        data = new JLabel(""+ show(input)+"");
        data.setBackground(new Color(128,128,128,120));
        data.setOpaque(true);
        data.setForeground(Color.white);
        data.setBounds(0,40,600,100);


        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(300,280,160,64);
        back.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\bacc.png"));
        back.setOpaque(false);
        back.setBorder(emptyBorder);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        back.addActionListener(this);
        background.add(back);
        background.add(next);
        background.add(data);
        info.add(background);
    }
    public Car IsCarmodelmatched(String booked) {
        for (Car p : Carlist2) {
            if (p.getCarModel().equalsIgnoreCase(booked)) {
                return p;
            }
        }
        return null;
    }

    public boolean Ismakematched(Car booked) {
        for (Car p : Carlist2) {
            if (p.getCarMake().equalsIgnoreCase(booked.getCarMake())) {
                return true;
            }
        }
        return false;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Display and Book")){
            UIManager.put("OptionPane.okButtonText","ok");
            JOptionPane.showMessageDialog(null, message);
            Helper.removeCar(nexts);
        }

        if(e.getSource()==back){info.dispose();}
    }
}

