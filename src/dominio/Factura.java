package dominio;

public class Factura {
    private int id;
    private int idCliente;
    private int numFactura;
    private String concepto;
    private int precio;
    private String fecha;
    private String hora;
    private double importe;

    public Factura(int id, int idCliente, int numFactura, String concepto,
                   int precio, String fecha, String hora, double importe) {
        this.id = id;
        this.idCliente = idCliente;
        this.numFactura = numFactura;
        this.concepto = concepto;
        this.precio = precio;
        this.fecha = fecha;
        this.hora = hora;
        this.importe = importe;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public void setNumFactura(int numFactura) {
        this.numFactura = numFactura;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}