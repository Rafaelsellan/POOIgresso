import java.util.Scanner;

public class TesteIngresso {
    
    public static void main(String[] args) {
        int opc;
        Scanner scanf = new Scanner(System.in);
        int i, z = 0, x = 0;
        int opcao = 0;
        Normal [] normal2 = new Normal[2];
        Vip [] vips2 = new Vip [2];
        
        while (opcao == 0) {
            System.out.println(" 1 - Consulta de Ingresso \n 2 - Comprar Ingresso ");
            opcao = scanf.nextInt();
            switch (opcao) {
                case 1:
                System.out.println("Normal");
                for (Normal ingressonNormal: normal2) {
                    if (ingressonNormal != null) {
                        System.out.println(ingressonNormal);
                    }
                }

                System.out.println("V.I.P");
                for (Vip ingressoVIP: vips2) {
                    if (ingressoVIP != null) {
                        System.out.println(ingressoVIP);
                }
                    }
                    break;

                case 2:
                for (i = 0; i < 2; i++) {
                    System.out.println("\nQual opcao voce deseja (1 para normal, 2 para vip): ");
                    opc = scanf.nextInt();
                    Normal ing = new Normal();
                    Vip inv = new Vip();
                    
                    switch (opc) {
                        case 1:
                            System.out.println("Compra de Ingresso do tipo: Normal (SELECIONADA)");
                            System.out.print("Digite a data: ");
                            ing.setDataIngresso(scanf.next());
                            System.out.print("Digite a hora: ");
                            ing.setHoraIngresso(scanf.next());
                            System.out.print("Digite o valor do ingresso: ");
                            ing.setReaisIngresso(scanf.nextDouble());
                            ing.imprimeDados();
                            ing.setValorNormal();
                            normal2[z]= ing;
                            z ++;
                            break;

                        case 2:
                            System.out.println("Compra de Ingresso do tipo: VIP (SELECIONADA)");
                            System.out.print("Digite a data: ");
                            inv.setDataIngresso(scanf.next());
                            System.out.print("Digite a hora: ");
                            inv.setHoraIngresso(scanf.next());
                            System.out.print("Qual a localizacao da cadeira (C1, C2 ... C20): ");
                            inv.setLocalizacaoCadeira(scanf.next());
                            System.out.print("Digite o valor do ingresso: ");
                            inv.setReaisIngresso(scanf.nextDouble());
                            inv.imprimeDados();
                            inv.imprimeLocalizacao();
                            inv.setValorAdicional();
                            inv.imprimeValor();
                            System.out.print("\n");
                            vips2[x] = inv;
                            x ++;
                            break;            
                    }
                    opcao = 0; 
                }               
            }
        }
    scanf.close();        
    }
}
       



