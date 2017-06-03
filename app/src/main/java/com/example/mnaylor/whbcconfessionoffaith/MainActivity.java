package com.example.mnaylor.whbcconfessionoffaith;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        // default method for handling onClick Events..
        switch (v.getId()) {
            case R.id.button1:
                Intent one = new Intent(MainActivity.this, Section1.class);
                startActivity(one);
                break;
            case R.id.button2:
                Intent two = new Intent(MainActivity.this, Section2.class);
                startActivity(two);
                break;
            case R.id.button3:
                Intent three = new Intent(MainActivity.this, Section3.class);
                startActivity(three);
                break;
            default:
                break;
        }
    }
}