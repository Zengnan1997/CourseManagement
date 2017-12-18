$(function(){
  /*加载信息*/
  $.ajax({
    type:"GET",
    url:"/course",
    success:function(data){
      $.each(data,function(index,course){
        $("#addCoursePlus").before(
          '<div class="main_box_right_content">'+
            '<h3 class="classtitle">'+course.name+
            '<button class="deleteCourseButton" style="cursor: pointer;">删除课程</button>'+
            '<button class="modifyCourseButton" style="cursor: pointer;">修改课程</button>'+
            '</h3>'+
            '<div class="divideline"></div>'+
            '<div  class="classinfo">'+
              '<table class="table">'+
                '<tr>'+
                  '<td class="tabletext">班级数：'+'<span>'+course.numClass+'</span></td>'+
                  '<td class="tabletext">学生人数：'+course.numStudent+'</td>'+
                '</tr>'+
                '<tr>'+
                  '<td class="tabletext">开始时间：'+course.startTime+'</td>'+
                  '<td class="tabletext">结束时间：'+course.endTime+'</td>'+
                '</tr>'+
              '</table>'+
            '</div>'+
          '</div>'
        );
      });
    }
  })

    /*删除课程*/
    $(".body").on("click",".deleteCourseButton",function(e){
      var con = confirm("确定删除课程");
      if(con)
      {
        $.ajax({
          type:"DELETE",
          url:"/course/1",
          success:function(){
              alert("删除成功");
              var classTitle = e.target.parentNode;
              var classDiv = classTitle.parentNode;
              var parentDiv = classDiv.parentNode;
              parentDiv.removeChild(classDiv);
          }
        })
      }
    })


    /*添加课程*/
    $(".addcourse").click(function(){
      window.location.href = 'createCourse.html';
    })

  /*修改课程*/
  
    $(".body").on("click",".modifyCourseButton",function(){
      window.location.href = "createCourse.html";
    })


            $("#homePage").click(function(){
              window.location.href = 'teacherHomePage.html';
            })
            
    $(".body").on("click",".classinfo",function(){
    	window.location.href = "teacherCourseHomePage.html";
    })
})
          