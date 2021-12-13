package com.example.lifecycleactivity18102021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button mBtnNavigateScreen3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("BBB","Main2: onCreate");
        mBtnNavigateScreen3 = findViewById(R.id.buttonNavigateScreen3);
        mBtnNavigateScreen3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this,MainActivity3.class));
            }
        });
    }
    @Override
    protected void onStart() {
        Log.d("BBB","Main2: onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("BBB","Main2: onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("BBB","Main2: onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("BBB","Main2: onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("BBB","Main2: onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("BBB","Main2: onRestart");
    }
}