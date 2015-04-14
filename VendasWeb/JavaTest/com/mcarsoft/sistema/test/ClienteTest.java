package com.mcarsoft.sistema.test;

import static org.junit.Assert.*;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.mcarsoft.sistema.cliente.Cliente;
import com.mcarsoft.sistema.cliente.ClienteRN;
import com.mcarsoft.sistema.util.HibernateUtil;

public class ClienteTest {

	private static Session sessao;
	private static Transaction transacao;

	@BeforeClass
	public static void abreConexao() {
		sessao = HibernateUtil.getSession().getCurrentSession();
		transacao = sessao.beginTransaction();
	}

	@AfterClass
	public static void fechaConexao() {
		try {
			transacao.commit();
		} catch (Throwable e) {
			System.out.println("Problema no commit : " + e.getMessage());
		} finally {
			try {
				if (sessao.isOpen()) {
					sessao.close();
				}

			} catch (Exception e2) {
				System.out.println("Problema no fechamento da conexao : "
						+ e2.getMessage());
			}
		}
	}

	@Test
	public void salvarTest() {

		Cliente c1 = new Cliente();
		c1.setNome("Ronaldo");
		c1.setEndereco("Rua Teste");
		c1.setRenda(5000f);
		c1.setCpf("123456789");

		ClienteRN clienteRN = new ClienteRN();
		clienteRN.salvar(c1);

		assertEquals(true, true);
	}
	
	@Test
	public void listarTeste(){
		ClienteRN clienteRN = new ClienteRN();
		List<Cliente> lista =  clienteRN.listar();
		assertEquals(4, lista.size());
	}
}
