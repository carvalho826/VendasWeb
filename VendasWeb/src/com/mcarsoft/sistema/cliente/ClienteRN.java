package com.mcarsoft.sistema.cliente;

import com.mcarsoft.sistema.util.DAOFactory;

public class ClienteRN {

	private ClienteDAO ClienteDAO;
	
	public ClienteRN(){
		this.ClienteDAO = DAOFactory.criaClienteDAO();
	}

	public void salvar(Cliente c1) {
		this.ClienteDAO.salvar(c1);
		
	}
}
