package com.testpro.mdaling.aop_test;

import android.os.SystemClock;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.testpro.mdaling.aop_test.aop.annotation.BehaviorTrace;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnOne, btnTwo, btnThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnOne = (Button) findViewById(R.id.button_one);
        btnTwo = (Button) findViewById(R.id.button_two);
        btnThree = (Button) findViewById(R.id.button_three);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_one:
                buttonOneAction();
                break;
            case R.id.button_two:
                buttonTwoAction();
                break;
            case R.id.button_three:
                buttonThreeAction();
                break;
        }
    }

    @BehaviorTrace("button_one")
    public void buttonOneAction() {
        SystemClock.sleep(new Random().nextInt(2000));
    }

    @BehaviorTrace("button_two")
    public void buttonTwoAction() {
        SystemClock.sleep(new Random().nextInt(2000));
    }

    @BehaviorTrace("button_three")
    public void buttonThreeAction() {
        SystemClock.sleep(new Random().nextInt(2000));
    }
}
