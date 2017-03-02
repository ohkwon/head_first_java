import javax.swing.*;
import java.awt.event.*;
// this imports the ActionListener and ActionEvent objects, which are important 

// if you have listeners, your class mus implement ActionListener

public class SecondSwing implements ActionListener {
  // we'll start by making a JButton as an attribute of the class
  JButton button;
  int stage = 0;

  public static void main(String[] args) {
    // create our class instance
    SecondSwing eventTest = new SecondSwing();
    eventTest.run();
  }

  // we'll shove the JFrame things inside the run class instead this time
  public void run() {
    // create our new JFrame
    JFrame frame = new JFrame();

    // Create our button
    button = new JButton("I have a but");

    // Here, we'll add our listener.
    // this basically sys that add me to your list of listeners.
    // the argument you pass must be an object from a class that implements ActionListener
    button.addActionListener(this);
    // this passes the object of the class this is written in (SecondSwing), the object you're calling the method on

    // make sure our window quits the program when closed
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // add a widget
    frame.getContentPane().add(button);

    // display the stuff
    frame.setSize(300,300);
    frame.setVisible(true);
  }

  // this is our listener interface, a bridge between hte listener (you) and the event source (the button)
  // basically, this is our event handler
  // the button will call this method to let you know an event happened. 
  // normally, it sends an ActionEvent object as an argument, but that's not important at the moment
  public void actionPerformed(ActionEvent event) {
    // this is so that there are three different ways that the button will act upon hearing an event
    if (stage == 0) {
      button.setText("I have a but");
      stage += 1;
    } else if (stage == 1) { 
      button.setText("I have a ton");
      stage += 1;
    } else {
      button.setText("BU-UT-TON");
      stage = 0;
    }
  }
}