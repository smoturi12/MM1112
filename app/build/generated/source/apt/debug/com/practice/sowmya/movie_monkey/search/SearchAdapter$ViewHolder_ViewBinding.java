// Generated code from Butter Knife. Do not modify!
package com.practice.sowmya.movie_monkey.search;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.practice.sowmya.movie_monkey.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchAdapter$ViewHolder_ViewBinding implements Unbinder {
  private SearchAdapter.ViewHolder target;

  @UiThread
  public SearchAdapter$ViewHolder_ViewBinding(SearchAdapter.ViewHolder target, View source) {
    this.target = target;

    target.titleView = Utils.findRequiredViewAsType(source, R.id.movie_title, "field 'titleView'", TextView.class);
    target.imageView = Utils.findRequiredViewAsType(source, R.id.movie_image, "field 'imageView'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchAdapter.ViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.titleView = null;
    target.imageView = null;
  }
}
