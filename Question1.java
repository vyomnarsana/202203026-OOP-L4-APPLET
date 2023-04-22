import java.applet.*;
import java.awt.*;
import java.util.Scanner;
import java.awt.Dimension;

public class Question1 extends Applet {

    TextField t1;
    String greeting;

    public void init() {

        t1 = new TextField(10);
//        System.out.println("Enter your name: ");

          add(t1);
        //str1 = t1.getText();
//        String str1;
//        str1 = t1.getText();
//        greeting = "Hello "+str1;
    }

    public void paint(Graphics g) {

          g.drawString("Enter Your Name:",0,0);
          String str1;
          str1 = t1.getText();
          String greeting = "Hello "+str1;
          //System.out.println("Enter your name: ");


        Dimension dimension = getSize();

        g.drawString(greeting,dimension.width/2,dimension.height/2);
    }
}