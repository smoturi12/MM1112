// Generated code from Butter Knife. Do not modify!
package com.practice.sowmya.movie_monkey.details;

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

public class DetailsActivity_ViewBinding implements Unbinder {
  private DetailsActivity target;

  @UiThread
  public DetailsActivity_ViewBinding(DetailsActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DetailsActivity_ViewBinding(DetailsActivity target, View source) {
    this.target = target;

    target.imageView = Utils.findRequiredViewAsType(source, R.id.movie_poster, "field 'imageView'", ImageView.class);
    target.titleView = Utils.findRequiredViewAsType(source, R.id.movie_title, "field 'titleView'", TextView.class);
    target.releaseDateView = Utils.findRequiredViewAsType(source, R.id.movie_release_date, "field 'releaseDateView'", TextView.class);
    target.overviewView = Utils.findRequiredViewAsType(source, R.id.movie_overview, "field 'overviewView'", TextView.class);
    target.errorView = Utils.findRequiredViewAsType(source, R.id.error_view, "field 'errorView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DetailsActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.imageView = null;
    target.titleView = null;
    target.releaseDateView = null;
    target.overviewView = null;
    target.errorView = null;
  }
}
