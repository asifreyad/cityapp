package com.reyad.cityguide.common.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

import com.reyad.cityguide.R;

public class StartUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_r_startup);
    }
//call login page
    public void call_activity_login(View view){
        Intent intent = new Intent(StartUp.this, Login.class);
        //pair tran
        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<>(findViewById(R.id.login_btn), "login_tran");
        //start activity
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(StartUp.this, pairs);
        startActivity(intent, options.toBundle());

    }
// call sign up page
    public void call_activity_signUp(View view) {
        Intent intent = new Intent(StartUp.this, SignUp.class);
        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<>(findViewById(R.id.signUp_btn), "SignUp_tran");
        //start activity
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(StartUp.this, pairs);
        startActivity(intent, options.toBundle());
    }
}
