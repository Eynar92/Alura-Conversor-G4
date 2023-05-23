package convert;

import java.util.HashMap;
import window.CurrencyWindow;

public class CurrencyConvert {

    private HashMap<String, Double> tasaDeCambioOriginal;

    public void CambioDinero() {

        tasaDeCambioOriginal = new HashMap<>();
        tasaDeCambioOriginal.put("Bolivianos (Bs) a Dólar ($)", 0.14);
        tasaDeCambioOriginal.put("Bolivianos (Bs) a Euro (€)", 0.13);
        tasaDeCambioOriginal.put("Bolivianos (Bs) a Libras Esterlinas (£)", 0.12);
        tasaDeCambioOriginal.put("Bolivianos (Bs) a Yen Japonés (¥)", 20.00);
        tasaDeCambioOriginal.put("Bolivianos (Bs) a Won sur-coreano (₩)", 190.22);
        tasaDeCambioOriginal.put("Dólar ($) a Bolivianos (Bs)", 6.91);
        tasaDeCambioOriginal.put("Euro (€) a Bolivianos (Bs)", 7.48);
        tasaDeCambioOriginal.put("Libras Esterlinas (£) a Bolivianos (Bs)", 8.60);
        tasaDeCambioOriginal.put("Yen Japonés (¥) a Bolivianos (Bs)", 0.050);
        tasaDeCambioOriginal.put("Won sur-coreano (₩) a Bolivianos (Bs)", 0.0053);
    }

    public HashMap<String, Double> getTasaDeCambio() {
        return tasaDeCambioOriginal;
    }
}
