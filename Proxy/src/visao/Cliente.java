package visao;
import model.BancoProxy;
import model.BancoUsuarios;

public class Cliente {
	public static void main(String[] args) {
		System.out.println("Usuario teste: ");
		BancoUsuarios bu1 = new BancoUsuarios("testUser");
		BancoProxy banco = new BancoProxy(bu1, "Hacker", "1234");
		System.out.println(banco.getUsuario());
		System.out.println(banco.getSenha());

		System.out.println("\nAdministrador acessando: ");
		banco = new BancoProxy(bu1, "admin", "admin");
		System.out.println("Autenticacao realizada com sucesso!");
		
	}
}
