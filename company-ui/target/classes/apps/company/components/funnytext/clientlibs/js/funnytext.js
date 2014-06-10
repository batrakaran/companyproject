jQuery(function($) {
    $('.funny').hover(function() {
    console.log(this);
        $('.funny p').addClass("bigfun");
    }, function() {
        $('.funny p').removeClass("bigfun");
    });
});