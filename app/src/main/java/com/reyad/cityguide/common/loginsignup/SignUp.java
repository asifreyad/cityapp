package com.reyad.cityguide.common.loginsignup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;
import com.reyad.cityguide.R;

public class SignUp extends AppCompatActivity {

    ImageView BackArrow;
    TextView Tittle;
    Button NextBtn, LoginBtn;
    TextInputEditText NAME, EMAIL, PASSWORD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_r_signup);

        //hooke
        BackArrow = findViewById(R.id.back_btn);
        Tittle = findViewById(R.id.tittle);
//        //button hooke
        NextBtn = findViewById(R.id.next_btn);
        LoginBtn = findViewById(R.id.login_btn);
    }
//        //text field
//        NAME = findViewById(R.id.name);
//        EMAIL = findViewById(R.id.email);
//        PASSWORD = findViewById(R.id.password);


    public void cll_activity_signUp2(View view) {
        Intent intent = new Intent(SignUp.this, SignUp2ndClass.class);

        Pair[] pairs = new Pair[4];
        pairs[0] = new Pair<>(BackArrow, "back_btn_tran");
        pairs[1] = new Pair<>(Tittle, "create_ac_tran");
        pairs[2] = new Pair<>(NextBtn, "next_btn_tran");
        pairs[3] = new Pair<>(LoginBtn, "login_btn_tran");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUp.this, pairs);
        startActivity(intent, options.toBundle());
    }

}

































//    public void clickRegister(View view) {
//        UserResister();
//    }
//
//    private void UserResister() {
//        String name = NAME.getText().toString().trim();
//        String email= EMAIL.getText().toString().trim();
//        String password = PASSWORD.getText().toString().trim();
//    }
//    public void call_activity_login(View view) {
//
//    }


