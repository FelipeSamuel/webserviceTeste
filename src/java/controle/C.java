/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcio Vasconcelos
 */
public class C {

    private static final String URL = "jdbc:mysql://$OPENSHIFT_MYSQL_DB_HOST:$OPENSHIFT_MYSQL_DB_PORT/jbossas";
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "adminsuvtKVR";
    private static final String PSW = "auz4i5CshJrL";

    private static Connection conn;

    public static Connection cd() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        conn = (Connection) DriverManager.getConnection(URL, USER, PSW);

        return conn;

    }

    public static void db() {
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(C.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
