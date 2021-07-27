package com.lti.model;

public class DegreeCourse extends Course {

	DegreeLevel degreeLevel;
	boolean isPlacementAvailable;

	public DegreeCourse() {
		super();
	}

	public DegreeCourse(int id, String name, int duration, int fees,
			DegreeLevel degreeLevel, boolean isaplacementAvailable) {
		super(id, name, duration, fees);
		this.degreeLevel = degreeLevel;
		this.isPlacementAvailable = isPlacementAvailable;
	}

	public DegreeLevel getDegreeLevel() {
		return degreeLevel;
	}

	public void setDegreeLevel(DegreeLevel degreeLevel) {
		this.degreeLevel = degreeLevel;
	}

	public boolean isPlacementAvailable() {
		return isPlacementAvailable;
	}

	public void setPlacementAvailable(boolean isPlacementAvailable) {
		this.isPlacementAvailable = isPlacementAvailable;
	}
	public void MonthlyFees(){
		System.out.println(super.getId() + " "+ super.getName()+" "+ super.getFees());
		super.MonthlyFees();//reuse base class method
		//if placement is available, charge 10% of the total fees as placement service
		System.out.println("total Fees: " +(super.getFees()*1.1));
	}
}
