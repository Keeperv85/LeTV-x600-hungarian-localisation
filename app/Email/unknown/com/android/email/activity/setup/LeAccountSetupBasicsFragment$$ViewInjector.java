// Generated code from Butter Knife. Do not modify!
package com.android.email.activity.setup;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAccountSetupBasicsFragment$$ViewInjector {
  public static void inject(Finder finder, final com.android.email.activity.setup.LeAccountSetupBasicsFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624055, "field 'mEmailView'");
    target.mEmailView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624313, "field 'mPasswordView'");
    target.mPasswordView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624317, "field 'mTypeTextView' and method 'onAccountType'");
    target.mTypeTextView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAccountType();
        }
      });
    view = finder.findRequiredView(source, 2131624309, "field 'mEmailClearButton'");
    target.mEmailClearButton = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624314, "field 'mPasswordClearButton'");
    target.mPasswordClearButton = (android.widget.ImageView) view;
    view = finder.findRequiredView(source, 2131624315, "field 'mPwdLayout'");
    target.mPwdLayout = view;
    view = finder.findRequiredView(source, 2131624311, "field 'mGmailLabel'");
    target.mGmailLabel = view;
  }

  public static void reset(com.android.email.activity.setup.LeAccountSetupBasicsFragment target) {
    target.mEmailView = null;
    target.mPasswordView = null;
    target.mTypeTextView = null;
    target.mEmailClearButton = null;
    target.mPasswordClearButton = null;
    target.mPwdLayout = null;
    target.mGmailLabel = null;
  }
}
