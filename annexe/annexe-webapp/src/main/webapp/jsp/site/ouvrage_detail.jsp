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
	  <fieldset>
        <legend class="text-center grossissement">Spot</legend>
        <div class="row justify-content-lg-center">
		 <div class="produit col-lg-8 col-lg-offset-2">
			<div class="panel panel-default">
				<div class="panel-heading"><s:property value="ouvrage.titre"/></div>
				<div class="panel-body">
				<img class="col-lg-8" alt="img" src="resource_image/<s:property value="titre.photos"/>">
				<div class="col-lg-4">
					<p class="resume">Résumé:<s:property value="resume" /></p>
					<p class="langue">Langue:<s:property value="langue" /></p>
					<p class="editeur">Éditeur:<s:property value="editeur" /></p>
					<p class="ISBN">ISBN:<s:property value="isbn" /></p>
					<p class="auteur">Auteur:<s:property value="auteur" /></p>
					<p class="genre">Genre:<s:property value="genre" /></p>					
					<p></p>
					<s:a action="prêt"><button class="btn btn-default">Emprunter cet ouvrage</button></s:a>
					</div>
				</div>
			</div>
		</div>
    </div>
   </fieldset>
	
</div>
	<%@include file="../_include/footer.jsp"%>
</body>
</html>