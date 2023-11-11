package co.com.cesde.tienda.modelo;

public class ProductoModelo {

    //Datos productos
    private int idProducto;
    private String nombreProducto;
    private double cantidad;
    private double precio;
    private int opc;

    //Getter y setter
    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getOpc() {
        return opc;
    }

    public void setOpc(int opc) {
        this.opc = opc;
    }

    //Constructores
    public ProductoModelo(int idProducto, String nombreProducto, double cantidad, double precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad ;
        this.precio = precio;
    }
    public ProductoModelo(){
    }
}
