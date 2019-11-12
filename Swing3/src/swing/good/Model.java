package swing.good;
import java.util.ArrayList;
import java.util.List;

public abstract class Model {
	private List<View> views;
	
	public Model () {
		 this.views = new ArrayList<View>();
	}
	
	public void addView(View v) {
		views.add(v);
	}
	
	protected void notifyViews(Object changed) {
		for (View v : views) {
			v.notify(changed);
		}
	}
	
	public abstract void update(Object arg);
}
