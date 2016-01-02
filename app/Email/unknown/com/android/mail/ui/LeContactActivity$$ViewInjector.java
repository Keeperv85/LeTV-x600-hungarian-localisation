// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeContactActivity$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeContactActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624361, "field 'mBadgeView'");
    target.mBadgeView = (com.letv.leui.widget.LeQuickContactBadge) view;
    view = finder.findRequiredView(source, 2131624133, "field 'mNameView'");
    target.mNameView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624379, "field 'mEmailView'");
    target.mEmailView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624380, "field 'mActionList'");
    target.mActionList = (android.widget.ListView) view;
  }

  public static void reset(com.android.mail.ui.LeContactActivity target) {
    target.mBadgeView = null;
    target.mNameView = null;
    target.mEmailView = null;
    target.mActionList = null;
  }
}
