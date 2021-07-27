package com.lti.model;

public class DiplomaCourse extends Course {

	private DiplomaLevel diplomaLevel;
	private boolean type;
	public DiplomaCourse(){
		super();
	}
	
	public DiplomaCourse (int id, String name,int duration, int fees,DiplomaLevel diplomaLevel, boolean type){
		super(id, name, duration,fees);
		this.diplomaLevel=diplomaLevel;
		this.type=type;
	}

	public DiplomaLevel getDiplomaLevel() {
		return diplomaLevel;
	}

	public void setDiplomaLevel(DiplomaLevel diplomaLevel) {
		this.diplomaLevel = diplomaLevel;
	}

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public void MonthlyFees(){
		System.out.println(super.getId() + " "+ super.getName()+" "+ super.getFees());
		super.MonthlyFees();
		if(diplomaLevel.name().equals("Professional")){
			System.out.println("total fees" + (super.getFees()*1.4));
		}
		else{
			System.out.println("total fees" + (super.getFees()*1.5));
		}
	}
	
}
