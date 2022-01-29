package com.spring.spEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	//GETTING ANY VALUE	
	@Value("#{ 55+55 }")
	private int x;

	//GETTING OBJECT
	@Value("#{ new String('SHubham Taware') }")
	private String y;

	//GETTING STATIC METHOD
	@Value("#{ T(java.lang.Math).sqrt(25) }")
	private Double d;

	//GETTING STATIC VARIABLE
	@Value("#{ T(java.lang.Math).PI }")
	private Double e;

	//GETTING BOOLEAN VALUE
	@Value("#{ 6>4 }")
	private boolean b;
		
	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public int getX() {
		return x;
	}

	public Double getD() {
		return d;
	}

	public void setD(Double d) {
		this.d = d;
	}

	public Double getE() {
		return e;
	}

	public void setE(Double e) {
		this.e = e;
	}

	public void setX(int x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Student [x=" + x + ", y=" + y + ", d=" + d + ", e=" + e + ", b=" + b + "]";
	}

}
