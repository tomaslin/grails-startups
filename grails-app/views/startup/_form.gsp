<%@ page import="com.grailsstartups.Startup" %>



<div class="fieldcontain ${hasErrors(bean: startupInstance, field: 'approved', 'error')} ">
	<label for="approved">
		<g:message code="startup.approved.label" default="Approved" />
		
	</label>
	<g:checkBox name="approved" value="${startupInstance?.approved}" />
</div>

<div class="fieldcontain ${hasErrors(bean: startupInstance, field: 'description', 'error')} ">
	<label for="description">
		<g:message code="startup.description.label" default="Description" />
		
	</label>
	<g:textField name="description" value="${startupInstance?.description}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: startupInstance, field: 'image', 'error')} ">
	<label for="image">
		<g:message code="startup.image.label" default="Image" />
		
	</label>
	<g:textField name="image" value="${startupInstance?.image}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: startupInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="startup.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${startupInstance?.name}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: startupInstance, field: 'twitter', 'error')} ">
	<label for="twitter">
		<g:message code="startup.twitter.label" default="Twitter" />
		
	</label>
	<g:textField name="twitter" value="${startupInstance?.twitter}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: startupInstance, field: 'website', 'error')} ">
	<label for="website">
		<g:message code="startup.website.label" default="Website" />
		
	</label>
	<g:textField name="website" value="${startupInstance?.website}"/>
</div>

