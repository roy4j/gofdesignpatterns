package gof.dp17.colleagues.landlord;

import gof.dp17.Mediator;

public class Tom extends Landlord {

	public Tom(Mediator mediator) {
		super(mediator);
		room.setRent(1000);
	}

	@Override
	public String toString() {
		return "Tom";
	}
}