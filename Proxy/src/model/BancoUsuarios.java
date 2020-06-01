package model;



//abstract ou interface
public class BancoUsuarios implements Banco{
	private String usuario;
	private String senha;

	public BancoUsuarios() {
		
	}
	
	

	public BancoUsuarios(String usuario, String senha) {
		super();
		this.usuario = usuario;
		this.senha = senha;
	}
	
	public BancoUsuarios(String usuario) {
		super();
		this.usuario = usuario;
	}



	public String getUsuario() {
		return new String("Usuario: " + usuario);
	}

	public String getSenha() {
		return new String("Senha: " + senha);
	}
}