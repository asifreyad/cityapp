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

import com.reyad.cityguide.R;

public class SignUp2ndClass extends AppCompatActivity {

    ImageView Back;
    TextView Tittle;
    Button Next, Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_r_sign_up2nd_class);

        //hooke
        Back = findViewById(R.id.back_btn);
        Tittle = findViewById(R.id.tittle);
        Next = findViewById(R.id.next_btn);
        Login = findViewById(R.id.login_btn);

    }

    public void cll_activity_signUp3(View view) {
        Intent intent = new Intent(SignUp2ndClass.this, SignUp3rdclass.class);

        Pair[] pairs = new Pair[4];
        pairs[0] = new Pair<>(Back,"back_btn_tran");
        pairs[1] = new Pair<>(Tittle,"create_ac_tran");
        pairs[2] = new Pair<>(Next,"next_btn_tran");
        pairs[3] = new Pair<>(Login,"login_btn_tran");

        ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SignUp2ndClass.this, pairs);
        startActivity(intent, options.toBundle());

    }
}
