package com.wenld.eventsummary.event;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/**
 * <p/>
 * Author: wenld on 2017/7/26 14:52.
 * blog: http://www.jianshu.com/u/99f514ea81b3
 * github: https://github.com/LidongWen
 *
 *  代码 来自   http://www.cnblogs.com/net168/p/4165970.html
 */

public class MyFrameLayout extends FrameLayout {

    public MyFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e("test", "【经理】下达任务：" + Util.actionToString(ev.getAction())  + "，找个人帮我完成，任务往下分发。");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        boolean relust = Util.经理拦截;
        Log.e("test", "【经理】是否拦截任务：" + Util.actionToString(ev.getAction())  + "，拦下来？" + relust);
        return relust;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean relust = Util.经理消费;
        Log.e("test", "【经理】完成任务：" + Util.actionToString(event.getAction()) + "，【组长】太差劲了，以后不再找你干活了，我自来搞定！是否解决：" + Util.canDoTask(relust));
        return relust;
    }
}