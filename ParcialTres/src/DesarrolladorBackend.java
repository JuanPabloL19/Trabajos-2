
public class DesarrolladorBackend extends Empleado implements OperacionEmpleado {
	private String skill;
	private String listaLenguajes;
	double AUMENTOVARIABLE= 5;
	
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getListaLenguajes() {
		return listaLenguajes;
	}
	public void setListaLenguajes(String listaLenguajes) {
		this.listaLenguajes = listaLenguajes;
	}
	public DesarrolladorBackend() {
		
	}
	public DesarrolladorBackend(String skill, String listaLenguajes) {
		this.skill = skill;
		this.listaLenguajes = listaLenguajes;
		
	}
	@Override
	public double devolverSalario() {
		// TODO Auto-generated method stub
		return 0;
	}

}
