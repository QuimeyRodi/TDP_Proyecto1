package TDP_Proyecto1;

public class Persona {

	protected String nombre;
	protected int dni;

	public Persona(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}