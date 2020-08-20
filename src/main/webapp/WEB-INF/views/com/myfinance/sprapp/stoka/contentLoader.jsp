<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<script>

</script>
<div class="content">

	<div class="divToggler" id="divStokaStokDash" >
		<jsp:include page="crawlSetting/stokaStokDash.jsp" />
	</div>
	<div class="divToggler" id="divPerson" style='display:none'>
		사람토글
	</div>
	<div class="divToggler" id="divStokaStokList" style='display:none'>
		<jsp:include page="crawlSetting/stokaStokList.jsp" />
	</div>
	<div class="divToggler" id="divStokaStokReport" style='display:none'>
		<jsp:include page="report/stokaStokReport.jsp" />
	</div>

</div>