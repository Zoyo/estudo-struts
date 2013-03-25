package struts.estudo.modelo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String endereco;
	private String email;
	private Calendar dataNascimento;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDataNascimento() {
		if(this.dataNascimento == null)
			return Calendar.getInstance();
		
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		if(dataNascimento == null)
			dataNascimento = Calendar.getInstance();
		
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("ID........: ").append(this.id)
		   .append("\nNome......: ").append(this.nome)
		   .append("\nEndereço..: ").append(this.endereco)
		   .append("\nEmail.....: ").append(this.email)
		   .append("\nNascimento: ").append(new SimpleDateFormat("dd/MM/yyyy").format(this.dataNascimento.getTime()))
		   .append("\n");
		return str.toString();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
}
