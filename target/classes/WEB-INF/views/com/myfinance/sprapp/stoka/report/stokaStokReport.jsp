<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="false"%>
<% request.setCharacterEncoding("utf-8"); %>
<% response.setContentType("text/html; charset=utf-8"); %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<script>

	//화면초기화
	$(document).ready(function() {

		//초기화 call 쓰는 곳
		$("#menuStokaStokReport").click(function(){


		});

		$("#StockReportBtn").click(function(){
			ReportStock();

			});

	});

	//insert stock
	function ReportStock(){
		var sendData = {}

		$.ajax({
			url:'/stoka/stokaCrawlStart.do'
			, type:'post'
			, data:JSON.stringify(sendData)
			, contentType: 'application/json; charset=UTF-8'
			, timeout: 10000
            , datatype: 'json'
			, success:function(data){

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
						<h4 class="card-title ">분석쏜다!</h4>
						<p class="card-category"> 로그를 확인하거라.</p>
					</div>
					<div class="card-body">
						<div class="table-responsive">
							<table class="table">
								<tbody>
									<tr>
										<td>
											<input type="button" id="StockReportBtn" class="btn btn-primary pull-right" value="분석쏴!"/>
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

