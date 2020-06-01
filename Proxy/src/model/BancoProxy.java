package model;

import model.BancoUsuarios;


public class BancoProxy implements Banco{

	protected BancoUsuarios bancousuario;
	protected String usuario, senha;
	
	

	public BancoProxy(BancoUsuarios bancousuario, String usuario, String senha) {
		
		this.bancousuario = bancousuario;
		this.usuario = usuario;
		this.senha = senha;
	}

	@Override
	public String getUsuario() {
		if (temPermissaoDeAcesso()) {
			return bancousuario.getUsuario();
		}
		return "usuario incorreto";
	}

	@Override
	public String getSenha() {
		if (temPermissaoDeAcesso()) {
			return bancousuario.getSenha();
		}
		return "senha incorreta";
	}

	private boolean temPermissaoDeAcesso() {
		return usuario == "admin" && senha == "admin";
	}
}
