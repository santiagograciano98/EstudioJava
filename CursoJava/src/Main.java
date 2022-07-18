
import conexiones.ConexionBD;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        String consulta = String.format("SELECT articulo_codigo,componente_codigo,cantidad FROM DetalleArticulos WHERE articulo_codigo = '%s' ORDER BY articulo_codigo,componente_codigo","AH0003");
        
        ResultSet rs = ConexionBD.consultarRegistros(consulta);
        ArrayList<DetalleArticulosLn> listaDA = new ArrayList<>();
        try{
            while(rs.next()){
                DetalleArticulosLn da = new DetalleArticulosLn();
                da.setArticuloCodigo(rs.getString("articulo_codigo"));
                da.setComponenteCodigo(rs.getString("componente_codigo"));
                da.setCantidad(rs.getFloat("cantidad"));
                System.out.print(da.getArticuloCodigo());
                System.out.print("  ");
                System.out.print(da.getComponenteCodigo());
                System.out.print("  ");
                System.out.println(da.getCantidad());
                
            }
            
        }catch(Exception e){
            System.out.println("Error");
        }
    }

}
