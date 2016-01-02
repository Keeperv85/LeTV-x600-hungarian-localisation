// Generated code from Butter Knife. Do not modify!
package com.android.email.activity.setup;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAccountSetupNamesFragment$$ViewInjector {
  public static void inject(Finder finder, final com.android.email.activity.setup.LeAccountSetupNamesFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624078, "field 'mDescription'");
    target.mDescription = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624080, "field 'mName'");
    target.mName = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624323, "field 'mAccountNameRow'");
    target.mAccountNameRow = view;
  }

  public static void reset(com.android.email.activity.setup.LeAccountSetupNamesFragment target) {
    target.mDescription = null;
    target.mName = null;
    target.mAccountNameRow = null;
  }
}
