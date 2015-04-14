package com.mcarsoft.sistema.cliente;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class ClienteDAOHibernate implements ClienteDAO {

	private Session sessao;
	
	public Session getSessao() {
		return sessao;
	}

	public void setSessao(Session sessao) {
		this.sessao = sessao;
	}

	@Override
	public void salvar(Cliente cliente) {
		this.sessao.save(cliente);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> listar() {
		Criteria lista = sessao.createCriteria(Cliente.class);
		return lista.list();
	}

}
