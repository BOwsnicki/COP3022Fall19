package abstractclasses;

public class ConcreteC extends AbstractC {
		   @Override
		   public void put(String s) {
		      this.s = s;
		   }
		   @Override
		   public void show() {
		      System.out.println(s);
		   }
}
