package com.hencoder.hencoderpracticedraw7.practice.practice03;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.hencoder.hencoderpracticedraw7.Utils;

public class Practice03OfObjectView extends View {
    public static final float RADIUS = Utils.dpToPixel(20);

    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

    PointF position = new PointF();//（0，0）-->(1,1)

    public Practice03OfObjectView(Context context) {
        super(context);
    }

    public Practice03OfObjectView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03OfObjectView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setColor(Color.parseColor("#009688"));
    }

    public PointF getPosition() {
        return position;
    }

    public void setPosition(PointF position) {
        if (position != null) {
            this.position.set(position);
            invalidate();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawColor(Color.RED);

        float innerPaddingLeft = RADIUS * 1;
        float innterPaddingRight = RADIUS * 1;
        float innterPaddingTop = RADIUS * 1;
        float innterPaddingBottom = RADIUS * 3;
        float width = getWidth() - innerPaddingLeft - innterPaddingRight - RADIUS * 2;//除去球和pandding的剩余空间
        float height = getHeight() - innterPaddingTop - innterPaddingBottom - RADIUS * 2;//除去球和pandding的剩余空间

        canvas.drawCircle(innerPaddingLeft + RADIUS + width * position.x,
                innterPaddingTop + RADIUS + height * position.y,
                RADIUS, paint);
    }
}
