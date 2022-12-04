package gof.dp01;

import gof.dp01.product.FourWheeler;
import gof.dp01.product.TwoWheeler;
import gof.dp01.product.Vehicle;

public class VehicleFactory {
    public Vehicle getVehicle(int numberOfWheels) {
        if (numberOfWheels == 4) {
            return new FourWheeler();
        } else if (numberOfWheels == 2) {
            return new TwoWheeler();
        } else {
            return null;
        }
    }
}
