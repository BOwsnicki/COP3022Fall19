package MethodsConstructors;

public class Rectangle 
{
   private int width;
   private int length;
   
   public Rectangle(int width, int length) {
      this.width = width;
      this.length = length;
   }

   public int circumference() {
      return 2*width + 2*length;
   } 

   public static void main(String args[]) {
	  Rectangle obj = new Rectangle(4,6);
	  // System.out.println(obj.circumference());
      System.out.println(obj.circumference(2,3)); 
   } 
}