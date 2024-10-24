package hn.unah.poo.clases.tarjetas;

import hn.unah.poo.interfaces.IMetodooPago;

public class PagoPaypal implements IMetodooPago{

    private String cuenta;

    @Override
    public boolean procesarPago(double monto) {//Verificar el monto del pedido
        return true;
    }

    
}
