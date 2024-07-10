import javax.swing.*;  
import java.awt.*;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
public class LoginFrame extends JFrame {  
  
    private JTextField usernameField;  
    private JPasswordField passwordField;  
    private JButton loginButton;  
  
    public LoginFrame() {  
        // 设置窗口标题  
        setTitle("登录界面");  
        // 设置窗口关闭操作  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        // 设置窗口布局管理器  
        setLayout(new GridBagLayout());  
  
        // 初始化组件  
        initComponents();  
  
        // 设置窗口大小  
        pack();  
        // 设置窗口居中显示  
        setLocationRelativeTo(null);  
        // 设置窗口可见  
        setVisible(true);  
    }  
  
    private void initComponents() {  
        // 创建标签和输入框  
        JLabel usernameLabel = new JLabel("用户名:");  
        usernameField = new JTextField(20);  
  
        JLabel passwordLabel = new JLabel("密码:");  
        passwordField = new JPasswordField(20);  
  
        // 创建登录按钮  
        loginButton = new JButton("登录");  
        // 为登录按钮添加事件监听器  
        loginButton.addActionListener(new ActionListener() {  
            @Override  
            public void actionPerformed(ActionEvent e) {  
                // 这里只是简单地打印出输入的用户名和密码，实际中应该进行验证  
                String username = usernameField.getText();  
                char[] passwordChars = passwordField.getPassword();  
                String password = new String(passwordChars);  
                  
                // 清除密码字符数组，防止内存泄漏  
                Arrays.fill(passwordChars, Character.MIN_VALUE);  
  
                // 输出到控制台（实际中应该是验证逻辑）  
                System.out.println("用户名: " + username);  
                System.out.println("密码: " + password);  
  
                // 可以在这里添加验证逻辑，比如与数据库中的数据进行比对  
                // 如果验证成功，可以关闭这个窗口并打开另一个窗口  
  
                // 这里只是简单演示，所以不做任何处理  
            }  
        });  
  
        // 使用GridBagConstraints来管理布局  
        GridBagConstraints gbc = new GridBagConstraints();  
        gbc.fill = GridBagConstraints.HORIZONTAL;  
        gbc.insets = new Insets(10, 10, 10, 10);  
  
        // 添加组件到窗口  
        gbc.gridx = 0;  
        gbc.gridy = 0;  
        add(usernameLabel, gbc);  
  
        gbc.gridx = 1;  
        gbc.gridy = 0;  
        add(usernameField, gbc);  
  
        gbc.gridx = 0;  
        gbc.gridy = 1;  
        add(passwordLabel, gbc);  
  
        gbc.gridx = 1;  
        gbc.gridy = 1;  
        add(passwordField, gbc);  
  
        gbc.gridx = 1;  
        gbc.gridy = 2;  
        gbc.anchor = GridBagConstraints.CENTER;  
        add(loginButton, gbc);  
    }  
  
    public static void main(String[] args) {  
        // 在事件调度线程中创建和显示GUI，以确保线程安全  
        SwingUtilities.invokeLater(new Runnable() {  
            @Override  
            public void run() {  
                new LoginFrame();  
            }  
        });  
    }  
}