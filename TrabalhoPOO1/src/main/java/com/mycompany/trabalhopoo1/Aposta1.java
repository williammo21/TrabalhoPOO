package com.mycompany.trabalhopoo1;

public class Aposta1 {
   private double CalcularLucro; 
    public Evento2 confronto ;
    private double valoraposta1;
  	private  Resultado resultado;
    private final Evento2 Etapa;
    public Aposta1(Evento2 Etapa, Resultado resultado, double valoraposta1) {
        this.Etapa = confronto;
        this.resultado = resultado;
        this.valoraposta1 = valoraposta1;
    }
    public Evento2 getconfronto() {
        return confronto;
    }
    public Resultado getResultado() {
        return resultado;
    }
    public double getvaloraposta1() {
        return valoraposta1;
    }
    
    public double CalcularLucro(Evento2 confronto){
        double ganho = 0;
        
        if (Etapa.getResultado() == Resultado.TIME1){
            if(this.getResultado() == Resultado.TIME1){
                
            
           ganho = (valoraposta1*(double)Etapa.getTime1()) - valoraposta1;
            return ganho;
            }
        if(Etapa.getResultado() == Resultado.EMPATE){
            ganho = (valoraposta1*(double)Etapa.getEmpate()) - valoraposta1;
            return ganho;
                }
        
        }         
       return 0;
    }
}