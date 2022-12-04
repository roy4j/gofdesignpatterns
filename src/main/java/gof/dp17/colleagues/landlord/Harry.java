package gof.dp17.colleagues.landlord;

import gof.dp17.Mediator;

public class Harry extends Landlord {

	public Harry(Mediator mediator) {
		super(mediator);
		room.setRent(5000);
	}

	@Override
	public String toString() {
		return "Harry";
	}
}