import java.awt.*;

public class Backimage extends Canvas {

    Image img;
    public Backimage(){
        img = Toolkit.getDefaultToolkit().getImage("C:/Users/Moqeet Ul Hassan/IdeaProjects/Project/background/backmain.jpg");
    }
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D)g;
        int width = getSize().width;
        int hight = getSize().height;
        g2.drawImage(img,0,0,600,600,this);


    }
}
