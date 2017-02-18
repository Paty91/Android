package com.example.paty.contador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int contador;
    //Metodo que se ejecuta al iniciar la aplicacion
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contador=0;
    }


    public void sumar(View boton){
        contador++;
        this.mostrarResultado();
    }

    public void restar(View boton){
        contador--;
        this.mostrarResultado();
    }

    public void resetear(View boton){
        contador=0;
        this.mostrarResultado();
    }

    public void mostrarResultado(){
        TextView textoResultado=(TextView)findViewById(R.id.textContador);
        textoResultado.setText("Contador " + contador);
    }

}
