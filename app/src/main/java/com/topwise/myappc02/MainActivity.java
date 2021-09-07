package com.topwise.myappc02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * @author mojialiang
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.trueBtn);
        textView = findViewById(R.id.textView001);
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(MainActivity.this, new HelloWorld().sayHello(), Toast.LENGTH_LONG).show();
        HelloWorld helloWorld = new HelloWorld();
        String show = helloWorld.sayHello();
        textView.setText(show);

    }
}