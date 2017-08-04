<%@ taglib uri="/WEB-INF/struts-form.tld" prefix="form"%>
<form:form action="register.do"> 
UserName:<form:text property="username" />
	<br> 
enter password:<form:password property="password1" />
	<br> 
re-enter password:<form:password property="password2" />
	<br>
	<form:submit value="Register" />
</form:form>