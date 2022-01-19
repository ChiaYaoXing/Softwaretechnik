<#include "header.ftl">

<b>Welcome to Movie Rating App</b><br><br>

<form method="POST" action="usergui?action=register">
	<fieldset id="insertoffer">
		<legend>Required Information</legend>
		<div>
			<label>name</label>
			<input type="text" name="name" >
	    </div>

		<div>
			<label> age</label>
			<input type="text" name="age"  >
	    </div>

		<div>
			<label>email</label>
			<input type="text" name="email">
	    </div>
	    
	    
	</fieldset>
	<button type="submit" id="submit">Submit</button>
</form>
<#include "footer.ftl">