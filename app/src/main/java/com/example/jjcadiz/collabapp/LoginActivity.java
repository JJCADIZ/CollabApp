package com.example.jjcadiz.collabapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by jjcadiz on 11/7/16.
 */

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);


        EditText Username = (EditText) findViewById(R.id.edtUser);
        EditText Password = (EditText) findViewById(R.id.edtPass);
        Button Login = (Button) findViewById(R.id.btnLogin);

    }
}
