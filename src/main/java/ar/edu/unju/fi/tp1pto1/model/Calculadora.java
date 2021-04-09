package ar.edu.unju.fi.tp1pto1.model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private int num1, num2;
	
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}

	public Calculadora(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}

	public int sumar() {
		return num1+num2;
	}
	
	public int restar() {
		return num1-num2;
	}
	
	public int multiplicar() {
		return num1*num2;
	}
	
	public int dividir() {
		return num1/num2;
	}
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
}