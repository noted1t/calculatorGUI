import javax.swing.*;
import java.awt.event.*;

public class Calc extends JDialog {
    private JPanel contentPane;
    private JTextField solutionField;
    private JButton a1Button;
    private JButton a4Button;
    private JButton a7Button;
    private JButton ClearButton;
    private JButton a2Button;
    private JButton a5Button;
    private JButton a8Button;
    private JButton a0Button;
    private JButton a3Button;
    private JButton a6Button;
    private JButton a9Button;
    private JButton equalsButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton divisionButton;
    private JButton multiplicButton;
    private JButton buttonOK;
    private JButton buttonCancel;

    public Calc() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        double firstN;
        double secondN;

        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "1");
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "2");
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "3");
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "4");
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "5");
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "6");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "7");
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "8");
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "9");
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                solutionField.setText(solutionField.getText() + "0");
            }
        });
       /* solutionField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        */
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!solutionField.getText().equals("")) {
                    solutionField.setText(solutionField.getText() + " + ");
                }
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!solutionField.getText().equals("")) {
                    solutionField.setText(solutionField.getText() + " - ");
                }
            }
        });
        divisionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!solutionField.getText().equals("")) {
                    solutionField.setText(solutionField.getText() + " / ");
                }
            }
        });
        multiplicButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!solutionField.getText().equals("")) {
                    solutionField.setText(solutionField.getText() + " * ");
                }
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Matcher matcher = new Matcher();
                String answer = String.valueOf(matcher.mathSolver(solutionField.getText()));
                solutionField.setText(answer);
                }

        });
        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            solutionField.setText("");
            }
        });
    }


    public static void main(String[] args) {
        Calc dialog = new Calc();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
