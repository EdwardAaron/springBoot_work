$(function () {
    $("#target").submit(function (event) {
        event.preventDefault();
        let user = {};
        user.name = $("input[name=name]", $(this)).first().val() || "default name";
        user.age = $("input[name=age]", $(this)).first().val() || 0;
        $.post("/saveUser", user, function (user) {
            $("#result").text("user has saved .id " + user.id + " name:" + user.name + " age:" + user.age);
        });
    });

});