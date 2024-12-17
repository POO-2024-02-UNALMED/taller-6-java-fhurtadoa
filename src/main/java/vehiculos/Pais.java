package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    String pais;
    private static Map<String, Integer> vehiculosForCountry = new HashMap<>();


    public Pais(String pais) {
        this.pais = pais;
        vehiculosForCountry.put(pais, vehiculosForCountry.getOrDefault(pais, 0) + 1);
    }

    public String getNombre() {
        return pais;
    }

    public void setNombre(String pais) {
        this.pais = pais;
    }

    public static Pais paisMasVendedor() {
        String paisMasVendedor = null;
        int maxVentas = 0;

        for (Map.Entry<String, Integer> entry : vehiculosForCountry.entrySet()) {
            if (entry.getValue() > maxVentas) {
                maxVentas = entry.getValue();
                paisMasVendedor = entry.getKey();
            }
        }

        return paisMasVendedor != null ? new Pais(paisMasVendedor) : null;
    }
}