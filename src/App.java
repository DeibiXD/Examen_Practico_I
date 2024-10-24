import java.util.LinkedList;

import hn.unah.poo.clases.Pedido;
import hn.unah.poo.clases.Producto;
import hn.unah.poo.clases.ProductoAlimenticio;
import hn.unah.poo.clases.ProductoElectronico;
import hn.unah.poo.clases.tienda.ConfiguracionTienda;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<Producto> nvaLista = new LinkedList<>();
        LinkedList<Producto> nvaLista2 = new LinkedList<>();
        Pedido nvoPedidoCredito = new Pedido(nvaLista);
        Pedido nvoPedidoPaypal = new Pedido(nvaLista2);
        //Los productos electronicos
        Producto telefono = new ProductoElectronico("Iphone 15", 40000.0, 4, 24);
        Producto controlTV = new ProductoElectronico("Samsung Control Basic", 500, 10, 3);
        nvoPedidoCredito.agregarProductos(controlTV, 2);
        nvoPedidoCredito.agregarProductos(telefono, 1);


        Producto telefono2 = new ProductoElectronico("Samsung S22", 35000.0, 2, 22);
        Producto controlTV2 = new ProductoElectronico("Asus Control Basic", 600, 5, 6);
        nvoPedidoPaypal.agregarProductos(controlTV2, 2);
        nvoPedidoPaypal.agregarProductos(telefono2, 1);

        //Los producto alimenticios
        Producto leche = new ProductoAlimenticio("Leche Sula", 24.0, 400, 2025);
        Producto galleta = new ProductoAlimenticio("Oreo", 90.0, 100, 2026);
        nvoPedidoCredito.agregarProductos(galleta, 10);
        nvoPedidoCredito.agregarProductos(leche, 3);

        Producto leche2 = new ProductoAlimenticio("Leche Leyde", 25.0, 500, 2025);
        Producto galleta2 = new ProductoAlimenticio("Oreo Vanilla", 92.0, 90, 2026);
        nvoPedidoPaypal.agregarProductos(galleta2, 10);
        nvoPedidoPaypal.agregarProductos(leche2, 10);

        LinkedList<Pedido> listaPedidos = new LinkedList<>();
        listaPedidos.add(nvoPedidoPaypal);
        listaPedidos.add(nvoPedidoCredito);
        //Total de los pedidos
        for (Pedido pedido : listaPedidos) {
            System.out.println(pedido.calcularTotal());
        }
        //Creando y accediendo una tienda
        ConfiguracionTienda nvaTienda =ConfiguracionTienda.crearInstancia("Mercadito", "Las lomas", "Lempira");
        ConfiguracionTienda nvaTienda2 =ConfiguracionTienda.crearInstancia("Mercadito", "Las lomas", "Lempira");
        
        System.out.println(nvaTienda.toString());
    }
}
