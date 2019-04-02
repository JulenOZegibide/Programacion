package Modelo.BD;

import com.db4o.*;

public class GenericoBD {
    private static ObjectContainer oc;
    public static void abrirConexion() throws Exception{
          oc = Db4o.openFile("bdejemplo");
    /*
          //otra manera de abrir la conexion
          
          configuration configuracion=Db4o.newconfiguration();
          configuracion.objectclass(Acontecimiento.class).updatedepth(50);
          configuracion.objectclass(Empresa.class).updatedepth(50);
          configuracion.objectclass(Persona.class).updatedepth(50);
          oc=DB4o.openFile(configuracion,"bdacontecimientos");
          */
    
    }
    public static void cerrar(){
        oc.close();
    }
    public static ObjectContainer getConexion(){
        return oc;
    }
    
}

