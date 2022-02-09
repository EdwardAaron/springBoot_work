$(function () {
    //将下载的内容填充到指定元素中，p为selector
    $("#loadContent").click(function () {
        $(this).load("/load.html p", function (responseText, textStatus) {
            console.log(this.tagName);
            console.log(responseText);
            console.log(textStatus);
        });
    });
});