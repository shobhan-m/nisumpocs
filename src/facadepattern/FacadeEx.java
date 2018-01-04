package facadepattern;

import com.designpatterns.factory.Circle;
import com.designpatterns.factory.Shape;
import com.designpatterns.factory.Square;

public class FacadeEx {
	private Shape circle;
	  // private Shape rectangle;
	   private Shape square;
	   public FacadeEx() {
		   circle=new Circle();
		   square=new Square();
	   }
	   
	   public void getCircle() {
		   circle.draw();
	   }
	   public void getSquare() {
	   
	   square.draw();
	   }
		   
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   
		FacadeEx facadeEx= new FacadeEx();
		facadeEx.getCircle();
		facadeEx.getSquare();

	}

}
