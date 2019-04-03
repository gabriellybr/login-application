package br.com.etecia.loggin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      Button buttonLogin = findViewById(R.id.buttonLogin);
      buttonLogin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              TextView textUsername = findViewById(R.id.Username);
              TextView textPassword = findViewById(R.id.password);
              String Username = textUsername.getText().toString();
              String password = textPassword.getText().toString();
          }
      });

    }
}
