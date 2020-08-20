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

		$("#insertStockBtn").click(function(){
			alert("func is ready but closed")
			//insertStock();

			});

	});

	//insert stock
	function insertStock(){
		var sendData = {}

		//need valueCheck
		sendData.stokNm = $("#inpStokNm").val();
		sendData.stokId = $("#inpStokId").val();

		$.ajax({
			url:'/stoka/stokaInsertStok.do'
			, type:'post'
			, data:JSON.stringify(sendData)
			, contentType: 'application/json; charset=UTF-8'
			, timeout: 10000
            , datatype: 'json'
			, success:function(data){

				callStokList();
				alert(data);
				}
		});
	}

	function callStokList(){
		var sendData = {}
		$.ajax({
			url:'/stoka/stokaStokList.do'
			, type:'post'
			, data:sendData
			//, contentType: 'application/x-www-form-urlencoded; charset=euc-kr'
			, timeout: 10000
            , datatype: 'json'
			, success:function(data){

				//jsontext에 JSON객체를 넣는다.
				var jsontext = data;

				//JSON.parse를 이용해 jsontext를 파싱해 리스트(javascript list)로 만든후 contact에 넣어준다.
				var contact = JSON.parse(jsontext);

				reDrawStockList(contact);
				}
		});
	}

	function reDrawStockList(data){
		var stokId;
		var stokNm;
		var rnum;
		var stockListTmplt;
		$("#targetStockList").html(" ");
		for(var i = 0 ; i < data.length ; i++){
			stockListTmplt =
			"<tr><td>"+i+
			"</td><td>"+data[i].stokNm+
			"</td><td>"+data[i].stokId+
			"</td><td><input type='button' value='func'/></td></tr>";
			$("#targetStockList").append(stockListTmplt);
		}
	}
	//managedStockList
</script>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header card-header-primary">
						<h4 class="card-title ">주식등록</h4>
						<p class="card-category"> 주식코드와 주식 이름을 등록해주세요</p>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table">
								<tbody>
									<tr>
										<td>
											<input type="text" id="inpStokNm" name="stokNm" class="form-control" placeholder="stock_Name">
										</td>
										<td>
											<input type="text" id="inpStokId" name="stokId" class="form-control" placeholder="stock_code">
										</td>
										<td>
											<input type="button" id="insertStockBtn" class="btn btn-primary pull-right" value="insert"/>
										</td>
									</tr>
								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="card">
					<div class="card-header card-header-primary">
						<h4 class="card-title ">관리하고 있는 주식 리스트</h4>
						<p class="card-category"> 지금 분석기가 관리하고 있는 주식 리스트입니다.</p>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table">
								<thead class=" text-primary">
									<th>
										rum
									</th>
									<th>
										Stock Name
									</th>
									<th>
										Stock Code
									</th>
									<th>
										func
										<!-- delete... favorite... buy... cell... trace... -->
									</th>
								</thead>
								<tbody id="targetStockList">

								</tbody>
							</table>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

