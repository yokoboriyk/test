<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Index</title>
</head>
<body>
 <s:form action="HelloStrutsAction">
  <s:submit value="HelloStruts"/>
  </s:form>

  <s:form actino="WelcomeAction">
   <s:submit value="Welcome"/>
   </s:form>

</body>
</html>