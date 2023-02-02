package com.mycompany.questaoadd;
import java.util.Random;
import java.util.Scanner;


public class TesteCampo2{
  public static void main(String []args){
   
      Scanner read = new Scanner(System.in);
      System.out.print("informe os dados da bola, altura e largura ");
      
      System.out.print("Largura");  
      String altura = read.next();
        
        System.out.print("Altura");
        String largura = read.next();
        
        
        System.out.print("Informe o raio da bola "); 
        System.out.print("Raio: "); 
        float raio = read.nextFloat(); 
        read.close();
        ParOrdenado pos_ini = new ParOrdenado (0,0); 
        
        float total = Float.parseFloat(largura+ Float.parseFloat(altura));
        float max   = (10*total)/100;
	float min   = (5*total)/100; 
        float velocidade = ((max - min)+1) +min ; 
              Bola bola = new Bola(pos_ini, velocidade, velocidade, raio );
            CampoRetangular campo = new CampoRetangular( pos_ini, largura, altura, Bola); {
              for (int i = 0; i < 30; i++) {
			campo.bolamovi();
			System.out.print(i + ": " + campo.getBola().toString());
		}
  }
    
  }