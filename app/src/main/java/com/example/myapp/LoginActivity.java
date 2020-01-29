package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private Button btnLogin;
    private EditText txtUsername, txtPassword;
    private TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(R.id.btn_login);
        txtUsername = (EditText) findViewById(R.id.txt_username);
        txtPassword = (EditText) findViewById(R.id.txt_password);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);

        buttonLoginClick();
    }

    // Function button login click
    private void buttonLoginClick(){
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username, password, hasil;
                username = txtUsername.getText().toString();
                password = txtPassword.getText().toString();
                hasil = "Usernamenya : " + username + "\n" + "Password : " + password;
                txtHasil.setText(hasil);
                txtUsername.setText(null);
                txtPassword.setText(null);
                txtUsername.requestFocus();
                showToast("Login Clicked !!");
            }
        });
    }
    // End function button login click

    // Show toast
    public void showToast(String message){
        Context context = getApplicationContext();
        CharSequence text = message;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    // End toast

}
