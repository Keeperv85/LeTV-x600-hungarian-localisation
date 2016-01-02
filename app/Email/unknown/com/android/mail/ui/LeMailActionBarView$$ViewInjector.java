// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeMailActionBarView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeMailActionBarView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624392, "field 'mTitleBar'");
    target.mTitleBar = (com.letv.leui.app.LeTopWidget) view;
    view = finder.findRequiredView(source, 2131624341, "field 'mSearchWidget'");
    target.mSearchWidget = (com.android.mail.ui.LeSearchView) view;
  }

  public static void reset(com.android.mail.ui.LeMailActionBarView target) {
    target.mTitleBar = null;
    target.mSearchWidget = null;
  }
}
