<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html:html>
	<head>
		<title>Insert title here</title>
	</head>
	
	<h1>Cadastro de Contato</h1>
	
	<html:errors />
	
	<html:form action="/novoContato" focus="contato.nome">
		<table >
			<tr>
				<td>Nome</td>
				<td><html:text property="contato.nome" /></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><html:text property="contato.email" /></td>
			</tr>
			<tr>
				<td>Endereço</td>
				<td><html:text property="contato.endereco" /></td>
			</tr>
			<tr>
				<td><html:submit>Enviar Dados</html:submit>
			</tr>
		</table>
	</html:form>
</html:html>