package com.letv.app.appstore.thirdGetDownloadInfo;
import com.letv.app.appstore.thirdGetDownloadInfo.OnDownloadListener;
import com.letv.app.appstore.DownloadAppInfo;
interface AppStoreDownloadInterface {
	void setOnDownloadListener(OnDownloadListener onDownloadListener);

	List<DownloadAppInfo> getAllDownloadInfo();

	DownloadAppInfo getDownloadInfoByPackageName(String packageName);
	
	DownloadAppInfo getDownloadInfoById(long id);
	
	void pauseDownload(long downloadId);

	void resumeDownload(long downloadId);

	void cancelDownload(long downloadId);
}
