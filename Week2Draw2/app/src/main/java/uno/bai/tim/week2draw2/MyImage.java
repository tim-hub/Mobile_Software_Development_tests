package uno.bai.tim.week2draw2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.widget.ImageView;

/**
 * Created by tim on 8/03/18.
 */

public class MyImage extends ImageView {


    float x;
    float y;
    PointF pos = new PointF();
    Paint paint = new Paint();


    public MyImage(Context context){
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){


        x =motionEvent.getX();
        y =motionEvent.getY();
        pos = new PointF(x,y);
        invalidate();
        return true;
//        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        paint.setColor(Color.GREEN);

        canvas.drawCircle(pos.x,pos.y, 50, paint);
    }
}
