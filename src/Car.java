//Katelyn Refugia
public class Car extends Vehicle{
	
	private double mileage;
	private int passengers;
	
	//default constructor
	public Car()
	{
		super();
		this.mileage = 0.00;
		this.passengers = 0;
	}
	
	//parameterized constructor
	public Car(String xManufac, int xCylinders, String xOwner, double xMileage, int xPassengers)
	{
		super(xManufac, xCylinders, xOwner);
		this.setMileage(xMileage);
		this.setPassengers(xPassengers);
	}
	
	//accessors
	public double getMileage()
	{
		return this.mileage;
	}
	
	public int getPassengers()
	{
		return this.passengers;
	}
	
	//mutators
	public void setMileage(double xMileage)
	{
		if(xMileage >= 0)
		{
			this.mileage = xMileage;
		}
		else
		{
			System.out.println("Invalid value entered for Gas Mileage!");
		}
	}
	
	public void setPassengers(int xPassengers)
	{
		if(xPassengers >= 0)
		{
			this.passengers = xPassengers;
		}
		else
		{
			System.out.println("Invalid value entered for Number of Passengers!");
		}
	}
	
	//other methods
	public boolean equals(Car c)
	{
		if(this.getManufac().equalsIgnoreCase(c.getManufac())
				&& this.getCylinders() == c.getCylinders()
				&& this.getOwner().equalsIgnoreCase(c.getOwner())
				&& this.mileage == c.mileage
				&& this.passengers == c.passengers)
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
		return super.toString()+"\nGas Mileage: "+this.mileage+" gallons"
				+"\nPassengers: "+this.passengers;
	}

}
