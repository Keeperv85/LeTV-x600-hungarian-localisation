// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeMessageAttachmentView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeMessageAttachmentView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624141, "field 'mAttachmentsListView', method 'onAttachmentsListItemClick', and method 'onItemLongClick'");
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
    ((android.widget.AdapterView<?>) view).setOnItemLongClickListener(
      new android.widget.AdapterView.OnItemLongClickListener() {
        @Override public boolean onItemLongClick(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          return target.onItemLongClick(p0, p1, p2, p3);
        }
      });
    view = finder.findRequiredView(source, 2131624395, "field 'mLeMessageAttachmentView'");
    target.mLeMessageAttachmentView = (com.android.mail.ui.LeMessageAttachmentView) view;
    view = finder.findRequiredView(source, 2131624396, "field 'mOpenAllView' and method 'onExpandClick'");
    target.mOpenAllView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onExpandClick();
        }
      });
    view = finder.findRequiredView(source, 2131624397, "field 'mdownloadView'");
    target.mdownloadView = view;
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
    view = finder.findRequiredView(source, 2131624398, "field 'mCollapseView' and method 'onCollapseClick'");
    target.mCollapseView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCollapseClick();
        }
      });
  }

  public static void reset(com.android.mail.ui.LeMessageAttachmentView target) {
    target.mAttachmentsListView = null;
    target.mLeMessageAttachmentView = null;
    target.mOpenAllView = null;
    target.mdownloadView = null;
    target.mAttachmentAllView = null;
    target.mCollapseView = null;
  }
}
