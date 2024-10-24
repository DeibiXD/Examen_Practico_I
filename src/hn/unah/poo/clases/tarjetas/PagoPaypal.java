package hn.unah.poo.clases.tarjetas;

import hn.unah.poo.interfaces.IMetodooPago;

public class PagoPaypal implements IMetodooPago{

    private String cuenta;

    

    public PagoPaypal(String cuenta) {
        this.cuenta = cuenta;
    }



    @Override
    public boolean procesarPago(double monto) {//Verificar el monto del pedido
        System.out.println("Redirecionando a paypal con la cuenta: " + this.cuenta);
        return true;
    }



    public String getCuenta() {
        return cuenta;
    }



    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    
}
