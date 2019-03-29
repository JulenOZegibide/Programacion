package Modelo.BD;

import Modelo.UML.*;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class PersonaBD {
       
    private static PreparedStatement sentenciaPre;
    private static String plantilla;
    private static ResultSet resultado;
    private static Persona p;
    private static ObjectContainer oc;
    
    public static Persona queryByDni(Persona p) throws Exception{
         
        GenericoBD.abrirConexion();
            
        oc=GenericoBD.getConexion();
        ObjectSet conjunto = oc.queryByExample(p);
        if(conjunto.hasNext())
        {
            p = (Persona) conjunto.next();
        }
        else
            return null;
        return p;
    }
    
    public static void alta(Persona p) throws Exception
    {
        GenericoBD.abrirConexion();
        GenericoBD.getConexion().store(p);

        
        GenericoBD.cerrar();
    }

    
//    public static ArrayList<Persona> getAsistentes(String nombreAcontecimiento)throws Exception
//    {
//        ArrayList<Persona> lista = new ArrayList();
//        GenericoBD.abrirBD();
//            
//        plantilla = "select p.dni,p.nombre,p.apellidos,p.telefono from personas p, personasacontecimientos pa where pa.nombre = ? and pa.dni = p.dni";
//        sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
//        sentenciaPre.setString(1,nombreAcontecimiento);
//        resultado = sentenciaPre.executeQuery();
//        while(resultado.next())
//        {
//            crearObjeto();
//            lista.add(p);
//        }
//        
//        if (lista.isEmpty())
//            throw new Exception("El evento no existe o no hay personas inscritas");
//        return lista;
//    }
    
    public static void crearObjeto() throws Exception{
        p = new Persona();
        p.setDni(resultado.getString(1));
        p.setNombre(resultado.getString(2));
        p.setApellidos(resultado.getString(3));
        p.setTelefono(resultado.getString(4));
    }
}
