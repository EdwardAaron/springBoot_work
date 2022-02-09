$(function () {
    $("#target").submit(function (event) {
        event.preventDefault();
        let user = {};
        user.name = $("input[name=name]", $(this)).first().val() || "default name";
        user.age = $("input[name=age]", $(this)).first().val() || 0;
        //script 会在global上下文中执行
        $.getScript("/getScript", function (script, textStatus, jqXHR) {
            let $result = $("#result");
            $result.text("script:" + script);
            $result.text($result.text() + "\ntextStatus:" + textStatus);
        });
    });

});