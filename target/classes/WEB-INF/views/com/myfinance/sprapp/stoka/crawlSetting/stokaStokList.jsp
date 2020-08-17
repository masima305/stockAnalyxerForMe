<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<% request.setCharacterEncoding("utf-8"); %>
<% response.setContentType("text/html; charset=utf-8"); %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script>

	//화면초기화
	$(document).ready(function() {

		$("#menuStokaStokList").click(function(){
			callStokList();

		});

	});


	function callStokList(){

		var sendData = {}

		$.ajax({
			url:'/stoka/stokaStokList.do'
			, type:'post'
			, data:sendData
			,contentType: 'application/x-www-form-urlencoded; charset=euc-kr'
			, timeout: 10000
            , datatype: 'json'
			, success:function(data){

				//jsontext에 JSON객체를 넣는다.
				var jsontext = data;

				//JSON.parse를 이용해 jsontext를 파싱해 리스트(javascript list)로 만든후 contact에 넣어준다.
				var contact = JSON.parse(jsontext);

				console.log(contact);

			}
		});
	}
</script>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header card-header-primary">
						<h4 class="card-title ">Simple Table</h4>
						<p class="card-category"> Here is a subtitle for this table</p>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table">
								<thead class=" text-primary">
									<th>
										ID
									</th>
									<th>
										Name
									</th>
									<th>
										Country
									</th>
									<th>
										City
									</th>
									<th>
										Salary
									</th>
								</thead>
								<tbody>
									<tr>
										<td>
											1
										</td>
										<td>
											Dakota Rice
										</td>
										<td>
											Niger
										</td>
										<td>
											Oud-Turnhout
										</td>
										<td class="text-primary">
											$36,738
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

