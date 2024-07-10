import java.sql.*;

public class Connect {
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/userdb?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
    static final String USER = "root";
    static final String PASS = "123456";

    public static Connection getConnection() {
        Connection conn = null;
        System.out.println("连接数据库...");
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            if (conn != null) {
                System.out.println("成功连接到数据库！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("数据库连接失败！");
        }
        return conn;
    }
    public PreparedStatement prepareStatement(String sql) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'prepareStatement'");
    }
}
