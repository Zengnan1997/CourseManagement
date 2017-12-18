$(function(){
	/*动态显示信息*/
	$.ajax({
		type:"GET",
		url:"/me",
		datatype:"json",
        async: false,
		success:function(data){
			$("#UserName").text(data.id);
			$("#Name").text(data.name);
			$("#Gender").text(data.gender);
			$("#college").text("软件学院");
			$("#qualification").text("本科");
			$("#E-mail").text(data.email);
			$("#telephone").text(data.phone);
            $("#school").text(data.school.name);
		}
	})


	/*modifyButton*/
    
        $("#modifyButton").click(function(){
        	var allSpan = $("span:gt(0)");
        	$(allSpan).each(function(){
        		var span = document.getElementById(this.id);
        		var parent = span.parentNode;
        		var input = document.createElement('input');
        		input.value = span.innerHTML;
        		input.id = span.id;
        		parent.removeChild(span);
        		parent.appendChild(input);
        	});
        	var parent = this.parentNode;
        	var submitButton = document.createElement("button");
        	$(submitButton).text("提交");
        	$(submitButton).addClass("submitButton")
        	parent.removeChild(this);
        	parent.appendChild(submitButton);
            /*$(this).attr("class","submitButton");*/
        })


    /*submitButton*/
    $(".body").on("click",".submitButton",function(e){
        var localschool = {
            name:$("#school").val()
        }
        var info = {
            name:$("#Name").val(),
            number:$("#UserName").val(),
            phone:$("#telephone").val(),
            email:$("#E-mail").val(),
            gender:$("#Gender").val()=="男"?"male":"female",
            school:localschool,
            avatar:"/avatar/3486.png"
        }
    	$.ajax({
            type:"PUT",
            url:"/me",
            datatype:"json",
            async:false,
            success:function(data){
                alert("修改个人信息成功");
                window.location.href = "studentHomePage.html"
            }
        })
    })

});