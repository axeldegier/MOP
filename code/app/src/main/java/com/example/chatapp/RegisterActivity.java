package com.example.chatapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.gms.tasks.OnCompleteListener;

public class RegisterActivity extends AppCompatActivity {

    // Widgets
    EditText userET, passET, emailET;
    Button registerBtn;

    // Firebase

    FirebaseAuth auth;
    DatabaseReference myRef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // initializing Widgets
        userET = findViewById(R.id.userEditText);
        passET = findViewById(R.id.passwordEditText);
        emailET = findViewById(R.id.emailEditText);
        registerBtn = findViewById(R.id.buttonRegister);


        auth = FirebaseAuth.getInstance();

    }
    private void RegisterNow(final String username, String email, String password){
        auth.createUserWithEmailandPassword(email, password)
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {

                    }
                });



    }

}

