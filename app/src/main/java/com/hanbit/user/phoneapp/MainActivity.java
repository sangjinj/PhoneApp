package com.hanbit.user.phoneapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{
    Button btDial,btCall;
    Phone phone = new Phone(this,this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btDial = (Button) findViewById(R.id.btDial);
        btCall = (Button) findViewById(R.id.btCall);

        btDial.setOnClickListener(this);
        btCall.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btDial:
                Toast.makeText(MainActivity.this,"다이얼 호출",Toast.LENGTH_LONG);
                phone.dial("010-6426-3539");

                break;
            case R.id.btCall:
                Toast.makeText(MainActivity.this,"콜 호출",Toast.LENGTH_LONG);
                phone.call("010-6426-3539");
                break;
        }
    }
}
