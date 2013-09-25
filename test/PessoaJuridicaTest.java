package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pessoa.PessoaJuridica;

public class PessoaJuridicaTest {

	PessoaJuridica novaPessoaJuridica;
	@Before
	public void setUp() throws Exception {
		novaPessoaJuridica = new PessoaJuridica("Joao","2020");
	}

	@Test
	public void GetNomeTest() {
		assertEquals("Joao", novaPessoaJuridica.getNome());
	}
	
	@Test
	public void SetNomeTest(){
		novaPessoaJuridica.setNome("Marcos");
		assertEquals("Marcos", novaPessoaJuridica.getNome());
	}
	
	@Test
	public void SetTelefoneTest(){
		novaPessoaJuridica.setTelefone("99828787");
		assertEquals("99828787", novaPessoaJuridica.getTelefone());
	}
	
	@Test
	public void SetEnderecoTest(){
		novaPessoaJuridica.setEndereco("Rua 9 sul");
		assertEquals("Rua 9 sul", novaPessoaJuridica.getEndereco());
	}
	
	@Test
	public void SetEmailTest(){
		novaPessoaJuridica.setEmail("au-ramses@hotmail.com");
		assertEquals("au-ramses@hotmail.com", novaPessoaJuridica.getEmail());
	}
	
	@Test
	public void SetSiteTest(){
		novaPessoaJuridica.setSite("www.google.com.br");
		assertEquals("www.google.com.br", novaPessoaJuridica.getSite());
	}
	
	@Test
	public void GetCnpjTest(){
		assertEquals("2020", novaPessoaJuridica.getCnpj());
	}
	
	@Test
	public void SetCnpjTest(){
		novaPessoaJuridica.setCnpj("5050");
		assertEquals("5050", novaPessoaJuridica.getCnpj());
	}
	
	@Test
	public void SetRazaoSocialTest(){
		novaPessoaJuridica.setRazaoSocial("123");
		assertEquals("123", novaPessoaJuridica.getRazaoSocial());
	}
}
