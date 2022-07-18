
package conexiones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Definición: Establece conexión a la base de datos SQL Server NBMDigitaciones
 * @author jdia
 * @date 13-09-2021
 */
public class ConexionBD {

    private static Connection conexionBD() {
        /** conexionBD(). Establece la conexión a la base de datos local
          * NBMFiscales, que existe en SQL Server.
          */
        String strConexionBD = "jdbc:sqlserver://localhost:1433;databaseName=lider;databaseName=lider;user=sa;password=Flowing2022@";
        Connection conn = null;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection(strConexionBD);
            System.out.println("OK! Conexion a BD lider establecida.");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Ojo! Error al conectarse a BD lider. " + e);
        }
        return conn;
    }

    public static int ejecutarSentenciaSQL(String strSentenciaSQL) {
        /** ejecutarSentenciaSQL(String strSentenciaSQL). Método para ejecutar
          * instrucción SQL que realiza alguna acción, sin devolver datos. Aplica
          * para instrucciones de adición, modificación o anulación de registros,
          * por ejemplo.
          */
        Connection con = ConexionBD.conexionBD();

        try {
            PreparedStatement pstm = con.prepareStatement(strSentenciaSQL);
            pstm.execute();
            return 1;
        } catch (SQLException e) {
            System.out.println("Error en SQL: " + e);
            return 0;
        }
    }

    public static ResultSet consultarRegistros(String strSentenciaSQL) {
        /** consultarRegistros(String strSentenciaSQL). Método para ejecutar
          * instrucción SQL que consulta información y la devuelve como un
          * conjunto de datos.
          */
        Connection con = ConexionBD.conexionBD();

        try {
            PreparedStatement pstm = con.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (SQLException e) {
            System.out.println("Error en SQL: " + e);
            return null;
        }
    }
    
    public static void main(String[] args) {
        Connection con = ConexionBD.conexionBD();
        System.out.println(con);
        System.out.println(consultarRegistros("SELECT * FROM Articulos"));
    }
}
