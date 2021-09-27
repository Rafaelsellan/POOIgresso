public class Vip extends Ingresso{

  private String localizacaoCadeira;
  private double valorAdicional;

  //Getters
  public String getLocalizacaoCadeira(){
      return localizacaoCadeira;
  }
  public double getValorAdicional(){
      return valorAdicional;
  }

  //Setters
  public void setLocalizacaoCadeira(String local){
	  localizacaoCadeira = local;
  }
  public void setValorAdicional(){
    valorAdicional = this.reaisIngresso*1.30;
  }

  //Metodos
  public void imprimeValor(){
    System.out.println("Valor do ingresso com adicional: " + this.valorAdicional);
  }
  public void imprimeLocalizacao(){
    System.out.println("Localizacao da cadeira: " +getLocalizacaoCadeira());
  }
}


