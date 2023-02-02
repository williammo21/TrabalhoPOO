package com.mycompany.questaoadd;

import java.util.Scanner;

public class TesteCampo{
    public static void main(String[]args){
        
        Scanner read = new Scanner(System.in);
        System.out.print("informe a posicao do eixo x ");
        
        float PosicaoX = read.nextFloat(); 
        System.out.print("Posicao do eixo y"); 
       
        float PosicaoY = read.nextFloat(); 
        System.out.print("Altura");
        String Altura = read.next();
        System.out.print("Largura"); 
        String Largura = read.next(); 
        
        
        System.out.print("posicao da bola, dados da bola: ");
        System.out.print("Posicao eixo x: ");
        float PosX = read.nextFloat(); 
        System.out.print("Posicao eixo y: ");
        float PosY = read.nextFloat(); 
        
        System.out.print("raio");
        float raio = read.nextFloat();
        
        System.out.print("velocidade horizontal da bola ");
        float velHori = read.nextFloat(); 
        System.out.print("velocidade vertical da bola ");
        float velVert = read.nextFloat(); 
        
        ParOrdenado ParOrdenado = new ParOrdenado(PosX, PosY); 
    ParOrdenado posCenter = new ParOrdenado((velHori),(velVert));
		ParOrdenado Esquerda = new ParOrdenado(PosicaoX, PosicaoY);
    Bola bola  = new Bola(posCenter, (velHori), (velVert), raio);
		CampoRetangular campo = new CampoRetangular(Esquerda, Double.parseDouble(Largura), Double.parseDouble(Altura), bola);
                for (int i = 0; i < 30; i++) {
			campo.movimentaBola();
			System.out.println(i + ": " + campo.getBola().toString());
		}
        
    }
}