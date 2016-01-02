// Generated code from Butter Knife. Do not modify!
package com.android.mail.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeSessionInfoActivity$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.ui.LeSessionInfoActivity target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624461, "field 'mContactsGrid'");
    target.mContactsGrid = (android.widget.GridView) view;
    view = finder.findRequiredView(source, 2131624462, "field 'mAttachmentView'");
    target.mAttachmentView = (com.android.mail.ui.LeSessionAttachmentView) view;
    view = finder.findRequiredView(source, 2131624465, "field 'mSubjectReadSwitch'");
    target.mSubjectReadSwitch = (com.letv.leui.widget.LeSwitch) view;
    view = finder.findRequiredView(source, 2131624463, "field 'mLayout'");
    target.mLayout = (android.view.ViewGroup) view;
  }

  public static void reset(com.android.mail.ui.LeSessionInfoActivity target) {
    target.mContactsGrid = null;
    target.mAttachmentView = null;
    target.mSubjectReadSwitch = null;
    target.mLayout = null;
  }
}
