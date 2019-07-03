import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Delete extends JFrame implements ActionListener{
        JButton next, back;
        JLabel data;
        String nexts;
        JFrame deleteCar;
        String message = "vehical not found";
        Border emptyBorder = BorderFactory.createEmptyBorder();
        ArrayList<Car> Carlist2 = Helper.readAllDataCar();
        public String show(String input) {
            Car cardelete;
            if (IsCarmodelmatched(input) != null) {
                cardelete = IsCarmodelmatched(input);
                cardelete = IsCarmodelmatched(input);
                if (Ismakematched(cardelete)) {
                    message = "     Model:" + cardelete.getCarModel() +
                            "\n     Make: " + cardelete.getCarMake() +
                            "\n     Color: " + cardelete.getCarColour() +
                            "\n     Transmission: " + cardelete.getCarTransmission() +
                            "\n     Year: " + cardelete.getCarYear() +
                            "\n     Price: " + cardelete.getCarPrice();

                    Carlist2.remove(input);

                }

            }

            return message;
        }
        Delete(String input){
            ImageLabel background = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\update.jpg"), 600, 400, Image.SCALE_SMOOTH, new Rectangle(0,0,600,400));

            nexts = input;
            next = new JButton("Delete");
            next.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\show.png"));
            next.setBounds(50,300,200,50);
            next.setOpaque(false);
            next.setBackground(Color.black);
            next.setBorder(emptyBorder);
            next.addActionListener((ActionListener) this);
            next.validate();

            deleteCar = new JFrame();
            deleteCar.setVisible(true);
            deleteCar.setLayout(null);
            deleteCar.setBounds(300,160,600,400);

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
            back.addActionListener((ActionListener) this);
            background.add(back);
            background.add(next);
            background.add(data);
            deleteCar.add(background);
        }
        public Car IsCarmodelmatched(String deleted) {
            for (Car p : Carlist2) {
                if (p.getCarModel().equalsIgnoreCase(deleted)) {
                    return p;
                }
            }
            return null;
        }

        public boolean Ismakematched(Car deleted) {
            for (Car p : Carlist2) {
                if (p.getCarMake().equalsIgnoreCase(deleted.getCarMake())) {
                    return true;
                }
            }
            return false;
        }


        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == next){
                UIManager.put("OptionPane.okButtonText","ok");
                JOptionPane.showMessageDialog(null, message);
                Helper.removeCar(nexts);


            }

            if(e.getSource()==back){deleteCar.dispose();}
        }
    }






