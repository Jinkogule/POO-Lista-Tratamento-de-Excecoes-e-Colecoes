package lista6.questao3;

public class CadastroCliente {
    public static Cliente[] clientes = new Cliente[10];

    public static void inserir(Cliente cliente) throws RepositorioException, ClienteJaExistenteException {
        if (clientes[9] != null){
            throw new RepositorioException("Array já está cheio, não é possível adicionar novos cadastros.");
        }
        for (int i=0; i<clientes.length; i++){
            if (clientes[i] != null){
                if (clientes[i].getCPF() == cliente.getCPF()){
                    throw new ClienteJaExistenteException("Valor inválido, este cliente já está cadastrado.");
                }
            }
            if (clientes[i] == null){
                clientes[i] = cliente;
                break;
            }
        }
    }

    public static void buscar(Cliente cliente) throws ClienteInexistenteException {
        boolean verif_existencia = false;
        for (int i=0; i<clientes.length; i++){
            if (clientes[i] != null) {
                if (cliente.getCPF() == clientes[i].getCPF()) {
                    System.out.println("CLIENTE:\nNome: " + cliente.getNome() + "\nCPF: " + cliente.getCPF() + "\nIdade: " + cliente.getIdade() + "\nSexo: " + cliente.getSexo() + "\n");
                    verif_existencia = true;
                    break;
                }
            }
        }
        if (verif_existencia == false){
            throw new ClienteInexistenteException("Cadastro não encontrado.");
        }
    }
}
