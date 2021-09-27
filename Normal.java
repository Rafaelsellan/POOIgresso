public class Normal extends Ingresso{
    private double valorNormal;

    public double getValorNormal(){
         return valorNormal;
    }
    public void setValorNormal(){
        valorNormal = this.reaisIngresso + (this.reaisIngresso*0.15);
    }
    public void imprimeValorNormal(){
        System.out.println("Valor do Ingresso normal: " + this.valorNormal);
    }
     
}
