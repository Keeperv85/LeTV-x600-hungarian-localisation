// Generated code from Butter Knife. Do not modify!
package com.android.email.activity.setup;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeLoginFailGuideActivity$$ViewInjector {
  public static void inject(Finder finder, final com.android.email.activity.setup.LeLoginFailGuideActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624431, "field 'mLoginFailGuide'");
    target.mLoginFailGuide = (com.android.email.view.LeGuideWebview) view;
    view = finder.findRequiredView(source, 2131624429, "field 'mReferenceOther'");
    target.mReferenceOther = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624430, "field 'mLine'");
    target.mLine = view;
  }

  public static void reset(com.android.email.activity.setup.LeLoginFailGuideActivity target) {
    target.mLoginFailGuide = null;
    target.mReferenceOther = null;
    target.mLine = null;
  }
}
