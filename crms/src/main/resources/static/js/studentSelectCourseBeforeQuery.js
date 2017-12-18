$(function(){
	$("button").click(function(){
		alert("选课成功");
		var classTitle = this.parentNode;
        var classDiv = classTitle.parentNode;
        classDiv.removeChild(classTitle);
	})
})