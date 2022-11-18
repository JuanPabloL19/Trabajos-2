
public class Empleado {
private String Nombre;
private String Apellido;
private String direccion;
private int DNI;
private double salario; 
private long sexo;
double SALARIO_MINIMO= 980000;
double DESCUENTO_EPS= 4;
double DESCUENTO_FP= 4;
public Empleado(String nombre, String apellido, String direccion, int dNI, double salario, long sexo) {
	super();
	Nombre = nombre;
	Apellido = apellido;
	this.direccion = direccion;
	DNI = dNI;
	this.salario = salario;
	this.sexo = sexo;
	
}
public Empleado(String nombre, String apellido, String direccion, int dNI, double salario) {
	
	Nombre = nombre;
	Apellido = apellido;
	this.direccion = direccion;
	DNI = dNI;
	this.salario = salario;
	
}
public Empleado(String direccion, int dNI, long sexo) {
	
	this.direccion = direccion;
	DNI = dNI;
	this.sexo = sexo;
	
}
public Empleado(String nombre, String apellido, int dNI, double salario, long sexo) {

	Nombre = nombre;
	Apellido = apellido;
	DNI = dNI;
	this.salario = salario;
	this.sexo = sexo;
}
public Empleado() {
	
	
}
public String getNombre() {
	return Nombre;
}
public void setNombre(String nombre) {
	Nombre = nombre;
}
public String getApellido() {
	return Apellido;
}
public void setApellido(String apellido) {
	Apellido = apellido;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public int getDNI() {
	return DNI;
}
public void setDNI(int dNI) {
	DNI = dNI;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
public long getSexo() {
	return sexo;
}
public void setSexo(long sexo) {
	this.sexo = sexo;
} 


}
