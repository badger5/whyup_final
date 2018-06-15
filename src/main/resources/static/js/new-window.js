function new_window(url, w, h, name, option) {
    var pozX, pozY = 0;
    var sw = screen.availWidth;
    var sh = screen.availHeight;
    var scroll = 0;
    if (option == 'scroll') {
        scroll = 1;
    }
    pozX = (sw - w) / 2;
    pozY = (sh - h) / 2;
    return window.open(url, name, "location=no,status=0,scrollbars=" + scroll + ",resizable=1,width=" + w + ",height=" + h + 
    ",left=" + pozX + ",top=" + pozY +"resizable=no");
}

$("p.login").click(function(){
    new_window("signIn.html", 880, 615, "login","none");
})

