import java.applet.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.util.Scanner;

public class Question2 extends Applet {

    int colourNumber;
    Choice choice = new Choice();

    public void init() {
        choice.addItem("Red");
        choice.addItem("Blue");
        choice.addItem("Green");
        add(choice);
    }

    public void paint(Graphics g) {
        String colour = choice.getSelectedItem();
        int R=0,G=0,B=0;
        if(colour=="Red")
            R=100;
        else if(colour=="Green")
            G=100;
        else if(colour=="Blue")
            B=100;

        Color colourCode = new Color(R,G,B);

        this.setBackground(colourCode);

    }
}
