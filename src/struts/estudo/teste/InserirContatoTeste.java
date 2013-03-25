package struts.estudo.teste;

import java.util.GregorianCalendar;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;

public class InserirContatoTeste {
	public static void main(String[] args) {
		Contato contato = new Contato();
		
		contato.setNome("Alterar");
		contato.setEndereco("Rua Para Alterar, 1234");
		contato.setEmail("alterar@mailinator.com");
		contato.setDataNascimento(new GregorianCalendar(1970, 0, 1));
		
		ContatoDAO dao = new ContatoDAO();
		dao.adiciona(contato);
		
		System.out.println("Contato gravado");
	}
}
