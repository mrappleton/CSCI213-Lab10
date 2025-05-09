/* Car.java
	
   Author: Matthew Appleton
   Date: 5/8/25
   
   Description: This file will extend the vehicle class, instantiate variables
   				for the number of doors and passengers, and utilize a constructor
   				the receives make, model, plate, doors, and passengers. Further,
   				the two instance variables will have getter methods and be followed
   				by a toString, copy, and equals method.
   				
*/

	public class Car extends Vehicle {
		
		// Instance Variables for doors and passengers
		private int doors;
		private int passengers;
		
		public Car(String aMake, String aModel, String aPlate, int aDoors, int aPassengers){
			
			// Superclass Vehicle
			super(aMake, aModel, aPlate);
			
			this.doors = aDoors;
			this.passengers = aPassengers;
		}
		
		// Door and Passengers getter methods
		public int getDoors() {
			return this.doors;
		}
		
		public int getPassengers() {
			return this.passengers;
		}
		
		// toString method
		public String toString() {
			String result = this.doors + "-door " + this.getMake() + " " + this.getModel() + " with license " + this.getPlate() + ".";
			return result;
		}
		
		// equals method
		public boolean equals(Object other) {
        
				if (!(other instanceof Car)) {
					return false;
				}
        
				Car otherCar = (Car) other;
        
				if (this.doors == otherCar.getDoors()) {
					if (this.passengers == otherCar.getPassengers()) {
						if (super.equals(otherCar)) {
							return true;
						}
					}
				}
        
				return false;
		}
		
		// copy method
		public Car copy() {
			Car theCopy = new Car(this.getMake(), this.getModel(), this.getPlate(), this.doors, this.passengers);
			return theCopy;
        }
    	
	}	
	