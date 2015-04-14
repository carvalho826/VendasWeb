package com.mcarsoft.sistema.cliente;

import java.util.List;

import com.mcarsoft.sistema.util.DAOFactory;

public class ClienteRN {

	private ClienteDAO clienteDAO;
	
	public ClienteRN(){
		this.clienteDAO = DAOFactory.criaClienteDAO();
	}

	public void salvar(Cliente c1) {
		this.clienteDAO.salvar(c1);
		
	}

	public List<Cliente> listar() {
		return this.clienteDAO.listar();
		
	}
}
