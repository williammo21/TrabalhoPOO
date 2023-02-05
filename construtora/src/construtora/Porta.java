package construtora;
public class Porta {
	private EspecificarPorta tipoPorta;
	private double altura;
	private double largura;
	private String pivotanteSN;
	final  double sePivotante   = 350.00;
	final  double alturaPadrao  = 1.8;
	final  double larguraPadrao = 0.7;
          String getpivo;
	public Porta() {
		tipoPorta = EspecificarPorta.valueOf(pivotanteSN);
		altura  =  alturaPadrao;
		largura = larguraPadrao;
		pivotanteSN = "N";
                
	}
	public Porta(EspecificarPorta tipoPorta, double altura, double largura, String pivotanteSN) {
		
		tipoPorta = tipoPorta;
		altura = altura;
		largura = largura;
		pivotanteSN = pivotanteSN;
	}
	public EspecificarPorta getTipoPorta() {
		return tipoPorta;
	}
	public void setTipoPorta(EspecificarPorta tipoPorta) {
		tipoPorta = tipoPorta;
	}
	public double getAltura() {
		return altura;
	}
	 public void setAltura(double altura) {
		altura = altura;
	}
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		largura = largura;
	}
	
	public String getPivotanteSN() {
		return pivotanteSN;
	}
	public void setPivotanteSN(String pivotanteSN) {
		pivotanteSN = pivotanteSN;
	}
	public double getSePivotante() {
		return sePivotante;
	}
	
	public double getAlturaPadrao() {
		return alturaPadrao;
	}

	public double getLarguraPadrao() {
		return larguraPadrao;
	}
	public double calculaPreco() {
		double valor = altura*largura * tipoPorta.getvalor();
		if(pivotanteSN == "S")
			return sePivotante + valor;
		else 
			return valor;
	}
	public void exibePorta(){
		System.out.println("|Informacoes da porta ");
		System.out.println(" Tipo de porta: "+tipoPorta);
		System.out.println(" Altura: "+altura  );
		System.out.println(" Lagura: "+largura );
		System.out.println(" Pivotante(S/N): "+pivotanteSN);
		
	}
}