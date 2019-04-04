/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;

/**
 *
 * @author MARTA
 */
public class GenericoBD_db4o {
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
