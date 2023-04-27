package br.com.siged.service;

import br.com.siged.modelo.UsuarioDTO;
import br.com.siged.persistencia.DAO.UsuarioDAO;

public class UsuarioServiceImpl implements UsuarioService {

	public void incluir(UsuarioDTO usuarioDTO) throws Exception{
		UsuarioDAO dao = new UsuarioDAO();
		dao.incluir(usuarioDTO);		
	}
}
