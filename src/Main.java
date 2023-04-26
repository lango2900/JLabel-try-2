import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;


public class Main {
    public static void main(String[] args) {

    ImageIcon image = new ImageIcon("foams.jpg");


    Border border = BorderFactory.createLineBorder(new Color(255,50,255),3);


    JLabel label = new JLabel();
    label.setText("Whats up mandem?"); // set text of label
    label.setIcon(image);
    label.setHorizontalTextPosition(JLabel.CENTER); // centers text of label LEFT, CENTER, RIGHT of icon
    label.setVerticalTextPosition(JLabel.TOP); // sets text TOP, CENTER, or BOTTOM of icon
    label.setForeground(new Color(255,50,255)); // changes color of label
    label.setFont(new Font("MV Boli",Font.PLAIN,69)); // set font of text
        label.setIconTextGap(-50); // sets spacing of label from image
        label.setBackground(Color.ORANGE);
        label.setOpaque(true); // makes it so you can see background color
        label.setBorder(border); // adds border to label
        label.setVerticalAlignment(JLabel.CENTER); // sets vertical position of icon + text
        label.setHorizontalAlignment(JLabel.CENTER); // sets horizontal position of icon + text w/i label
       // label.setBounds(100,0,350,350); // x,y,width,height of label w/ null layout


    JFrame frame = new JFrame();
    frame.setVisible(true);
    frame.setSize(700,700);
   // frame.setLayout(null); // displays nothing and allows us to manually size label

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(label);
    frame.pack(); // will resize frame  to accommodate for components
        // add all components prior to using pack method :)



    }
}