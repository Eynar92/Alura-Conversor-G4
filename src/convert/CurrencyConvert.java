package convert;

import java.util.HashMap;

public class CurrencyConvert {

    private HashMap<String, Double> tasaDeCambioOriginal = new HashMap<>();
    private HashMap<String, String> currencyReverseMap = new HashMap<>();

    public void CambioDinero() {

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

    public void ReverseDinero() {

        currencyReverseMap.put("Bolivianos (Bs) a Dólar ($)", "Dólar ($) a Bolivianos (Bs)");
        currencyReverseMap.put("Bolivianos (Bs) a Euro (€)", "Euro (€) a Bolivianos (Bs)");
        currencyReverseMap.put("Bolivianos (Bs) a Libras Esterlinas (£)", "Libras Esterlinas (£) a Bolivianos (Bs)");
        currencyReverseMap.put("Bolivianos (Bs) a Yen Japonés (¥)", "Yen Japonés (¥) a Bolivianos (Bs)");
        currencyReverseMap.put("Bolivianos (Bs) a Won sur-coreano (₩)", "Won sur-coreano (₩) a Bolivianos (Bs)");
        currencyReverseMap.put("Dólar ($) a Bolivianos (Bs)", "Bolivianos (Bs) a Dólar ($)");
        currencyReverseMap.put("Euro (€) a Bolivianos (Bs)", "Bolivianos (Bs) a Euro (€)");
        currencyReverseMap.put("Libras Esterlinas (£) a Bolivianos (Bs)", "Bolivianos (Bs) a Libras Esterlinas (£)");
        currencyReverseMap.put("Yen Japonés (¥) a Bolivianos (Bs)", "Bolivianos (Bs) a Yen Japonés (¥)");
        currencyReverseMap.put("Won sur-coreano (₩) a Bolivianos (Bs)", "Bolivianos (Bs) a Won sur-coreano (₩)");

    }

    public HashMap<String, String> getCurrencyReverse() {
        return currencyReverseMap;
    }
}
