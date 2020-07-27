<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Plano de saúde</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css"
	integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk"
	crossorigin="anonymous">

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
	integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"
	integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI"
	crossorigin="anonymous"></script>

</head>
<body>

	<h1>Entre com os seus dados</h1>

	<form>

		<div class="row">
			<div class="col">
				<input type="text" class="form-control" placeholder="Nome" required="required">
			</div>
			<div class="col">
				<input type="text" class="form-control" placeholder="Sobrenome">
			</div>
		</div>

		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputEmail4">Email</label> <input type="email"
					class="form-control" id="inputEmail4" placeholder="Email">
			</div>
			<div class="form-group col-md-6">
				<label for="inputPassword4">Senha</label> <input type="password"
					class="form-control" id="inputPassword4" placeholder="Senha" required="required">
			</div>
		</div>
		<div class="form-group">
			<label for="inputAddress">Endereço</label> <input type="text"
				class="form-control" id="inputAddress"
				placeholder="Rua dos Bobos, nº 0" required="required">
		</div>
		<div class="form-row">
			<div class="form-group col-md-6">
				<label for="inputCity">Cidade</label> <input type="text"
					class="form-control" id="inputCity" required="required">
			</div>
			<div class="form-group col-md-4">
				<label for="inputEstado">Estado</label> <select id="inputEstado"
					class="form-control">
					<option selected>Escolher...</option>
					<option>...</option>
				</select>
			</div>
			<div class="form-group col-md-2">
				<label for="inputCEP">CEP</label> <input type="text"
					class="form-control" id="inputCEP" required="required">
			</div>
		</div>
		<div class="form-group">
			<div class="form-check">
				<input class="form-check-input" type="checkbox" id="gridCheck">
				<label class="form-check-label" for="gridCheck"> Confirmo os dados digitados </label>
			</div>
		</div>
		<button type="submit" class="btn btn-primary">Enviar</button>

	</form>

</body>
</html>