<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ include file ="top_user.jsp" %>
<!DOCTYPE html>
<!--
--------------------------------------------------------------
* Description 	: User Purchase page
*  Detail		: 주문/결제페이지 
* Author 		: LS
* Date 			: 2024.02.016
* ---------------------------Update---------------------------		
* 
--------------------------------------------------------------
-->	

<html lang="ko">
<head>
<meta charset="UTF-8">
<title>주문/결제 페이지</title>
</head>
<body>
    <h1>주문/결제</h1>
    <hr>
    
    <h2>구매자 정보</h2>
        <br>
        
    <h2>결제 정보</h2>
        <br>
        
        	
  		<form action="purchasecomplete.do" method="post">
            <input type="submit" value="결제하기">
        </form>
    
     <script src="https://code.jquery.com/jquery-3.6.4.min.js"></script>
    <script src="purchase.js"></script>
</body>
</html>