public final class Point {
	private final double x;
	private final double y;
	private final Radius radius;
	
	public Point(double x, double y, Radius radius)
	{
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public Radius getRadius(Radius radius){
		return radius;
	}
	
}

//the issue here is that, the state of Point can be changed. So we have to make it immutable

public final class Point {
	private final double x;
	private final double y;
	private final Radius radius;
	
	public Point(double x, double y, Radius radius)
	{
		this.x = x;
		this.y = y;
		
		Radius clone = new Radius();
		clone.setStart(radius.getStart());
		clone.setEnd(radius.getEnd());
		
		this.radius = clone;
	} //cloning the immutable class in constructor
	
	public double getX(){
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public Radius getRadius(Radius radius){
		
		
		Radius clone = new Radius();
		clone.setStart(radius.getStart());
		clone.setEnd(radius.getEnd());
		
		this.radius = clone;
		
	} //clone the immutable class in the getter as well
	
}

