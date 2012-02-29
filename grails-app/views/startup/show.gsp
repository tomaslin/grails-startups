
<%@ page import="com.grailsstartups.Startup" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'startup.label', default: 'Startup')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-startup" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-startup" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list startup">
			
				<g:if test="${startupInstance?.approved}">
				<li class="fieldcontain">
					<span id="approved-label" class="property-label"><g:message code="startup.approved.label" default="Approved" /></span>
					
						<span class="property-value" aria-labelledby="approved-label"><g:formatBoolean boolean="${startupInstance?.approved}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${startupInstance?.description}">
				<li class="fieldcontain">
					<span id="description-label" class="property-label"><g:message code="startup.description.label" default="Description" /></span>
					
						<span class="property-value" aria-labelledby="description-label"><g:fieldValue bean="${startupInstance}" field="description"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${startupInstance?.image}">
				<li class="fieldcontain">
					<span id="image-label" class="property-label"><g:message code="startup.image.label" default="Image" /></span>
					
						<span class="property-value" aria-labelledby="image-label"><g:fieldValue bean="${startupInstance}" field="image"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${startupInstance?.name}">
				<li class="fieldcontain">
					<span id="name-label" class="property-label"><g:message code="startup.name.label" default="Name" /></span>
					
						<span class="property-value" aria-labelledby="name-label"><g:fieldValue bean="${startupInstance}" field="name"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${startupInstance?.twitter}">
				<li class="fieldcontain">
					<span id="twitter-label" class="property-label"><g:message code="startup.twitter.label" default="Twitter" /></span>
					
						<span class="property-value" aria-labelledby="twitter-label"><g:fieldValue bean="${startupInstance}" field="twitter"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${startupInstance?.website}">
				<li class="fieldcontain">
					<span id="website-label" class="property-label"><g:message code="startup.website.label" default="Website" /></span>
					
						<span class="property-value" aria-labelledby="website-label"><g:fieldValue bean="${startupInstance}" field="website"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${startupInstance?.id}" />
					<g:link class="edit" action="edit" id="${startupInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
