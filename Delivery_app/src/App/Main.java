package App;
import App.pagamentos.Credito;


public class Main {
    public static void main(String[] args) {
    	Usuario usuario = new Usuario("João Silva", "Rua A, 123", "(11) 91234-5678", "123.456.789-00", "joao.silva@email.com", "senha123");
        Credito pagamentoCredito = new Credito("1234-5678-9876-5432", "João Silva", "12/28", "123");
       
        usuario.setEndereco("Rua A, 123");
        pagamentoCredito.realizarPagamento(100.0);
      
        
        System.out.println("Login bem-sucedido?" + usuario.autenticar("joao.silva@email.com", "senha123")); 
        System.out.println("Login bem-sucedido? " + usuario.autenticar("joao.silva@email.com", "senhaErrada"));
        if (usuario.alterarSenha("senha123", "novaSenha")) {
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Senha atual incorreta!");
        }
        System.out.println("Login com nova senha? " + usuario.autenticar("joao.silva@email.com", "novaSenha")); // true
       }
   }
