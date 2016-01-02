// Generated code from Butter Knife. Do not modify!
package com.android.mail.compose;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAttachmentsView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.compose.LeAttachmentsView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624342, "field 'mAttachmentsHeaderView' and method 'onExpandCollapseViewClick'");
    target.mAttachmentsHeaderView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onExpandCollapseViewClick();
        }
      });
    view = finder.findRequiredView(source, 2131624343, "field 'mExpandCollapseView' and method 'onExpandCollapseViewClick'");
    target.mExpandCollapseView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onExpandCollapseViewClick();
        }
      });
    view = finder.findRequiredView(source, 2131624344, "field 'mAttachmentSummaryView'");
    target.mAttachmentSummaryView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624345, "field 'mAttachmentListView'");
    target.mAttachmentListView = (com.letv.commons.widget.LeLinearListView) view;
  }

  public static void reset(com.android.mail.compose.LeAttachmentsView target) {
    target.mAttachmentsHeaderView = null;
    target.mExpandCollapseView = null;
    target.mAttachmentSummaryView = null;
    target.mAttachmentListView = null;
  }
}
