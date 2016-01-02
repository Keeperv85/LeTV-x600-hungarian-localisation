// Generated code from Butter Knife. Do not modify!
package com.android.email.activity.setup;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAccountSetupIncomingFragment$$ViewInjector {
  public static void inject(Finder finder, final com.android.email.activity.setup.LeAccountSetupIncomingFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624067, "field 'mUsernameView'");
    target.mUsernameView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624313, "field 'mPasswordEdit'");
    target.mPasswordEdit = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624070, "field 'mServerView'");
    target.mServerView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624071, "field 'mPortView'");
    target.mPortView = (android.widget.EditText) view;
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
    view = finder.findRequiredView(source, 2131624074, "field 'mDeletePolicyView' and method 'onAccountDeletePolicy'");
    target.mDeletePolicyView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAccountDeletePolicy();
        }
      });
    view = finder.findRequiredView(source, 2131624076, "field 'mImapPathPrefixView'");
    target.mImapPathPrefixView = (android.widget.EditText) view;
    view = finder.findRequiredView(source, 2131624320, "field 'mDeletePolicySection'");
    target.mDeletePolicySection = view;
    view = finder.findRequiredView(source, 2131624075, "field 'mImapPathPrefixSection'");
    target.mImapPathPrefixSection = view;
  }

  public static void reset(com.android.email.activity.setup.LeAccountSetupIncomingFragment target) {
    target.mUsernameView = null;
    target.mPasswordEdit = null;
    target.mServerView = null;
    target.mPortView = null;
    target.mSecurityTypeView = null;
    target.mDeletePolicyView = null;
    target.mImapPathPrefixView = null;
    target.mDeletePolicySection = null;
    target.mImapPathPrefixSection = null;
  }
}
