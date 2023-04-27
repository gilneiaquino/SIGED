package br.com.siged.persistencia.DAO;

import br.com.siged.modelo.UsuarioDTO;
import br.com.siged.persistencia.conexao.HibernateDAO;

public class UsuarioDAO {	

	public void incluir(UsuarioDTO obj) throws Exception {
    	HibernateDAO dao = HibernateDAO.getInstace();
    	dao.saveOrUpdate(obj);
	}
}
