package com.example.firstsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.firstsqlite.adapters.DBHelper;

public class LoginActivity extends AppCompatActivity {
    
    EditText et_user,et_pass;
    Button btn_login;
    private String user,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        //Hubungan Widget Activity Ke XML        
        et_user = findViewById(R.id.et_username);
        et_pass = findViewById(R.id.et_pass);
        btn_login = findViewById(R.id.btn_login);
        
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user = et_user.getText().toString();
                pass = et_pass.getText().toString();

                if(user.equals("admin")&& pass.equals("admin")){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Username dan Password salah", Toast.LENGTH_SHORT).show();
                }
            }
        });

      
        
    }
}