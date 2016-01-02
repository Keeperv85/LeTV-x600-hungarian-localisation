// Generated code from Butter Knife. Do not modify!
package com.letv.commons.chip;

import android.view.View;
import butterknife.ButterKnife.Finder;

public class LeRecipientEditTextView$$ViewInjector {
  public static void inject(Finder finder, final com.letv.commons.chip.LeRecipientEditTextView target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624450, "field 'mEditText'");
    target.mEditText = (com.letv.commons.chip.RecipientEditTextView) view;
    view = finder.findRequiredView(source, 2131624451, "field 'mTextViewPanel'");
    target.mTextViewPanel = view;
    view = finder.findRequiredView(source, 2131624452, "field 'mTextView'");
    target.mTextView = (android.widget.TextView) view;
    view = finder.findRequiredView(source, 2131624453, "field 'mMoreView'");
    target.mMoreView = (android.widget.TextView) view;
  }

  public static void reset(com.letv.commons.chip.LeRecipientEditTextView target) {
    target.mEditText = null;
    target.mTextViewPanel = null;
    target.mTextView = null;
    target.mMoreView = null;
  }
}
