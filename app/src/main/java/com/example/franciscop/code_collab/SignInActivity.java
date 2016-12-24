package com.example.franciscop.code_collab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class SignInActivity extends AppCompatActivity {

    private Toolbar mSignInToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        mSignInToolbar = (Toolbar) findViewById(R.id.SigninToolbar);
        setSupportActionBar(mSignInToolbar);

        getActionBar().setDisplayHomeAsUpEnabled(true);



    }
}
