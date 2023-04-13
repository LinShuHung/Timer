package com.suhun.timer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.suhun.timer.functionobj.StopWatch;

public class MainActivity extends AppCompatActivity {
    public String tag = MainActivity.class.getSimpleName();

    private Button leftButton, rightButton;
    private TextView clock;
    private ListView lapRecord;
    private StopWatch stopWatch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        stopWatch = new StopWatch(clock);
    }

    private void initView(){
        clock = findViewById(R.id.timer);
        leftButton = findViewById(R.id.leftBtn);
        rightButton = findViewById(R.id.rightBtn);
        lapRecord = findViewById(R.id.lap);
    }

    public void leftBtnOnClick(View view){

    }

    public void rightBtnOnClick(View view){
        stopWatch.showRight(leftButton, rightButton);
    }
}