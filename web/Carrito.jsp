<%-- 
    Document   : Carrito
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
    <title>Carrito de Compras</title>
    <meta name="description" content="WebUni Education Template">
    <meta name="keywords" content="webuni, education, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Favicon -->
    <link href="img/favicon.ico" rel="shortcut icon">
    <!-- Google Fonts -->
    <link href="https://fonts.googleapis.com/css?family=Raleway:400,400i,500,500i,600,600i,700,700i,800,800i"

      rel="stylesheet">
    <!-- Stylesheets -->
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/owl.carousel.css">
    <link rel="stylesheet" href="css/style.css">
    <!--[if lt IE 9]>
	  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>	  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>	<![endif]-->
  </head>
  <body> <!-- Page Preloder -->
    <div id="preloder">
      <div class="loader"></div>
    </div>
    <!-- Header section -->
    <header class="header-section">
      <div class="container">
        <div class="row">
          <div class="col-lg-3 col-md-3">
            <div class="nav-switch"> <i class="fa fa-bars"></i> </div>
          </div>
        </div>
      </div>
    </header>
    <!-- Header section end -->
    <!-- Page info -->
    <div class="page-info-section set-bg" data-setbg="img/page-bg/carrito.jpg">
      <div class="container">
        <div class="site-breadcrumb"> <a href="index.html">Inicio</a> <span>Carrito
            de Compras</span> </div>
      </div>
    </div>
    <!-- Page info end -->
    <!-- search section -->
    <section class="search-section ss-other-page">
      <div class="container">
        <div class="search-warp">
          <div class="section-title text-white">
            <h2><span>Carrito de Compras</span></h2>
          </div>
          <div class="row">
            <div class="col-lg-10 offset-lg-1">
              <!-- search form -->
              <form class="course-search-form" action="ControladorCliente" method="POST">
                <input class="last-m" placeholder="Codigo de Barras" name="CodigodeBarras"

                  type="text"> <input class="last-m" placeholder="Cantidad" name="Cantidad"

                  type="text"> <br>
                <br>
                <br>
                <input class="last-m" placeholder="Nombre del Cliente" name="NombredelCliente"

                  type="text"> <input class="last-m" placeholder="Identificacion"

                  name="Identificacion" type="text"> <br>
                <br>
                <br>
                <input class="last-m" placeholder="Direccion" name="Direccion" type="text">
                <button class="site-btn btn-dark" name="Ingresar">Ingresar</button>
                <br>
                <br>
                <br>
                <table style="width:100%">
                  <tbody>
                    <tr>
                      <th>Nombre</th>
                      <th>Codigo de Barras</th>
                      <th>Cantidad</th>
                      <th>Precio</th>
                      <th>Precio Total</th>
                    </tr>
                  </tbody>
                </table>
                <br>
                <br>
                <br>
                <input class="last-m" placeholder="Total a Pagar" name="TotalaPagar"

                  type="text"> <button class="site-btn btn-dark" name="Totalizar">Totalizar</button>
                <br>
                <br>
                <input class="last-m" placeholder="Medio de Pago" name="MediodePago"

                  type="text"> <button class="site-btn btn-dark" name="Pagar">Pagar</button>
                <br>
                <br>
                <input class="last-m" placeholder="Cambio" name="Cambio" type="text">
                <button class="site-btn btn-dark" name="Facturar">Facturar</button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </section>
    <!-- search section end -->
    <!-- Page -->
    <!-- Page end -->
    <!-- footer section -->
    <footer class="footer-section spad pb-0">
      <div class="footer-top">
        <div class="footer-warp">
          <div class="row">
            <div class="widget-item">
              <h4>Contact Info</h4>
              <ul class="contact-list">
                <li>1481 Creekside Lane <br>
                  Avila Beach, CA 931</li>
                <li>+53 345 7953 32453</li>
                <li>yourmail@gmail.com</li>
              </ul>
            </div>
            <div class="widget-item">
              <h4>Engeneering</h4>
              <ul>
                <li><a href="">Applied Studies</a></li>
                <li><a href="">Computer Engeneering</a></li>
                <li><a href="">Software Engeneering</a></li>
                <li><a href="">Informational Engeneering</a></li>
                <li><a href="">System Engeneering</a></li>
              </ul>
            </div>
            <div class="widget-item">
              <h4>Graphic Design</h4>
              <ul>
                <li><a href="">Applied Studies</a></li>
                <li><a href="">Computer Engeneering</a></li>
                <li><a href="">Software Engeneering</a></li>
                <li><a href="">Informational Engeneering</a></li>
                <li><a href="">System Engeneering</a></li>
              </ul>
            </div>
            <div class="widget-item">
              <h4>Development</h4>
              <ul>
                <li><a href="">Applied Studies</a></li>
                <li><a href="">Computer Engeneering</a></li>
                <li><a href="">Software Engeneering</a></li>
                <li><a href="">Informational Engeneering</a></li>
                <li><a href="">System Engeneering</a></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
      <div class="footer-bottom">
        <div class="footer-warp">
          <ul class="footer-menu">
            <li><a href="#">Terms &amp; Conditions</a></li>
            <li><a href="#">Register</a></li>
            <li><a href="#">Privacy</a></li>
          </ul>
        </div>
      </div>
    </footer>
    <!-- footer section end -->
    <!--====== Javascripts & Jquery ======-->
    <script src="js/jquery-3.2.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/circle-progress.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>
  </body>
</html>

