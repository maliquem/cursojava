package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double valuePerHaour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuePerHaour, Integer hours) {
		this.date = date;
		this.valuePerHaour = valuePerHaour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHaour() {
		return valuePerHaour;
	}

	public void setValuePerHaour(Double valuePerHaour) {
		this.valuePerHaour = valuePerHaour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		return valuePerHaour * hours;
	}
	
	

}
