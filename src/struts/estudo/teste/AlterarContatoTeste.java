
package struts.estudo.teste;

import java.util.GregorianCalendar;

import struts.estudo.dao.ContatoDAO;
import struts.estudo.modelo.Contato;

public class AlterarContatoTeste {
	public static void main(String[] args) {
		Contato contato = new Contato();
		contato.setId(3L);
		contato.setNome("Excluir");
		contato.setEmail("excluir@mailinator.com");
		contato.setEndereco("Rua Para Excluir, 4321");
		contato.setDataNascimento(new GregorianCalendar(1985, 1, 25));
		
		ContatoDAO dao = new ContatoDAO();
		
		dao.altera(contato);
		
		System.out.println("Alterado");
	}
}
