// we're utilizing swing, so we need to make sure we import it
import javax.swing.*;

public class FirstSwing {
  public static void main(String[] args) {
    // 1. start by making a JFrame
    JFrame frame = new JFrame();

    // 2. Make a widget (button, textfield, etc.)
      // JButton, JRadioButton, JCheckBox, JLabel, JList, JScrollPane, JSlider, JTextArea, JTextField, JTable
    JButton button = new JButton("I am a button");

    // this makes the program quit as soon as you close the window
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // 3. Add the widget to the frame
    frame.getContentPane().add(button);
    // you add things to the frame by actaully adding it to the pane

    // 4. Display it by gibving it a size and making it visible
    frame.setSize(300,300);
    frame.setVisible(true);
  }
}