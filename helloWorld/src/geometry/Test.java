package geometry;

public class Test {
	public static void main(String[] args){
		
		Point p= new Point();
		p.setX(10);
		p.setY(20);
		
		p.setSelected(true);
		
		System.out.println("x coordinate of point p is: "+ p.getX() + "\n"+
				"y coordinate of point p is " + p.getY()+ '\n' + 
				"status of a dot is "+ p.isSelected());
		
		double result= p.distance(40, 50);
		System.out.println(result);
		
		
		
	}
}
