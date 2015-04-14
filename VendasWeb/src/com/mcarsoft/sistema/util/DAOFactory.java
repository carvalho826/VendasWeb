package com.mcarsoft.sistema.util;

import com.mcarsoft.sistema.cliente.ClienteDAO;
import com.mcarsoft.sistema.cliente.ClienteDAOHibernate;

public class DAOFactory {

	public static ClienteDAO criaClienteDAO() {
		ClienteDAOHibernate clienteDAOHibernate = new ClienteDAOHibernate();
		clienteDAOHibernate.setSessao(HibernateUtil.getSession()
				.getCurrentSession());
		return clienteDAOHibernate;
	}

}
