import javax.swing.*;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Display  extends  JFrame implements ActionListener {
    JButton next, back;

    JFrame display;
    ImageLabel menuback = new ImageLabel("", JLabel.CENTER, new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\menuback.jpg"), 600, 600, Image.SCALE_SMOOTH, new Rectangle(0, 0, 600, 600));


    Display() {
        display = new JFrame("DISPLAY ALL VEHICALS");
        display.setVisible(true);
        display.add(menuback);
        display.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        display.setLayout(null);
        display.setBounds(420, 50, 600, 600);

        next = new JButton(" Show All Cars");
        next.setForeground(Color.white);
        next.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\show2.png"));
        next.setBounds(225, 250, 130, 65);
        next.setOpaque(false);
        next.setBackground(Color.darkGray);
        next.setBorder(BorderFactory.createEmptyBorder());
        next.addActionListener(this);
        menuback.add(next);


        back = new JButton("back");
        back.setBounds(100, 350,400,110 );
        back.setBackground(Color.black);
        back.setIcon(new ImageIcon("C:\\Users\\Moqeet Ul Hassan\\IdeaProjects\\Project\\out\\img\\back.png"));
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setBorderPainted(false);
        back.addActionListener(this);
        menuback.add(back);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== back){display.dispose();}
        if (e.getSource() == next) {
            int x= 0;
            ArrayList<Car> CarList=Helper.readAllDataCar();
            try{
            for(int i=0;i<=CarList.size();i++) {
                UIManager.put("OptionPane.yesButtonText", "Next");
                UIManager.put("OptionPane.noButtonText", "cancel");
                if(x==0){
                x = JOptionPane.showConfirmDialog(new JFrame(),"Car details:  \nMake: "+CarList.get(i).getCarMake()+
                        "\nName :"+CarList.get(i).getCarModel()+
                        "\nColor: "+CarList.get(i).getCarColour()+
                        "\nCar Year: "+CarList.get(i).getCarYear()+
                        "\nHorse Power: "+CarList.get(i).getHorsePower()+
                        "\nCar Transmission (i.e Automatic or Manual?) :"+CarList.get(i).getCarTransmission()+
                        "\nPrice of Car: "+CarList.get(i).getCarPrice(),"Available Car",JOptionPane.YES_NO_OPTION);}
                else{
                    break;}


            }}
            catch (IndexOutOfBoundsException io2){
                UIManager.put("OptionPane.okButtonText","close");
                JOptionPane.showMessageDialog(null,"End of List");






               }
        }

    }
}