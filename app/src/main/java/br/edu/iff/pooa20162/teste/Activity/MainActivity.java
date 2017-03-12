package br.edu.iff.pooa20162.teste.Activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.content.Intent;

import br.edu.iff.pooa20162.teste.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void chamaTelaCadastrosP(View v){

        Intent intentp = new Intent(MainActivity.this, ListaPActivity.class);
        startActivity(intentp);
    }

    public void chamaTelaCadastrosV(View v){
        Intent intentv = new Intent(MainActivity.this, ListaVActivity.class);
        startActivity(intentv);
    }

    private Context getContext(){
        return this;

    }
}
