package lista6.questao3;

public class Cliente {
    private String CPF;
    private int idade;
    private String nome;
    private char sexo;

    public void setIdade(int idade) throws DadoInvalidoException {
        if (idade<0){
            throw new DadoInvalidoException("Dado inválido!");
        }
        this.idade = idade;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        if (!(nome.matches("[A-Za-z - ]+"))){
            throw new DadoInvalidoException("Dado inválido!");
        }
        this.nome = nome;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNome() {
        return nome;
    }

    public String getCPF() {
        return CPF;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }
}

