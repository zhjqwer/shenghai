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
                    if(data.code == 0){
                        alert("退出登录成功");
                        window.location.href = "http://localhost:9091/show/index";
                    } else {
                        alert("退出登录失败");
                        window.location.href = "http://localhost:9091/show/index";
                    }
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
                "island": islandname,
            },
            type: "post",
            dataType: "json",
            success: function(data) {
                $("#islanddiv>div").empty(); //清空div里原有的内容
                var str = "";
                if (data.code == 0) {
                    console.log(data.target_island)
                    $.each(data.data, function(i, item) {
                        // $.each(data.data, function(i, item) {
                        str +="<div class='fl fish'><ul>";
                        str +="<li><img src='../static/images/1.png'/></li>";
                        str +="<li class='ship'><span>｢"+ item.ship_name +"｣"+ item.ship_type +",长*宽："
                            + item.ship_length +"M*"+item.ship_width +"M，限载人数" + item.most_people + "人，船只新颖，驾船10年</span></li>";
                        str +="<li class='price'><span>￥" + item.present_price +"/艘</span><span class='horizontalline'>￥"
                            + item.price +"/艘</span></li>";
                        str +="<li><img class='xingxing' src='../static/images/xingxing.png'/><span>68 · 超赞驾驶</span></li>";
                        str +="</ul></div>";
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
                    "island": city,
                    "people": count,
                },
                type: "post",
                dataType: "json",
                success: function(data) {
                    $("#islanddiv>div").empty(); //清空div里原有的内容
                    var str = "";
                    if (data.code == 0) {
                        console.log(data.target_island)
                        $.each(data.data, function(i, item) {
                            str +="<div class='fl fish'><ul>";
                            str +="<li><img src='../static/images/1.png'/></li>";
                            str +="<li class='ship'><span>｢"+ item.ship_name +"｣"+ item.ship_type +",长*宽："
                                + item.ship_length +"M*"+item.ship_width +"M，限载人数" + item.most_people + "人，船只新颖，驾船10年</span></li>";
                            str +="<li class='price'><span>￥" + item.present_price +"/艘</span><span class='horizontalline'>￥"
                                + item.price +"/艘</span></li>";
                            str +="<li><img class='xingxing' src='../static/images/xingxing.png'/><span>68 · 超赞驾驶</span></li>";
                            str +="</ul></div>";
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
                    "island": city,
                    "people": count,
                    "date": time,
                },
                type: "post",
                dataType: "json",
                success: function(data) {
                    $("#islanddiv>div").empty(); //清空div里原有的内容
                    var str = "";
                    if (data.code == 0) {
                        console.log(data.target_island)
                        $.each(data.data, function(i, item) {
                            str +="<div class='fl fish'><ul>";
                            str +="<li><img src='../static/images/1.png'/></li>";
                            str +="<li class='ship'><span>｢"+ item.ship_name +"｣"+ item.ship_type +",长*宽："
                                + item.ship_length +"M*"+item.ship_width +"M，限载人数" + item.most_people + "人，船只新颖，驾船10年</span></li>";
                            str +="<li class='price'><span>￥" + item.present_price +"/艘</span><span class='horizontalline'>￥"
                                + item.price +"/艘</span></li>";
                            str +="<li><img class='xingxing' src='../static/images/xingxing.png'/><span>68 · 超赞驾驶</span></li>";
                            str +="</ul></div>";
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
                            str +="<div class='fl fish'><ul>";
                            str +="<li><img src='../static/images/1.png'/></li>";
                            str +="<li class='ship'><span>｢"+ item.ship_name +"｣"+ item.ship_type +",长*宽："
                                + item.ship_length +"M*"+item.ship_width +"M，限载人数" + item.most_people + "人，船只新颖，驾船10年</span></li>";
                            str +="<li class='price'><span>￥" + item.present_price +"/艘</span><span class='horizontalline'>￥"
                                + item.price +"/艘</span></li>";
                            str +="<li><img class='xingxing' src='../static/images/xingxing.png'/><span>68 · 超赞驾驶</span></li>";
                            str +="</ul></div>";
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