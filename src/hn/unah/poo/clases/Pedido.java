package hn.unah.poo.clases;

import java.util.LinkedList;

import hn.unah.poo.clases.tarjetas.PagoPaypal;
import hn.unah.poo.clases.tarjetas.PagoTarjetaCredito;


public class Pedido {
    private LinkedList<Producto> lista_productos = new LinkedList<>();

    public Pedido(LinkedList<Producto> lista_productos) {
        this.lista_productos = lista_productos;
    }

    public void agregarProductos(Producto producto,int cantidad){
        //Verifiar que hay suficiente stock
        if (producto.getStock()<cantidad){
            System.out.println("No hay suficiente storck de este producto");
        }else if(producto.getStock()>cantidad){
            //Agregando a carrito
            for (int i = 0; i<cantidad; i++){
            lista_productos.add(producto);
            producto.setStock(producto.getStock()-1);//Reduciendo el stock por iteracion
        }
        }

    }

    public void procesar_pedido(PagoPaypal pagoPaypal){
        int fecha_actual = 2024;
        if (pagoPaypal.procesarPago(this.calcularTotal())){
        for (Producto producto : this.lista_productos) {
            if (producto instanceof ProductoAlimenticio){
                ProductoAlimenticio nvProductoAlimenticio = (ProductoAlimenticio) producto;
                if (nvProductoAlimenticio.getFechaExpiracion()<fecha_actual){
                    System.out.println("Este producto esta vencido, quitando de pedido");
                    this.lista_productos.remove(producto);
                }
            }
        }
    } else {
        System.out.println("Error procesando el pedido");
    }
    }

    public void procesar_pedido(PagoTarjetaCredito tarjetaCredito){
        int fecha_actual = 2024;
        if (tarjetaCredito.procesarPago(this.calcularTotal())){
        for (Producto producto : this.lista_productos) {
            if (producto instanceof ProductoAlimenticio){
                ProductoAlimenticio nvProductoAlimenticio = (ProductoAlimenticio) producto;
                if (nvProductoAlimenticio.getFechaExpiracion()<fecha_actual){
                    System.out.println("Este producto esta vencido, quitando de pedido");
                    this.lista_productos.remove(producto);
                }
            }
        }
    } else {
        System.out.println("Error procesando el pedido.");
    }
    }

    public double calcularTotal (){
        double total=0;
        for (Producto producto : lista_productos) {
            total = total+producto.getPrecio();
        }
        return total;
    }

    

    
}
