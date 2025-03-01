<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import ="java.util.Iterator" %>
<%@ page import="java.util.List" %>
<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="itheima" uri="http://itheima.com/common/"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() 
	                   + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
		<meta charset="utf-8" />
		<title> CabManageWeb</title>

		<meta name="description" content="Draggabble Widget Boxes with Persistent Position and State" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0" />

		<!-- bootstrap & fontawesome -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/bootstrap.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/font-awesome/4.5.0/css/font-awesome.min.css" />

		<!-- page specific plugin styles -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/jquery-ui.custom.min.css" />

		<!-- text fonts -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/fonts.googleapis.com.css" />

		<!-- ace styles -->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/ace.min.css" class="ace-main-stylesheet" id="main-ace-style" />

		<!--[if lte IE 9]>
			<link rel="stylesheet" href="assets/css/ace-part2.min.css" class="ace-main-stylesheet" />
		<![endif]-->
		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/ace-skins.min.css" />
		<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/ace-rtl.min.css" />

		<!--[if lte IE 9]>
		  <link rel="stylesheet" href="assets/css/ace-ie.min.css" />
		<![endif]-->

		<!-- inline styles related to this page -->

		<!-- ace settings handler -->
		<script src="${pageContext.request.contextPath }/assets/js/ace-extra.min.js"></script>

		<!-- HTML5shiv and Respond.js for IE8 to support HTML5 elements and media queries -->

		<!--[if lte IE 8]>
		<script src="assets/js/html5shiv.min.js"></script>
		<script src="assets/js/respond.min.js"></script>
		<![endif]-->
	</head>

	<body class="no-skin">
		<div id="navbar" class="navbar navbar-default          ace-save-state">
			<div class="navbar-container ace-save-state" id="navbar-container">
				<button type="button" class="navbar-toggle menu-toggler pull-left" id="menu-toggler" data-target="#sidebar">
					<span class="sr-only">Toggle sidebar</span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>

					<span class="icon-bar"></span>
				</button>

				<div class="navbar-header pull-left">
					<a href="index.html" class="navbar-brand">
						<small>
							<i class="fa fa-leaf"></i>
						CabManageApp
						</small>
					</a>
				</div>

				<div class="navbar-buttons navbar-header pull-right" role="navigation">
					<ul class="nav ace-nav">
						<li class="grey dropdown-modal">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#">
								<i class="ace-icon fa fa-tasks"></i>
								<span class="badge badge-grey">4</span>
							</a>

							<ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
								<li class="dropdown-header">
									<i class="ace-icon fa fa-check"></i>
									4 Tasks to complete
								</li>

								<li class="dropdown-content">
									<ul class="dropdown-menu dropdown-navbar">
										<li>
											<a href="#">
												<div class="clearfix">
													<span class="pull-left">Software Update</span>
													<span class="pull-right">65%</span>
												</div>

												<div class="progress progress-mini">
													<div style="width:65%" class="progress-bar"></div>
												</div>
											</a>
										</li>

										<li>
											<a href="#">
												<div class="clearfix">
													<span class="pull-left">Hardware Upgrade</span>
													<span class="pull-right">35%</span>
												</div>

												<div class="progress progress-mini">
													<div style="width:35%" class="progress-bar progress-bar-danger"></div>
												</div>
											</a>
										</li>

										<li>
											<a href="#">
												<div class="clearfix">
													<span class="pull-left">Unit Testing</span>
													<span class="pull-right">15%</span>
												</div>

												<div class="progress progress-mini">
													<div style="width:15%" class="progress-bar progress-bar-warning"></div>
												</div>
											</a>
										</li>

										<li>
											<a href="#">
												<div class="clearfix">
													<span class="pull-left">Bug Fixes</span>
													<span class="pull-right">90%</span>
												</div>

												<div class="progress progress-mini progress-striped active">
													<div style="width:90%" class="progress-bar progress-bar-success"></div>
												</div>
											</a>
										</li>
									</ul>
								</li>

								<li class="dropdown-footer">
									<a href="#">
										See tasks with details
										<i class="ace-icon fa fa-arrow-right"></i>
									</a>
								</li>
							</ul>
						</li>

						<li class="purple dropdown-modal">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#">
								<i class="ace-icon fa fa-bell icon-animated-bell"></i>
								<span class="badge badge-important">8</span>
							</a>

							<ul class="dropdown-menu-right dropdown-navbar navbar-pink dropdown-menu dropdown-caret dropdown-close">
								<li class="dropdown-header">
									<i class="ace-icon fa fa-exclamation-triangle"></i>
									8 Notifications
								</li>

								<li class="dropdown-content">
									<ul class="dropdown-menu dropdown-navbar navbar-pink">
										<li>
											<a href="#">
												<div class="clearfix">
													<span class="pull-left">
														<i class="btn btn-xs no-hover btn-pink fa fa-comment"></i>
														New Comments
													</span>
													<span class="pull-right badge badge-info">+12</span>
												</div>
											</a>
										</li>

										<li>
											<a href="#">
												<i class="btn btn-xs btn-primary fa fa-user"></i>
												Bob just signed up as an editor ...
											</a>
										</li>

										<li>
											<a href="#">
												<div class="clearfix">
													<span class="pull-left">
														<i class="btn btn-xs no-hover btn-success fa fa-shopping-cart"></i>
														New Orders
													</span>
													<span class="pull-right badge badge-success">+8</span>
												</div>
											</a>
										</li>

										
									</ul>
								</li>

								<li class="dropdown-footer">
									<a href="#">
										See all notifications
										<i class="ace-icon fa fa-arrow-right"></i>
									</a>
								</li>
							</ul>
						</li>

						<li class="green dropdown-modal">
							<a data-toggle="dropdown" class="dropdown-toggle" href="#">
								<i class="ace-icon fa fa-envelope icon-animated-vertical"></i>
								<span class="badge badge-success">5</span>
							</a>

							<ul class="dropdown-menu-right dropdown-navbar dropdown-menu dropdown-caret dropdown-close">
								<li class="dropdown-header">
									<i class="ace-icon fa fa-envelope-o"></i>
									5 Messages
								</li>

								<li class="dropdown-content">
									<ul class="dropdown-menu dropdown-navbar">
										<li>
											<a href="#" class="clearfix">
												<img src="assets/images/avatars/avatar.png" class="msg-photo" alt="Alex's Avatar" />
												<span class="msg-body">
													<span class="msg-title">
														<span class="blue">Alex:</span>
														Ciao sociis natoque penatibus et auctor ...
													</span>

													<span class="msg-time">
														<i class="ace-icon fa fa-clock-o"></i>
														<span>a moment ago</span>
													</span>
												</span>
											</a>
										</li>

									

								<li class="dropdown-footer">
									<a href="inbox.html">
										See all messages
										<i class="ace-icon fa fa-arrow-right"></i>
									</a>
								</li>
							</ul>
						</li>

						<li class="light-blue dropdown-modal">
							<a data-toggle="dropdown" href="#" class="dropdown-toggle">
								<img class="nav-user-photo" src="assets/images/avatars/user.jpg" alt="Jason's Photo" />
								<span class="user-info">
									<small>Welcome,</small>
								${USER_SESSION.adminname}
								</span>

								<i class="ace-icon fa fa-caret-down"></i>
							</a>

							<ul class="user-menu dropdown-menu-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
								<li>
									<a href="#">
										<i class="ace-icon fa fa-cog"></i>
										Settings
									</a>
								</li>

								<li>
									<a href="profile.html">
										<i class="ace-icon fa fa-user"></i>
										Profile
									</a>
								</li>

								<li class="divider"></li>

								<li>
									<a href="${pageContext.request.contextPath }/logout.action">
										<i class="ace-icon fa fa-power-off"></i>
										Logout
									</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
			</div><!-- /.navbar-container -->
		</div>

		<div class="main-container ace-save-state" id="main-container">
			<script type="text/javascript">
				try{ace.settings.loadState('main-container')}catch(e){}
			</script>

			<div id="sidebar" class="sidebar                  responsive                    ace-save-state">
				<script type="text/javascript">
					try{ace.settings.loadState('sidebar')}catch(e){}
				</script>

				<div class="sidebar-shortcuts" id="sidebar-shortcuts">
					<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
						<button class="btn btn-success">
							<i class="ace-icon fa fa-signal"></i>
						</button>

						<button class="btn btn-info">
							<i class="ace-icon fa fa-pencil"></i>
						</button>

						<button class="btn btn-warning">
							<i class="ace-icon fa fa-users"></i>
						</button>

						<button class="btn btn-danger">
							<i class="ace-icon fa fa-cogs"></i>
						</button>
					</div>

					<div class="sidebar-shortcuts-mini" id="sidebar-shortcuts-mini">
						<span class="btn btn-success"></span>

						<span class="btn btn-info"></span>

						<span class="btn btn-warning"></span>

						<span class="btn btn-danger"></span>
					</div>
				</div><!-- /.sidebar-shortcuts -->

				<ul class="nav nav-list">
					<li class="">
						<a href="index.html">
							<i class="menu-icon fa fa-tachometer"></i>
							<span class="menu-text"> Dashboard </span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-desktop"></i>
							<span class="menu-text">
								ViewDriverOnMap
							</span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="#" class="dropdown-toggle">
									<i class="menu-icon fa fa-caret-right"></i>

									Layouts
									<b class="arrow fa fa-angle-down"></b>
								</a>

								<b class="arrow"></b>

							</li>

						
							<li class="">
								<a href="treeview.html">
									<i class="menu-icon fa fa-caret-right"></i>
									####
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="jquery-ui.html">
									<i class="menu-icon fa fa-caret-right"></i>
										####
								</a>

								<b class="arrow"></b>
							</li>

							

							
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-list"></i>
							<span class="menu-text"> Tables </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="active">
								<a href="${pageContext.request.contextPath }/viewDriverManage.action">
									<i class="menu-icon fa fa-caret-right"></i>
									DriverManagement
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="jqgrid.html">
									<i class="menu-icon fa fa-caret-right"></i>
									PassengerManagement
								</a>

								<b class="arrow"></b>
							</li>
							<li class="">
								<a href="jqgrid.html">
									<i class="menu-icon fa fa-caret-right"></i>
									AdminManagement
								</a>

								<b class="arrow"></b>
							</li>
							<li class="">
							<a href="${pageContext.request.contextPath }/viewVehicleManage.action">
									<i class="menu-icon fa fa-caret-right"></i>
									VehicleManagement
								</a>

								<b class="arrow"></b>
							</li>
								<li class="">
								<a href="jqgrid.html">
									<i class="menu-icon fa fa-caret-right"></i>
									PaymentRecord
								</a>

								<b class="arrow"></b>
							</li>
							</li>
								<li class="">
								<a href="jqgrid.html">
									<i class="menu-icon fa fa-caret-right"></i>
									TripRecord
								</a>

								<b class="arrow"></b>
							</li>
						</ul>
					</li>

					<li class="">
						<a href="#" class="dropdown-toggle">
							<i class="menu-icon fa fa-pencil-square-o"></i>
							<span class="menu-text"> HelpDesk </span>

							<b class="arrow fa fa-angle-down"></b>
						</a>

						<b class="arrow"></b>

						<ul class="submenu">
							<li class="">
								<a href="form-elements.html">
									<i class="menu-icon fa fa-caret-right"></i>
									LostItem
								</a>

								<b class="arrow"></b>
							</li>

							<li class="">
								<a href="form-elements-2.html">
									<i class="menu-icon fa fa-caret-right"></i>
									Emergency
								</a>

								<b class="arrow"></b>
							</li>

							
						</ul>
					</li>

					

					<li class="">
						<a href="calendar.html">
							<i class="menu-icon fa fa-calendar"></i>

							<span class="menu-text">
								BankAccount

								<span class="badge badge-transparent tooltip-error" title="2 Important Events">
									<i class="ace-icon fa fa-exclamation-triangle red bigger-130"></i>
								</span>
							</span>
						</a>

						<b class="arrow"></b>
					</li>

					<li class="">
						<a href="gallery.html">
							<i class="menu-icon fa fa-picture-o"></i>
							<span class="menu-text"> Profile </span>
						</a>

						<b class="arrow"></b>
					</li>

				</ul><!-- /.nav-list -->

				<div class="sidebar-toggle sidebar-collapse" id="sidebar-collapse">
					<i id="sidebar-toggle-icon" class="ace-icon fa fa-angle-double-left ace-save-state" data-icon1="ace-icon fa fa-angle-double-left" data-icon2="ace-icon fa fa-angle-double-right"></i>
				</div>
			</div>

			<div class="main-content">
				<div class="main-content-inner">
					<div class="breadcrumbs ace-save-state" id="breadcrumbs">
						<ul class="breadcrumb">
							<li>
								<i class="ace-icon fa fa-home home-icon"></i>
								<a href="#">Home</a>
							</li>
							<li class="active">Widgets</li>
						</ul><!-- /.breadcrumb -->

						<div class="nav-search" id="nav-search">
							<form class="form-search">
								<span class="input-icon">
									<input type="text" placeholder="Search ..." class="nav-search-input" id="nav-search-input" autocomplete="off" />
									<i class="ace-icon fa fa-search nav-search-icon"></i>
								</span>
							</form>
						</div><!-- /.nav-search -->
					</div>

					<div class="page-content">
						<div class="ace-settings-container" id="ace-settings-container">
							<div class="btn btn-app btn-xs btn-warning ace-settings-btn" id="ace-settings-btn">
								<i class="ace-icon fa fa-cog bigger-130"></i>
							</div>

							<div class="ace-settings-box clearfix" id="ace-settings-box">
								<div class="pull-left width-50">
									<div class="ace-settings-item">
										<div class="pull-left">
											<select id="skin-colorpicker" class="hide">
												<option data-skin="no-skin" value="#438EB9">#438EB9</option>
												<option data-skin="skin-1" value="#222A2D">#222A2D</option>
												<option data-skin="skin-2" value="#C6487E">#C6487E</option>
												<option data-skin="skin-3" value="#D0D0D0">#D0D0D0</option>
											</select>
										</div>
										<span>&nbsp; Choose Skin</span>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-navbar" autocomplete="off" />
										<label class="lbl" for="ace-settings-navbar"> Fixed Navbar</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-sidebar" autocomplete="off" />
										<label class="lbl" for="ace-settings-sidebar"> Fixed Sidebar</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-breadcrumbs" autocomplete="off" />
										<label class="lbl" for="ace-settings-breadcrumbs"> Fixed Breadcrumbs</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-rtl" autocomplete="off" />
										<label class="lbl" for="ace-settings-rtl"> Right To Left (rtl)</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2 ace-save-state" id="ace-settings-add-container" autocomplete="off" />
										<label class="lbl" for="ace-settings-add-container">
											Inside
											<b>.container</b>
										</label>
									</div>
								</div><!-- /.pull-left -->

								<div class="pull-left width-50">
									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-hover" autocomplete="off" />
										<label class="lbl" for="ace-settings-hover"> Submenu on Hover</label>
									</div>

									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-compact" autocomplete="off" />
										<label class="lbl" for="ace-settings-compact"> Compact Sidebar</label>
									</div>
 
									<div class="ace-settings-item">
										<input type="checkbox" class="ace ace-checkbox-2" id="ace-settings-highlight" autocomplete="off" />
										<label class="lbl" for="ace-settings-highlight"> Alt. Active Item</label>
									</div>
								</div><!-- /.pull-left -->
							</div><!-- /.ace-settings-box -->
						</div><!-- /.ace-settings-container -->

						<div class="page-header">
							<h1>
								Dashboard
								<small>
									<i class="ace-icon fa fa-angle-double-right"></i>
									Welcome using CabManageAPP 
								</small>
							</h1>
							<button class="btn" data-toggle="modal" data-target="#newDriverDialog">
												<i class="ace-icon fa fa-pencil align-top bigger-125"></i>
												Create a Driver Account
											</button>
						</div><!-- /.page-header -->
                           
			
			<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">DriverInformation</div>
					<!-- /.panel-heading -->
					<table class="table table-bordered table-striped">
						<thead>
							<tr>
								<th>DriverId</th>
								<th>DriverName</th>
								<th>DathOfBirth</th>
								<th>Email</th>
								<th>Activated</th>
								
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${page.rows}" var="row">
								<tr>
									<td>${row.driverid}</td>
									<td>${row.drivername}</td>
									<td>${row.dob}</td>
									
									<td>${row.email}</td>
									<td>${row.activated}</td>
									
									<td>
										            <a href="#"class="btn btn-xs btn-success" data-toggle="modal" data-target="#editDriverDialog" onclick="edit('${row.driverid}');">
														<i class="ace-icon fa fa-pencil-square-o bigger-120" title="Edit"></i>
													</a>
													<a href="#"class="btn btn-xs btn-success" data-toggle="modal" data-target="#checkDriverDialog" onclick="MoreIN('${row.driverid}');">
														<i class="ace-icon fa fa-pencil-square-o bigger-120" title="MoreIN"></i>
													</a>
													
													<a href="#"class="btn btn-xs btn-danger" onclick="del('${row.driverid}');">
														<i class="ace-icon fa fa-trash-o bigger-120" title="Delete"></i>
													</a>
										
									</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
					<div class="col-md-12 text-right">
						<itheima:page url="${pageContext.request.contextPath }/viewDriverManage.action" />
					</div>
					<!-- /.panel-body -->
				</div>
				<!-- /.panel -->
			</div>
			<!-- /.col-lg-12 -->
		</div>
			
										


									<hr />
									<div class="text-center">
										<button type="reset" id="reset-widgets" class="btn btn-danger btn-white btn-bold btn-round">Reset Position/State</button>
									</div>
								</div><!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
				</div>
				
				
				
			<!-- 创建客户模态框 -->
<div class="modal fade" id="newDriverDialog" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">New_Driver</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal"  action="${pageContext.request.contextPath}/addDriver.action" 
			                       method="post" id="new_Driver_form">
					<div class="form-group">
						<label for="new_DriverName" class="col-sm-2 control-label">
						   Name
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="New_Drivername" placeholder="XXX" name="drivername" />
						</div>
					</div>	
						<div class="form-group">
						<label for="new_Driverdriverpassword" class="col-sm-2 control-label">
						  Password
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_Driverdriverpassword" placeholder="2015" name="driverpassword" />
						</div>
					</div>	
						<div class="form-group">
						<label for="new_Driverdob" class="col-sm-2 control-label">
						 Date of Birth
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_Driverdob" placeholder="2015-11-20" name="dob" />
						</div>
					</div>	
						<div class="form-group">
						<label for="new_Driverdriverstate" class="col-sm-2 control-label">
						 Driverstate
						</label>
							<div class="col-sm-10"> 
							<select	class="form-control" id="new_Driverdriverstate"  name="driverstate">
								<option value="">--please select--</option>
								
									<option value="1">
								   Online
									</option>
							<option value="0">
								    Offline
									</option>
							</select>
						</div>
						</div>
						
						<div class="form-group">
						<label for="new_Driveremail" class="col-sm-2 control-label">
						 Email
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_Driveremail" placeholder="_0@studentmail.ul.ie" name="email" />
						</div>
					</div>	
					<div class="form-group">
						<label for="new_Driverlocked" class="col-sm-2 control-label">
					   IsLocked or not
						</label>
							<div class="col-sm-10"> 
							<select	class="form-control" id="new_Driverlocked"  name="locked">
								<option value="">--please select--</option>
								
									<option value="1">
								   Locked
									</option>
							<option value="0">
								    NotLocked
									</option>
							</select>
						</div>
						
					</div>	
					<div class="form-group">
						<label for="new_Driveractivated" class="col-sm-2 control-label">
						   Is Activated or not
						</label>
					
						<div class="col-sm-10"> 
							<select	class="form-control" id="new_Driveractivated"  name="activated">
								<option value="">--please select--</option>
								
									<option value="1">
								   Activated
									</option>
							<option value="0">
								    NotActivated
									</option>
							</select>
						</div>
					</div>	
					<div class="form-group">
						<label for="new_Driversubsribed" class="col-sm-2 control-label">
						 Subscribed
						</label>
						
							<div class="col-sm-10"> 
							<select	class="form-control" id="new_Driversubscribed"  name="subscribed">
								<option value="">--please select--</option>
								
									<option value="1">
								   Subscribed
									</option>
							<option value="0">
								    NoSubscribed
									</option>
							</select>
						</div>
					</div>	
						<div class="form-group">
						<label for="new_Driver" class="col-sm-2 control-label">
						  Phonenumber
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_Driverphonenumber" placeholder="1982054" name="phonenumber" />
						</div>
					</div>	
						<div class="form-group">
						<label for="new_Driver" class="col-sm-2 control-label">
						 Address
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="new_Driveraddress" placeholder="House,Road,Town,City,Country" name="address" />
						</div>
					</div>	
					
					<input name="driverid" id="new_Driverdriverid" type="hidden" class="form-control"  aria-describedby="sizing-addon1" />
					<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancle</button>
				<button type="submit" class="btn btn-primary" >Submit</button>
			</div>
				</form>
			</div>
			
		</div>
	</div>
</div>
				
				
			<!-- 创建客户模态框 -->
<div class="modal fade" id="editDriverDialog" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">editDriver</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal"  action="${pageContext.request.contextPath }/updateDriver.action" 
			                       method="post" id="edit_Driver_form">
					<div class="form-group">
						<label for="edit_DriverName" class="col-sm-2 control-label">
						   Name
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="editDriverdrivername" placeholder="XXX" name="drivername" value=""/>
						</div>
					</div>	
						<div class="form-group">
						<label for="edit_Driverdriverpassword" class="col-sm-2 control-label">
						  Password
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="editDriverdriverpassword" placeholder="2015" name="driverpassword" value=""/>
						</div>
					</div>	
						<div class="form-group">
						<label for="editDriverdob" class="col-sm-2 control-label">
						 Date of Birth
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="editDriverdob" placeholder="2015-11-20" name="dob" value=""/>
						</div>
					</div>	
						<div class="form-group">
						<label for="editDriverdriverstate" class="col-sm-2 control-label">
						 State
						</label>
							<div class="col-sm-10"> 
							<select	class="form-control" id="editDriverdriverstate"  name="driverstate">
								<option value="">--please select--</option>
								
									<option value="1">
								   Online
									</option>
							<option value="0">
								    Offline
									</option>
							</select>
						</div>
					</div>	
						<div class="form-group">
						<label for="editDriveremail" class="col-sm-2 control-label">
						 Email
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="editDriveremail" placeholder="_0@studentmail.ul.ie" name="email"value="" />
						</div>
					</div>	
					<div class="form-group">
						<label for="editDriverlocked" class="col-sm-2 control-label">
					   IsLocked or not
						</label>
							<div class="col-sm-10"> 
							<select	class="form-control" id="editDriverlocked"  name="locked" value="">
								<option value="">--please select--</option>
								
									<option value="1">
								   Locked
									</option>
							<option value="0">
								    NotLocked
									</option>
							</select>
						</div>
						
					</div>	
					<div class="form-group">
						<label for="editDriveractivated" class="col-sm-2 control-label">
						   Is Activated or not
						</label>
					
						<div class="col-sm-10"> 
							<select	class="form-control" id="editDriveractivated"  name="activated" value="">
								<option value="">--please select--</option>
								
									<option value="1">
								   Activated
									</option>
							<option value="0">
								    NotActivated
									</option>
							</select>
						</div>
					</div>	
					<div class="form-group">
						<label for="edit_Driverloginattempts" class="col-sm-2 control-label" >
						Loginattempts
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="editDriverloginattempts" placeholder="0" name="loginattempts"value="" />
						</div>
					</div>	
						<div class="form-group">
						<label for="edit_Driverloginattempts" class="col-sm-2 control-label">
					lastlogin
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="editDriverlastlogin" placeholder="0" name="lastlogin"value="" />
						</div>
					</div>	
					<div class="form-group">
						<label for="editDriversubscribed" class="col-sm-2 control-label">
						 Subscribed
						</label>
						
							<div class="col-sm-10"> 
							<select	class="form-control" id="editDriversubscribed"  name="subscribed" value="">
								<option value="">--please select--</option>
								
									<option value="1">
								   Subscribed
									</option>
							<option value="0">
								    NoSubscribed
									</option>
							</select>
						</div>
					</div>	
						<div class="form-group">
						<label for="new_Driver" class="col-sm-2 control-label">
						  PhonenumbereditDriverphonenumber
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="editDriverphonenumber" placeholder="1982054" name="phonenumber"value="" />
						</div>
					</div>	
						<div class="form-group">
						<label for="editDriveraddress" class="col-sm-2 control-label">
						 Address
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="editDriveraddress" placeholder="House,Road,Town,City,Country" name="address"value="" />
						</div>
					</div>	
					
					<input name="driverid" id="editDriverdriverid" type="hidden" class="form-control"  aria-describedby="sizing-addon1" value=""/>
					<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancle</button>
				<button type="submit" class="btn btn-primary" >Submit</button>
			</div>
				</form>
			</div>
			
		</div>
	</div>
</div>
	
			<!-- 创建客户模态框 -->
<div class="modal fade" id="CheckDriverDialog" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel">
	<div class="modal-dialog" role="document">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal" aria-label="Close">
					<span aria-hidden="true">&times;</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">学院</h4>
			</div>
			<div class="modal-body">
				<form class="form-horizontal"  action="${pageContext.request.contextPath }/managercollege/updatecollegeInfor.action" 
			                       method="post" id="new_customer_form">
					<div class="form-group">
						<label for="new_customerName" class="col-sm-2 control-label">
						   学院名
						</label>
						<div class="col-sm-10">
							<input type="text" class="form-control" id="collegename" placeholder="2015" name="collegename" />
						</div>
					</div>	
					
					
					<input name="collegeid" id="collegeid" type="hidden" class="form-control"  aria-describedby="sizing-addon1" />
					<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
				<button type="submit" class="btn btn-primary" >创建</button>
			</div>
				</form>
			</div>
			
		</div>
	</div>
</div>	
			<!-- 创建客户模态框 -->

				
				
				
				
				
				
			</div><!-- /.main-content -->

			<div class="footer">
				<div class="footer-inner">
					<div class="footer-content">
						<span class="bigger-120">
							<span class="blue bolder">CabManageApplication</span>
							Application &copy; 2019-2020
						</span>

						&nbsp; &nbsp;
						<span class="action-buttons">
							<a href="#">
								<i class="ace-icon fa fa-twitter-square light-blue bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-facebook-square text-primary bigger-150"></i>
							</a>

							<a href="#">
								<i class="ace-icon fa fa-rss-square orange bigger-150"></i>
							</a>
						</span>
					</div>
				</div>
			</div>

			<a href="#" id="btn-scroll-up" class="btn-scroll-up btn btn-sm btn-inverse">
				<i class="ace-icon fa fa-angle-double-up icon-only bigger-110"></i>
			</a>
		</div><!-- /.main-container -->

		<!-- basic scripts -->

		<!--[if !IE]> -->
	<script src="${pageContext.request.contextPath }/assets/js/jquery-2.1.4.min.js"></script>
		<!-- <![endif]-->

		<!--[if !IE]> -->
<!--	<script src="${pageContext.request.contextPath }/assets/js/jquery-1.11.3.min.js"></script>-->

		<script type="text/javascript">
			if('ontouchstart' in document.documentElement) document.write("<script src='${pageContext.request.contextPath }/assets/js/jquery.mobile.custom.min.js'>"+"<"+"/script>");
		</script>
		<script src="${pageContext.request.contextPath }/assets/js/bootstrap.min.js"></script>

		<!-- page specific plugin scripts -->
		<script src="${pageContext.request.contextPath }/assets/js/jquery-ui.custom.min.js"></script>
		<script src="${pageContext.request.contextPath }/assets/js/jquery.ui.touch-punch.min.js"></script>

		<!-- ace scripts -->
		<script src="${pageContext.request.contextPath }/assets/js/ace-elements.min.js"></script>
		<script src="${pageContext.request.contextPath }/assets/js/ace.min.js"></script>

		<!-- inline scripts related to this page -->
		<script type="text/javascript">	
		function edit(id) {
			$.ajax({
		        type:"Post",
		        url:"<%=basePath%>checkDriver.action",
		        data:{"id":id},
		        success:function(data) {  
		        	$("#editDriverdriverid").val(data.driverid);
		            $("#editDriverdrivername").val(data.drivername);
		            $("#editDriverdob").val(data.dob);
		            $("#editDriverdriverstate").val(changeBooleantoint(data.driverstate));
		            $("#editDriveremail").val(data.email);
		            $("#editDriverlocked").val(changeBooleantoint(data.locked));
		            $("#editDriverlastlogin").val(data.lastlogin);
		            
		            $("#editDriveractivated").val(changeBooleantoint(data.activated));
		            $("#editDriversubscribed").val(changeBooleantoint(data.subscribed));
		            $("#editDriverphonenumber").val(data.phonenumber);
		            $("#editDriveraddress").val(data.address);
		            $("#editDriverdriverpassword").val(data.driverpassword);
		            $("#editDriverloginattempts").val(data.loginattempts);
		        },
		    });    		     
			}
		function changeBooleantoint(string){
			var data=0;
			if (string=="True")
				{
				data=1;
				return data;
				}
			return data;
			
		}
			//删除用户
		function del(id) {
		    if(confirm('Confirm Delete Action')) {
		$.post("<%=basePath%>deleteDriver.action",{"id":id},
		function(data){
		            if(data =="OK"){
		                alert("Delete Success");
		                window.location.reload();
		            }else{
		                alert("Delete Failed");
		                window.location.reload();
		            }
		        });
		    }
		}
		function MoreIN(id) {
		
			}</script>
		<script type="text/javascript">
			jQuery(function($) {
			
				$('#simple-colorpicker-1').ace_colorpicker({pull_right:true}).on('change', function(){
					var color_class = $(this).find('option:selected').data('class');
					var new_class = 'widget-box';
					if(color_class != 'default')  new_class += ' widget-color-'+color_class;
					$(this).closest('.widget-box').attr('class', new_class);
				});
			
			
				// scrollables
				$('.scrollable').each(function () {
					var $this = $(this);
					$(this).ace_scroll({
						size: $this.attr('data-size') || 100,
						//styleClass: 'scroll-left scroll-margin scroll-thin scroll-dark scroll-light no-track scroll-visible'
					});
				});
				$('.scrollable-horizontal').each(function () {
					var $this = $(this);
					$(this).ace_scroll(
					  {
						horizontal: true,
						styleClass: 'scroll-top',//show the scrollbars on top(default is bottom)
						size: $this.attr('data-size') || 500,
						mouseWheelLock: true
					  }
					).css({'padding-top': 12});
				});
				
				$(window).on('resize.scroll_reset', function() {
					$('.scrollable-horizontal').ace_scroll('reset');
				});
			
				
				$('#id-checkbox-vertical').prop('checked', false).on('click', function() {
					$('#widget-toolbox-1').toggleClass('toolbox-vertical')
					.find('.btn-group').toggleClass('btn-group-vertical')
					.filter(':first').toggleClass('hidden')
					.parent().toggleClass('btn-toolbar')
				});
			
				/**
				//or use slimScroll plugin
				$('.slim-scrollable').each(function () {
					var $this = $(this);
					$this.slimScroll({
						height: $this.data('height') || 100,
						railVisible:true
					});
				});
				*/
				
			
				/**$('.widget-box').on('setting.ace.widget' , function(e) {
					e.preventDefault();
				});*/
			
				/**
				$('.widget-box').on('show.ace.widget', function(e) {
					//e.preventDefault();
					//this = the widget-box
				});
				$('.widget-box').on('reload.ace.widget', function(e) {
					//this = the widget-box
				});
				*/
			
				//$('#my-widget-box').widget_box('hide');
			
				
			
				// widget boxes
				// widget box drag & drop example
			    $('.widget-container-col').sortable({
			        connectWith: '.widget-container-col',
					items:'> .widget-box',
					handle: ace.vars['touch'] ? '.widget-title' : false,
					cancel: '.fullscreen',
					opacity:0.8,
					revert:true,
					forceHelperSize:true,
					placeholder: 'widget-placeholder',
					forcePlaceholderSize:true,
					tolerance:'pointer',
					start: function(event, ui) {
						//when an element is moved, it's parent becomes empty with almost zero height.
						//we set a min-height for it to be large enough so that later we can easily drop elements back onto it
						ui.item.parent().css({'min-height':ui.item.height()})
						//ui.sender.css({'min-height':ui.item.height() , 'background-color' : '#F5F5F5'})
					},
					update: function(event, ui) {
						ui.item.parent({'min-height':''})
						//p.style.removeProperty('background-color');
			
						
						//save widget positions
						var widget_order = {}
						$('.widget-container-col').each(function() {
							var container_id = $(this).attr('id');
							widget_order[container_id] = []
							
							
							$(this).find('> .widget-box').each(function() {
								var widget_id = $(this).attr('id');
								widget_order[container_id].push(widget_id);
								//now we know each container contains which widgets
							});
						});
						
						ace.data.set('demo', 'widget-order', widget_order, null, true);
					}
			    });
				
				
				///////////////////////
			
				//when a widget is shown/hidden/closed, we save its state for later retrieval
				$(document).on('shown.ace.widget hidden.ace.widget closed.ace.widget', '.widget-box', function(event) {
					var widgets = ace.data.get('demo', 'widget-state', true);
					if(widgets == null) widgets = {}
			
					var id = $(this).attr('id');
					widgets[id] = event.type;
					ace.data.set('demo', 'widget-state', widgets, null, true);
				});
			
			
				(function() {
					//restore widget order
					var container_list = ace.data.get('demo', 'widget-order', true);
					if(container_list) {
						for(var container_id in container_list) if(container_list.hasOwnProperty(container_id)) {
			
							var widgets_inside_container = container_list[container_id];
							if(widgets_inside_container.length == 0) continue;
							
							for(var i = 0; i < widgets_inside_container.length; i++) {
								var widget = widgets_inside_container[i];
								$('#'+widget).appendTo('#'+container_id);
							}
			
						}
					}
					
					
					//restore widget state
					var widgets = ace.data.get('demo', 'widget-state', true);
					if(widgets != null) {
						for(var id in widgets) if(widgets.hasOwnProperty(id)) {
							var state = widgets[id];
							var widget = $('#'+id);
							if
							(
								(state == 'shown' && widget.hasClass('collapsed'))
								||
								(state == 'hidden' && !widget.hasClass('collapsed'))
							) 
							{
								widget.widget_box('toggleFast');
							}
							else if(state == 'closed') {
								widget.widget_box('closeFast');
							}
						}
					}
					
					
					$('#main-widget-container').removeClass('invisible');
					
					
					//reset saved positions and states
					$('#reset-widgets').on('click', function() {
						ace.data.remove('demo', 'widget-state');
						ace.data.remove('demo', 'widget-order');
						document.location.reload();
					});
				
				})();
			
			});
			
		
			
			
			
			
		</script>
		
	</body>
</html>
