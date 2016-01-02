// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeSecureConversationViewController$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeSecureConversationViewController target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624301, "field 'mWebView'");
    target.mWebView = (com.android.mail.browse.MessageWebView) view;
    view = finder.findRequiredView(source, 2131624406, "field 'mMessageHeader'");
    target.mMessageHeader = (com.android.mail.ui.LeMessageHeaderView) view;
    view = finder.findRequiredView(source, 2131624395, "field 'mMessageAttachment'");
    target.mMessageAttachment = (com.android.mail.ui.LeMessageAttachmentView) view;
    view = finder.findRequiredView(source, 2131624458, "field 'mScrollView'");
    target.mScrollView = (com.android.mail.browse.MessageScrollView) view;
    view = finder.findRequiredView(source, 2131624381, "field 'mMessageInvitation' and method 'onMessageInvitationClick'");
    target.mMessageInvitation = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onMessageInvitationClick();
        }
      });
    view = finder.findRequiredView(source, 2131624459, "field 'mShowImageButton' and method 'onShowImageClick'");
    target.mShowImageButton = view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onShowImageClick();
        }
      });
  }

  public static void reset(com.android.mail.ui.LeSecureConversationViewController target) {
    target.mWebView = null;
    target.mMessageHeader = null;
    target.mMessageAttachment = null;
    target.mScrollView = null;
    target.mMessageInvitation = null;
    target.mShowImageButton = null;
  }
}
