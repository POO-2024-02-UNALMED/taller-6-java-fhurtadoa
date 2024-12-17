package vehiculos;

public class Camioneta extends Vehiculo {
        
    private boolean volco;

    public Camioneta(String placa, Integer puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        Vehiculo.increaseCamionetas();
        this.volco = volco;
    }

    public boolean isVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}