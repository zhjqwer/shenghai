$(function() {
    // --------------注销-------
    $("#cancellation").click(function() {
        $.ajax({
            url: "http://localhost:9090/user/logOut",
            xhrFields: {
                withCredentials: true
            },
            dataType: "json",
            success: function(data) {
                var str = "";
                    if(data.code == 0){
                        str += "<a href=\"http://localhost:9090/user/login\">请登录</a>";
                        str += "<a href=\"http://localhost:9090/user/reg\">去注册</a>";
                    } else {
                        str += "<span style='color:#fff'>欢迎" + data.data.name + "</span>";
                        str += "<a href=\"http://localhost:9090/user/logOut\">注销!</a>";
                    }
                    // 如果id里面直接写的是a标签或者p标签之类的,.html方法只会改掉里面的文字，不会把标签替换
                $("#welcome-info").html(str);
            }
        })

    });


    $("#island li").click(function() {
        var islandname = $(this).text();
        console.log(islandname);
        // 链式编程操作
        $(this).addClass("blue").siblings().removeClass("blue");
        $.ajax({
            url: "http://localhost:9092/show/index/service",
            // url: url,
            xhrFields: {
                withCredentials: true
            },
            data: {
                "target_island": islandname,
            },
            type: "post",
            dataType: "json",
            success: function(data) {
                $("#islanddiv>div").empty(); //清空div里原有的内容
                var str = "";
                if (data.code == 0) {
                    console.log(data.target_island)
                    $.each(data, function(i, item) {
                        // $.each(data.data, function(i, item) {
                        str += '<div class="fl fish"><ul><li><img src=' + item.ship_img + '></li>'
                            + '<li class="ship"><span>｢' + item.ship_name + '｣ ' + item.ship_type + '，长*宽：'
                            + item.ship_length + 'M*' + item.ship_width + 'M 限载人数' + item.most_people
                            + '人，船只新颖，驾船10年</span></li><li class="price"><span>￥' + item.present_price
                            + '/艘</span><span class="horizontalline">￥' + item.price + '/艘</span></li><li>'
                            + '<img class="xingxing"' + ' src="../static/images/xingxing.png"><span>68 · 超赞驾驶</span></li>'
                            + '</ul></div>';
                    });
                } else {
                    console.log("请求失败");
                }
                $("#islanddiv").html(str);
            }
        })
    });

    // 首页筛选服务接口（有无参数）
    $("#button").click(function() {
        var province = $("#province option:selected").text();
        var city = $("#city option:selected").text();
        var count = $("#count option:selected").text();
        var time = $("#time option:selected").text();
        console.log(province + city + count + time);
        if (time == "出海时间") {
            $.ajax({
                url: "http://localhost:9092/show/Term/service",
                xhrFields: {
                    withCredentials: true
                },
                data: {
                    "region": province,
                    "target_island": city,
                    "most_people": count,
                },
                type: "post",
                dataType: "json",
                success: function(data) {
                    $("#islanddiv>div").empty(); //清空div里原有的内容
                    var str = "";
                    if (data.code == 0) {
                        console.log(data.target_island)
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
                        console.log("请求失败");
                    }
                    $("#islanddiv").html(str);
                }
            })
        } else {
            $.ajax({
                url: "http://localhost:9092/show/byTerm/service",
                xhrFields: {
                    withCredentials: true
                },
                data: {
                    "region": province,
                    "target_island": city,
                    "most_people": count,
                    "data": time,
                },
                type: "post",
                dataType: "json",
                success: function(data) {
                    $("#islanddiv>div").empty(); //清空div里原有的内容
                    var str = "";
                    if (data.code == 0) {
                        console.log(data.target_island)
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
                        console.log("请求失败");
                    }
                    $("#islanddiv").html(str);
                }
            })
        }

        // 查询所有出海服务的接口


        $("#more").click(function() {
            $.ajax({
                url: "http://localhost:9092/show/sea/service",
                xhrFields: {
                    withCredentials: true
                },
                type: "get",
                dataType: "json",
                success: function(data) {
                    $("#moreIsland").empty(); //清空div里原有的内容
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
                        console.log("请求失败");
                    }
                    $("#moreIsland").html(str);
                }
            })
        })


    })
})