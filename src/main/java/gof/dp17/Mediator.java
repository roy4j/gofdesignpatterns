package gof.dp17;

import gof.dp17.colleagues.landlord.Landlord;
import gof.dp17.colleagues.tenant.Tenant;

import java.util.ArrayList;

public class Mediator {
    private ArrayList<Tenant> tenants = new ArrayList<>();
    private ArrayList<Landlord> landlords = new ArrayList<>();

    public ArrayList<Tenant> getTenants() {
        return tenants;
    }

    public ArrayList<Landlord> getLandlords() {
        return landlords;
    }

    public void registerTenant(Tenant t) {
        tenants.add(t);
    }

    public void unregisterTenant(Tenant t) {
        tenants.remove(t);
    }

    public void registerLandlord(Landlord l) {
        landlords.add(l);
    }

    public void unregisterLandlord(Landlord l) {
        landlords.remove(l);
    }

    /**
     * This method asks a Landlord if he/she has a room to rent
     * <i>l.hasRoom()</i>, then offers the room to a Tenant
     * <i>t.takeOnRent(l.getRoom())</i>, if the Tenant accepts the deal then
     * notifies the same with the Landlord <i>l.giveOnRent()</i>.
     */
    public void rentRoom() {
        ArrayList<Tenant> tenantList = new ArrayList<>(tenants);
        for (Tenant t : tenantList) {
            for (Landlord landlord : landlords) {
                if (landlord.hasRoom()) {
                    if ((t.takeOnRent(landlord.getRoom())) && (landlord.giveOnRent())) {
                        System.out.println(t + " -->> " + landlord);
                        break;
                    }
                }
            }
        }
    }
}