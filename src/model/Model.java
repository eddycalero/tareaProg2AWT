package model;

public class Model {

	private double a;
	private double b;
	private double resp;
	
	public Model() {
		
	}
	
	public double getA() {
		return b;
	}
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return a;
	}
	public void setB(double b) {
		this.b = b;
	}
	
	public double getResp() {
		return b;
	}
	public void setResp(double resp) {
		this.resp = resp;
	}
	
	public double suma(double a, double b, double resp) {
	 resp = a + b ;
		return resp;
	}
	
	public double resta(double a, double b, double resp) {
		 resp = a - b ;
			return resp;
		}
	
	public double divicion(double a, double b, double resp) {
		 resp = a  / b ;
			return resp;
		}
	
	public double multiplicacion(double a, double b) {
		 resp = a * b ;
			return resp;
		}
	
}
