// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui.cardMode;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeCardModeItemFrontView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.cardMode.LeCardModeItemFrontView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624361, "field 'mBadge'");
    target.mBadge = (com.letv.leui.widget.LeQuickContactBadge) view;
    view = finder.findRequiredView(source, 2131624362, "field 'mUnreadMask'");
    target.mUnreadMask = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624241, "field 'mSenderName'");
    target.mSenderName = (com.letv.commons.widget.LeHighlightTextView) view;
    view = finder.findRequiredView(source, 2131624238, "field 'mForward'");
    target.mForward = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624236, "field 'mReply'");
    target.mReply = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624178, "field 'mStar'");
    target.mStar = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624198, "field 'mAttachmentIcon'");
    target.mAttachmentIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624244, "field 'mSendDate'");
    target.mSendDate = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624364, "field 'mSelect'");
    target.mSelect = (com.letv.leui.widget.LeCheckBox) view;
    view = finder.findRequiredView(source, 2131624246, "field 'mEmailSnippet'");
    target.mEmailSnippet = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624365, "field 'mMask'");
    target.mMask = view;
  }

  public static void reset(com.android.mail.ui.cardMode.LeCardModeItemFrontView target) {
    target.mBadge = null;
    target.mUnreadMask = null;
    target.mSenderName = null;
    target.mForward = null;
    target.mReply = null;
    target.mStar = null;
    target.mAttachmentIcon = null;
    target.mSendDate = null;
    target.mSelect = null;
    target.mEmailSnippet = null;
    target.mMask = null;
  }
}
