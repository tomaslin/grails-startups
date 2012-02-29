<%@ page import="com.grailsstartups.Startup" %>
<!doctype html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script src="css/normalize.css">
        
        
    </script>
    <script src="https://raw.github.com/GBKS/Wookmark-jQuery/master/jquery.wookmark.min.js"></script>
    <title>Grails Startups</title>

    <script type="text/javascript">
        $(document).ready(function () {
            $('.item').wookmark({
                container:$('#container'),
                offset:4,
                itemWidth:272,
                autoResize:true
            });
        });
    </script>

    <link rel='stylesheet' type='text/css' href='css/normalize.css' />
    <link rel='stylesheet' type='text/css' href='css/startup.css' />




</head>

<body>

<div id="container">

    <div id="about" class="item">
        <h3>About</h3>
        This is a showcase of startups built using the <a href="http://www.grails.org">Grails</a> framework.

        <h3>Suggest a Startup</h3>
        <p>Not in the list? Add now.</p>

        <g:formRemote url="${[action: 'index', controller: 'suggest']}" name="suggestForm" update="suggestion">
            Twitter id: @<g:textField name="username"></g:textField>
            <g:submitButton name="Get Details"/>
        </g:formRemote>

    </div>

    <g:each in="${Startup.list().sort { Math.random() } }" var="startup">
        <tmpl:/startup startup="${startup}"/>
    </g:each>

</div>

<div id="suggestion">
</div>


</body>
</html>