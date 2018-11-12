// Generated code from Butter Knife. Do not modify!
package com.practice.sowmya.movie_monkey.search;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.practice.sowmya.movie_monkey.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchActivity_ViewBinding implements Unbinder {
  private SearchActivity target;

  @UiThread
  public SearchActivity_ViewBinding(SearchActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchActivity_ViewBinding(SearchActivity target, View source) {
    this.target = target;

    target.moviesResultsView = Utils.findRequiredViewAsType(source, R.id.movie_results, "field 'moviesResultsView'", RecyclerView.class);
    target.errorTextView = Utils.findRequiredViewAsType(source, R.id.error_textView, "field 'errorTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.moviesResultsView = null;
    target.errorTextView = null;
  }
}
