package add;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class addEmp extends JPanel {

    private static JFrame f3;
    private static JLabel labelPwd;
    private static JPasswordField InpPwd;
    private static JButton Submit;
    private static ImageIcon img = new ImageIcon("emp.png");
    private JButton a1EnterEmployeeDetailsButton;
    private JButton a2SearchEmployeeButton;
    private JButton SrtEmp;
    private JButton a3ExitButton;
    private JButton ClrTxt;
    private JButton UpEmp;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private JLabel l8;
    private JLabel l9;
    private JLabel l10;
    private JLabel l11;
    private JLabel Jndate;
    private JLabel Emp_Desg;
    private JProgressBar progressBar1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField InEmp_Desg;
    private JTextField textFieldSearEmp;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JTextField textField8;
    private JTextField InJndate;
    private JFrame f2;
    private JTextArea textArea1;
    private JScrollPane txtScroll;
    private String[] Name = new String[1001];
    private Date[] Emp_Jn_date = new Date[1001];
    private String[] Dept = new String[1001];
    private String[] Desg = new String[1001];
    private String[] Sal = new String[1001];
    private int[] GrsSal = new int[1001];
    private int[] Id = new int[1001];
    private int i = 1;
    private Image bgimage = null;
    private Image timg;

    private addEmp() {

        MediaTracker mt = new MediaTracker(this);
        bgimage = Toolkit.getDefaultToolkit().getImage("b1.jpg");
        mt.addImage(bgimage, 0);
        try {
            mt.waitForAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        f2 = new JFrame();

        l6 = new JLabel("Progress:");

        progressBar1 = new JProgressBar();
        progressBar1.setBounds(10, 5, 865, 20);

        l1 = new JLabel("Name:");
        l1.setBounds(5, 30, 204, 60);
        l1.setFont((new Font("Roboto", Font.PLAIN, 18)));
        textField1 = new JTextField();
        textField1.setBounds(270, 50, 400, 20);

        l2 = new JLabel("Department:");
        l2.setBounds(5, 60, 204, 60);
        l2.setFont((new Font("Roboto", Font.PLAIN, 18)));
        textField2 = new JTextField();
        textField2.setBounds(270, 80, 400, 20);

        Emp_Desg = new JLabel("Designation");
        Emp_Desg.setBounds(5, 90, 204, 60);
        Emp_Desg.setFont((new Font("Roboto", Font.PLAIN, 18)));
        InEmp_Desg = new JTextField();
        InEmp_Desg.setBounds(270, 110, 400, 20);

        Jndate = new JLabel("Join Date:");
        Jndate.setBounds(5, 120, 204, 60);
        Jndate.setFont((new Font("Roboto", Font.PLAIN, 18)));
        InJndate = new JTextField();
        InJndate.setBounds(270, 140, 400, 20);

        l3 = new JLabel("Employee Salary:");
        l3.setBounds(5, 150, 204, 60);
        l3.setFont((new Font("Roboto", Font.PLAIN, 18)));
        textField3 = new JTextField();
        textField3.setBounds(270, 170, 400, 20);

        a1EnterEmployeeDetailsButton = new JButton("Submit");
        a1EnterEmployeeDetailsButton.setBackground(Color.BLUE);
        a1EnterEmployeeDetailsButton.setBounds(570, 200, 100, 20);

        l4 = new JLabel("Search By Employee Id:");
        l4.setBounds(5, 230, 204, 60);
        l4.setFont((new Font("Roboto", Font.PLAIN, 18)));
        textFieldSearEmp = new JTextField();
        textFieldSearEmp.setBounds(270, 250, 400, 20);

        a2SearchEmployeeButton = new JButton("Search");
        a2SearchEmployeeButton.setBackground(Color.BLUE);
        a2SearchEmployeeButton.setBounds(570, 280, 100, 20);

        l5 = new JLabel("Sort by Salary:");
        l5.setBounds(5, 310, 204, 60);
        l5.setFont((new Font("Roboto", Font.PLAIN, 18)));
        textField4 = new JTextField();
        textField4.setBounds(270, 320, 400, 20);

        SrtEmp = new JButton("Sort");
        SrtEmp.setBackground(Color.ORANGE);
        SrtEmp.setBounds(270, 350, 400, 20);

        ClrTxt = new JButton("Clear Sort and Search Results");
        ClrTxt.setBackground(Color.BLUE);
        ClrTxt.setBounds(270, 380, 400, 20);

        l7 = new JLabel("** Update Section **");
        l7.setFont((new Font("Roboto", Font.PLAIN, 18)));
        l7.setBounds(400, 390, 204, 60);
        l8 = new JLabel("ID Of Employee:");
        l8.setFont((new Font("Roboto", Font.PLAIN, 18)));
        l8.setBounds(5, 430, 204, 60);
        textField5 = new JTextField();
        textField5.setBounds(270, 450, 400, 20);
        l9 = new JLabel("Employee Name:");
        l9.setFont((new Font("Roboto", Font.PLAIN, 18)));
        l9.setBounds(5, 460, 204, 60);
        textField6 = new JTextField();
        textField6.setBounds(270, 480, 400, 20);
        l10 = new JLabel("Employee Department");
        l10.setFont((new Font("Roboto", Font.PLAIN, 18)));
        l10.setBounds(5, 490, 204, 60);
        textField7 = new JTextField();
        textField7.setBounds(270, 510, 400, 20);
        l11 = new JLabel("Employee Salary");
        l11.setFont((new Font("Roboto", Font.PLAIN, 18)));
        l11.setBounds(5, 520, 204, 60);
        textField8 = new JTextField();
        textField8.setBounds(270, 540, 400, 20);

        UpEmp = new JButton("Update");
        UpEmp.setBackground(Color.BLUE);
        UpEmp.setEnabled(false);
        UpEmp.setBounds(570, 570, 100, 20);

        a3ExitButton = new JButton("Exit");
        a3ExitButton.setBackground(Color.BLUE);
        a3ExitButton.setBounds(570, 600, 100, 20);

        textArea1 = new JTextArea();
        textArea1.setEditable(false);
        textArea1.setBackground(SystemColor.activeCaption);
        textArea1.setForeground(Color.black);
        txtScroll = new JScrollPane(textArea1);

        setLayout(null);

        add(l6);
        add(progressBar1);
        add(l1);
        add(textField1);
        add(l2);
        add(textField2);
        add(Emp_Desg);
        add(InEmp_Desg);
        add(Jndate);
        add(InJndate);
        add(l3);
        add(textField3);
        add(a1EnterEmployeeDetailsButton);
        add(l4);
        add(textFieldSearEmp);
        add(a2SearchEmployeeButton);
        add(l5);
        add(textField4);
        add(SrtEmp);
        add(ClrTxt);
        add(l7);
        add(l8);
        add(textField5);
        add(l9);
        add(textField6);
        add(l10);
        add(textField7);
        add(l11);
        add(textField8);
        add(UpEmp);
        add(a3ExitButton);
        f2.add(txtScroll);

        Sal[i] = "0";
        check();

        textField1.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                int res = 0;
                if (textField2.getText().equals("") && textField3.getText().equals("")) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                }
                if (textField2.getText().equals("")) {
                    res = res + 1;
                }

                if (textField3.getText().equals("")) {
                    res = res + 1;
                }

                if (res == 2) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                } else if (res == 1) {
                    progressBar1.setForeground(Color.yellow);
                    progressBar1.setValue(55);
                } else {
                    progressBar1.setForeground(Color.green);
                    progressBar1.setValue(100);
                    a1EnterEmployeeDetailsButton.setEnabled(true);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                rmvtxt();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }

            private void changed() {

            }

            private void rmvtxt() {

                int res = 0;
                if (textField2.getText().equals("") && textField3.getText().equals("")) {

                    progressBar1.setValue(0);
                }
                if (textField2.getText().equals("")) {

                    res = res + 1;
                }

                if (textField3.getText().equals("")) {

                    res = res + 1;
                }

                if (res == 2) {
                    progressBar1.setValue(0);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                } else if (res == 1) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                } else {
                    progressBar1.setForeground(Color.yellow);
                    progressBar1.setValue(55);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                }

            }

        });

        textField2.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                int res = 0;
                if (textField1.getText().equals("") && textField3.getText().equals("")) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                }
                if (textField1.getText().equals("")) {
                    res = res + 1;
                }

                if (textField3.getText().equals("")) {
                    res = res + 1;
                }

                if (res == 2) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                } else if (res == 1) {
                    progressBar1.setForeground(Color.yellow);
                    progressBar1.setValue(55);
                } else {
                    progressBar1.setForeground(Color.green);
                    progressBar1.setValue(100);
                    a1EnterEmployeeDetailsButton.setEnabled(true);
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                rmvtxt();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }

            private void changed() {

            }

            private void rmvtxt() {

                int res = 0;
                if (textField1.getText().equals("") && textField3.getText().equals("")) {

                    progressBar1.setValue(0);
                }
                if (textField1.getText().equals("")) {

                    res = res + 1;
                }

                if (textField3.getText().equals("")) {

                    res = res + 1;
                }

                if (res == 2) {
                    progressBar1.setValue(0);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                } else if (res == 1) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                } else {
                    progressBar1.setForeground(Color.yellow);
                    progressBar1.setValue(55);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                }

            }

        });

        textField3.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

                int res = 0;
                if (textField1.getText().equals("") && textField2.getText().equals("")) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                }
                if (textField1.getText().equals("")) {
                    res = res + 1;
                }

                if (textField2.getText().equals("")) {
                    res = res + 1;
                }

                if (res == 2) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                } else if (res == 1) {
                    progressBar1.setForeground(Color.yellow);
                    progressBar1.setValue(55);
                } else {
                    progressBar1.setForeground(Color.green);
                    progressBar1.setValue(100);
                    a1EnterEmployeeDetailsButton.setEnabled(true);
                }

            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                rmvtxt();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changed();
            }

            private void changed() {

            }

            private void rmvtxt() {

                int res = 0;
                if (textField1.getText().equals("") && textField2.getText().equals("")) {

                    progressBar1.setValue(0);
                }
                if (textField1.getText().equals("")) {

                    res = res + 1;
                }

                if (textField2.getText().equals("")) {

                    res = res + 1;
                }

                if (res == 2) {
                    progressBar1.setValue(0);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                } else if (res == 1) {
                    progressBar1.setForeground(Color.red);
                    progressBar1.setValue(20);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                } else {
                    progressBar1.setForeground(Color.yellow);
                    progressBar1.setValue(55);
                    a1EnterEmployeeDetailsButton.setEnabled(false);
                }


            }

        });

        textField6.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                UpEmp.setEnabled(true);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                int res = 0;
                if (textField7.getText().equals("") && textField8.getText().equals("")) {

                    UpEmp.setEnabled(false);
                }
                if (textField7.getText().equals("")) {

                    res = res + 1;
                }

                if (textField8.getText().equals("")) {

                    res = res + 1;
                }

                if (res == 2) {

                    UpEmp.setEnabled(false);
                } else if (res == 1) {

                    UpEmp.setEnabled(true);
                } else {

                    UpEmp.setEnabled(true);
                }


            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        textField7.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                UpEmp.setEnabled(true);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                int res = 0;
                if (textField6.getText().equals("") && textField8.getText().equals("")) {

                    UpEmp.setEnabled(false);
                }
                if (textField6.getText().equals("")) {

                    res = res + 1;
                }

                if (textField8.getText().equals("")) {

                    res = res + 1;
                }

                if (res == 2) {

                    UpEmp.setEnabled(false);
                } else if (res == 1) {

                    UpEmp.setEnabled(true);
                } else {

                    UpEmp.setEnabled(true);
                }


            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        textField8.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                UpEmp.setEnabled(true);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                int res = 0;
                if (textField6.getText().equals("") && textField7.getText().equals("")) {

                    UpEmp.setEnabled(false);
                }
                if (textField6.getText().equals("")) {

                    res = res + 1;
                }

                if (textField7.getText().equals("")) {

                    res = res + 1;
                }

                if (res == 2) {

                    UpEmp.setEnabled(false);
                } else if (res == 1) {

                    UpEmp.setEnabled(true);
                } else {

                    UpEmp.setEnabled(true);
                }


            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        a1EnterEmployeeDetailsButton.setEnabled(false);
        a1EnterEmployeeDetailsButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                int res = 0;
                try {

                    Integer.parseInt(textField1.getText());
                    textField1.setText("");
                    textField2.setText("");
                    InEmp_Desg.setText("");
                } catch (NumberFormatException a) {

                    res = res + 1;

                }

                try {

                    Integer.parseInt(textField2.getText());
                    textField1.setText("");
                    textField2.setText("");
                    InEmp_Desg.setText("");
                } catch (NumberFormatException a) {

                    res = res + 1;

                }

                try {

                    Integer.parseInt(InEmp_Desg.getText());
                    textField1.setText("");
                    textField2.setText("");
                    InEmp_Desg.setText("");
                } catch (NumberFormatException a) {

                    res = res + 1;

                }

                if (res <= 2) {
                    JOptionPane.showMessageDialog(null, "You Entered Number in Name Field or Department Field or Designation Field and its must be in Alphabets");

                }

                if (res == 3) {

                    Name[i] = textField1.getText();
                    Dept[i] = textField2.getText();
                    Desg[i] = InEmp_Desg.getText();
                }

                chkSal();
                validateJavaDate(InJndate.getText());

            }

        });

        a2SearchEmployeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    // checking valid integer using parseInt() method
                    Integer.parseInt(textFieldSearEmp.getText());
                    f2.setVisible(true);
                    int i;
                    i = Integer.parseInt(textFieldSearEmp.getText());

                    textArea1.setText(textArea1.getText() + "\nName: " + Name[i] + "\nDepartment: " + Dept[i] + "\nDesignation: " + Desg[i] + "\nEmployee ID: " + Id[i] + "\nMonthly Salary: " + Sal[i] + "\nGross Salary: " + GrsSal[i] + "\nEmployee Join Date: " + Emp_Jn_date[i] + "\n\n");

                } catch (NumberFormatException a) {
                    JOptionPane.showMessageDialog(null, "Please enter valid Salary input in Number in the Sort By Salary Field");
                }

            }
        });

        SrtEmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (textField4.getText().equals("")) {

                    JOptionPane.showMessageDialog(null, "Sorry Sort By Salary Field must not be empty..!");
                } else {

                    f2.setVisible(true);
                    int ser = Integer.parseInt(textField4.getText());
                    for (i = 1; i <= Id[i]; i++) {
                        int tmp;
                        tmp = Integer.parseInt(Sal[i]);
                        if (tmp >= ser) {

                            textArea1.setText(textArea1.getText() + "\nName: " + Name[i] + "\nDepartment: " + Dept[i] + "\nDesignation: " + Desg[i] + "\nEmployee ID: " + Id[i] + "\nMonthly Salary: " + Sal[i] + "\nGross Salary: " + GrsSal[i] + "\nJoin Date: " + Emp_Jn_date[i] + "\n\n");
                            textField4.setText("");

                        } else {

                            JOptionPane.showMessageDialog(null, "No any Employees is at " + tmp + " salary");
                        }
                    }

                }

            }
        });

        ClrTxt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                textArea1.setText("");
                f2.setVisible(false);
            }
        });

        UpEmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int i = 0;

                if (textField5.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "ID Of Employee Field is empty you need Employee Id For Update their Details You Can Search them using Search And Sort Option in this software");
                } else {

                    try {

                        Integer.parseInt(textField5.getText());
                        i = Integer.parseInt(textField5.getText());
                        if (textField6.getText().equals("")) {

                        } else {

                            Name[i] = (textField6.getText());
                        }

                        if (textField7.getText().equals("")) {

                        } else {

                            Dept[i] = (textField7.getText());
                        }

                        if (textField8.getText().equals("")) {

                        } else {

                            Sal[i] = (textField8.getText());
                            GrsSal[i] = Integer.parseInt(textField8.getText());
                            GrsSal[i] = GrsSal[i] * 12;
                        }
                        JOptionPane.showMessageDialog(null, "Employee Details Updated Successfully");
                        textField5.setText("");
                        textField6.setText("");
                        textField7.setText("");
                        textField8.setText("");

                    } catch (NumberFormatException a) {

                        JOptionPane.showMessageDialog(null, "Employee ID always in numbers you entered Alphabets");
                        textField5.setText("");
                    }

                }

            }
        });

        a3ExitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        progressBar1.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentMoved(ComponentEvent e) {
                super.componentMoved(e);
            }
        });


        f2.setTitle("Results");
        f2.setLocation(550, 40);
        f2.setSize(400, 300);
        ImageIcon img = new ImageIcon("emp.png");
        f2.setIconImage(img.getImage());

    }

    public static void main(String[] args) {

        addRecord();
    }

    public static void addRecord() {
        JFrame frame = new JFrame();
        frame.setTitle("Employees Salary Management System");
        frame.setSize(900, 700);
        frame.setBounds(100, 100, 900, 700);
        frame.setLocation(400, 0);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setIconImage(img.getImage());
        frame.getContentPane().add(new addEmp());
        frame.setVisible(true);
    }

    // This Function Checks if no any data is presented and disable buttons
    private void check() {
        int chk = Integer.parseInt(Sal[i]);
        if (chk == 0) {
            a2SearchEmployeeButton.setEnabled(false);
            SrtEmp.setEnabled(false);

        } else {
            SrtEmp.setEnabled(true);
            a2SearchEmployeeButton.setEnabled(true);
        }
    }

    // This function checks input is in numbers or not
    private void chkSal() {

        try {

            Integer.parseInt(textField3.getText()); // If Input is in numbers then only the parsing to integer type is possible
            Sal[i] = textField3.getText();
            GrsSal[i] = Integer.parseInt(textField3.getText());
            GrsSal[i] = GrsSal[i] * 12;

        } catch (NumberFormatException a) {

            JOptionPane.showMessageDialog(null, "Please enter valid Salary input in Number in the Employee Salary Field");
            textField3.setText("");
        }
    }

    public boolean validateJavaDate(String strDate) //checks if given input is date data type and is in the valid format
    {
        /* Check if date is 'null' */
        if (strDate.trim().equals("")) {
            JOptionPane.showMessageDialog(null, "You Have Not Entered Join Date of Employee In Employee Join Date Field..!");
            chkPgbar();
            return true;
        }
        /* Date is not 'null' */
        else {
            /*
             * Set preferred date format,
             * For example MM-dd-yyyy, MM.dd.yyyy,dd.MM.yyyy etc.*/
            SimpleDateFormat sdfrmt = new SimpleDateFormat("dd/MM/yyyy");
            sdfrmt.setLenient(false);
            /* Create Date object
             * parse the string into date
             */
            try {
                Date javaDate = sdfrmt.parse(strDate);
                Emp_Jn_date[i] = javaDate;
                JOptionPane.showMessageDialog(null, "Employee Details Added Successfully and Employee ID is " + i);
                Id[i] = i;
                textField1.setText("");
                textField2.setText("");
                InJndate.setText("");
                InEmp_Desg.setText("");
                textField3.setText("");
                check();
                i++;

            }
            /* Date format is invalid */ catch (ParseException e) {
                JOptionPane.showMessageDialog(null, "Date must be in dd/MM/yyyy format ...!");
                chkPgbar();
                return false;
            }
            /* Return true if date format is valid */
            return true;
        }
    }

    private void chkPgbar() {

        progressBar1.setForeground(Color.yellow);
        progressBar1.setValue(85);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int imwidth = bgimage.getWidth(null);
        int imheight = bgimage.getHeight(null);
        g.drawImage(bgimage, 1, 1, null);

    }


}