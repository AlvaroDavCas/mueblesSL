import dominio.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();

        cliente.setNombre(" ");
        cliente.setApellidos(" ");
        cliente.setNif(" ");
        cliente.setDireccion(" ");
        cliente.setLocalidad(" ");
        cliente.setProvincia(" ");
        cliente.setTelefono(" ");
        cliente.setEmail(" ");

        //visualizar valores
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getApellidos());
        System.out.println(cliente.getNif());
        System.out.println(cliente.getDireccion());
        System.out.println(cliente.getLocalidad());
        System.out.println(cliente.getProvincia());
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getEmail());
    }
}