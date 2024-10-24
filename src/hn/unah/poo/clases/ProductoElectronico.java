package hn.unah.poo.clases;

public class ProductoElectronico extends Producto{
    private int garantia;

    public ProductoElectronico(String nombre, double precio, int stock, int garantia) {
        super(nombre, precio, stock);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    
}
