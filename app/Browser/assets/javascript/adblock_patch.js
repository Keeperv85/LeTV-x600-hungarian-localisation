// 修复广告过滤造成的部分页面排版问题
function insertAdblockPatchCss() {
    var head = document.head;
    if(head)
    {
        var leui_adblock_layout_beauty = document.getElementById('leui_adblock_layout_beauty');
        if(!leui_adblock_layout_beauty)
        {
             var forSina = "body{margin-top: 0px!important;}";
             var forXueqiu = "#top-bar+.container nav {top: 0px!important;}div[id='container']{padding-top: 0px!important;}";
             var forQidian = "#app_download_blank_show {height: 0px!important;}";
             var url = window.location.href;
             var patchCss = "data:text/css,";
             if(url && url.indexOf("sina.cn") > -1){
            	 if(window.document.body.style.marginTop && window.document.body.style.marginTop == "60px"){
            		 patchCss = patchCss + forSina;
            	 }
             }
             if("http://xueqiu.com/" == url){
            	 patchCss = patchCss + forXueqiu;
             }
             if(url.indexOf("m.qidian.com") != -1){
            	 patchCss = patchCss + forQidian;
             }
             if(patchCss == "data:text/css,"){
            	 return;
             }
             var NewStyles = document.createElement('link');
             NewStyles.rel = 'stylesheet';
             NewStyles.type = 'text/css';
             NewStyles.id = 'leui_adblock_layout_beauty';
             NewStyles.href = patchCss;
             head.appendChild(NewStyles);
        }
    }
}
insertAdblockPatchCss();