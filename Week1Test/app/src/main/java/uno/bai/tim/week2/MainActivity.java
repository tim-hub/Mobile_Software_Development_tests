package uno.bai.tim.week2;

import android.support.v4.app.SupportActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.MotionEvent;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    TextView touchArea, text_x, text_y;
    float x, y;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btn_start = findViewById(R.id.btn_start);


        btn_start.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {


                        touchArea = (TextView)findViewById(R.id.panel);
                        text_x = (TextView)findViewById((R.id.x));
                        text_y = (TextView)findViewById(R.id.y);

                        touchArea.setOnTouchListener(handleTouch);

                    }

        });

    }

    private View.OnTouchListener handleTouch;

    {
        handleTouch = new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                x= motionEvent.getX();
                y=motionEvent.getY();


                if(view.getId() ==R.id.panel ){
                    text_x.setText(Float.toString(x));
                    text_y.setText(Float.toString(y));

                    return true;
                }

                return false;
            }
        };
    }


}
