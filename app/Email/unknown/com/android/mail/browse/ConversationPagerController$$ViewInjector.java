// Generated code from Butter Knife. Do not modify!
package com.android.mail.browse;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class ConversationPagerController$$ViewInjector {
  public static void inject(Finder finder, final com.android.mail.browse.ConversationPagerController target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624248, "field 'mPager'");
    target.mPager = (android.support.v4.view.ViewPager) view;
    view = finder.findRequiredView(source, 2131624424, "field 'mBottomBar'");
    target.mBottomBar = (com.android.mail.ui.LeConversationViewBottomBar) view;
  }

  public static void reset(com.android.mail.browse.ConversationPagerController target) {
    target.mPager = null;
    target.mBottomBar = null;
  }
}
