package com.androidxx.yangjw.eventdispatchdemo;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by yangjw on 2016/7/7.
 */
public class CustomLinearLayout extends LinearLayout {
    private static final String TAG = "androidxx";

    public CustomLinearLayout(Context context) {
        this(context,null);
    }

    public CustomLinearLayout(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public CustomLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    /**
     * 事件分发
     * @param ev
     * @return
     */
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "LinearLayout--->dispatchTouchEvent: ");
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "LinearLayout--->dispatchTouchEvent:  ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "LinearLayout--->dispatchTouchEvent:  ACTION_UP");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    /**
     * 事件拦截
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.d(TAG, "LinearLayout--->onInterceptTouchEvent: ");
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "LinearLayout--->onInterceptTouchEvent:  ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "LinearLayout--->onInterceptTouchEvent:  ACTION_UP");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    /**
     * 事件消费
     * @param event
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.d(TAG, "LinearLayout--->onTouchEvent:  ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.d(TAG, "LinearLayout--->onTouchEvent:  ACTION_UP");
                break;
        }
        return true;
    }
}
