package com.example.dsm2018.home_application;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity{
    EditText id;
    EditText password;
    Button button;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginlayout);
        id=(EditText)findViewById(R.id.id);
        password=(EditText)findViewById(R.id.password);
        button=(Button)findViewById(R.id.go);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getid=id.getText().toString();
                String getpw=password.getText().toString();
                getid=getid.trim();
                getpw=getpw.trim();
                if(getid.getBytes().length<=0|getpw.getBytes().length<=0){
                    Toast.makeText(getApplicationContext(),"아이디 혹은 비밀번호를 입력하시지 않으셨습니다.",Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(login.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        });

    }

}
