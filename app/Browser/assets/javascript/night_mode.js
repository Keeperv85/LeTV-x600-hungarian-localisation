function nightMode() {
    var head = document.head;
    if(head)
    {
        var nightNode = document.getElementById('leui_night_mode');
        if(nightNode)
        {
            if(nightModeJsCallback)
            {
                nightModeJsCallback.onAlreadyNightMode();
            }
        }
        else
        {
             var NewStyles = document.createElement('link');
             NewStyles.rel = 'stylesheet';
             NewStyles.type = 'text/css';
             NewStyles.id = 'leui_night_mode';
             NewStyles.href = 'replace_me_by_css';
             head.appendChild(NewStyles);

             if(nightModeJsCallback)
             {
                 nightModeJsCallback.onNightModeResult(true);
             }
        }
    }
    else
    {
        if(nightModeJsCallback)
        {
            nightModeJsCallback.onNightModeResult(false);
        }
    }
}

function diableNightMode(){
      var element = document.getElementById("leui_night_mode");
      if(element){
          element.parentNode.removeChild(element);
          nightModeJsCallback.onDisableNightModeResult(true);
      }else{
          nightModeJsCallback.onAlreadyDay();
      }
}
nightMode();