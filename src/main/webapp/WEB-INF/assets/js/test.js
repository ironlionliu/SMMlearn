//
//alert("start");
//$.getJSON("/hello/8910",function(data){
//    alert("???????");
//});
//alert("end");




//$.ajax({url:"/hello/124",success:function(result){
//    console.log(result);
//    alert(result);
//}});



$.getJSON(
    "/hello/testget",
    {"courseId":"123"},
    function(data){
        console.log("get得到的数据");
        console.log(data);
    }
);


$.postJSON(
    "/hello/testpost",
    {"courseId":"123"},
    function(data){
        console.log("post得到的数据");
        console.log(data);
    }
);