//广告过滤：隐藏过滤掉的元素
function enableAdblock() {
    var head = document.head;
    if(head)
    {
        var leui_adblock = document.getElementById('leui_adblock');
        if(!leui_adblock)
        {
             var NewStyles = document.createElement('link');
             NewStyles.rel = 'stylesheet';
             NewStyles.type = 'text/css';
             NewStyles.id = 'leui_adblock';
             NewStyles.href = 'replaceMeByCss';
             head.appendChild(NewStyles);
             adblockJsCallback.onAdblockResult(true);
        }else{
        	adblockJsCallback.onAlreadyAdblock();
        }
    }else{
    	adblockJsCallback.onAdblockResult(false);
    }
}
enableAdblock();