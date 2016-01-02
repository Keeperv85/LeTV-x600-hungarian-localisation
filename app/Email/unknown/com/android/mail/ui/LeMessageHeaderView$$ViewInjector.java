// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeMessageHeaderView$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeMessageHeaderView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624409, "field 'mSummaryPanel'");
    target.mSummaryPanel = (android.view.ViewGroup) view;
    view = finder.findRequiredView(source, 2131624333, "field 'mSummaryView'");
    target.mSummaryView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624421, "field 'mCcPanel'");
    target.mCcPanel = (android.view.ViewGroup) view;
    view = finder.findRequiredView(source, 2131624417, "field 'mDetailPanel' and method 'onCollapseClick'");
    target.mDetailPanel = (android.view.ViewGroup) view;
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCollapseClick();
        }
      });
    view = finder.findRequiredView(source, 2131624166, "field 'mSubjectView'");
    target.mSubjectView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624174, "field 'mSendersView'");
    target.mSendersView = (com.android.mail.ui.LeEmailAddressTextView) view;
    view = finder.findRequiredView(source, 2131624418, "field 'mSendersLabelView'");
    target.mSendersLabelView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624420, "field 'mReceiversView'");
    target.mReceiversView = (com.android.mail.ui.LeEmailAddressTextView) view;
    view = finder.findRequiredView(source, 2131624419, "field 'mReceiversLabelView'");
    target.mReceiversLabelView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624124, "field 'mCcView'");
    target.mCcView = (com.android.mail.ui.LeEmailAddressTextView) view;
    view = finder.findRequiredView(source, 2131624123, "field 'mCcLabelView'");
    target.mCcLabelView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624423, "field 'mSendTimeView'");
    target.mSendTimeView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624422, "field 'mSendTimeLabelView'");
    target.mSendTimeLabelView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624410, "field 'mSummaryLabelView'");
    target.mSummaryLabelView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624416, "field 'mSummaryTimeView'");
    target.mSummaryTimeView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624411, "field 'mReecipientPanel'");
    target.mReecipientPanel = (android.view.ViewGroup) view;
    view = finder.findRequiredView(source, 2131624413, "field 'mRecipientLabelView'");
    target.mRecipientLabelView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624414, "field 'mRecipientView'");
    target.mRecipientView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624415, "field 'mRecipientCountView'");
    target.mRecipientCountView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624408, "field 'mOrPanel'");
    target.mOrPanel = (android.view.ViewGroup) view;
    view = finder.findRequiredView(source, 2131624398, "method 'onCollapseClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCollapseClick();
        }
      });
    view = finder.findRequiredView(source, 2131624407, "method 'onCollapseClick'");
    view.setOnClickListener(
      new android.view.View.OnClickListener() {
        @Override public void onClick(
          android.view.View p0
        ) {
          target.onCollapseClick();
        }
      });
  }

  public static void reset(com.android.mail.ui.LeMessageHeaderView target) {
    target.mSummaryPanel = null;
    target.mSummaryView = null;
    target.mCcPanel = null;
    target.mDetailPanel = null;
    target.mSubjectView = null;
    target.mSendersView = null;
    target.mSendersLabelView = null;
    target.mReceiversView = null;
    target.mReceiversLabelView = null;
    target.mCcView = null;
    target.mCcLabelView = null;
    target.mSendTimeView = null;
    target.mSendTimeLabelView = null;
    target.mSummaryLabelView = null;
    target.mSummaryTimeView = null;
    target.mReecipientPanel = null;
    target.mRecipientLabelView = null;
    target.mRecipientView = null;
    target.mRecipientCountView = null;
    target.mOrPanel = null;
  }
}
