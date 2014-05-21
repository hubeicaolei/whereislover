package com.cao.whereislover.domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Lover")
public class Lover {

	private String coordinateX = null;
	private String coordinateY = null;

	private String direction = null;

	private String distance = null;
	
	private String name = null;
	
	private String email = null;
	
	private String mobile = null;

	public String getCoordinateX() {
		return coordinateX;
	}

	public Lover()
	{
		this.name = "unknown";
	}
	public Lover(String name)
	{
		this.name = name;
	}
	
	public void setCoordinateX(String coordinateX) {
		this.coordinateX = coordinateX;
	}

	public String getCoordinateY() {
		return coordinateY;
	}

	public void setCoordinateY(String coordinateY) {
		this.coordinateY = coordinateY;
	}

	@XmlElement
	public String getDirection() {
		return direction;
	}

	public void setDirection(String d) {
		direction = d;
	}

	@XmlElement
	public String getDistance() {
		return distance;
	}

	public void setDistance(String d) {
		distance = d;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
}
