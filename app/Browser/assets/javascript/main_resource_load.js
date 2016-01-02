/**
 *  判断html主资源是否加载完成
 */

function mainResource() {

	var head = document.head;
	if(head)
		{
			var isMainResourceLoaded = document.getElementById("leui_main_resource");

			if(isMainResourceLoaded)
			{
				mainResourceLoadedJsCallback.onAlreadyMainResourceLoaded();
			}
	        else
	        {
	        	var NewStyles = document.createElement('link');
				NewStyles.id = 'leui_main_resource';
				head.appendChild(NewStyles);
				mainResourceLoadedJsCallback.onMainResourceLoadedResult(true);
	        }
	    }
	    else
	    {
	    	mainResourceLoadedJsCallback.onMainResourceLoadedResult(false);
	    }
}
mainResource();