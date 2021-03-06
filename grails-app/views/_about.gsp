<div id="about" class="item">

    <img src="images/logo.png" height="52" width="246" class="logo"/>

    This is a showcase of startups built using the <a
        href="http://www.grails.org">Grails</a> web application framework. [<a href="https://github.com/tomaslin/grails-startups">Github</a>]

    <p>Startup ordering is random.</p>

    <h3>Suggest a Startup</h3>

    <p>Startup not in the list? Add it now.<br/></p>

    <g:formRemote url="${[action: 'index', controller: 'suggest']}" name="suggestForm" update="suggestion"
                  onSuccess="showModal()">
        <label for="username">Twitter Username: ( @example )</label>
        <g:textField name="username"></g:textField>
        <g:submitButton name="Get Details"/>
    </g:formRemote>

    <p class="small">Please only submit links to full projects written in Grails. Individual accounts, consulting companies and 'coming soon' sites will be rejected.</p>



</div>