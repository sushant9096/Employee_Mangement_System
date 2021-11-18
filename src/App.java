import add.addEmp;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class App extends JPanel {

    private static JFrame f3;
    private static JLabel labelUsr;
    private static JTextField InpUsr;
    private static JLabel labelPwd;
    private static JPasswordField InpPwd;
    private static JButton Submit;
    private static ImageIcon img = new ImageIcon("emp.png");

    public static void main(String[] args) {

        // Authorization JFrame
        f3 = new JFrame("Authorization Required !");
        f3.setSize(500, 200);
        f3.setLocation(400, 250);
        f3.setIconImage(img.getImage());
        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        labelUsr = new JLabel("Username:");
        InpUsr = new JTextField();
        labelPwd = new JLabel("Password:");
        InpPwd = new JPasswordField();
        Submit = new JButton("Submit");
        Submit.setBackground(Color.magenta);
        Submit.setEnabled(false);

        GridLayout grid2 = new GridLayout(0, 1);

        f3.setLayout(grid2);

        f3.add(labelUsr);
        f3.add(InpUsr);
        f3.add(labelPwd);
        f3.add(InpPwd);
        f3.add(Submit);
        f3.setVisible(true);

        // Button Action Listener Starts
        InpPwd.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                Submit.setEnabled(true);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        // Key listener starts from here
        InpPwd.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

                if(e.getKeyCode() == KeyEvent.VK_ENTER) {

                    String pwd = "eaemp";
                    if (InpPwd.getText().equals(pwd)) {

                        f3.setVisible(false);
                        addEmp.addRecord();
                    } else {
                        JOptionPane.showMessageDialog(null, "You Have Entered Wrong Password !");
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        }); // Key listener ends here

        Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String pwd = "eaemp";
                if (InpPwd.getText().equals(pwd)) {

                    f3.setVisible(false);
                    addEmp.addRecord();
                } else {
                    JOptionPane.showMessageDialog(null, "You Have Entered Wrong Password !");
                }
            }
        }); // Button Listener Ends

    }
}