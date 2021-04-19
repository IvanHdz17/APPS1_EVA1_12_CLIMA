package com.example.eva1_12_clima;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    Clima aClimaCd[] =  {
            new Clima(R.drawable.sunny, "Chihuahua", "Despejado", 28),
            new Clima(R.drawable.cloudy, "Delicias", "Nublado", 22),
            new Clima(R.drawable.atmospher, "Camargo", "Vientos Fuertes", 16),
            new Clima(R.drawable.light_rain, "Parral", "Lluvia ligera", 12),
            new Clima(R.drawable.rainy, "Cuauhtemoc", "Lluvia", 14),
            new Clima(R.drawable.snow, "Madera", "Nevado", 2),
            new Clima(R.drawable.thunderstorm, "Creel", "Tormentas Fuertes", 9),
            new Clima(R.drawable.tornado, "Guerrero", "F en el chat", 12)
    };

    ListView lstVwClima;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        lstVwClima = findViewById(R.id.lstVwClima);
        lstVwClima.setAdapter(new ClimaAdaptador(this,R.layout.mi_lista_clima,aClimaCd));
    }
}