// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeMessageAttachmentView$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeMessageAttachmentView.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624012, "field 'mIcon'");
    target.mIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624133, "field 'mName'");
    target.mName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624373, "field 'mSize'");
    target.mSize = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624433, "field 'mDownload' and method 'onDownloadClick'");
    target.mDownload = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDownloadClick();
        }
      });
    view = finder.findRequiredView(source, 2131624436, "field 'mDownloadProgress'");
    target.mDownloadProgress = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624368, "field 'mOpen'");
    target.mOpen = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624434, "field 'mFail' and method 'onFailClick'");
    target.mFail = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onFailClick();
        }
      });
    view = finder.findRequiredView(source, 2131624435, "field 'mProgressBar' and method 'onDownloadClick'");
    target.mProgressBar = (com.letv.leui.widget.LeProgressBar) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDownloadClick();
        }
      });
    view = finder.findRequiredView(source, 2131624339, "field 'mProgressPauseView'");
    target.mProgressPauseView = view;
  }

  public static void reset(com.android.mail.ui.LeMessageAttachmentView.ViewHolder target) {
    target.mIcon = null;
    target.mName = null;
    target.mSize = null;
    target.mDownload = null;
    target.mDownloadProgress = null;
    target.mOpen = null;
    target.mFail = null;
    target.mProgressBar = null;
    target.mProgressPauseView = null;
  }
}
