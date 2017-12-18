$(function(){
	$("#submitCourseButton").click(function(){
		var propor = {
			c:$("input[name='five']").val(),
			b:$("input[name='four']").val(),
			a:$("input[name='three']").val(),
			report:$("input[name='seminarscore']").val(),
			presentation:$("input[name='reportscore']").val()
		}
		var courseInfo = {
			name:$("input[name='coursename']").val(),
			description:$("input[name='courseinfo']").val(),
			startTime:$("input[name='begintime']").val(),
			endTime:$("input[name='endtime']").val(),
			proportions:propor
		}
		$.ajax({
			type:"PUT",
			url:"/course/1",
			success:function(){
				alert("创建班级成功");
                window.location.href = "createCourse.html"
			}
		})
	})

	$("#resetCourseButton").click(function(){
		// var input = ;
        $("input").each(function(){
          	$(this).val("");
        });
        $("#multiInput").val("");
	})
})