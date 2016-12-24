package com.example.franciscop.code_collab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GetStartedActivity extends AppCompatActivity {
    private Button mSignINBtn;
    private Button mCreateBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_started);

        mSignINBtn = (Button) findViewById(R.id.getStartedLogin);
        mCreateBtn = (Button) findViewById(R.id.getStartedcreate);

        mSignINBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signIntent = new Intent(GetStartedActivity.this, SignInActivity.class);
                startActivity(signIntent);
            }
        });

        mCreateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent createIntent = new Intent(GetStartedActivity.this, CreateAccount.class);
                startActivity(createIntent);
            }
        });
    }
}