<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<script>
	$(document).ready(function() {

		//화면 초기화
		$("#menuStokaStokDash").click(function(){

		});

	});
</script>

	<div class="container-fluid">

		<!-- 카드형 간략 보기 -->

		<div class="row">
			<div class="col-lg-6 col-md-12">
				<div class="card">
					<div class="card-header card-header-tabs card-header-primary">
						<div class="nav-tabs-navigation">
							<div class="nav-tabs-wrapper">
								<span class="nav-tabs-title">Tasks:</span>
								<ul class="nav nav-tabs" data-tabs="tabs">
<!-- 									<li class="nav-item"> -->
<!-- 										<a class="nav-link active" href="#profile" data-toggle="tab"> -->
<!-- 											<i class="material-icons">bug_report</i> Bugs -->
<!-- 											<div class="ripple-container"></div> -->
<!-- 										</a> -->
<!-- 									</li> -->
									<li class="nav-item">
										<a class="nav-link" href="#messages" data-toggle="tab">
											<i class="material-icons">code</i> 공사중인부분
											<div class="ripple-container"></div>
										</a>
									</li>
<!-- 									<li class="nav-item"> -->
<!-- 										<a class="nav-link" href="#settings" data-toggle="tab"> -->
<!-- 											<i class="material-icons">cloud</i> Server -->
<!-- 											<div class="ripple-container"></div> -->
<!-- 										</a> -->
<!-- 									</li> -->
								</ul>
							</div>
						</div>
					</div>
					<div class="card-body">
						<div class="tab-content">
							<div class="tab-pane active" id="profile">
								<table class="table">
									<tbody>
										<tr>
											<td>
												<div class="form-check">
													<label class="form-check-label">
														<input class="form-check-input" type="checkbox" value="" checked>
														<span class="form-check-sign">
															<span class="check"></span>
														</span>
													</label>
												</div>
											</td>
											<td>주식 리스트 관리 및 크롤러 작동계기판 만들기(착수)</td>
											<td class="td-actions text-right">
												<button type="button" rel="tooltip" title="Edit Task" class="btn btn-primary btn-link btn-sm">
													<i class="material-icons">edit</i>
												</button>
												<button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-link btn-sm">
													<i class="material-icons">close</i>
												</button>
											</td>
										</tr>

										<tr>
											<td>
												<div class="form-check">
													<label class="form-check-label">
														<input class="form-check-input" type="checkbox" value="" checked>
														<span class="form-check-sign">
															<span class="check"></span>
														</span>
													</label>
												</div>
											</td>
											<td>화면 분석 및 공사판 설치 (2020-08-17 완료)</td>
											<td class="td-actions text-right">
												<button type="button" rel="tooltip" title="Edit Task" class="btn btn-primary btn-link btn-sm">
													<i class="material-icons">edit</i>
												</button>
												<button type="button" rel="tooltip" title="Remove" class="btn btn-danger btn-link btn-sm">
													<i class="material-icons">close</i>
												</button>
											</td>
										</tr>


									</tbody>
								</table>
							</div>
						</div>
					</div>
				</div>
			</div>
<!-- 			<div class="col-lg-6 col-md-12"> -->
<!-- 				<div class="card"> -->
<!-- 					<div class="card-header card-header-warning"> -->
<!-- 						<h4 class="card-title">Employees Stats</h4> -->
<!-- 						<p class="card-category">New employees on 15th September, 2016</p> -->
<!-- 					</div> -->
<!-- 					<div class="card-body table-responsive"> -->
<!-- 						<table class="table table-hover"> -->
<!-- 							<thead class="text-warning"> -->
<!-- 								<th>ID</th> -->
<!-- 								<th>Name</th> -->
<!-- 								<th>Salary</th> -->
<!-- 								<th>Country</th> -->
<!-- 							</thead> -->
<!-- 							<tbody> -->
<!-- 								<tr> -->
<!-- 									<td>1</td> -->
<!-- 									<td>Dakota Rice</td> -->
<!-- 									<td>$36,738</td> -->
<!-- 									<td>Niger</td> -->
<!-- 								</tr> -->
<!-- 								<tr> -->
<!-- 									<td>2</td> -->
<!-- 									<td>Minerva Hooper</td> -->
<!-- 									<td>$23,789</td> -->
<!-- 									<td>Curaçao</td> -->
<!-- 								</tr> -->
<!-- 								<tr> -->
<!-- 									<td>3</td> -->
<!-- 									<td>Sage Rodriguez</td> -->
<!-- 									<td>$56,142</td> -->
<!-- 									<td>Netherlands</td> -->
<!-- 								</tr> -->
<!-- 								<tr> -->
<!-- 									<td>4</td> -->
<!-- 									<td>Philip Chaney</td> -->
<!-- 									<td>$38,735</td> -->
<!-- 									<td>Korea, South</td> -->
<!-- 								</tr> -->
<!-- 							</tbody> -->
<!-- 						</table> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!--  			</div> -->
			</div>
		</div>

