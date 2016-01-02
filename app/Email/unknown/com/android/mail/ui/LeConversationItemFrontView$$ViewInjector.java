// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeConversationItemFrontView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeConversationItemFrontView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624361, "field 'mBadge' and method 'onContactBadgeClick'");
    target.mBadge = (com.letv.leui.widget.LeQuickContactBadge) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onContactBadgeClick();
        }
      });
    view = finder.findRequiredView(source, 2131624384, "field 'mBadgePanel'");
    target.mBadgePanel = (android.view.ViewGroup) view;
    view = finder.findRequiredView(source, 2131624385, "field 'mBadgePanel2'");
    target.mBadgePanel2 = (android.view.ViewGroup) view;
    view = finder.findRequiredView(source, 2131624362, "field 'mUnreadMask'");
    target.mUnreadMask = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624386, "field 'mUnreadMask2'");
    target.mUnreadMask2 = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624241, "field 'mSenderName'");
    target.mSenderName = (com.letv.commons.widget.LeHighlightTextView) view;
    view = finder.findRequiredView(source, 2131624178, "field 'mStar'");
    target.mStar = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624198, "field 'mAttachmentIcon'");
    target.mAttachmentIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624244, "field 'mSendDate'");
    target.mSendDate = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624389, "field 'mCaret'");
    target.mCaret = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624166, "field 'mSubject'");
    target.mSubject = (com.letv.commons.widget.LeHighlightTextView) view;
    view = finder.findRequiredView(source, 2131624246, "field 'mEmailSnippet'");
    target.mEmailSnippet = (com.letv.commons.widget.LeHighlightTextView) view;
    view = finder.findRequiredView(source, 2131624364, "field 'mSelect' and method 'onSelectClick'");
    target.mSelect = (com.letv.leui.widget.LeCheckBox) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onSelectClick();
        }
      });
    view = finder.findRequiredView(source, 2131624387, "field 'mSendStatus'");
    target.mSendStatus = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624388, "field 'mConversationMode'");
    target.mConversationMode = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624238, "field 'mForward'");
    target.mForward = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624236, "field 'mReply'");
    target.mReply = (android.widget.ImageView) view;
  }

  public static void reset(com.android.mail.ui.LeConversationItemFrontView target) {
    target.mBadge = null;
    target.mBadgePanel = null;
    target.mBadgePanel2 = null;
    target.mUnreadMask = null;
    target.mUnreadMask2 = null;
    target.mSenderName = null;
    target.mStar = null;
    target.mAttachmentIcon = null;
    target.mSendDate = null;
    target.mCaret = null;
    target.mSubject = null;
    target.mEmailSnippet = null;
    target.mSelect = null;
    target.mSendStatus = null;
    target.mConversationMode = null;
    target.mForward = null;
    target.mReply = null;
  }
}
