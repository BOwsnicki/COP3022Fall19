public class Crowd {
	private static final int CROWD_MAX = 30;

	private Person[] members;
	private int memberCount;

	public Crowd() { // HERE a default constructor makes sense!
		members = new Person[CROWD_MAX];
		memberCount = 0;
	}

	public int getMemberCount() {
		return memberCount;
	}

	public void add(Person p) {
		if (memberCount < CROWD_MAX) { // Still a space left?
			members[memberCount++] = p;
		} else {
		} // Short for "No idea. Let's pretend it didn't happen!"
	}

	public boolean isIn(Person p) {
		for (int i = 0; i < memberCount; i++) {
			if (members[i].equals(p))
				return true;
		}
		return false;
	}
	
	public boolean isIn(String name) {
		for (int i = 0; i < memberCount; i++) {
			if (members[i].getName().equals(name))
				return true;
		}
		return false;
	}
}
