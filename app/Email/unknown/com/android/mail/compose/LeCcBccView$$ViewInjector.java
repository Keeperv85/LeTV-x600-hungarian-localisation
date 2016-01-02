// Generated code from Butter Knife. Do not modify!
package com.android.mail.compose;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeCcBccView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.compose.LeCcBccView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624122, "field 'mCc'");
    target.mCc = view;
    view = finder.findRequiredView(source, 2131624125, "field 'mBcc'");
    target.mBcc = view;
  }

  public static void reset(com.android.mail.compose.LeCcBccView target) {
    target.mCc = null;
    target.mBcc = null;
  }
}
