package ar.edu.unju.fi.tp1pto1.model;

import org.springframework.stereotype.Component;

@Component
public class Provincia {
	private int codigo;
	private String nombre;
	
	public Provincia() {
		// TODO Auto-generated constructor stub
	}

	public Provincia(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
