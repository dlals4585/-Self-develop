<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>[kakaoMap]</title>
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=584e21e91778f272958c9657fa118847&libraries=services,clusterer,drawing"></script>
	
</head>
<body>
	<table id="table" width="60" height="10" border="1" cellpadding="1">
		<tr>
			<td>test</td>
		</tr>
		<tr>
			<td>test</td>
			<td>
				<div id="map" style="width: 500px; height: 400px;"></div> <script
					type="text/javascript">
					var container = document.getElementById('map'); //������ ���� ������ DOM ���۷���
					var options = { //������ ������ �� �ʿ��� �⺻ �ɼ�
						center : new kakao.maps.LatLng(33.450701, 126.570667), //������ �߽���ǥ.
						level : 3
					//������ ����(Ȯ��, ��� ����)
					};
					var map = new kakao.maps.Map(container, options); //���� ���� �� ��ü ����
				</script>
			</td>
		</tr>
	</table>

	
</body>
</html>