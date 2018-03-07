package uno.bai.tim.week2draw2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.widget.ImageView;

import java.util.ArrayList;

/**
 * Created by tim on 8/03/18.
 */

import  android.support.v7.widget.AppCompatImageView;

public class MyImage extends AppCompatImageView {



    PointF pos = new PointF();
    Paint paint = new Paint();
    ArrayList<PointF> points = new ArrayList<>();


    public MyImage(Context context){
        super(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent){


        float x =motionEvent.getX();
        float y =motionEvent.getY();
        pos = new PointF(x,y);
        points.add(pos);
        paint.setColor(Color.GREEN);

        // force a view to draw
        invalidate();
        return true;

    }

    @Override
    public void onDraw(Canvas canvas){
        super.onDraw(canvas);

        if (points.size()>0){
            for (int i =0; i< points.size(); i++){
                pos = points.get(i);
                canvas.drawCircle(pos.x, pos.y, 50, paint);

            }


        }


//        canvas.drawCircle(pos.x,pos.y, 50, paint);
    }
}
