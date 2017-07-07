package apps.lnsel.com.contactapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignupActivity extends AppCompatActivity {

    Button btn_login, btn_signup;
    EditText et_username, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        btn_login = (Button) findViewById(R.id.activity_signup_btn_login);
        btn_signup = (Button) findViewById(R.id.activity_signup_btn_signup);

        et_username = (EditText) findViewById(R.id.activity_signup_et_username);
        et_password =(EditText) findViewById(R.id.activity_signup_et_password);

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                Toast.makeText(SignupActivity.this, username, Toast.LENGTH_LONG).show();
                Toast.makeText(SignupActivity.this, password, Toast.LENGTH_LONG).show();

                Intent signup = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(signup);

            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(SignupActivity.this, LoginActivity.class);
                startActivity(signup);
            }

        });
    }
}
