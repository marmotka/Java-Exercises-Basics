package hospital;

import persons.Patient;

public abstract class Ordinatory {

	protected Room[] rooms = new Room[10];
	protected String type;

	public Ordinatory() {
		for (int i = 0; i < rooms.length; i++) {
			rooms[i] = new Room();
		}
	}

	public int idxAvailableRoom(Patient p) {
		for (int i = 0; i < rooms.length; i++) {
			if (rooms[i].hasAvailableBed(p)) {
				return i;
			}
		}
		return -1;
	}

	public Room[] getRooms() {
		return rooms;
	}

	public String getType() {
		return type;
	}

}
