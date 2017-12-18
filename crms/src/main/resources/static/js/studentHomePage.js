$(function(){
	$.ajax({
		type:"GET",
		url:"/class",
		success:function(data){
			$.each(data,function(index,course){
        	$(".content").append(
          		'<div class="main_box_right_content">'+
            	'<h3 class="classtitle">'+course.courseName+
            	'<button style="cursor: pointer;" class="dropCourse">退选课程</button>'+
            	'</h3>'+
            	'<div class="divideline"></div>'+
            	'<div  class="classinfo">'+
              	'<table class="table">'+
                	'<tr>'+
                  	'<td class="tabletext">班级：'+'<span>'+course.name+'</span></td>'+
                  	'<td class="tabletext">课程地点：'+course.site+'</td>'+
                	'</tr>'+
                	'<tr>'+
                  		'<td class="tabletext">教师：'+course.courseTeacher+'</td>'+
                	'</tr>'+
              		'</table>'+
            		'</div>'+
          		'</div>'+
          		'<br/>'
        );
      });
		}
	})

	/*退选课程*/
	$(".body").on("click",".dropCourse",function(e){
      var con = confirm("确定退选课程");
      if(con)
      {
        $.ajax({
          type:"DELETE",
          url:"/course/1",
          success:function(){
              alert("退课成功");
              var classTitle = e.target.parentNode;
              var classDiv = classTitle.parentNode;
              var parentDiv = classDiv.parentNode;
              parentDiv.removeChild(classDiv);
          }
        })
      }
    })
    
    $(".body").on("click",".classinfo",function(){
    	window.location.href = "courseHomePage.html";
    })
})