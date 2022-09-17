
package pruebaz;
import pruebaz.DTO.Cliente;
public class Main {

    public static void main(String[] args) {
              System.out.println("Creando Usuario");
        Cliente c = new Cliente();
        c.setId(7483);
        c.setNombreCompleto("Alonzo ");
        c.setTelefono(568737482);
        c.setRun(187422284, '0');
        c.setNombreUsuario("pois");
        c.setMail("Alonz0@gmail.com");
        c.setContraseña("alh13");
       
        System.out.println("Sus Datos son");
        System.out.println("El id es: "+c.getId());
        System.out.println("El nombre es: "+c.getNombreCompleto());
        System.out.println("El telefono es: "+ c.getTelefono());
        System.out.println("El rut es: "+c.getRun());
        System.out.println("El nombre de usuario es: "+c.getNombreUsuario());
        System.out.println("Su mail es: "+c.getMail());
        System.out.println("La contrasena es"+c.getContraseña());
        
    }
    
}
