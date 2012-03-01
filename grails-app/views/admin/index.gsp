<html>
<head>
</head>

<body>
<g:each in="${startups}" var="startup">
    <div style="border:1px solid black; margin:10px; padding: 10px">
        <tmpl:/startup startup="${startup}"/>
        <hr/>
        <g:link controller="admin" params="[id: startup.id, approved: true]" action="modify">Approve</g:link> |
        <g:link controller="admin" params="[id: startup.id, approved: false]" action="modify">Deny</g:link>
    </div>
</g:each>
</body>
</html>