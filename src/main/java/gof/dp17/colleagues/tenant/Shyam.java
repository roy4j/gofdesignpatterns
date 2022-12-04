package gof.dp17.colleagues.tenant;

import gof.dp17.Mediator;
import gof.dp17.Room;

public class Shyam extends Tenant {

	public Shyam(Mediator mediator) {
		super(mediator);
		mediator.registerTenant(this);
	}

	public boolean takeOnRent(Room r) {
		if ((r.getRent() <= 3000) && (r.getRent() >= 2000)) {
			mediator.unregisterTenant(this);
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Shyam";
	}
}