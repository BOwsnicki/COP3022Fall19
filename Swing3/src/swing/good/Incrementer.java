package swing.good;

public class Incrementer extends Model {
	int count;
	
	public Incrementer() {
		super();
		count = 0;
	}

	@Override
	@SuppressWarnings("unused")
	public void update(Object arg) {
		if (arg instanceof Integer) {
			count += (Integer)arg;
			notifyViews(count);
		}
	}
}
