package com.letv.app.appstore.thirdGetDownloadInfo;
import com.letv.app.appstore.DownloadAppInfo;

interface OnDownloadListener {
	void onDownloadStart(in DownloadAppInfo downloadInfo);
	void onDownloadSucess(in DownloadAppInfo downloadInfo);
	void onDownloadFailed(in DownloadAppInfo downloadInfo,int reasonCode);
	void onDownloadRunning(in DownloadAppInfo downloadInfo);
	void onDownloadPause(in DownloadAppInfo downloadInfo,int reasonCode);
	void onDownloadCancel(in DownloadAppInfo downloadInfo);
	void onDownloadInstallStart(in DownloadAppInfo downloadInfo);
	void onDownloadInstallSucess(in DownloadAppInfo downloadInfo);
	void onDownloadInstallFailed(in DownloadAppInfo downloadInfo,int reasonCode);
	
}
