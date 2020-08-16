<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>




<div class="sidebar" data-color="azure" data-background-color="white" data-image="${webappRoot}/resources/statics/assets/img/sidebar-1.jpg">

	<!--         Tip 1: You can change the color of the sidebar using: data-color="purple | azure | green | orange | danger" -->
	<!--         Tip 2: you can also add an image using data-image tag -->

	<div class="logo">
		<span class="simple-text logo-normal">
			주식분석가 STOKA
		</span>
	</div>
	<div class="sidebar-wrapper">
		<ul class="nav">
			<li class="nav-item active">
				<a class="nav-link" href="./dashboard.html">
					<i class="material-icons">dashboard</i>
					<p>현황판</p>
				</a>
			</li>

			<li class="nav-item">
				<a class="nav-link" href="./user.html">
					<i class="material-icons">person</i>
					<p>사용자관리</p>
				</a>
			</li>

			<li class="nav-item ">
				<a class="nav-link" href="./tables.html">
					<i class="material-icons">content_paste</i>
					<p>테이블리스트</p>
				</a>
			</li>

			<li class="nav-item ">
				<a class="nav-link" href="./typography.html">
					<i class="material-icons">library_books</i>
					<p>Typography</p>
				</a>
			</li>

			<li class="nav-item ">
				<a class="nav-link" href="./icons.html">
					<i class="material-icons">bubble_chart</i>
					<p>Icons</p>
				</a>
			</li>

			<li class="nav-item ">
				<a class="nav-link" href="./map.html">
					<i class="material-icons">location_ons</i>
					<p>Maps</p>
				</a>
			</li>

			<li class="nav-item ">
				<a class="nav-link" href="./notifications.html">
					<i class="material-icons">notifications</i>
					<p>Notifications</p>
				</a>
			</li>

			<li class="nav-item ">
				<a class="nav-link" href="./rtl.html">
					<i class="material-icons">language</i>
					<p>RTL Support</p>
				</a>
			</li>

			<li class="nav-item active-pro ">
				<a class="nav-link" href="./upgrade.html">
					<i class="material-icons">unarchive</i>
					<p>Upgrade to PRO</p>
				</a>
			</li>
		</ul>
	</div>
</div>