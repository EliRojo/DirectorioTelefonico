import domain.Contacto;
import domain.Directorio;
import domain.Telefono;
import service.TipoTelefono;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Telefono tel1 = new Telefono(TipoTelefono.MOVIL, "54","1122491299");
        Telefono tel2 = new Telefono(TipoTelefono.MOVIL, "54","1122458877");
        Telefono tel3 = new Telefono(TipoTelefono.MOVIL, "54","1153396580");
        Telefono tel4 = new Telefono(TipoTelefono.MOVIL, "54","1187542033");
        Telefono tel5 = new Telefono(TipoTelefono.FIJO, "54","47553318");
        //CREANDO EL SET DE TELEFONOS
        Set<Telefono> juan = new HashSet<>();
        juan.add(tel2);
        juan.add(tel3);
        Set <Telefono> eli =new HashSet<>();
        eli.add(tel1);
        eli.add(tel4);
        Set<Telefono> vane= new HashSet<>();
        vane.add(tel5);
        //CREANDO CONTACTOS
        Contacto contacto1 = new Contacto("juan","albarracin",juan);
        Contacto contacto2 = new Contacto("eli","rojo",eli);
        Contacto contacto3 = new Contacto("vane","rojo",vane);
        Contacto contacto4 = new Contacto("pablo","benitez");
        Contacto contacto5 = new Contacto("mica","fernandez");

        //CREANDO DIRECTORIO
        Directorio directorio = new Directorio();
        //LLAMANDO METODOS
        directorio.registrarContacto(contacto1.getNombre(),contacto1.getApellido(),juan);
        directorio.registrarContacto(contacto2.getNombre(),contacto2.getApellido(),eli);
        directorio.registrarContacto(contacto3.getNombre(),contacto3.getApellido(),vane);
        directorio.registrarContacto(contacto4.getNombre(),contacto4.getApellido());
        directorio.registrarContacto(contacto5.getNombre(),contacto5.getApellido());

        directorio.registrarTelefono("pablo","benitez",TipoTelefono.MOVIL,"54","1150495065");
        directorio.registrarTelefono("mica","fernandez",TipoTelefono.MOVIL,"54","1120236099");
        directorio.registrarTelefono("eli","rojo",TipoTelefono.FIJO,"54","70808050");



        directorio.removerContacto("juan","albarracin");
        System.out.println(directorio.getContactos());

    }
}
