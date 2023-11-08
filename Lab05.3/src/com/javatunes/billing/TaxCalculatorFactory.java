package com.javatunes.billing;

public class TaxCalculatorFactory {

    private TaxCalculatorFactory() {
    }

    /*
    * TODO: Consider implementing a cache of TaxCalculator objects;
    *
    * if I have not previously created the object for example USAtax, then I will create it here (with new), add it to my cache, and then return it
    *
    * however, if my cache already contains it, then I just fetch it from the cache and return it - no need to create another one.
    *
    * hint: you could use a simple Map<Location,TaxCalculator> for the cache.
     *
    public static TaxCalculator getTaxCalculator(Location location) {
        TaxCalculator calc = null;

        switch (location) {
            case ONLINE:
                calc = new OnlineTax();
                break;
            case USA:
                calc = new USATax();
                break;
            case EUROPE:
                calc = new EuropeTax();
        }
        return calc;
    }

     */
}