import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class E3 extends JFrame implements ActionListener {
    private JPanel mainPanel;
    private JButton redButton;
    private JButton greenButton;
    private JButton blueButton; 
    private JButton pinkButton;
    private JButton yellowButton;

    public E3() {
        setTitle("Theme Color Selector");
    
        mainPanel = new JPanel();
    
        redButton = new JButton("Red");
        greenButton = new JButton("Green");
        blueButton = new JButton("Blue");
        pinkButton = new JButton("Pink");
        yellowButton = new JButton("Yellow");
    
        redButton.setActionCommand("RED");
        greenButton.setActionCommand("GREEN");
        blueButton.setActionCommand("BLUE");
        pinkButton.setActionCommand("PINK");
        yellowButton.setActionCommand("YELLOW");
    
        redButton.addActionListener(this);
        greenButton.addActionListener(this);
        blueButton.addActionListener(this);
        pinkButton.addActionListener(this);
        yellowButton.addActionListener(this);

    
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(redButton);
        buttonPanel.add(greenButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(pinkButton);
        buttonPanel.add(yellowButton);
    
        setLayout(new BorderLayout());
        add(buttonPanel, BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 250);
        setLocationRelativeTo(null);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "RED":   mainPanel.setBackground(Color.RED);   
            break;
            case "GREEN": mainPanel.setBackground(Color.GREEN); 
            break;
            case "BLUE":  mainPanel.setBackground(Color.BLUE);  
            break;
            case "PINK":  mainPanel.setBackground(Color.PINK);  
            break;
            case "YELLOW": mainPanel.setBackground(Color.YELLOW);
            break;
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new E3().setVisible(true));
    }
}