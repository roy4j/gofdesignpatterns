package gof.dp17.colleagues.landlord;

import gof.dp17.Mediator;

public class Dick extends Landlord {

	public Dick(Mediator mediator) {
		super(mediator);
		room.setRent(2000);
	}

	@Override
	public String toString() {
		return "Dick";
	}
}