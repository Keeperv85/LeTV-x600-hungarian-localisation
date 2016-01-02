// Generated code from Butter Knife. Do not modify!
package com.android.email.activity.setup;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeAccountSetupOptionsFragment$$ViewInjector {
  public static void inject(Finder finder, final com.android.email.activity.setup.LeAccountSetupOptionsFragment target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624081, "field 'mCheckFrequencyView' and method 'onAccountCheckFrequency'");
    target.mCheckFrequencyView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAccountCheckFrequency();
        }
      });
    view = finder.findRequiredView(source, 2131624084, "field 'mSyncWindowView' and method 'onAccountSyncWindow'");
    target.mSyncWindowView = (android.widget.TextView) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onAccountSyncWindow();
        }
      });
    view = finder.findRequiredView(source, 2131624085, "field 'mNotifyView'");
    target.mNotifyView = (android.widget.CompoundButton) view;
    view = finder.findRequiredView(source, 2131624086, "field 'mSyncContactsView'");
    target.mSyncContactsView = (android.widget.CompoundButton) view;
    view = finder.findRequiredView(source, 2131624087, "field 'mSyncCalendarView'");
    target.mSyncCalendarView = (android.widget.CompoundButton) view;
    view = finder.findRequiredView(source, 2131624088, "field 'mSyncEmailView'");
    target.mSyncEmailView = (android.widget.CompoundButton) view;
    view = finder.findRequiredView(source, 2131624089, "field 'mBackgroundAttachmentsView'");
    target.mBackgroundAttachmentsView = (android.widget.CompoundButton) view;
    view = finder.findRequiredView(source, 2131624324, "field 'mSyncContactsRow'");
    target.mSyncContactsRow = view;
    view = finder.findRequiredView(source, 2131624325, "field 'mSyncCalendarRow'");
    target.mSyncCalendarRow = view;
    view = finder.findRequiredView(source, 2131624326, "field 'mBackgroundAttachmentsRow'");
    target.mBackgroundAttachmentsRow = view;
    view = finder.findRequiredView(source, 2131624082, "field 'mSyncWindowRow'");
    target.mSyncWindowRow = view;
  }

  public static void reset(com.android.email.activity.setup.LeAccountSetupOptionsFragment target) {
    target.mCheckFrequencyView = null;
    target.mSyncWindowView = null;
    target.mNotifyView = null;
    target.mSyncContactsView = null;
    target.mSyncCalendarView = null;
    target.mSyncEmailView = null;
    target.mBackgroundAttachmentsView = null;
    target.mSyncContactsRow = null;
    target.mSyncCalendarRow = null;
    target.mBackgroundAttachmentsRow = null;
    target.mSyncWindowRow = null;
  }
}
