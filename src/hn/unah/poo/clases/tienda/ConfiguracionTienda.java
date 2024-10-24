package hn.unah.poo.clases.tienda;

public class ConfiguracionTienda {
//Singleton Class
    private String nombre_Tienda;
    private String direccion;
    private String moneda;
    private static int counter = 0;
    

    private ConfiguracionTienda(String nombre_Tienda, String direccion, String moneda) {
        this.nombre_Tienda = nombre_Tienda;
        this.direccion = direccion;
        this.moneda = moneda;
    }


    public ConfiguracionTienda crearInstancia (String nombre, String direccion, String moneda){
        if (ConfiguracionTienda.counter==0){
            ConfiguracionTienda confTienda = new ConfiguracionTienda(nombre,direccion,moneda);
            ConfiguracionTienda.counter++;
            return confTienda;
        }else {
            System.out.println("Ya ha creado una tienda");
            return null;
        }
    }


    public String getNombre_Tienda() {
        return nombre_Tienda;
    }


    public void setNombre_Tienda(String nombre_Tienda) {
        this.nombre_Tienda = nombre_Tienda;
    }


    public String getDireccion() {
        return direccion;
    }


    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    public String getMoneda() {
        return moneda;
    }


    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

}