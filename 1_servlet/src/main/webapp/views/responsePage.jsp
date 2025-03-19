<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>응답용 페이지</title>
</head>
<body>
    <!-- html 주석 -->
    <%-- JSP 주석 --%>
	<h1>##응답 완료##</h1>

    <%-- 자바 코드 작성하기 --%>
    <%
        // System.out.println("Hi~ JSP!?");
        // 스크립틀릿 (Scriptlet) : HTML 내에서 Java코드를 작성할 수 있는 영역
        String name = (String) request.getAttribute("name");
        String gender = (String) request.getAttribute("gender");
        String age = (String)request.getAttribute("age");
        String addr = (String)request.getAttribute("addr");
        String height = (String)request.getAttribute("height");
        String[] foods = (String[])request.getAttribute("foods");
    %>
    
    이름 : <span><%= name %></span>
    성별 : <span><%= gender %></span>
    나이 : <span><%= age %></span>
    주소 : <span><%= addr %></span>
    키 : <span><%= height %></span>
</body>
</html>