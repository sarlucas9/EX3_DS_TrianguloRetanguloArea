package exercicio3;

import exercicio3.CalculoTrianguloRetangulo;

public class calculos {

	public static void main(String[] args) {
		
		//crio o objeto Triangulo
				CalculoTrianguloRetangulo Triangulo = new CalculoTrianguloRetangulo();
				
				//dou valor ao atributo base
				Triangulo.base=32;
				
				
				//dou valor ao atributo altura
				Triangulo.altura=400;
				
				//eu printo o valor de altura e base
				System.out.println("Valor da base do Triangulo: "+Triangulo.base);
				System.out.println("Valor da base do Triangulo: "+Triangulo.altura);
				
				System.out.println("Resultado Triangulo: "+Triangulo.calcularAreaTriangulo());
				
				
				//crio o objeto Retangulo
				CalculoTrianguloRetangulo Retangulo = new CalculoTrianguloRetangulo();
				
				//dou valor ao atributo base
				Retangulo.base=62;
				
				
				//dou valor ao atributo altura
				Retangulo.altura=205;
				
				//eu printo o valor de altura e base
				System.out.println("Valor da base do Retangulo: "+Retangulo.base);
				System.out.println("Valor da base do Retangulo: "+Retangulo.altura);
				
				System.out.println("Resultado Retangulo: "+Retangulo.calcularAreaRetangulo());
				
				
				
		

	}

}
