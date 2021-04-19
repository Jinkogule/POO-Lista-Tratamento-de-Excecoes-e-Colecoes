package lista6.questao3;

public class Q3_Main {
    public static void main(String[] args) throws ClienteInexistenteException, RepositorioException, ClienteJaExistenteException, DadoInvalidoException {
        Cliente c1 = new Cliente();
        c1.setNome("Lucas");
        c1.setCPF("123.345.434-54");
        c1.setIdade(22);
        c1.setSexo('M');

        Cliente c2 = new Cliente();
        c2.setNome("Sophia");
        try{ //inserção de valor inválido no nome
            c2.setNome("S0ph1a");
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"\n");
        }
        c2.setCPF("564.786.543-89");

        c2.setIdade(24);
        c2.setSexo('F');

        Cliente c3 = new Cliente();
        c3.setNome("Matheus");
        c3.setCPF("242.243.565-33");
        c3.setIdade(21);
        c3.setSexo('M');

        Cliente c4 = new Cliente();
        c4.setNome("Ruan");
        c4.setCPF("112.221.112-55");
        c4.setIdade(25);
        c4.setSexo('M');

        Cliente c5 = new Cliente();
        c5.setNome("Pedro");
        c5.setCPF("111.222.333-11");
        c5.setIdade(21);
        c5.setSexo('M');

        Cliente c6 = new Cliente();
        c6.setNome("Catarina");
        c6.setCPF("667.567.544-99");
        c6.setIdade(28);
        c6.setSexo('F');

        Cliente c7 = new Cliente();
        c7.setNome("Davi");
        c7.setCPF("999.888.999-67");
        c7.setIdade(21);
        c7.setSexo('M');

        Cliente c8 = new Cliente();
        c8.setNome("Rodrigo");
        c8.setCPF("171.171.454-90");
        c8.setIdade(21);
        c8.setSexo('M');

        Cliente c9 = new Cliente();
        c9.setNome("Anna");
        c9.setCPF("777.543.543-01");
        c9.setIdade(24);
        c9.setSexo('F');

        Cliente c10 = new Cliente();
        c10.setNome("Maradonna");
        c10.setCPF("010.929.838-56");
        c10.setIdade(70);
        c10.setSexo('M');

        Cliente c11 = new Cliente();
        c11.setNome("Gustavo");
        c11.setCPF("112.223.334-45");
        c11.setIdade(16);
        c11.setSexo('M');

        CadastroCliente.inserir(c1);
        CadastroCliente.inserir(c2);
        CadastroCliente.inserir(c3);
        CadastroCliente.inserir(c4);
        CadastroCliente.inserir(c5);
        CadastroCliente.inserir(c6);
        try{ //inserção de cliente já existente
            CadastroCliente.inserir(c6);
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"\n");
        }
        CadastroCliente.inserir(c7);
        CadastroCliente.inserir(c8);
        CadastroCliente.inserir(c9);
        CadastroCliente.inserir(c10);

        CadastroCliente.buscar(c4);
        CadastroCliente.buscar(c7);

        try{//inserção com o array cheio
            CadastroCliente.inserir(c11);
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"\n");
        }

        try{//buscando cliente que não está no array
            CadastroCliente.buscar(c11);
        }
        catch(Exception e){
            System.out.println(e.getMessage()+"\n");
        }
    }
}
