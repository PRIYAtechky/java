import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class LoginPage extends JFrame implements ActionListener {
    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel usernameLabel;
    private JTextField usernameText;
    private JLabel passwordLabel;
    private JPasswordField passwordText;
    private JButton loginButton;
    private JLabel resLabel;

    // Constructor to setup GUI components and event handling
    public LoginPage() {
        setTitle("Login Page");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        // Title
        title = new JLabel("Login Page");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        // Username
        usernameLabel = new JLabel("Username");
        usernameLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        usernameLabel.setSize(100, 20);
        usernameLabel.setLocation(100, 150);
        c.add(usernameLabel);

        usernameText = new JTextField();
        usernameText.setFont(new Font("Arial", Font.PLAIN, 15));
        usernameText.setSize(190, 20);
        usernameText.setLocation(200, 150);
        c.add(usernameText);

        // Password
        passwordLabel = new JLabel("Password");
        passwordLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        passwordLabel.setSize(100, 20);
        passwordLabel.setLocation(100, 220);
        c.add(passwordLabel);

        passwordText = new JPasswordField();
        passwordText.setFont(new Font("Arial", Font.PLAIN, 15));
        passwordText.setSize(190, 20);
        passwordText.setLocation(200, 220);
        c.add(passwordText);

        // Login Button
        loginButton = new JButton("Login");
        loginButton.setFont(new Font("Arial", Font.PLAIN, 15));
        loginButton.setSize(100, 20);
        loginButton.setLocation(150, 300);
        loginButton.addActionListener(this);
        c.add(loginButton);

        // Result label
        resLabel = new JLabel("");
        resLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        resLabel.setSize(500, 25);
        resLabel.setLocation(100, 350);
        c.add(resLabel);

        setVisible(true);
    }

    // Method to process the login action
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = usernameText.getText();
            String password = new String(passwordText.getPassword());
            
            // Validate login credentials (hardcoded for demo)
            if (username.equals("admin") && password.equals("12345")) {
                resLabel.setText("Login successful");
            } else {
                resLabel.setText("Invalid username or password");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        new LoginPage();
    }
}
