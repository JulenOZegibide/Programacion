package t9p1e2;

import Modelo.UML.Acontecimiento;
import GUI.*;
import Modelo.BD.*;
import Modelo.UML.Empresa;
import Modelo.UML.Persona;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;



public class Controlador {
   
    private static Acontecimiento acontecimiento;
    private static Persona p;
    private static Empresa e;
    
    // Lista de acontecimientos que admiten personas.
    private static ArrayList<Acontecimiento> listaAcontecimientos;
    
    private static VentanaPrincipal vp;
    private static VentanaAcontecimientos ve;
    private static VentanaInscripcion vi;
    
    public static void main(String[] args) {    
       try{
        GenericoBD.abrirConexion();
        
        vp = new VentanaPrincipal();
        vp.setVisible(true);
       }catch(Exception e){
           System.out.println("No abre la bd");
       
       } 
    }
    
    public static void visualizarVentanaAlta()
    {
        // Dejo por debajo la principal
         ve = new VentanaAcontecimientos();
         ve.setVisible(true);
    }
    
    public static void volver(javax.swing.JFrame v){
        v.dispose();
    }
       
    public static void grabarAcontecimiento(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int nro)throws Exception{
       
        // Alta -- Crear objeto y enviarlo a AcontecimientoBD
        acontecimiento = new Acontecimiento(nombre,lugar, fecha,horaI,horaF,nro);
        AcontecimientoBD.alta(acontecimiento);
        System.out.println("Alta terminada");
        acontecimiento =  AcontecimientoBD.consulta(acontecimiento);
        System.out.println(acontecimiento.getNombre());
    }
    
   public static void terminar(){
       GenericoBD.cerrar();
       System.exit(0);
   }
   
//   public static String listado() throws Exception{
//       return AcontecimientoBD.listado();
//   }
   
   public static void borrarAcontecimiento(String nombre) throws Exception
   {
       // Primero lo consultamos, mostramos sus datos y luego pedimos confirmación.
       acontecimiento = new Acontecimiento(nombre);
       acontecimiento= AcontecimientoBD.consultar(acontecimiento);
       if (acontecimiento != null)
            if (vp.mostrar(acontecimiento.toString()) == true)
                 AcontecimientoBD.borrar(acontecimiento);
            else
                System.out.println("no borro");
       else
            System.out.println("Problemas");
   }
    
    public static void modificarAcontecimientoParteUno(String nombre) throws Exception
   {
       // Primero consultamos y mostramos sus datos
       acontecimiento = AcontecimientoBD.consultar(new Acontecimiento(nombre));
       ve = new VentanaAcontecimientos(acontecimiento);
       ve.setVisible(true);
   }
    
   public static void modificarAcontecimientoParteDos(String nombre, String lugar, LocalDate fecha, LocalTime horaI, LocalTime horaF, int nro) throws Exception
   {
       // actualizamos objeto en memoria
       acontecimiento.setLugar(lugar);
       acontecimiento.setFecha(fecha);
       acontecimiento.setHoraI(horaI);
       acontecimiento.setHoraF(horaF);
       acontecimiento.setAforo(nro);
       AcontecimientoBD.modificar(acontecimiento);
   }
   
   // Añadido al completo
   public static boolean visualizarVentanaInscripcion() throws Exception{
        // Pido ya a la base de datos información sobre los proximos acontecimientos con plazas libres.
        //listaAcontecimientos = AcontecimientoBD.consultarProximosLibres();
        
        if (listaAcontecimientos.isEmpty())
            return false;
        
        // Dejo por debajo la principal
         vi = new VentanaInscripcion();
         vi.setVisible(true);
         return true;
    }
   
   public static int getNumeroAcontecimientosDisponibles()
    {
        return listaAcontecimientos.size();
    }
   
    public static String getNombreAcontecimiento(int x)
    {
        return listaAcontecimientos.get(x).getNombre();
    }
   
    public static LocalDate getFechaAcontecimiento(int x)
    {
        acontecimiento = listaAcontecimientos.get(x);
        return acontecimiento.getFecha();
    }
    
    public static LocalTime getHoraAcontecimiento()
    {
        return acontecimiento.getHoraI();
    }
    
    public static boolean buscarPersona(String dni) throws Exception{
       p = new Persona();
       p.setDni(dni);
       p = PersonaBD.queryByDni(p);
       if (p != null)
           return true;
       return false;
   }
   
   public static String getNombre(){
       return p.getNombre();
   }
   
   public static String getApellidos(){
       return p.getApellidos();
   }
   
   public static String getTelefono(){
       return p.getTelefono();
   }
   
   public static String getNombreEmpresa(){
       return p.getE().getNombre();
   }
   
   public static String getNif(){
       return p.getE().getNif();
   }
   
   public static String getCnae(){
       return p.getE().getCnae().toString();
   }
   
   public static String getRazonSocial(){
       return p.getE().getRazonSocial();
   }
   
//   public static void altaAsistente() throws Exception{
//       // Relaciones
//       acontecimiento.setAsistente(p);
//       p.setEvento(acontecimiento);
//       
//       // A la base de datos
//       AsistentesBD.alta(acontecimiento,p);
//       
//   }
   
   public static void altaPersonaEmpresa(String nom,LocalDate fecha,LocalTime hora,String d,String n,String ap,String tel,String nif,String nEmp,String rs,String cnae) throws Exception{

       acontecimiento = new Acontecimiento(nom,fecha,hora);
       acontecimiento= AcontecimientoBD.consultar(acontecimiento);
              
       e = new Empresa(nif,nEmp,rs,cnae);
       e = PersonaBD.consultarempresa(e);
       p = new Persona(acontecimiento,d,n,ap,tel,e);

       PersonaBD.alta(p);
   }
   
//   public static String getAsistentes(String nombre) throws Exception
//   {
//       ArrayList<Persona> lista = PersonaBD.getAsistentes(nombre);
//       String datos="";
//       for(Persona obj:lista)
//       {
//           datos += obj.toString() + "\n";
//       }
//       return datos;
//   }
}
