<%@ page import="com.grailsstartups.Startup" %>
<!doctype html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script src="https://raw.github.com/GBKS/Wookmark-jQuery/master/jquery.wookmark.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

    <title>Grails Startups</title>

    <script type="text/javascript">
        $(document).ready(function () {
            $('.item').wookmark({
                container:$('#container'),
                offset:4,
                itemWidth:272,
                autoResize:true
            });

            $('#dialog').modal({
               show:false
            })

        });


    </script>

    <script>
        function showModal(){
            $('#dialog').modal('show')
        }
    </script>

    <link rel='stylesheet' type='text/css' href='css/bootstrap.min.css' />
    <link rel='stylesheet' type='text/css' href='css/startup.css' />

</head>

<body>

<div id="container">

    <div id="about" class="item">

		<img src="images/logo.png" height="52" width="246" class="logo"/>
	
        This is a showcase of startups built using the <a href="http://www.grails.org">Grails</a> web application framework.
	
        <h3>Suggest a Startup</h3>
        <p>Startup not in the list? Add it now.<br/></p>

        <g:formRemote url="${[action: 'index', controller: 'suggest']}" name="suggestForm" update="suggestion" onSuccess="showModal()">
            <label for="username">Twitter Username: ( @example )</label>
			<g:textField name="username"></g:textField>
            <g:submitButton name="Get Details"/>
        </g:formRemote>

    </div>

    <g:each in="${Startup.findAllByApproved(true).sort { Math.random() } }" var="startup">
        <tmpl:/startup startup="${startup}"/>
    </g:each>

</div>

        <div class="modal" id="dialog" style="display:none">
        <div class="modal-header">
        <h3>Suggest a startup</h3>
        </div>
        <div class="modal-body" id="suggestion">
        </div>
        </div>


</body>
</html>