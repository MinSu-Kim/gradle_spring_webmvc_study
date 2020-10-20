<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="login" action="result" method="get">
		<label for="loginType">로그인 타입</label>
		<form:select path="loginType">
			<option value="">--- 선택하세요---</option>
			<form:options items="${loginTypes}" />
		</form:select>
		<br>
		<label for="jobCode">직군</label>
        <form:select path="jobCode.code">
            <option value="">-- 선택하세요---</option>
            <form:options items="${jobCodes}" itemValue="code" itemLabel="label" />
        </form:select>
        
        <br>
        <label for="favoriteOs">선호 OS</label><br>
        <form:checkboxes items="${favoriteOsNames}" path="favoriteOs" /><br>
        
        <br>
		<form:checkbox path="allowNoti" label="이메일을 수신합니다." /><br>

		<label>주로 사용하는 개발 툴</label>
		<br>
		<form:radiobuttons items="${tools}" path="tool" />

		<label for="etc"> 기타 </label> <br>
		<form:textarea path="etc" cols="20" rows="3" />

		<input type="submit" value="결과보기">
	</form:form>
</body>
</html>


<%--
 <label for="osCodes">선호 OS</label><br>
        <form:checkboxes items="${osCodeNames}" itemValue="code" itemLabel="label" path="osCodes" delimiter="<br>"/>
        
        <label for="favoriteOs">선호 OS</label><br>
        <form:checkboxes items="${favoriteOsNames}" path="favoriteOs" /><br>

--%>