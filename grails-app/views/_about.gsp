<div id="about" class="item">

    <img src="images/logo.png" height="52" width="246" class="logo"/>

    This is a showcase of startups built using the <a
        href="http://www.grails.org">Grails</a> web application framework.

    <p>Startup ordering is random.</p>

    <p>Source available on <a href="https://github.com/tomaslin/grails-startups">Github</a></p>

    <h3>Suggest a Startup</h3>

    <p>Startup not in the list? Add it now.<br/></p>

    <g:formRemote url="${[action: 'index', controller: 'suggest']}" name="suggestForm" update="suggestion"
                  onSuccess="showModal()">
        <label for="username">Twitter Username: ( @example )</label>
        <g:textField name="username"></g:textField>
        <g:submitButton name="Get Details"/>
    </g:formRemote>


</div>