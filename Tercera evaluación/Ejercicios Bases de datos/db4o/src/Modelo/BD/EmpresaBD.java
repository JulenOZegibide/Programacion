
package Modelo.BD;

import Modelo.UML.Empresa;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class EmpresaBD {
    
    private static PreparedStatement sentenciaCon;
    private static String plantilla;
    private static ResultSet resultado;
    
    private static ObjectContainer oc;
    
    private static Empresa e;
    
    public static Empresa queryByNif(String nif) throws Exception{
         
        // ¿¿¿¿¿¿¿¿¿¿¿  GenericoBD.abrirBD();
        if (GenericoBD.getCon() == null)
            GenericoBD.abrirBD();
            
        plantilla = "select * from empresas where nif = ?";
        sentenciaCon = GenericoBD.getCon().prepareStatement(plantilla);
        sentenciaCon.setString(1,nif);
        resultado = sentenciaCon.executeQuery();
        // Doy por hecho que existe
        resultado.next();
        
        // Crear objeto
        e = new Empresa();
        e.setNif(nif);
        e.setNombre(resultado.getString("nombre"));
        e.setRazonSocial(resultado.getString("razonSocial"));
        e.setCnae(resultado.getInt("cnae"));
        
        resultado.close();
        
       // GenericoBD.cerrarBD();
        return e;
    }
    
    public static void alta(Empresa e) throws Exception{
        GenericoBD.abrirConexion();
        GenericoBD.getConexion().store(e);

        
        GenericoBD.cerrar();
    
}
    public static Empresa consultarempresa(Empresa e) throws Exception{
         
        GenericoBD.abrirConexion();
            
        oc=GenericoBD.getConexion();
        ObjectSet conjunto = oc.queryByExample(e);
        if(conjunto.hasNext())
        {
            e = (Empresa) conjunto.next();
        }
        else
            return null;
        return e;
    }
}
