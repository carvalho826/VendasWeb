package com.mcarsoft.sistema.cliente;

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

}
