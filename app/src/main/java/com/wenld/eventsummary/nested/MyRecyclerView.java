package com.wenld.eventsummary.nested;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;

/**
 * <p/>
 * Author: 温利东 on 2017/7/26 11:22.
 * blog: http://blog.csdn.net/sinat_15877283
 * github: https://github.com/LidongWen
 */

public class MyRecyclerView extends RecyclerView {
    public MyRecyclerView(Context context) {
        super(context);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyRecyclerView(Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    float x = 0;
    float y = 0;

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean bol = super.onInterceptTouchEvent(ev);
        final int action = ev.getAction();
        switch (action & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN: {
                final ViewParent parent = getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                x = ev.getX();
                y = ev.getY();
                break;
            }
        }
        return bol;
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        final int action = ev.getAction();
        switch (action & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_MOVE: {
                final boolean scrollup;
                if (ev.getY() - y > 0) {
                    scrollup = false;
                } else {
                    scrollup = true;
                }
                if (!canScrollVertically(scrollup ? 1 : -1)) {
                    final ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(false);
                    }
                }
                y = ev.getY();
            }
        }
        return super.onTouchEvent(ev);
    }
}
