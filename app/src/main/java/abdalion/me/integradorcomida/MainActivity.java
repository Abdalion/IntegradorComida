package abdalion.me.integradorcomida;

import android.content.Intent;
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


        Button botonDondeComer = (Button) findViewById(R.id.activity_main_btn_donde_comer);
        botonDondeComer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent dondeComer = new Intent(MainActivity.this, DondeComerActivity.class);
                startActivity(dondeComer);
            }
        });

        Button botonRecetas = (Button) findViewById(R.id.activity_main_btn_recetas);
        botonRecetas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent recetas = new Intent(MainActivity.this, RecetasActivity.class);
                startActivity(recetas);
            }
        });

    }



}
