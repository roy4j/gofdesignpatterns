package gof.dp17.colleagues.tenant;

import gof.dp17.Mediator;
import gof.dp17.Room;

public abstract class Tenant {
	protected Mediator mediator;

	public Tenant(Mediator mediator) {
		this.mediator = mediator;
	}

	public boolean takeOnRent(Room r) {
		mediator.unregisterTenant(this);
		return true;
	}
}