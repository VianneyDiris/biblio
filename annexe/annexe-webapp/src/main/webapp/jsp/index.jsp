<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="_include/head.jsp"%>
</head>
<body>
	<nav class="navbar navbar-default"> <!-- Brand and toggle get grouped for better mobile display -->
	<div class="navbar-header">
		<button type="button" data-target="#navbarCollapse"
			data-toggle="collapse" class="navbar-toggle">
			<span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span>
			<span class="icon-bar"></span> <span class="icon-bar"></span>
		</button>
		<s:a action="index" class="navbar-brand">Biblio</s:a>
	</div>

	<div id="navbarCollapse" class="collapse navbar-collapse">
		<ul class="nav navbar-nav">
			<li class="active"><s:a action="index">Accueil</s:a></li>
			<li><s:a action="connexion">Connexion</s:a></li>
			<li><s:a action="inscription">Inscription</s:a></li>			
						
		</ul>
	</div>
	</nav>


	<!-- Page Content -->
	<div class="container main">
		<h1 class="text-center">Bibliotheque d'OC</h1>
		<p class="text-center">Pour avoir accès aux ouvrages, vous devez être identifié.</p>

	</div>



	<%@include file="_include/footer.jsp"%>
</body>
</html>