$(function () {
    $("#ajax_get").click(function () {
        let $ajax_get_parent = $(this).parent();
        let $useData = $("input[type=radio]:checked", $ajax_get_parent);
        if ($useData.length>0&&$useData.attr("value")==="data") {
            //使用data
            $.get("/getUser", {name: "lifu", age: 17}, function (data) {
                $("input[name=name]", $ajax_get_parent).attr("value", data.name);
                $("input[name=age]", $ajax_get_parent).attr("value", data.age);
            });
        } else {
            //不使用data
            $.get("/getUser?name=lucia", function (data) {
                $("input[name=name]", $ajax_get_parent).attr("value", data.name);
                $("input[name=age]", $ajax_get_parent).attr("value", data.age);
            });
        }

    });

});