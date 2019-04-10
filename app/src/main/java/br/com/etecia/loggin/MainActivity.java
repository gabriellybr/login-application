package br.com.etecia.loggin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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
              if(Username.equals("Etecia")&& password.equals("etec") ){
                  System.out.println("Logado com sucesso");


                      Intent intentGohome = new Intent( MainActivity.this,
                          Home.class);
                      startActivity(intentGohome);

              }
              else{
                  System.out.println("Erro ao logar!se corrija parsa!");

              }
              private void alert (string message){
                  Toast.makeText(This,message, Toast.LENGTH_SHORT).show();

              }
          }
      });

    }
}
