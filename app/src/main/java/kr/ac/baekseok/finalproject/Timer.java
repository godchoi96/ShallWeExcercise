package kr.ac.baekseok.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class Timer extends AppCompatActivity {

    private Chronometer mChronomter;
    Button btnStart1;
    Button btnPause1;
    Button btnReset1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        mChronomter = (Chronometer) findViewById(R.id.chronometer);

        Button btnStart1 = (Button) findViewById(R.id.btnStart1);
        Button btnPause1 = (Button) findViewById(R.id.btnPause1);
        Button btnReset1 = (Button) findViewById(R.id.btnReset1);

        btnStart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChronomter.setBase(SystemClock.elapsedRealtime());
                mChronomter.start();
            }
        });

        btnPause1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChronomter.stop();
            }
        });

        btnReset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mChronomter.stop();
                mChronomter.setBase(SystemClock.elapsedRealtime());
            }
        });

    }
}
