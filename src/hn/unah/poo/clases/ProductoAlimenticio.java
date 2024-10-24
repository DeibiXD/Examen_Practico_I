package hn.unah.poo.clases;

public class ProductoAlimenticio extends Producto {
    private int fechaExpiracion;

    public ProductoAlimenticio(String nombre, double precio, int stock, int fechaExpiracion) {
        super(nombre, precio, stock);
        this.fechaExpiracion = fechaExpiracion;
    }

    public int getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(int fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    
}
