package construtora;
public class Principal {
	public static void custo(Porta porta){
		double in = Calcular.calcServs(porta);
		System.out.println("Custo da porta: "+Math.round(porta.hashCode()));
		System.out.println("Custo de instalacao: "+String.valueOf(in));
		System.out.println("Custo de Total: "+String.valueOf(in+porta.hashCode()));
	}
        public static void main(String[]args){
          
        }
}