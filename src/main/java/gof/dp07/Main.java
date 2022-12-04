package gof.dp07;

import gof.dp07.legacy.Legacy;
import gof.dp07.legacy.LegacyImpl;
import gof.dp07.vendor.VendorImpl;

public class Main {
    public static void main(String[] args) {
        Legacy legacy = new LegacyImpl();
        System.out.println("Legacy calls...");
        testLegacy(legacy);

        VendorImpl vendor = new VendorImpl();
        Legacy legacyAdapter = new LegacyAdapter(vendor);
        System.out.println("Adapter calls...");
        testLegacy(legacyAdapter);
    }

    private static void testLegacy(Legacy legacy) {
        legacy.legacyMethod();
    }
}