package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    String nombre;
    Pais pais;
    private static Map<String, Integer> vehiculosByFabric = new HashMap<>();

    public Fabricante(String nombre, Pais pais) {
        vehiculosByFabric.put(nombre, vehiculosByFabric.getOrDefault(pais, 0) + 1);
        this.nombre = nombre;
        this.pais = pais;
    }

    public static Fabricante fabricaMayorVentas() {
        String fabricanteMayorVentas = null;
        int maxVentas = 0;

        for (Map.Entry<String, Integer> entry : vehiculosByFabric.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                fabricanteMayorVentas = entry.getKey();
            }
        }
        return fabricanteMayorVentas != null ? new Fabricante(fabricanteMayorVentas, null) : null;
    }

    public String getNombre() {
        return nombre;
    }

    public Pais getPais() {
        return pais;
    }

}