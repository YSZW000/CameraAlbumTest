package com.example.cameraalbumtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class LoginActivity extends AppCompatActivity {
    public Button register;
    public Button login;
    public EditText edt_account;
    public EditText edt_password;
    private String account;
    private String password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        edt_account= findViewById(R.id.account);
        edt_password=findViewById(R.id.password);
        setContentView(R.layout.activity_login);
        register=findViewById(R.id.register);
        login=findViewById(R.id.login);
//测试
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(LoginActivity.this,RegisterActivity.class);
                startActivity(intent);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                account = edt_account.getText() + "";
                password = edt_password.getText() + "";

            }
        });
    }

}
