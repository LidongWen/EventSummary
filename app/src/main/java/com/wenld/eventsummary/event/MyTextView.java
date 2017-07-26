package com.wenld.eventsummary.event;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * <p/>
 * Author: wenld on 2017/7/26 14:54.
 * blog: http://www.jianshu.com/u/99f514ea81b3
 * github: https://github.com/LidongWen
 * * 代码 来自   http://www.cnblogs.com/net168/p/4165970.html
 */

public class MyTextView extends AppCompatTextView {


    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.e("test", "【员工】下达任务：" + Util.actionToString(event.getAction()) + "，我没手下了，唉~自己干吧");
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean relust = Util.员工消费;
        Log.i("test", "【员工】完成任务：" + Util.actionToString(event.getAction()) + "，【员工】现在只能靠自己了！是否解决：" + Util.canDoTask(relust));
        return relust;
    }
}