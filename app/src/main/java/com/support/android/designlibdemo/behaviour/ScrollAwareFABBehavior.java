package com.support.android.designlibdemo.behaviour;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Created by joychine on 2017/4/3.
 * 自定义behaviour, 滚动时隐藏fab
 */
public class ScrollAwareFABBehavior extends FloatingActionButton.Behavior {
    private String TAG = getClass().getSimpleName();

    public ScrollAwareFABBehavior(Context context, AttributeSet attrs) {
        super();
    }

    @Override
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout,
                                       FloatingActionButton child, View directTargetChild, View target, int nestedScrollAxes) {
        Log.e(TAG, "coordinatorLayout:" + coordinatorLayout + "\nchild:" + child + "\ndirectTargetChild：" + directTargetChild
                + "\ntarget:" + target + "\nnestedScrollAxes:" + nestedScrollAxes);
        return nestedScrollAxes == ViewCompat.SCROLL_AXIS_VERTICAL ||
                super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target,
                        nestedScrollAxes);
    }

    @Override
    public void onNestedScroll(CoordinatorLayout coordinatorLayout, FloatingActionButton child, View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        Log.e(TAG, "coordinatorLayout:" + coordinatorLayout + "\nchild:" + child + "\ntarget:" + target
                + "\ndxConsumed:" + dxConsumed + "\ndyConsumed:" + dyConsumed
                + "\ndxUnconsumed:" + dxUnconsumed + "\ndyUnconsumed:" + dyUnconsumed);
        super.onNestedScroll(coordinatorLayout, child, target, dxConsumed, dyConsumed, dxUnconsumed,
                dyUnconsumed);
        if (dyConsumed > 0 && child.getVisibility() == View.VISIBLE) {
            child.hide();
        } else if (dyConsumed < 0 && child.getVisibility() != View.VISIBLE) {
            child.show();
        }
    }
}

