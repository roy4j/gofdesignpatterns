package gof.dp17;

import gof.dp17.colleagues.landlord.Dick;
import gof.dp17.colleagues.landlord.Harry;
import gof.dp17.colleagues.landlord.Tom;
import gof.dp17.colleagues.tenant.Madhu;
import gof.dp17.colleagues.tenant.Jadu;
import gof.dp17.colleagues.tenant.Ram;
import gof.dp17.colleagues.tenant.Shyam;

public class Main {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        /**
         * Concrete Landlord Colleague Objects are created and registered with
         * the Mediator
         */
        new Tom(mediator);
        new Dick(mediator);
        new Harry(mediator);
        /**
         * Concrete Tenant Colleague Objects are created and registered with the
         * Mediator
         */
        new Ram(mediator);
        new Shyam(mediator);
        new Madhu(mediator);
        new Jadu(mediator);

        /**
         * Prints the list of Tenants who are seeking Rooms
         */
        System.out.println("Starting List:" + mediator.getTenants().size());
        System.out.println(mediator.getTenants());
        /**
         * Facilitates conversation among all the Tenant Colleague Objects and
         * Landlord Colleague Objects
         */
        System.out.println("Allocating Rooms...");
        mediator.rentRoom();
        /**
         * Prints the list of Tenants who are seeking Rooms
         */
        System.out.println("Waiting List:" + mediator.getTenants().size());
        System.out.println(mediator.getTenants());

        System.out.println("The End");
    }
}