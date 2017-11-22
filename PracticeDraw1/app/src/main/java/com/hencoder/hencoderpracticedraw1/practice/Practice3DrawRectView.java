package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice3DrawRectView extends View {

    public Practice3DrawRectView(Context context) {
        super(context);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice3DrawRectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawRect() 方法画矩形
        int rectWidth=400,rectHeight=600;
        int centerX=getMeasuredWidth()/2,centerY=getHeight()/2;
        int left=centerX-rectWidth/2;
        int top=centerY-rectHeight/2;
        int right=rectWidth+left;
        int bottom=top+rectHeight;
        Paint paint = new Paint();
        canvas.drawRect(left,top,right,bottom, paint);
    }
}
