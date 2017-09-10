package com.carlosivan.miapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private EditText mEtUsername;
    private EditText mEtPassword;
    private Button mBtnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(TAG,"estamos en onCreate()"); //tag: etiqueta, nombre de la clase sobre la cual se manda el log

        mEtUsername = (EditText) findViewById(R.id.et_username);
        mEtPassword = (EditText) findViewById(R.id.et_password);
        mBtnLogin = (Button) findViewById(R.id.btn_login);

        mBtnLogin.setOnClickListener(new View.OnClickListener() { //evento al boton
            @Override
            public void onClick(View view) {

                View v = MainActivity.this.getCurrentFocus();
                if(v!=null){ //si no es nulo, se oculta el teclado
                    InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromInputMethod(v.getWindowToken(),0);
                }

                String userName = mEtUsername.getText().toString();
                String password = mEtPassword.getText().toString();

                if(userName.equals("Carlos") && password.equals("123456")){
                    Toast.makeText(MainActivity.this, "Las credenciales son correctas", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(MainActivity.this, "Usuario o Password incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });





    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "estamos en onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "estamos en onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "estamos en onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "estamos en onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "estamos en onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "estamos en onDestroy()");
    }
}
