public class Ingresso {

    protected String dataIngresso;
    protected String horaIngresso;
    protected double reaisIngresso;

    //Getters
    public String getDataIngresso(){
        return dataIngresso;
    }
    public String getHoraIngresso(){
        return horaIngresso;
    }
    public double getReaisIngresso(){
        return reaisIngresso;
    }

    //Setters
    public void setDataIngresso (String data){
        dataIngresso = data;
    }
    public void setHoraIngresso (String hora){
        horaIngresso = hora;
    }
    public void setReaisIngresso (Double reais){
        reaisIngresso = reais;
    }

    //Construtores
    public Ingresso(){ 
        dataIngresso = "0";
        horaIngresso = "0";
        reaisIngresso = 0.0;
    }
    public Ingresso(String data, String hora, double preco){
        dataIngresso = data;
        horaIngresso = hora;
        reaisIngresso = preco;
    }

    public Ingresso(Ingresso in) {
        dataIngresso = in.dataIngresso;
        horaIngresso = in.horaIngresso;
        reaisIngresso = in.reaisIngresso;
    }
 
    //Metodos
    public void imprimeDados(){
        System.out.println("");
        System.out.println("Data " +this.dataIngresso);
        System.out.println("Horario " +this.horaIngresso);
        System.out.println("");
    }

    public void imprimeValor(){
        System.out.println("Valor do ingresso: " +this.reaisIngresso);
    }

    @Override
    public String toString() {
        return "Data: " + this.dataIngresso + ", Hora: " + this.horaIngresso + ", Valor: " + this.reaisIngresso;
    }

}  
