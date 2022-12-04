package gof.dp17.colleagues.tenant;

import gof.dp17.Mediator;

public class Madhu extends Tenant {

	public Madhu(Mediator mediator) {
		super(mediator);
		mediator.registerTenant(this);
	}

	@Override
	public String toString() {
		return "Madhu";
	}
}