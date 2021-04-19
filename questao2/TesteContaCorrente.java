package lista6.questao2;

public class TesteContaCorrente {
    public static void main(String[] args) {
        System.out.println("CONTA 1:");
        ContaCorrente conta1 = new ContaCorrente(5000);
        conta1.imprimeStatus();
        conta1.setValorLimite(1200);
        conta1.imprimeStatus();

        try{
            conta1.sacar(-20);
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"\n");

        }
        conta1.sacar(6000);
        conta1.imprimeStatus();
        conta1.sacar(200);
        conta1.imprimeStatus();

        try{
            conta1.sacar(1);
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"\n");
        }

        conta1.depositar(600);
        conta1.imprimeStatus();
        conta1.pagarFatura();
        conta1.imprimeStatus();
        conta1.sacar(500);
        conta1.imprimeStatus();
    }
}
