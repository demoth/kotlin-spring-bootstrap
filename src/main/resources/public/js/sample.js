$(document).ready(function() {
    console.log( "ready!" );
    $("#main_button").click(function click() {
        console.log("clicked!")
        $.get("/sample", {name:$("#input_text1").val()} )
            .done(function(data, status) {
                console.log(data);
                $("#input_text1").val(data);
            });
    });
});