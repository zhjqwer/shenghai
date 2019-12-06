$(function() {

    $.ajax({
        url: "http://localhost:9090/user/check/isLogin",
        xhrFields: {
            withCredentials: true
        },
        dataType: 'json',
        success: function(data) {
            console.log(data.code);
            var str = "";
            if (data.code == 0) {
                str += "<span style='color:#fff'>欢迎" + data.data.name + "</span>";
                str += "<a href=\"javascript:;\" id='cancellation' target=\"_top\">注销!</a>";
            } else {
                str += "<a href=\"http://localhost:9090/user/login\">请登录</a>";
                str += "<a href=\"http://localhost:9090/user/reg\">去注册</a>";
            }
            // 如果id里面直接写的是a标签或者p标签之类的,.html方法只会改掉里面的文字，不会把标签替换
            $("#welcome-info").html(str);
        }
    });




    //查询导航栏方法接口 已测试
    $.ajax({
        url: "http://localhost:9091/show/index/navigation",
        xhrFields: {
            withCredentials: true
        },
        type: "get",
        dataType: "json",
        success: function(data) {
            console.log(data.data.length);
            var str = "";
            if (data.code == 0) {
                for (var i = 0; i < data.data.length; i++) {
                    str += "<a href=\"#\">" + data.data[i] + "</a>";
                }
            } else {
                str += "<a href=\"#\">手机端</a>";
                str += "<a href=\"#\">出租船员</a>";
                str += "<a href=\"#\">帮助</a>";
            };
            $("#login-info").html(str);
        }
    });

    //页面渲染完成后直接默认显示  鱼山岛的内容  已测
    $.ajax({
        url: "http://localhost:9092/show/index/service",
        // url: url,
        xhrFields: {
            withCredentials: true
        },
        dataType: "json",
        success: function(data) {
            var str = "";
            if (data.code == 0) {
                $.each(data.data, function(i, item) {
                    str += '<div class="fl fish"><ul><li><img src=' + item.ship_img + '></li>'
                        + '<li class="ship"><span>｢' + item.ship_name + '｣ ' + item.ship_type + '，长*宽：'
                        + item.ship_length + 'M*' + item.ship_width + 'M 限载人数' + item.most_people 
                        + '人，船只新颖，驾船10年</span></li><li class="price"><span>￥' + item.present_price 
                        + '/艘</span><span class="horizontalline">￥' + item.price + '/艘</span></li><li>'
                        + '<img class="xingxing"' + ' src="../static/images/xingxing.png"><span>68 · 超赞驾驶</span></li>'
                        + '</ul></div>';
                });
            } else {
                console.log("页面渲染失败");
            }
            // 如果id里面直接写的是a标签或者p标签之类的,.html方法只会改掉里面的文字，不会把标签替换
            $("#islanddiv").html(str);
        }
    });



})