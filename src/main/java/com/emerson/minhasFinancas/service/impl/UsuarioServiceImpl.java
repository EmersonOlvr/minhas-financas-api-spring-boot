package com.emerson.minhasFinancas.service.impl;

import com.emerson.minhasFinancas.exception.RegraNegocioException;
import com.emerson.minhasFinancas.model.entity.Usuario;
import com.emerson.minhasFinancas.model.repository.UsuarioRepository;
import com.emerson.minhasFinancas.service.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	private UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public Usuario autentica(String email, String senha) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario salvarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if (existe) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com este email.");
		}
	}	
	
}
