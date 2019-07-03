import javax.swing.*;
import java.awt.*;

public class ImageLabel extends JLabel{
    private ImageIcon icon;
    private int width;
    private int height;
    private int scaleType;
    private Rectangle rectangle;

    public ImageLabel(ImageIcon icon, int width, int height, int scaleType) {
        this.icon = icon;
        this.width = width;
        this.height = height;
        this.scaleType = scaleType;
        Image iconToImage = this.icon.getImage();
        Image scaledIconToImage = iconToImage.getScaledInstance(width, height, this.scaleType);
        ImageIcon backTrack = new ImageIcon(scaledIconToImage);
        super.setIcon(backTrack);
    }

    public ImageLabel(String text, int horizontalAlignment, ImageIcon icon, int width, int height, int scaleType, Rectangle rectangle) {
        super(text, horizontalAlignment);
        this.icon = icon;
        this.width = width;
        this.height = height;
        this.scaleType = scaleType;
        this.rectangle = rectangle;

        Image iconToImage = this.icon.getImage();
        Image scaledIconToImage = iconToImage.getScaledInstance(width, height, this.scaleType);
        ImageIcon backTrack = new ImageIcon(scaledIconToImage);
        super.setIcon(backTrack);
        super.setBounds(rectangle);

    }
}