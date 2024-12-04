//Katelyn Refugia
public class Truck extends Vehicle{
	
	private double load;
	private double tow;
	
	//default constructor
	public Truck()
	{
		super();
		this.load = 0.0;
		this.tow = 0.0;
	}
	
	//parameterized constructor
	public Truck(String xManufacturer, int xCylinders, String xOwner, double xLoad, double xTow)
	{
		super(xManufacturer, xCylinders, xOwner);
		this.setLoad(xLoad);
		this.setTow(xTow);
	}
	
	//accessors
	public double getLoad()
	{
		return this.load;
	}
	
	public double getTow()
	{
		return this.tow;
	}
	
	//mutators
	public void setLoad(Double xLoad)
	{
		if(xLoad >= 0)
		{
			this.load = xLoad;
		}
		else
		{
			System.out.println("Invalid value entered for Load Capacity!");
		}
	}
	
	//other methods
	public void setTow(double xTow)
	{
		if(xTow >= 0)
		{
			this.tow = xTow;
		}
		else
		{
			System.out.println("Invlaid value entered for Tow Capacity");
		}
	}
	
	public boolean equals(Truck t)
	{
		if(this.getManufac().equalsIgnoreCase(t.getManufac())
				&& this.getCylinders() == t.getCylinders()
				&& this.getOwner().equalsIgnoreCase(getOwner())
				&& this.load == t.load
				&& this.tow == t.tow)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String toString()
	{
		return super.toString()+"\nLoad Capacity: "+this.load+" tons"
				+"\nTowing Capacity: "+this.tow+" tons";
	}

}
