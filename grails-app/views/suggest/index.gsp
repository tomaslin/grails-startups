<label>Icon</label>
<img src="${ details.profile_image_url }"/><br/>

<label for="name">Name</label>
<g:textField name="name" value="${ details.name }"></g:textField><br/>

<label for="description">Description</label>
<g:textArea name="description">${details.description}</g:textArea><br/>
Location:<br/> <g:textField name="location" value="${ details.location?:'' }"></g:textField><br/>
Website:<br/> <g:textField name="website" value="${ details.url?:'' }"></g:textField>

