
<%@ page import="com.grailsstartups.Startup" %>
<!doctype html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'startup.label', default: 'Startup')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-startup" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-startup" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="approved" title="${message(code: 'startup.approved.label', default: 'Approved')}" />
					
						<g:sortableColumn property="description" title="${message(code: 'startup.description.label', default: 'Description')}" />
					
						<g:sortableColumn property="image" title="${message(code: 'startup.image.label', default: 'Image')}" />
					
						<g:sortableColumn property="name" title="${message(code: 'startup.name.label', default: 'Name')}" />
					
						<g:sortableColumn property="twitter" title="${message(code: 'startup.twitter.label', default: 'Twitter')}" />
					
						<g:sortableColumn property="website" title="${message(code: 'startup.website.label', default: 'Website')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${startupInstanceList}" status="i" var="startupInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${startupInstance.id}">${fieldValue(bean: startupInstance, field: "approved")}</g:link></td>
					
						<td>${fieldValue(bean: startupInstance, field: "description")}</td>
					
						<td>${fieldValue(bean: startupInstance, field: "image")}</td>
					
						<td>${fieldValue(bean: startupInstance, field: "name")}</td>
					
						<td>${fieldValue(bean: startupInstance, field: "twitter")}</td>
					
						<td>${fieldValue(bean: startupInstance, field: "website")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${startupInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
