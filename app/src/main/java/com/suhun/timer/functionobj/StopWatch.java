package com.suhun.timer.functionobj;

import android.widget.Button;

public class StopWatch {
    private boolean isStart;

    public StopWatch(){
        super();
        isStart = false;
    }

    public void showLeft(){

    }

    public void showRight(Button leftButton, Button rightButton){
        isStart = !isStart;
        if(isStart){
            rightButton.setText("Stop");
            leftButton.setText("Lap");

        }else{
            rightButton.setText("Start");
            leftButton.setText("Reset");
        }
    }

    private void doStart(){

    }

    private void doStop(){

    }
}
