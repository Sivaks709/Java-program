class Ball
{
	//Variable
	private double radius;

	//const
	Ball()
	{}
	Ball(double radius)
	{
		//L.I
		this.radius=radius;
	}
	//helper methods for data Hideing
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double new_radius)
	{
		this.radius=new_radius;
	}
}