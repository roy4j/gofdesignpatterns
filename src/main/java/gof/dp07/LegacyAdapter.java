package gof.dp07;

import gof.dp07.legacy.Legacy;
import gof.dp07.vendor.Vendor;

public class LegacyAdapter implements Legacy {
    Vendor vendor;

    public LegacyAdapter(Vendor vendor) {
        this.vendor = vendor;
    }

    public void legacyMethod() {
        vendor.vendorMethod();
    }
}