import dominio.Cliente;
import dominio.Factura;

public class Main {
    public static void main(String[] args) {


        Cliente c1 = new Cliente(1, "123456789", "111111111x", "Luis", "Gento",
                "C/CALLE", "LUGO", "", "CORREO@correo.com");

        Factura f1 = new Factura(1, 1, 1, "", 1000, "hoy", "18:30", 1000);

        c1.addFactura(f1);

        for (Factura f : c1.getFacturas()) {
            System.out.println("Factura nº: " + f.getNumFactura() + " - Importe: " + f.getImporte());
        }
    }
}