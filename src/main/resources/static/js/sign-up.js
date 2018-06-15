$("button.cancel").click(function(){

	window.open('about:blank', '_self').close();
})

$("button.submit").click(function(){
	var data = {
		id: $(".id-area > input").val(),
		pw: $(".pw-area > input").val(),
		nickname: $(".id-area > input").val()
	}

	var postAjax = new AjaxUtil(/user/)
	postAjax.crudData(data, "POST", function(){
		window.location.href = "/signIn.html"
	})
	
})