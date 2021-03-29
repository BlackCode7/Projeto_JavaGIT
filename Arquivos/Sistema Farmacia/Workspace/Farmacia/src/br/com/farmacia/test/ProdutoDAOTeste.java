package br.com.farmacia.test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.Ignore;
import org.junit.Test;

import br.com.farmacia.DAO.FornecedoresDAO;
import br.com.farmacia.DAO.ProdutoDAO;
import br.com.farmacia.domain.Fornecedores;
import br.com.farmacia.domain.Produtos;
import br.com.farmacia.factory.ConexaoFactory;



public class ProdutoDAOTeste {
	
	@Test
	@Ignore
	public void salvar()throws SQLException{
	 Produtos p1 = new Produtos();
		p1.setDescricao("ASPIRINA");
		p1.setPreco(4.99);
		p1.setQuantidade(12L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo(13);
		p1.setFornecedores(f);
		
		
		
		ProdutoDAO fdao = new ProdutoDAO();
		
		fdao.salvar(p1);
	}
	
	@Test
	@Ignore
	public void listar()throws SQLException{
	
		ProdutoDAO fdao = new ProdutoDAO();
		ArrayList<Produtos> lista = fdao.listar();
		
		for (Produtos p : lista){
			System.out.println("C�digo do Produto: " + p.getCodigo());
			System.out.println("Descri��o do Produto: " + p.getDescricao());
			System.out.println("Valor do Produto: " + p.getPreco());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("C�digo do Fornecedor: " + p.getFornecedores().getCodigo());
			System.out.println("Descri��o do Fornecedor: " + p.getFornecedores().getDescricao());
			System.out.println("");
		}
		
	}
	
	@Test
	@Ignore
	public void excluir()throws SQLException{
		Produtos p = new Produtos();
		p.setCodigo(3L);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.excluir(p);
	}
	
	
	@Test
	
	public void editar()throws SQLException{
		Produtos p = new Produtos();
		p.setCodigo(5L);
		p.setDescricao("Cataflan");
		p.setPreco(15.75);
		p.setQuantidade(2L);
		
		Fornecedores f = new Fornecedores();
		f.setCodigo(10);
		p.setFornecedores(f);
		
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.editar(p);
	}
	
	
}
