// Generated code from Butter Knife. Do not modify!
package com.android.email.activity.setup;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAccountSetupOutgoingFragment$$ViewInjector {
  public static void inject(Finder finder, final com.android.email.activity.setup.LeAccountSetupOutgoingFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624067, "field 'mUsernameView'");
    target.mUsernameView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624313, "field 'mPasswordView'");
    target.mPasswordView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624070, "field 'mServerView'");
    target.mServerView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624071, "field 'mPortView'");
    target.mPortView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624096, "field 'mRequireLoginView'");
    target.mRequireLoginView = (android.widget.CompoundButton) view;
    view = finder.findRequiredView(source, 2131624072, "field 'mSecurityTypeView' and method 'onAccountSecurityType'");
    target.mSecurityTypeView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAccountSecurityType();
        }
      });
  }

  public static void reset(com.android.email.activity.setup.LeAccountSetupOutgoingFragment target) {
    target.mUsernameView = null;
    target.mPasswordView = null;
    target.mServerView = null;
    target.mPortView = null;
    target.mRequireLoginView = null;
    target.mSecurityTypeView = null;
  }
}
