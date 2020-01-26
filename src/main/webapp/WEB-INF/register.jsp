<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Registration</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
<script
	src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
/*-----Background-----*/
body {
	background-image:
		url(https://www.lazarski.pl/fileadmin/user_upload/erasmus-plus.-newspng.png);
	background-repeat: no-repeat;
	background-size: cover;
	width: 100%;
	height: 100vh;
	overflow: auto;
}

/*-----for border----*/
.container {
	font-family: Roboto, sans-serif;
	background-image:
		url(https://image.freepik.com/free-vector/dark-blue-blurred-background_1034-589.jpg);
	border-style: 1px solid grey;
	margin: 0 auto;
	text-align: center;
	margin-top: 67px;
	box-shadow: 2px 5px 5px 0px #eee;
	max-width: 500px;
	padding-top: 10px;
	height: 900px;
	margin-top: 100px;
}
/*--- for label of first and last name---*/
.lastname {
	margin-left: 1px;
	font-family: sans-serif;
	font-size: 14px;
	color: white;
	margin-top: 10px;
}

.nationality {
	margin-left: 1px;
	font-family: sans-serif;
	font-size: 14px;
	color: white;
	margin-top: 10px;
}

.fieldOfEducation {
	margin-left: 1px;
	font-family: sans-serif;
	font-size: 14px;
	color: white;
	margin-top: 10px;
}

.firstname {
	margin-left: 1px;
	font-family: sans-serif;
	font-size: 14px;
	color: white;
	margin-top: 5px;
}

#lname {
	margin-top: 5px;
}

/*---for heading-----*/
.heading {
	text-decoration: bold;
	text-align: center;
	font-size: 30px;
	color: #F96;
	padding-top: 10px;
}
/*-------for email----------*/
/*------label----*/
#email {
	margin-top: 5px;
}
/*-----------for Password--------*/
/*-------label-----*/
.mail {
	margin-left: 44px;
	font-family: sans-serif;
	color: white;
	font-size: 14px;
	margin-top: 13px;
}

.pass {
	color: white;
	margin-top: 9px;
	font-size: 14px;
	font-family: sans-serif;
	margin-left: 6px;
	margin-top: 9px;
}

#studentPassword {
	margin-top: 6px;
}

#nationality {
	margin-top: 6px;
}

#fieldOfEducation {
	margin-top: 6px;
}
/*------------for phone Number--------*/
/*----------label--------*/
.pno {
	font-size: 18px;
	margin-left: -13px;
	margin-top: 10px;
	color: #ff9;
}

/*--------------for Gender---------------*/
/*--------------label---------*/
.gender {
	color: white;
	font-family: sans-serif;
	font-size: 14px;
	margin-left: 28px;
	margin-top: 8px;
}

/*---------- for Input type--------*/
.col-xs-4.male {
	color: white;
	font-size: 13px;
	margin-top: 9px;
	padding-bottom: 16px;
}

.col-xs-4.female {
	color: white;
	font-size: 13px;
	margin-top: 9px;
	padding-bottom: 16px;
	padding-right: 95px;
}
/*------------For submit button---------*/
.sbutton {
	color: white;
	font-size: 20px;
	border: 1px solid white;
	background-color: #080808;
	width: 32%;
	margin-left: 41%;
	margin-top: 16px;
	box-shadow: 0px 2px 2px 0px white;
}

.btn.btn-warning:hover {
	box-shadow: 2px 1px 2px 3px #99ccff;
	background: #5900a6;
	color: #fff;
	transition: background-color 1.15s ease-in-out, border-color 1.15s
		ease-in-out, box-shadow 1.15s ease-in-out;
}
</style>
<body>
	<br />

	<button onclick="goBack()" class="myButton"
		style="float: right; background-color: transparent; border-color: transparent; top: 0px; leftt: 0px; position: fixed;">
		<b><font size="4px">Go Back</font></b>
	</button>
	<br />
	<br />
	<div class="container">
		<!---heading---->
		<header class="heading"> Register a Student</header>
		<hr></hr>
		<!---Form starting---->
		<form method="post" action="/task/register.jsp">
			<div class="row ">
				<!--- For Name---->
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="firstname">First Name :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="fname" id="fname"
								placeholder="Enter your First Name" class="form-control ">
						</div>
					</div>
				</div>


				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="lastname">Last Name :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="lname" id="lname"
								placeholder="Enter your Last Name" class="form-control last">
						</div>
					</div>
				</div>


				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="nationality">Nationality :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="nationality" id="nationality"
								placeholder="Enter your nationality" class="form-control ">
						</div>
					</div>
				</div>
				
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="nationality">Country :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="country" id="country"
								placeholder="Enter your country" class="form-control ">
						</div>
					</div>
				</div>

				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="fieldOfEducation">Field of Education :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="fieldOfEducation" id="fieldOfEducation"
								placeholder="Enter your field of education"
								class="form-control ">
						</div>
					</div>
				</div>

				<!-----For email---->
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="mail">Email :</label>
						</div>
						<div class="col-xs-8">
							<input type="email" name="email" id="email"
								placeholder="Enter your email" class="form-control">
						</div>
					</div>
				</div>
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="mail">University name :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="universityName" id="universityName"
								placeholder="Enter your university" class="form-control">
						</div>
					</div>
				</div>
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="mail">Faculty / Department :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="facultyOrDepartment" id="facultyOrDepartment"
								placeholder="Enter your faculty" class="form-control">
						</div>
					</div>
				</div>
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="mail">Erasmus Code :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="erasmusCode" id="erasmusCode"
								placeholder="Enter your erasmus university code" class="form-control">
						</div>
					</div>
				</div>
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="mail">Faculty address :</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="facultyAddress" id="facultyAddress"
								placeholder="Enter your faculty address" class="form-control">
						</div>
					</div>
				</div>
					<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="mail">Contact person info(Sending Institution):</label>
						</div>
						<div class="col-xs-8">
							<input type="text" name="contactPersonInfo" id="contactPersonInfo"
								placeholder="Enter contact for person" class="form-control">
						</div>
					</div>
				</div>
				<!-----For Password and confirm password---->
				<div class="col-sm-12">
					<div class="row">
						<div class="col-xs-4">
							<label class="pass">Password :</label>
						</div>
						<div class="col-xs-8">
							<input type="password" name="studentPassword"
								id="studentPassword" placeholder="Enter your Password"
								class="form-control">
						</div>
					</div>
				</div>

				<!-----------For Phone number-------->

				<div class="row">
					<div class="col-xs-4 ">
						<label class="gender">Gender:</label>
					</div>

					<div class="col-xs-4 male">
						<input type="radio" name="gender" id="gender" value="M">Male</input>
					</div>

					<div class="col-xs-4 female">
						<input type="radio" name="gender" id="gender" value="F">Female</input>
					</div>

				</div>

				<div class="row">
					<div class="col-xs-4 ">
						<label class="gender">Study Cycle:</label>
					</div>

					<div class="col-xs-4 male">
						<input type="radio" name="studyCycle" id="studyCycle"
							value="Bachelor">Bachelor</input>
					</div>

					<div class="col-xs-4 female">
						<input type="radio" name="studyCycle" id="studyCycle"
							value="Master">Master</input>
					</div>

				</div>
				<div class="row">
					<div class="col-xs-4 ">
						<label class="gender">Semester Stay</label>
					</div>

					<div class="col-xs-4 male">
						<input type="radio" name="semesterType" id="semesterType"
							value="Autumn">Autumn</input>
					</div>

					<div class="col-xs-4 female">
						<input type="radio" name="semesterType" id="semesterType"
							value="Spring">Spring</input>
					</div>

				</div>
				<div class="form-group">
					<label><font color="white">Date of Birth</font></label> <input
						type="date" class="form-control" id="dateOfBirth"
						name="dateOfBirth" placeholder="Date of Birth">
				</div>
				<button type="submit" id="login-button" class="btn btn-warning">Confirm
				</button>
		</form>

	</div>


</body>
<script>
	function goBack() {
		window.history.back();
	}
</script>
</html>