<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>ManageMyLA</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<style>
@import "compass/css3";

table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}


tr:nth-child(even) {
	background-color: #dddddd;
}

h1 {
	margin-right: auto;
	margin-left: auto;
}

body {
	font-family: URW Chancery L, cursive;
	font-size: 20px;
	background: #DAE2F8; /* fallback for old browsers */
	background: -webkit-linear-gradient(to right, #D6A4A4, #DAE2F8);
	/* Chrome 10-25, Safari 5.1-6 */
	background: linear-gradient(to right, #D6A4A4, #DAE2F8);
	/* W3C, IE 10+/ Edge, Firefox 16+, Chrome 26+, Opera 12+, Safari 7+ */
}

/*------------------------------------------------------*/

a {
	color: #9400D3;
	font-size: 20px;
}

button {
	/*background-color: #4B0082;*/
	color: #9400D3;
	display: block;
	margin: auto;
	max-width: 20em;
	width: 50%;
	border: 1px solid #818181;
	padding: 5px;
	border: 1px solid #818181;
	text-align: center;
}

div.wrapper {
	position: relative;
	bottom: 0;
	left: 0;
	right: 0;
	margin: auto;
	width: 600px;
	height: 100px;
	text-align: center;
	vertical-align: middle;
}

.glyphicon-lg {
	font-size: 4em
}

.info-block {
	margin-bottom: 25px;
	text-align: center;
	vertical-align: middle
}

.logoutLblPos {
	position: fixed;
	right: 40px;
	top: 5px;
	color: #9400D3
}

.info-block .square-box {
	width: 100px;
	min-height: 110px;
	margin-right: 22px;
	text-align: center !important;
	background-color: #676767;
	padding: 20px 0
}

.info-block.block-info {
	border-color: #20819e
}

.info-block.block-info .square-box {
	background-color: #20819e;
	color: #FFF
}

.clearfix {
	outline-width: 0;
}

.items {
	align: center;
	outline-width: 0;
}

input {
	display: block !important;
	padding: 0 !important;
	margin: 0 !important;
	border: 0 !important;
	width: 100% !important;
	border-radius: 0 !important;
	line-height: 1 !important;
}

.squaredThree {
	width: 20px;
	position: relative;
	margin: 20px auto; label { width : 20px;
	height: 20px;
	cursor: pointer;
	position: absolute;
	top: 0;
	left: 0;
	background: linear-gradient(top, #222 0%, #45484d 100%);
	border-radius: 4px;
	box-shadow: inset 0px 1px 1px rgba(0, 0, 0, 0.5), 0px 1px 0px
		rgba(255, 255, 255, .4); &: after { content : '';
	width: 9px;
	height: 5px;
	position: absolute;
	top: 4px;
	left: 4px;
	border: 3px solid #fcfff4;
	border-top: none;
	border-right: none;
	background: transparent;
	opacity: 0;
	transform: rotate(-45deg);
}

&
:hover::after {
	opacity: 0.3;
}

}
input[type=checkbox] {
	visibility: hidden;
	&:
	checked
	+
	label
	:
	after
	{
	opacity:1;
}
}
}
</style>
<head>
<link rel="stylesheet" type="text/css" href="stylesheet.css">
</head>
<header>
	<H1>Lists of courses available in Autumn semester - Receiving
		Institution</H1>
</header>
<body>
	<sql:setDataSource var="myDatabase" driver="com.mysql.cj.jdbc.Driver"
		url="jdbc:mysql://127.0.0.1/mydb?useUnicode=true&characterEncoding=utf8&useTimezone=True&serverTimezone=UTC"
		user="root" password="test" />

	<sql:query var="listCourses" dataSource="${myDatabase}">
        SELECT * FROM Course WHERE semesterType = 'Autumn';
    </sql:query>

	<form method="post" action="/task/autumnCourses.jsp">
		<table cellpadding="5" id="myTable" class="table table-bordered">
			<th>Name</th>
			<th>ECTS</th>
			<th></th>
			<c:forEach var="itemCatalog" items="${listCourses.rows}">

				<tr>
					<td>${itemCatalog.courseName}</td>
					<td>${itemCatalog.numofECTS}</td>
					<td>
						<section title=".squaredThree">
							<!-- .squaredThree -->
							<div class="squaredThree">
								<input type="checkbox" value="${itemCatalog.courseName} ${itemCatalog.numofECTS}"
									id="mycheck" name="mycheck" />
							</div>
							<!-- end .squaredThree -->
						</section>
					</td>

				</tr>
			</c:forEach>
		</table>
		<H1>Lists of chosen courses - Sending Institution</H1>
		<table class="table table-bordered table-condensed" width="400">
			<th>Name</th>
			<th>ECTS</th>
			<tbody>
				<tr>
					<td><input type="text" class="form-control"
						name="sendingCourse" id="sendingCourse" /></td>
					<td><input type="text" class="form-control" name="sendingECTS"
						id="sendingECTS" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control"
						name="sendingCourse" id="sendingCourse" /></td>
					<td><input type="text" class="form-control" name="sendingECTS"
						id="sendingECTS" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control"
						name="sendingCourse" id="sendingCourse" /></td>
					<td><input type="text" class="form-control" name="sendingECTS"
						id="sendingECTS" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control"
						name="sendingCourse" id="sendingCourse" /></td>
					<td><input type="text" class="form-control" name="sendingECTS"
						id="sendingECTS" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control"
						name="sendingCourse" id="sendingCourse" /></td>
					<td><input type="text" class="form-control" name="sendingECTS"
						id="sendingECTS" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control"
						name="sendingCourse" id="sendingCourse" /></td>
					<td><input type="text" class="form-control" name="sendingECTS"
						id="sendingECTS" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control"
						name="sendingCourse" id="sendingCourse" /></td>
					<td><input type="text" class="form-control" name="sendingECTS"
						id="sendingECTS" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control"
						name="sendingCourse" id="sendingCourse" /></td>
					<td><input type="text" class="form-control" name="sendingECTS"
						id="sendingECTS" /></td>
				</tr>
			</tbody>
		</table>
		<button type="Submit" class="btn btn-primary btn-block btn-large">Continue</button>
	</form>
	<form action="/task/logout" method="get" align="right">
		<label class="logoutLblPos">
			<button type="Submit"
				style="float: right; background-color: transparent; border-color: transparent"top:"0px";right:"0px">Logout</button>
		</label>
	</form>
</body>
</html>