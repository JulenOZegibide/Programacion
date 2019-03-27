package Modelo.BD;

import com.db4o.*;

public class GenericoBD {
    private static ObjectContainer oc;
    public static void abrirConexion() throws Exception{
          oc = Db4o.openFile("bdejemplo");
    }
    public static void cerrar(){
        oc.close();
    }
    public static ObjectContainer getConexion(){
        return oc;
    }
    
}

