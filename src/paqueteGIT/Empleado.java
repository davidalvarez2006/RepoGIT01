package paqueteGIT;

public class Empleado {
	private String dni;
	private String nombre;
	private String apellidos;
	private byte edad;
	private float sueldo;
	private boolean hijos;
	private double ayuda;

/////////CONSTRUCTOR COMPLETO/////////
	public Empleado(String dni, String nombre, String apellidos, byte edad, float sueldo, boolean hijos) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.sueldo = sueldo;
		this.hijos = hijos;
		this.ayuda = hijos ? sueldo * 0.10 : 20;
	}

/////////CONSTRUCTOR VACÍO/////////
	public Empleado() {
		super();
		this.dni = "";
		this.nombre = "********";
		this.apellidos = "******";
		this.edad = 0;
		this.sueldo = (float) 0.0;
		this.hijos = false;
		this.ayuda = hijos ? sueldo * 0.10 : 20;

	}

/////////CONSTRUCTOR PARCIAL (SOLO DNI Y NOMBRE)/////////
	public Empleado(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = "********";
		this.edad = 0;
		this.sueldo = (float) 0.0;
		this.hijos = false;
		this.ayuda = hijos ? sueldo * 0.10 : 20;

	}

/////////GETTERS SETTERS/////////
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public byte getEdad() {
		return edad;
	}

	public void setEdad(byte edad) {
		this.edad = edad;
	}

	public float getSueldo() {
		return sueldo;
	}

	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public boolean isHijos() {
		return hijos;
	}

	public void setHijos(boolean hijos) {
		this.hijos = hijos;
	}

	public double getAyuda() {
		return ayuda;
	}

	public void setAyuda() {
		this.ayuda = hijos ? sueldo * 0.10 : 20;
		;
	}
}
