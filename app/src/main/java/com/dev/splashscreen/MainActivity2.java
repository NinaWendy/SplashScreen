package com.dev.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Hide Title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        //Hide Action bar
        Objects.requireNonNull(getSupportActionBar()).hide();

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
    }
}