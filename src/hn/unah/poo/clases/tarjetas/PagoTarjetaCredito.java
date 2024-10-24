package hn.unah.poo.clases.tarjetas;
import hn.unah.poo.interfaces.*;
public class PagoTarjetaCredito implements IMetodooPago {

    private double fondosDisponible;

    public PagoTarjetaCredito(double fondosDisponible) {
        this.fondosDisponible = fondosDisponible;
    }

    public double getFondosDisponible() {
        return fondosDisponible;
    }

    public void setFondosDisponible(double fondosDisponible) {
        this.fondosDisponible = fondosDisponible;
    }
    
    @Override
    public boolean procesarPago(double monto) {//Verificar el monto del pedido
        if (this.fondosDisponible<monto){
            return false;
        }else{
        return true;
    }
    }

}
