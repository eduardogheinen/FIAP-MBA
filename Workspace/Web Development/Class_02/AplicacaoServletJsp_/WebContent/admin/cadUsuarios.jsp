<!DOCTYPE html>
<html>
<head>
<title>Cadastro de Usu�rios</title>
</head>
<body>
	<h1>Valida��o de usu�rios</h1>
	<form action="cadusuarios" method="post">
		<label for="nome">Usu�rio</label><br/>
		<input type="text" name="nome" id="nome" size="20"/><br/>
		<label for="senha">Senha</label><br/>
		<input type="password" name="senha" id="senha" size="20"/><br/>
		<label for="nivel">N�vel</label><br/>
		<select name="nivel" id="nivel">
			<option value="1" selected="selected">Administrador</option>
			<option value="2">Cliente</option>
		</select>
		
		<input type="submit" value="Validar">
		<br/>
		${msg}
	</form>	
	
	<br /><a href="menu.jsp">Voltar</a>
	<br /><a href="logoff">Logoff</a>
</body>
</html>