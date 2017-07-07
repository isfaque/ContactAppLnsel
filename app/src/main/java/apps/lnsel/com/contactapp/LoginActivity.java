package apps.lnsel.com.contactapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by apps2 on 7/7/2017.
 */
public class LoginActivity extends AppCompatActivity {
    Button btn_login, btn_signup;
    EditText et_username, et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btn_login = (Button) findViewById(R.id.activity_login_btn_login);
        btn_signup = (Button) findViewById(R.id.activity_login_btn_signup);

        et_username = (EditText) findViewById(R.id.activity_login_et_username);
        et_password =(EditText) findViewById(R.id.activity_login_et_password);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = et_username.getText().toString();
                String password = et_password.getText().toString();
                Toast.makeText(LoginActivity.this, username, Toast.LENGTH_LONG).show();
                Toast.makeText(LoginActivity.this, password, Toast.LENGTH_LONG).show();

                Intent signup = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(signup);

            }
        });

        btn_signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(LoginActivity.this, SignupActivity.class);
                startActivity(signup);
            }

        });
    }
}
