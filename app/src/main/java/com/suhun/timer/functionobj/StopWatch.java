package com.suhun.timer.functionobj;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.Timer;
import java.util.TimerTask;

public class StopWatch {
    public String tag = StopWatch.class.getSimpleName();
    private boolean isStart;
    private TextView clock;
    private Timer timer;
    private int counter;
    private MyTask myTask;
    private UIHandler uiHandler = new UIHandler();

    public StopWatch(TextView clock){
        super();
        isStart = false;
        this.clock = clock;
        timer = new Timer();
        counter = 0;
    }

    private class UIHandler extends Handler{
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            clock.setText(""+counter);
        }
    }

    private class MyTask extends TimerTask{
        @Override
        public void run() {
            counter++;
            uiHandler.sendEmptyMessage(0);
        }
    }
    public void showLeft(){

    }

    public void showRight(Button leftButton, Button rightButton){
        isStart = !isStart;
        if(isStart){
            rightButton.setText("Stop");
            leftButton.setText("Lap");
            doStart();

        }else{
            rightButton.setText("Start");
            leftButton.setText("Reset");
            doStop();
        }
    }

    private void doStart(){
        myTask = new MyTask();
        timer.schedule(myTask, 10, 10);
    }

    private void doStop(){
        if(myTask!=null){
            myTask.cancel();
            myTask=null;
        }
    }
}
