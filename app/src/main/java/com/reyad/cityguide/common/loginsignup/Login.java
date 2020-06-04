package com.reyad.cityguide.common.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;

import com.reyad.cityguide.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_r_login);
    }

    // call sign up page
    public void call_activity_signUp(View view) {
        Intent intent = new Intent(Login.this, SignUp.class);
        Pair[] pairs = new Pair[1];
        pairs[0] = new Pair<>(findViewById(R.id.create_account), "SignUp_tran");
        //start activity
        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(Login.this, pairs);
        startActivity(intent, options.toBundle());
    }
}
