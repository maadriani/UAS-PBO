
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connecDB {
    private String url, usr, pwd, db;
    connecDB() {
        db = "barang";
        url = "jdbc:mysql://localhost/" + db;
        usr = "root";
        pwd = "";
    }

    Connection getConnect() {
        Connection cn = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection(url, usr, pwd);
            System.out.println("Koneksi Berhasil");
        } catch (ClassNotFoundException e) {
            System.out.println("Error #1" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("Error #2" + e.getMessage());
        }

        return cn;
    }

    public static void main(String[] args) {
        new connecDB().getConnect();
    }
}