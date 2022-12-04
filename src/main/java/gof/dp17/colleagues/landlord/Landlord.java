package gof.dp17.colleagues.landlord;

import gof.dp17.Mediator;
import gof.dp17.Room;

public abstract class Landlord {
	protected Mediator mediator;
	protected Room room;
	protected int max_rooms = 3;

	public Landlord(Mediator mediator) {
		this.mediator = mediator;
		this.room = new Room(0);
		mediator.registerLandlord(this);
	}

	public Room getRoom() {
		return room;
	}

	public boolean giveOnRent() {
		if (max_rooms == 0) {
			mediator.unregisterLandlord(this);
			return false;
		}
		max_rooms--;
		return true;
	}

	public boolean hasRoom() {
		if (max_rooms > 0)
			return true;
		return false;
	}
}