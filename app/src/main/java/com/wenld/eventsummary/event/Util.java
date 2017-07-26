package com.wenld.eventsummary.event;

import android.view.MotionEvent;

/**
 * <p/>
 * Author: wenld on 2017/7/26 14:53.
 * blog: http://www.jianshu.com/u/99f514ea81b3
 * github: https://github.com/LidongWen
 *
 *  代码 来自   http://www.cnblogs.com/net168/p/4165970.html
 */

public class Util {
    public static String actionToString(int action) {
        String result = null;
        switch (action) {
            case MotionEvent.ACTION_DOWN:
                result = "ACTION_DOWN";
                break;
            case MotionEvent.ACTION_MOVE:
                result = "ACTION_MOVE";
                break;
            case MotionEvent.ACTION_UP:
                result = "ACTION_UP";
                break;
        }
        return result;
    }

    public static String canDoTask(boolean can) {
        String result = null;
        if (can) {
            result = "完美解决该任务！";
        } else {
            result = "这活搞不定，交给老大完成吧。";
        }
        return result;
    }

    public static String canDoTaskTop(boolean can) {
        String result = null;
        if (can) {
            result = "完美解决该任务！";
        } else {
            result = "这活搞不定，放弃该任务。";
        }
        return result;
    }

    public static boolean 经理拦截=false;
    public static boolean 经理消费=false;
    public static boolean 组长拦截=false;
    public static boolean 组长消费=false;

    public static boolean 员工消费=false;

    public static boolean 老板消费=false;
}
