
var global_cur_page = 1;
var global_url = "";
var global_method = "get";
var global_func = "";

function create_page(cur_page,total_page,url,method,id,func){
    /*
     * cur_page 当前页
     * total_page 总共多少页
     * url 请求的url
     * method 请求方法
     * id 分页div的id，只有当页面中同时含有几个分页时，才会用到，默认不填
     * func post请求过后的执行函数，get不用填写
     * */
    global_cur_page = cur_page;
    global_url = url;
    global_method = method;
    global_func = func;
    if(id == null)
        $(".cu_page").empty();
    else
        $("#" + id).empty();
    if(total_page <= 6){
        var page_header = "<ul> <li><a class='cu_prev' href='javascript:"+"on_pre_click();'></a></li>";
        var page_footer =   "<li><a class='cu_next'  href='javascript:"+"on_next_click("+ total_page+");'></a></li>" +
            " <li>共" + total_page +"页</li><li class='cu_palast'> <span>跳转到第</span> <input type='text' id='skip'" +
            " onkeydown='if(event.keyCode==13){on_skip_olick("+ total_page+")}' value=''> <span>页</span>" +
            " <a href='javascript:on_skip_olick("+ total_page+");'>跳转</a> </li> </ul>";
        var page_body = "";

        for(var i = 1; i <= total_page; i++){
            if(i == cur_page){
                page_body += "<li><a class='cuur' class='"+ "page_" + i +"' href='javascript:on_page_click("+i+");'>" + i +"</a></li>"
            }else {
                page_body += "<li><a class='"+ "page_" + i +"' href='javascript:on_page_click("+i+");'>" + i +" </a></li>";
            }
        }
    }
    else if(total_page > 6 && (cur_page) < 5){
        var page_header = "<ul> <li><a class='cu_prev' href='javascript:"+"on_pre_click();'></a></li>";
        var page_footer =   "<li><span class='cu_spct'>...</span></li>" +
            "<li><a class='"+ "page_" + total_page +"' href='javascript:on_page_click("+total_page+");'>" + total_page +" </a></li>"
            +"<li><a class='cu_next' href='javascript:"+"on_next_click("+ total_page+");'></a></li>" +
            " <li>共" + total_page +"页</li><li class='cu_palast'> <span>跳转到第</span> <input type='text'" +
            "onkeydown='if(event.keyCode==13){on_skip_olick("+ total_page+")}' id='skip' value=''> <span>页</span>" +
            " <a href='javascript:on_skip_olick("+ total_page+");'>跳转</a> </li> </ul>";
        var page_body = "";

        for(var i = 1; i <= 5; i++){
            if(i == cur_page){
                page_body += "<li><a class='"+ "page_" + i +"' class='cuur'  href='javascript:on_page_click("+i+");'>" + i +"</a></li>"
            }else {
                page_body += "<li><a class='"+ "page_" + i +"'  href='javascript:on_page_click("+i+");'>" + i +" </a></li>";
            }
        }
    }
    else if(total_page > 6 && (cur_page  > 5) && (total_page - cur_page) < 5){

        var page_header = "<ul> <li><a class='cu_prev'href='javascript:"+"on_pre_click();'></a></li>"
            +"<li><a  class='"+ "page_" + 1 +"' href='javascript:on_page_click(1);'>1</a></li>" +
            "<li><span class='cu_spct'>...</span></li>" ;

        var page_footer =   "<li><a class='cu_next' href='javascript:"+"on_next_click("+ total_page+");'></a></li>" +
            " <li>共" + total_page +"页</li><li class='cu_palast'> <span>跳转到第</span> <input type='text'" +
            " onkeydown='if(event.keyCode==13){on_skip_olick("+ total_page+")}' id='skip' value=''> <span>页</span>" +
            " <a href='javascript:on_skip_olick("+ total_page+");'>跳转</a> </li> </ul>";
        var page_body = "";

        for(var i = total_page - 4; i <= total_page; i++){
            if(i == cur_page){
                page_body += "<li><a  class='"+ "page_" + i +"' class='cuur'  href='javascript:on_page_click("+i+");'>" + i +"</a></li>"
            }else {
                page_body += "<li><a  class='"+ "page_" + i +"' href='javascript:on_page_click("+i+");'>" + i +" </a></li>";
            }
        }
    }
    else{

        var page_header = "<ul> <li><a class='cu_prev' href='javascript:"+"on_pre_click();'></a></li>"
            +"<li><a  class='"+ "page_" + 1 +"'  href='javascript:on_page_click(1);'>1</a></li>" +
            "<li><span class='cu_spct'>...</span></li>";
        var page_footer =   "<li><span class='cu_spct'>...</span></li>" +
            "<li><a  class='"+ "page_" + total_page +"'  href='javascript:on_page_click("+total_page+");'>" + total_page +" </a></li>"
            +"<li><a class='cu_next' href='javascript:"+"on_next_click("+ total_page+");'></a></li>" +
            " <li>共" + total_page +"页</li><li class='cu_palast'> <span>跳转到第</span> <input type='text' " +
            "onkeydown='if(event.keyCode==13){on_skip_olick("+ total_page+")}' id='skip' value=''> <span>页</span>" +
            " <a href='javascript:on_skip_olick("+ total_page+");'>跳转</a> </li> </ul>";
        var page_body = "";

        for(var i = cur_page-2; i <= cur_page +1; i++){
            if(i == cur_page){
                page_body += "<li><a  class='"+ "page_" + i +"' class='cuur'  href='javascript:on_page_click("+i+");'> " + i +"</a></li>"
            }else {
                page_body += "<li><a  class='"+ "page_" + i +"'  href='javascript:on_page_click("+i+");'>" + i +" </a></li>";
            }
        }
    }
    if(id == null)
        $(".cu_page").append(page_header + page_body + page_footer);
    else
        $("#" + id).append(page_header + page_body + page_footer);
}

//点击指定页
function on_page_click(page){
    $("." + "page_" + global_cur_page).removeClass();
    $("." + "page_" + page).addClass('cuur');
    global_cur_page = page;
    var point = (global_cur_page - 1)*15;
    if(global_method == "get"){
        window.location.href = global_url + "&point=" + point;
    }else{
        eval(global_func);
    }

}
//page表示当前页
function on_pre_click(){
    if(global_cur_page > 1){
        var pre_page = parseInt(global_cur_page) - 1;
        $("." + "page_" + global_cur_page).removeClass();
        $("." + "page_" + pre_page).addClass("cuur");
        global_cur_page = pre_page;
        var point = (global_cur_page - 1)*15;
        if(global_method == "get"){
            window.location.href = global_url + "&point=" + point;
        }else{
            eval(global_func);
        }
    }
}
//page表示当前页
function on_next_click(total_page){
    if(global_cur_page < total_page){
        var next_page = parseInt(global_cur_page) + 1;
        $("." + "page_" + global_cur_page).removeClass();
        $("." + "page_" + next_page).addClass("cuur");
        global_cur_page = next_page;
        var point = (global_cur_page - 1)*15;
        if(global_method == "get"){
            window.location.href = global_url + "&point=" + point;
        }else{
            eval(global_func);
        }
    }
}
//点击跳转页
function on_skip_olick(total_page){
    var skip_page = $("#skip").val();
    if(skip_page <= total_page && skip_page > 0){
        $("." + "page_" + global_cur_page).removeClass();
        $("." + "page_" + skip_page).addClass("cuur");
        global_cur_page = skip_page;
        var point = (global_cur_page - 1)*15;
        if(global_method == "get"){
            window.location.href = global_url + "&point=" + point;
        }else{
            eval(global_func);
        }
    }
}