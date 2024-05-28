package proyecto2;

public class Empleado extends Persona {
	private double remuneracion;
	private int empleadoId;
	
	
	public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion,
			int empleadoId) {
		super(nombre, apellido, numeroFiscal, direccion);
		this.remuneracion = remuneracion;
		this.empleadoId = empleadoId;
	}
	
	

	public double getRemuneracion() {
		return remuneracion;
	}
	public void setRemuneracion(double remuneracion) {
		this.remuneracion = remuneracion;
	}
	public int getEmpleadoId() {
		return empleadoId;
	}
	public void setEmpleadoId(int empleadoId) {
		this.empleadoId = empleadoId;
	}



	@Override
	public String toString() {
		return super.toString() + "Como empleado tiene la remuneracion de: " + remuneracion + " y su id es: " + empleadoId + "";
		
	}
	
		public void aumentarRemuneracion(int porcentaje) {
			double aumento=(this.getRemuneracion()*((double)porcentaje/100));
			this.setRemuneracion(this.getRemuneracion()+aumento);
		}

}
