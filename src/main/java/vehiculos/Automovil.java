package vehiculos;

public class Automovil extends Vehiculo {
    
    private int puestos;

    public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        Vehiculo.increaseAutomoviles();
        this.puestos = puestos;
    }
}