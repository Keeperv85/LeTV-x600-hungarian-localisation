// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAttachmentManagerActivity$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeAttachmentManagerActivity.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624330, "field 'mGoToEmail' and method 'onGoToEmailClick'");
    target.mGoToEmail = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onGoToEmailClick();
        }
      });
    view = finder.findRequiredView(source, 2131624198, "field 'mAttachmentIcon'");
    target.mAttachmentIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624199, "field 'mAttachmentTitle'");
    target.mAttachmentTitle = (com.letv.commons.widget.LeHighlightTextView) view;
    view = finder.findRequiredView(source, 2131624166, "field 'mSubject'");
    target.mSubject = (com.letv.commons.widget.LeHighlightTextView) view;
    view = finder.findRequiredView(source, 2131624333, "field 'mAttachmentSummary'");
    target.mAttachmentSummary = (com.letv.commons.widget.LeHighlightTextView) view;
    view = finder.findRequiredView(source, 2131624335, "field 'mAttachmentIcDownload' and method 'onDownloadClick'");
    target.mAttachmentIcDownload = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDownloadClick();
        }
      });
    view = finder.findRequiredView(source, 2131624336, "field 'mAttachmentIcOpen'");
    target.mAttachmentIcOpen = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624337, "field 'mAttachmentIcDownloadFail'");
    target.mAttachmentIcDownloadFail = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624338, "field 'mAttachmentIcDownloadProgress' and method 'onDownloadClick'");
    target.mAttachmentIcDownloadProgress = (com.letv.leui.widget.LeProgressBar) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDownloadClick();
        }
      });
    view = finder.findRequiredView(source, 2131624340, "field 'mSelected'");
    target.mSelected = (com.letv.leui.widget.LeCheckBox) view;
    view = finder.findRequiredView(source, 2131624328, "field 'frontLayout'");
    target.frontLayout = (android.widget.RelativeLayout) view;
    view = finder.findRequiredView(source, 2131624332, "field 'mAttachmentStatus'");
    target.mAttachmentStatus = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624339, "field 'mProgressPauseView'");
    target.mProgressPauseView = view;
  }

  public static void reset(com.android.mail.ui.LeAttachmentManagerActivity.ViewHolder target) {
    target.mGoToEmail = null;
    target.mAttachmentIcon = null;
    target.mAttachmentTitle = null;
    target.mSubject = null;
    target.mAttachmentSummary = null;
    target.mAttachmentIcDownload = null;
    target.mAttachmentIcOpen = null;
    target.mAttachmentIcDownloadFail = null;
    target.mAttachmentIcDownloadProgress = null;
    target.mSelected = null;
    target.frontLayout = null;
    target.mAttachmentStatus = null;
    target.mProgressPauseView = null;
  }
}
