package hn.unah.poo.clases.tarjetas;
import hn.unah.poo.interfaces.*;
public class PagoTarjetaCredito implements IMetodooPago {

    @Override
    public boolean procesarPago(double monto) {//Verificar el monto del pedido
        return true;
    }
    
}
