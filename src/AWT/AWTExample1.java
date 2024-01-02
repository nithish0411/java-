package AWT;

import java.awt.*;

// extending to frame class - container
public class AWTExample1 extends Frame {
    // initialize using constructor
    AWTExample1(){
        // creating a button
        Button button = new Button("ENTER");
        //SETTING  button position on screen
        button.setBounds(30,30,30,30);

        //adding into frame(container)
        add(button);

        //frame size
        setSize(300,300);
        //setting title on the frame
        setTitle("this is our first awt example");
        //no layout
        setLayout(null);
        //make frame visible
        setVisible(true);
    }
    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        AWTExample1 frame = new AWTExample1();
    }
}
