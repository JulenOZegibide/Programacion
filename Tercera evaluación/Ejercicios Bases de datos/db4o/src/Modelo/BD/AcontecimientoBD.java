
package Modelo.BD;


import Excepciones.AcontecimientoNoEncontrado;
import Modelo.UML.*;
import com.db4o.*;
import com.db4o.ObjectSet;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class AcontecimientoBD{
    
    /* Clase que contiene los métodos necesarios para trabajar
       con la tabla acontecimientos */
       
    private static Acontecimiento acontecimiento;
    
    private static ObjectContainer oc;
     
   
    public static void alta(Acontecimiento acontecimiento) throws Exception
    {
        oc=GenericoBD.getConexion();
        oc.store(acontecimiento);
    }
    
     public static Acontecimiento consulta(Acontecimiento acontecimiento) throws Exception
    {
        oc=GenericoBD.getConexion();
        ObjectSet resultado = oc.queryByExample(acontecimiento);
        if (resultado.hasNext())
            return (Acontecimiento) resultado.next();
        else
            return null;
        
    }
    
    public static java.sql.Date conversionDate(LocalDate fecha)
    {
        // Conversion LocalDate en java.sql.Date
        return java.sql.Date.valueOf(fecha);
    }
    
    public static java.sql.Time conversionTime(LocalTime hora)
    {
         // Conversion java.time.LocalTime en java.sql.Time
        return java.sql.Time.valueOf(hora);
    }
    
//    public static String listado() throws Exception{
//        // Método que genera un String con los datos de todos los acontemientos
//        GenericoBD.abrirBD();
//            
//        sentencia=GenericoBD.getConexion().createStatement();
//        resultado = sentencia.executeQuery("Select * from acontecimientos");
//
//        String mensaje="";
//        while (resultado.next())
//        {
//            crearObjeto();
//            mensaje += acontecimiento.toString()+"\n";
//        }
//        resultado.close();
//        GenericoBD.cerrarBD();
//          return mensaje;
//    }
    
//    public static void crearObjeto() throws Exception
//    {
//        /* creamos y llenamos un objeto de tipo acontecimiento a partir de una
//        fila de la tabla acontecimientos */
//        acontecimiento = new Acontecimiento();
//        acontecimiento.setNombre(resultado.getString("nombre"));
//        acontecimiento.setLugar(resultado.getString("lugar"));
//        acontecimiento.setFecha(resultado.getDate("fecha").toLocalDate());             
//        acontecimiento.setHoraI(resultado.getTime("horaInicio").toLocalTime());      
//        acontecimiento.setHoraF(resultado.getTime("horaFin").toLocalTime());
//        acontecimiento.setAforo(resultado.getInt("aforo"));
//    }
    
    public static void borrar(Acontecimiento acontecimiento) throws Exception
    {
        // Método que borrar un acontecimiento de la base de datos
        oc=GenericoBD.getConexion();
        oc.delete(acontecimiento);
    }
    
    public static Acontecimiento consultar(Acontecimiento acontecimiento) throws Exception
    {
        oc=GenericoBD.getConexion();
        ObjectSet conjunto = oc.queryByExample(acontecimiento);
        if(conjunto.hasNext())
        {
            acontecimiento = (Acontecimiento) conjunto.next();
        }
        else
            return null;
        return acontecimiento;
        
    }
    
     public static void modificar(Acontecimiento ac) throws Exception
    {
            oc=GenericoBD.getConexion();
            oc.store(acontecimiento);       
            // Cerrar la conexión
            GenericoBD.cerrar();
    }
     

//    public static ArrayList<Acontecimiento> consultarProximosLibres() throws Exception
//    { 
//            // opcion dos: Select más compleja
//        
//            /* arraylist que contendrá todos los objetos de tipo acontecimiento
//               cuya fecha sea superior a la de hoy  y queden plazas libres */
//            ArrayList<Acontecimiento> lista = new ArrayList();
//            
//            GenericoBD.abrirBD();
//            
//            plantilla = "select * from acontecimientos where fecha > ?";
//            sentenciaPre = GenericoBD.getCon().prepareStatement(plantilla);
//            // Conversión a sql.Date de la fecha de hoy
//            sentenciaPre.setDate(1, conversionDate(LocalDate.now()));
//            resultado = sentenciaPre.executeQuery();
//            while (resultado.next())
//            {  
//                // ¿ Hay plazas libres? 
//                if (isAforo(resultado.getString("nombre")))
//                {
//                    crearObjeto();               
//                    // La lista de asistentes no me interesa -- Carga bajo demanda.
//                    lista.add(acontecimiento);
//                }
//            }
//            resultado.close();
//            GenericoBD.cerrarBD();
//            return lista;
//    }
//    
//    public static boolean isAforo(String nombre) throws Exception{
//        // Controlador de base de datos ??????
//        if (AsistentesBD.getNumeroAsistentes(nombre)< resultado.getInt("aforo"))
//            return true;
//        return false;
//        
//        // return AsistentesBD.getNumeroAsistentes(nombre)< resultado.getInt("aforo");
//    }
}
