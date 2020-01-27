package com.emerson.minhasFinancas.service;

import com.emerson.minhasFinancas.model.entity.Usuario;

public interface UsuarioService {

	Usuario autentica(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario);
	
	void validarEmail(String email);
	
}
