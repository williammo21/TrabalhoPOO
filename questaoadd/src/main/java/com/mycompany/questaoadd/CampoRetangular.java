package com.mycompany.questaoadd;

public class CampoRetangular {
	private ParOrdenado posSuperiorEsquerdo;
	private double comprimento,altura;
	private Bola bola;
	
	public CampoRetangular(ParOrdenado posSuperiorEsquerdo, double comprimento, double altura, Bola bola) {
		super();
		this.posSuperiorEsquerdo = posSuperiorEsquerdo;
		this.comprimento 		 = comprimento;
		this.altura  	 		 = altura;
		this.bola 		 		 = bola;
	}

	public ParOrdenado getPosSuperiorEsquerdo() {
		return posSuperiorEsquerdo;
	}

	public double getComprimento() {
		return comprimento;
	}

	public double getAltura() {
		return altura;
	}
	
	public Bola getBola() {
		return bola;
	}

	public boolean tocouSuperior() {
		//	     21                  19 + 3  
		if(altura/2 <= bola.getposition().getY()+ bola.getraio())
			return true;
		return false;
	}
	public boolean tocouInferior() {
		if(-altura/2 >= bola.getposition().getY()- bola.getraio())
			return true;
		return false;
	}
	public boolean tocouEsquerda() {
		
		if(-comprimento/2 >= bola.getposition().getX()- bola.getraio())
			return true;
		return false;
	}
	public boolean tocouDireita() {
		if(comprimento/2 <= bola.getposition().getX()+ bola.getraio())
			return true;
		return false;
	}
	public void movimentaBola() {
		if(tocouSuperior()){
			bola.setVelVert(-1 * bola.getVelVert());
		}
		else if(tocouInferior()){
			bola.setVelVert(-1 * bola.getVelVert());
		}
		else if(tocouEsquerda()){
			bola.setVelHori(-1 * bola.getVelHori());
		}
		else if(tocouDireita()){
			bola.setVelHori(-1 * bola.getVelHori());
		}
		bola.movimenta();
	}

    void bolamovi() {
           
    }
}