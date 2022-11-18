
public class DesarrolladorFrontend extends Empleado implements OperacionEmpleado {
	private int aniosExperenciaBootstrap;
	private boolean experenciaCloud;
	double AUMENTOVARIABLE= 3;
	
	
	public int getAniosExperenciaBootstrap() {
		return aniosExperenciaBootstrap;
	}
	public void setAniosExperenciaBootstrap(int aniosExperenciaBootstrap) {
		this.aniosExperenciaBootstrap = aniosExperenciaBootstrap;
	}
	public boolean isExperenciaCloud() {
		return experenciaCloud;
	}
	public void setExperenciaCloud(boolean experenciaCloud) {
		this.experenciaCloud = experenciaCloud;
	}
	public DesarrolladorFrontend() {
		
	}
	public DesarrolladorFrontend(int aniosExperenciaBootstrap, boolean experenciaCloud) {
		super();
		this.aniosExperenciaBootstrap = aniosExperenciaBootstrap;
		this.experenciaCloud = experenciaCloud;
	}
	@Override
	public double devolverSalario() {
		// TODO Auto-generated method stub
		return 0;
	}
	private double Aumento=5;
	

}
