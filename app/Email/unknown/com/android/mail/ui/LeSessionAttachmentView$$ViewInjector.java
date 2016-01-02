// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeSessionAttachmentView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeSessionAttachmentView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624141, "field 'mAttachmentsListView' and method 'onAttachmentsListItemClick'");
    target.mAttachmentsListView = (com.android.mail.ui.LeMessageAttachmentListView) view;
    ((android.widget.AdapterView<?>) view).setOnItemClickListener(
      new android.widget.AdapterView.OnItemClickListener() {
        @Override public void onItemClick(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          target.onAttachmentsListItemClick(p1, p2);
        }
      });
    view = finder.findRequiredView(source, 2131624399, "field 'mAttachmentAllView' and method 'onDownloadAttachmentAll'");
    target.mAttachmentAllView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onDownloadAttachmentAll();
        }
      });
  }

  public static void reset(com.android.mail.ui.LeSessionAttachmentView target) {
    target.mAttachmentsListView = null;
    target.mAttachmentAllView = null;
  }
}
