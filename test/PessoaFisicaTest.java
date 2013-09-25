package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pessoa.PessoaFisica;

public class PessoaFisicaTest {

	PessoaFisica novaPessoaFisica;
	@Before
	public void setUp() throws Exception {
		novaPessoaFisica = new PessoaFisica("Ana","2020");
	}

	@Test
	public void GetNomeTest() {
		assertEquals("Ana", novaPessoaFisica.getNome());
	}
	
	@Test
	public void SetNomeTest(){
		novaPessoaFisica.setNome("Marcos");
		assertEquals("Marcos", novaPessoaFisica.getNome());
	}
	
	@Test
	public void SetTelefoneTest(){
		novaPessoaFisica.setTelefone("99828787");
		assertEquals("99828787", novaPessoaFisica.getTelefone());
	}
	
	@Test
	public void SetEnderecoTest(){
		novaPessoaFisica.setEndereco("Rua 9 sul");
		assertEquals("Rua 9 sul", novaPessoaFisica.getEndereco());
	}
	
	@Test
	public void SetEmailTest(){
		novaPessoaFisica.setEmail("au-ramses@hotmail.com");
		assertEquals("au-ramses@hotmail.com", novaPessoaFisica.getEmail());
	}
	
	@Test
	public void SetSiteTest(){
		novaPessoaFisica.setSite("www.google.com.br");
		assertEquals("www.google.com.br", novaPessoaFisica.getSite());
	}
	
	@Test
	public void GetCpfTest(){
		assertEquals("2020", novaPessoaFisica.getCpf());
	}
	
	@Test
	public void SetCpfTest(){
		novaPessoaFisica.setCpf("3030");
		assertEquals("3030", novaPessoaFisica.getCpf());
	}
	
	@Test
	public void SetEmpresaTest(){
		novaPessoaFisica.setEmpresa("Google");
		assertEquals("Google", novaPessoaFisica.getEmpresa());
	}

	@Test
	public void SetCargoTest(){
		novaPessoaFisica.setCargo("Diretor");
		assertEquals("Diretor", novaPessoaFisica.getCargo());
	}

	@Test
	public void SetAniversarioTest(){
		novaPessoaFisica.setAniversario("10/10");
		assertEquals("10/10", novaPessoaFisica.getAniversario());
	}

	@Test
	public void SetFotoTest(){
		novaPessoaFisica.setFoto("lala.jpg");
		assertEquals("lala.jpg", novaPessoaFisica.getFoto());
	}

}
