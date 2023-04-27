package br.com.siged.bean;

import br.com.siged.modelo.UsuarioDTO;
import br.com.siged.service.UsuarioService;
import br.com.siged.service.UsuarioServiceImpl;

public class UsuarioBean {

    private UsuarioDTO usuario;    
	
	public void incluir() throws Exception{
		UsuarioService service = new UsuarioServiceImpl();
		service.incluir(getUsuario());
	}

	public UsuarioDTO getUsuario() {
		if(usuario == null){
			usuario = new UsuarioDTO();
		}
		return usuario;
	}
	public void setUsuario(UsuarioDTO usuario) {
		this.usuario = usuario;
	}
	
	public static void main(String[] args) {
		
	}
	
	
}
