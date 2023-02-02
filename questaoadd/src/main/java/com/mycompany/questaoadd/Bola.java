package com.mycompany.questaoadd; 

public class Bola{
    private ParOrdenado position; 
    private double VelHori, VelVert; 
    private double raio; 
    String centro; 
    
    
    public  Bola(ParOrdenado centro,  double VelHoru, double VelVert, double raio){
        position = centro;
        VelHori =  VelHori; 
         VelVert =  VelVert; 
         raio = raio; 
}
        public String toString() {
		return "A bola está na posição " + this.position.toString()+ " se movendo a uma velocidade ("+(VelHori)+","+(VelVert)+") pixels por movimento";
	}
        public ParOrdenado getposition() {
		return position;
	}

	public double getraio() {
		return raio;
	}

	public double getVelHori() {
		return VelHori;
	}

	public void setVelHori(double VelHori) {
		VelHori = VelHori;
	}

	public double getVelVert() {
		return VelVert;
	}

	public void setVelVert(double VelVert) {
		VelVert = VelVert;
	}
		public void movimenta(){
		position.setX(position.getX()
                        +VelHori);
                position.setX(position.getX()
                        +VelHori);
                
             
	}
}


