
package construtora;



public enum EspecificarPorta {
      
       
        private final String madeira , fechadura; 
        final private int PIVOTANTE = 350;
	 double LARGURA = 0.70;
	double ALTURA = 1.8;
   
        private EspecificarPorta(double valor, double madeira, double fechadura){
            madeira = madeira; 
            fechadura = fechadura; 
            valor = valor; 
         
          
}

    public String getmadeira() {
		return madeira;
	}
	public String getfechadura() {
		return fechadura;
	}
	public double getvalor() {
		return 0; 
	}

   

    

}