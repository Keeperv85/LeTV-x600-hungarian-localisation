function showButton() {

	var reload = document.getElementById('reload');
	var settings = document.getElementById('settings');
	if (reload && settings) {
		if (reload.style.display == 'inline-block' && settings.style.display == 'inline-block') {
			if (errorPageShowButtonJsCallback) {
				errorPageShowButtonJsCallback.onErrorPageButtonShowed();
			}
		} else {
			reload.style.display = 'inline-block';
			settings.style.display = 'inline-block';
			if (errorPageShowButtonJsCallback) {
				errorPageShowButtonJsCallback.onErrorPageButtonShowResult(true);
			}
		}
	}
}
showButton();
