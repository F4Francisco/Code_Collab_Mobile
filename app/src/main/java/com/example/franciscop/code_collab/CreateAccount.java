package com.example.franciscop.code_collab;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import Util.ProgressGenerator;

public class CreateAccount extends AppCompatActivity implements ProgressGenerator.OnCompleteListener {
    private android.widget.EditText emailAddress;
    private android.widget.EditText  password;
    private android.widget.EditText  username;
    private ProgressGenerator progressGenerator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        progressGenerator = new ProgressGenerator(this);
    }



    public void createAccount(){

    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
       // getMenuInflater().inflate(android.R.menu.menu_create_account,menu);
        return true;
    }


    @Override
    public void onComplete() {

    }
}
