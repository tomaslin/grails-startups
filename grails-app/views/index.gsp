<%@ page import="com.grailsstartups.Startup" %>
<!doctype html>
<html>
<head>

    <title>Grails Startups</title>

    <link rel='stylesheet' type='text/css' href='css/bootstrap.min.css'/>
    <link rel='stylesheet' type='text/css' href='css/startup.css'/>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
    <script src="js/jquery.wookmark.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/startup.js"></script>

    <script type="text/javascript">

        var _gaq = _gaq || [];
        _gaq.push(['_setAccount', 'UA-29608281-1']);
        _gaq.push(['_trackPageview']);

        (function () {
            var ga = document.createElement('script');
            ga.type = 'text/javascript';
            ga.async = true;
            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
            var s = document.getElementsByTagName('script')[0];
            s.parentNode.insertBefore(ga, s);
        })();

    </script>

</head>

<body>

<div id="container">

    <tmpl:/about/>

    <g:each in="${Startup.approvedStartups.list().sort { Math.random() }}" var="startup">
        <tmpl:/startup startup="${startup}"/>
    </g:each>

</div>

<div class="modal" id="dialog" style="display:none">
    <div class="modal-header">
        <a data-dismiss="modal" class="close" href="#">×</a>
        <h3>Suggest a startup</h3>
    </div>

    <div class="modal-body" id="suggestion">
    </div>
</div>

</body>
</html>