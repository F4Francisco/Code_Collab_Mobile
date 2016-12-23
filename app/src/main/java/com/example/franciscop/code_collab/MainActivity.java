package com.example.franciscop.code_collab;

import android.net.ParseException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button loginButton;
    private Button createAccountButton;



    private static final String TAG = "Code_Collab";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"onCreate");

        createAccountButton = (Button) findViewById(R.id.createButtonId);
        loginButton = (Button) findViewById(R.id.loginButtonId);

        //createAccountButton.setOnClickListener(this);
        //loginButton.setOnClickListener(this);
    }


    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"onCResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }



    //Enable Local Datastore



/*    ParseUser user = new ParseUser();
    user.setUsername("my name");
    user.setPassword("my pass");
    user.setEmail("email@example.com");

    user.signUpInBackground(new SignUpCallback){
        @Override
                public void done (ParseException e) {
            if (e==null) {
                Toast.makeText(getApplicationContext(), "Good",Toast.LENGTH_LONG).show();
            }else{

            }
        }
    }*/

}
