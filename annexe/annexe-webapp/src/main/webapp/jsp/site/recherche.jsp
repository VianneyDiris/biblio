<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<%@include file="../_include/head.jsp"%>
</head>
<body>
<nav class="navbar navbar-default">
		<!-- Brand and toggle get grouped for better mobile display -->
		<div class="navbar-header">
			<button type="button" data-target="#navbarCollapse"
				data-toggle="collapse" class="navbar-toggle">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<s:a action="index" class="navbar-brand">Biblio</s:a>
		</div>

		<div id="navbarCollapse" class="collapse navbar-collapse">
			<ul class="nav navbar-nav">
				<li><s:a action="index">Accueil</s:a></li>
				<li class="active"><s:a action="ouvrage">Ouvrage</s:a></li>
				<li><s:a>Recherche</s:a></li>
				<li><s:a>Prêt</s:a></li>
			</ul>
		</div>
	</nav>


	<!-- Page Content -->
	<div class="container content">
		<s:form action="search_ouvrage" class="col-lg-6 col-lg-offset-3">
			<fieldset class="scheduler-border">
				<legend class="scheduler-border">Recherche ouvrage</legend>

			<div class="form-group">
					<s:label for="titre" class="espace">Titre</s:label>
					<s:textfield name="titre" class="form-control" placeholder="titre" label="titre"/>
					
					<s:label for="editeur" class="espace" >Éditeur</s:label>
					<s:textfield name="editeur" class="form-control" placeholder="editeur"/>
				</div>
				<div class="form-group">
					<s:label for="auteur">Auteur</s:label>
					<s:textfield name="auteur" class="form-control" placeholder="auteur"/>
				</div>
				<div class="form-group">
					<s:label for="genre">Genre</s:label>
					<s:textfield name="genre" class="form-control" placeholder="genre"/>
				</div>
				<div class="form-group">
					<s:label for="isbn">Genre</s:label>
					<s:textfield name="isbn" class="form-control" placeholder="isbn"/>
				</div>


				<s:submit value="Rechercher" id="connecter"	class="btn btn-primary center-block" />

			</fieldset>
		</s:form>
	</div>




	<%@include file="../_include/footer.jsp"%>
</body>
</html>