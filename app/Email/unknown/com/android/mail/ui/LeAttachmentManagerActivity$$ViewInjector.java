// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAttachmentManagerActivity$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeAttachmentManagerActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624141, "field 'mListView', method 'onItemClick', and method 'onItemLongClick'");
    target.mListView = (com.letv.leui.widget.LeListView) view;
    ((android.widget.AdapterView<?>) view).setOnItemClickListener(
      new android.widget.AdapterView.OnItemClickListener() {
        @Override public void onItemClick(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          target.onItemClick(p1, p2);
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
    view = finder.findRequiredView(source, 2131624329, "field 'mMaskView'");
    target.mMaskView = (com.letv.commons.widget.LeMaskView) view;
    view = finder.findRequiredView(source, 2131624048, "field 'mEmptyView'");
    target.mEmptyView = view;
  }

  public static void reset(com.android.mail.ui.LeAttachmentManagerActivity target) {
    target.mListView = null;
    target.mMaskView = null;
    target.mEmptyView = null;
  }
}
