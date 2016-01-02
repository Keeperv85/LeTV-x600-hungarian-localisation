// Generated code from Butter Knife. Do not modify!
package com.android.mail.compose;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ComposeActivity$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.compose.ComposeActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624372, "field 'mBottomBar'");
    target.mBottomBar = (com.android.mail.compose.LeComposeBottomBar) view;
    view = finder.findRequiredView(source, 2131624378, "field 'mAddAttachmentBtn' and method 'onAddAttachmentsClick'");
    target.mAddAttachmentBtn = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAddAttachmentsClick();
        }
      });
    view = finder.findRequiredView(source, 2131624377, "field 'mSelectTo' and method 'onSelectRecipientsClick'");
    target.mSelectTo = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onSelectRecipientsClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624366, "field 'mSelectCc' and method 'onSelectRecipientsClick'");
    target.mSelectCc = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onSelectRecipientsClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131624367, "field 'mSelectBcc' and method 'onSelectRecipientsClick'");
    target.mSelectBcc = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onSelectRecipientsClick(p0);
        }
      });
  }

  public static void reset(com.android.mail.compose.ComposeActivity target) {
    target.mBottomBar = null;
    target.mAddAttachmentBtn = null;
    target.mSelectTo = null;
    target.mSelectCc = null;
    target.mSelectBcc = null;
  }
}
