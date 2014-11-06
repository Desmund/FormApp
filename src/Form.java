import javax.swing.*;
import java.awt.*;

/**
 * Created by Denis on 06.11.2014.
 */
public class Form extends JFrame {
    private JPanel rootPanel;
    private JTextField textField;
    private JList list;
    private JButton buttonView;
    private JButton buttonAddToList;
    private JLabel lableText;
    private JLabel lableList;

    public Form() {
        super("Window with list");
        setContentPane(rootPanel);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
