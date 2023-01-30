package com.mycompany.trabalhopoo1;

public class UernBets {
    public static void main(String args[]){
   	 Evento2 quartasFinal1 = new Evento2 ("Quartas de final da copa do mundo",
   		 "Brasil", "Croácia", 1.18, 1.8, 2.5);
   	 Evento2 quartasFinal2 = new Evento2 ("Quartas de final da copa do mundo",
   		 "Argentina", "Holanda", 1.4, 1.5, 1.9);
   	 
   	 Aposta1 aposta1 = new Aposta1(quartasFinal1, Resultado.TIME1, 1000);
   	 Aposta1 aposta2 = new Aposta1(quartasFinal1, Resultado.EMPATE, 400);
   	 Aposta1 aposta3 = new Aposta1(quartasFinal2, Resultado.TIME2, 2000);
   	 
   	 quartasFinal1.setResultado(Resultado.TIME1);
   	 quartasFinal2.setResultado(Resultado.TIME2);
   	 if(aposta1.getResultado() == quartasFinal1.getResultado())
   		 System.out.print("O apostador ganhou R$ " +
   			 aposta1.CalcularLucro(quartasFinal1));
   	 else
   		 System.out.print("O apostador perdeu R$ " + 
                     aposta1.getvaloraposta1());
   	 
   	 
    }

}