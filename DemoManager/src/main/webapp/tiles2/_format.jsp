<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
	<head>
		<title>Welcome to Tiles2</title>
	</head>
	<body>
		<table>
			<tr>
				<td colspan="2"><tiles:insertAttribute name="_header" /></td>
			</tr>
			<tr>
				<td>LNB</td>
				<td><tiles:insertAttribute name="_content" /></td>
			</tr>
			<tr>
				<td colspan="2"><tiles:insertAttribute name="_footer" /></td>
			</tr>
		</table>
	</body>
</html>