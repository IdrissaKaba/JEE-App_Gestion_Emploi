<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib    prefix = "c"    uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>SofieNET</title>
		<link rel="stylesheet" href="bootstrap/dist/css/bootstrap.min.css">
    	<link rel="stylesheet" href="fontawesome/css/all.css">
	</head>
	<body bgcolor="#F3E5AB">
	<nav class="navbar navbar-expand-lg bg-primary" data-bs-theme="dark">
    <div class="container-fluid">
      <a class="navbar-brand" href="#">Essat Boutique </a>
      <div class="collapse navbar-collapse" id="navbarNav">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Promotions</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Ventes Flash</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#">Déstockages</a>
          </li>
        </ul>
      </div>
    </div>

  </nav>
  <div class="container-fluid">
      <div class="row mt-2">
            <div class="col-3">
                <ul class="list-group">
                    <li class="list-group-item active" aria-current="true">Tous les produits </li>
			<c:forEach items="${listCat}" var="cat">
			   <li class="list-group-item">
				 <p> ${cat.id} ${cat.categorie}</p>
				 <a href="PreProduit?idc=${cat.id}">List of ${cat.categorie}</a>
			   </li>
			</c:forEach> 
			</ul>
            </div>
            <div class="col-9">
                <div class="row">
                    <div class="col-4">
                         <div class="card bg-light" style="width: 18rem;">
                        <img src="pic/1.jpg" class="card-img-top">
                          <div class="card-body">
                              <h5 class="card-title">MSI</h5>
                              <p class="card-text">GF63THIN11</p>
                              <a href="#" class="btn btn-primary"> Acheter </a>
                              <a href="#" class="btn btn-danger"> 2400 TND</a>
                          </div>
                         </div>
                    </div>
                    <div class="col-4">
                        <div class="card bg-light" style="width: 18rem;">
                        <img src="pic/2.jpg" class="card-img-top">
                          <div class="card-body">
                              <h5 class="card-title">MSI</h5>
                              <p class="card-text">GF63THIN11</p>
                              <a href="#" class="btn btn-primary"> Acheter </a>
                              <a href="#" class="btn btn-danger"> 2400 TND</a>
                          </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="card bg-light" style="width: 18rem;">
                        <img src="pic/3.jpg" class="card-img-top">
                          <div class="card-body">
                              <h5 class="card-title">MSI</h5>
                              <p class="card-text">GF63THIN11</p>
                              <a href="#" class="btn btn-primary"> Acheter </a>
                              <a href="#" class="btn btn-danger"> 2400 TND</a>
                          </div>
                        </div>
                    </div>
                    <div class="col-4">
                        <div class="card bg-light" style="width: 18rem;">
                        <img src="pic/3.5.jpg" class="card-img-top">
                          <div class="card-body">
                              <h5 class="card-title">MSI</h5>
                              <p class="card-text">GF63THIN11</p>
                              <a href="#" class="btn btn-primary"> Acheter </a>
                              <a href="#" class="btn btn-danger"> 2400 TND</a>
                          </div>
                        </div>
                    </div>
            </div>
      </div>
      </div>
    </div>
			
	</body>
</html>