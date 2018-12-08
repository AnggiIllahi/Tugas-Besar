package com.example.anggi.tubes;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import com.example.anggi.tubes.Fragment.ClickListerner;


public class RecycleTouchListener implements RecyclerView.OnItemTouchListener {

    private GestureDetector gestureDetector;
    private ClickListerner clickListerner;


    public RecycleTouchListener(Context context, final RecyclerView recyclerView, final ClickListerner clickListerner)
    {
        this.clickListerner = clickListerner;
        gestureDetector = new GestureDetector(context, new GestureDetector.SimpleOnGestureListener(){
            public  boolean onSingleTapUp(MotionEvent e) {return true;}

            public void onLongPress(MotionEvent e)
            {
                View child = recyclerView.findChildViewUnder(e.getX(), e.getY());
                if(child !=null && clickListerner != null){
                    clickListerner.onLongClick(child, recyclerView.getChildPosition(child));
                }

            }
        });
    }
    public boolean onInterceptTouchEvent(RecyclerView rv, MotionEvent e) {
        View child = rv.findChildViewUnder(e.getX(), e.getY());
        if (child != null && clickListerner != null && gestureDetector.onTouchEvent(e))
        {
            clickListerner.onClick(child, rv.getChildPosition(child));
        }
        return false;
    }

    @Override
    public void onTouchEvent(RecyclerView rv, MotionEvent e) {

    }

    @Override
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {

    }
}
