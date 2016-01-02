// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeConversationItemView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeConversationItemView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624328, "field 'mContentView'");
    target.mContentView = (com.android.mail.ui.LeConversationItemFrontView) view;
    view = finder.findRequiredView(source, 2131624358, "field 'mToggleUnread'");
    target.mToggleUnread = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624359, "field 'mToggleStar' and method 'onToggleStarClick'");
    target.mToggleStar = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onToggleStarClick();
        }
      });
    view = finder.findRequiredView(source, 2131624360, "field 'mDelete' and method 'onDelete'");
    target.mDelete = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDelete();
        }
      });
  }

  public static void reset(com.android.mail.ui.LeConversationItemView target) {
    target.mContentView = null;
    target.mToggleUnread = null;
    target.mToggleStar = null;
    target.mDelete = null;
  }
}
