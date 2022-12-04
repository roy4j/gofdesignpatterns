package gof.dp01;

import gof.dp01.product.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new VehicleFactory().getVehicle(2);
        vehicle.start();
    }
}
