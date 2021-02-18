package dark.suit.owl.linkedfa.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import dark.suit.owl.linkedfa.MainActivity;
import dark.suit.owl.linkedfa.R;

public class LoginActivity extends AppCompatActivity {
    EditText usernameEdit;
    EditText passwordEdit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button singInBtn = findViewById(R.id.sing_in_btn);

        usernameEdit = findViewById(R.id.username);
        passwordEdit = findViewById(R.id.password);

        singInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkFuncSignUp();


            }
        });


    }



    private void checkFuncSignUp() {
        String name = usernameEdit.getText().toString().trim();
        String password = passwordEdit.getText().toString().trim();



        if (password.length() < 6) {
            if (password.isEmpty()) {
                passwordEdit.setError("Password is required");
                passwordEdit.requestFocus();
                return;
            }
            passwordEdit.setError("Password is too short");
            passwordEdit.requestFocus();
            return;
        }

        if (name.isEmpty()) {
            usernameEdit.setError("name is required");
            usernameEdit.requestFocus();
            return;
        }

        Toast.makeText(getApplicationContext(), "Welcome  " + name + " !!", Toast.LENGTH_LONG).show();

        startActivity(new Intent(LoginActivity.this, MainActivity.class));
        LoginActivity.this.finish();
    }
}