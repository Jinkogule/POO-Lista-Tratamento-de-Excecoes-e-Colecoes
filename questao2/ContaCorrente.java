package lista6.questao2;

public class ContaCorrente {
    private float limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float saldo){
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (valor<0){
            throw new IllegalArgumentException("Não se pode sacar um valor negativo!");
        }
        else{
            if (valor>=this.getSaldo() && !(valor>this.getSaldo() && (valor - this.getSaldo()>this.limite))){
                this.limite -= (valor - this.getSaldo());
                this.saldo = 0;
            }
            else if (valor>=this.getSaldo() && (valor - this.getSaldo()>this.limite)){
                throw new IllegalArgumentException("Sacar este valor estourará o limite máximo disponível!");
            }
            else{
                this.saldo -= valor;
            }
        }
    }

    public void depositar(float valor) {
        if (valor<0){
            throw new IllegalArgumentException("Não se pode depositar um valor negativo!");
        }
        this.saldo += valor;
    }

    public void setValorLimite(float valorLimite) {
        this.valorLimite = valorLimite;
        this.limite = valorLimite;
    }

    public void pagarFatura(){ //método extra que decidi adicionar
        if (this.saldo >= this.valorLimite){
            this.limite+=this.valorLimite;
            this.saldo-= this.valorLimite;
        }
        else{
            this.limite = this.saldo;
            this.saldo = 0;
        }
    }

    public void imprimeStatus(){ //método extra que decidi adicionar
        System.out.println("Valor atual do saldo: "+this.getSaldo());
        System.out.println("Valor atual do limite: "+this.getLimite());
        System.out.println("Limite máximo: "+this.getValorLimite());
        System.out.println();
    }

    public float getSaldo() {
        return saldo;
    }

    public float getLimite() {
        return limite;
    }

    public float getValorLimite() {
        return valorLimite;
    }
}

