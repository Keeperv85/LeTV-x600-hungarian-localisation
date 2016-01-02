// Generated code from Butter Knife. Do not modify!
package com.android.mail.compose;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAttachmentsView$ViewHolder$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.compose.LeAttachmentsView.ViewHolder target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624012, "field 'mIcon'");
    target.mIcon = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624133, "field 'mName'");
    target.mName = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624373, "field 'mSize'");
    target.mSize = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624360, "field 'mDelete' and method 'onDeleteClick'");
    target.mDelete = (android.widget.ImageView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDeleteClick();
        }
      });
  }

  public static void reset(com.android.mail.compose.LeAttachmentsView.ViewHolder target) {
    target.mIcon = null;
    target.mName = null;
    target.mSize = null;
    target.mDelete = null;
  }
}
