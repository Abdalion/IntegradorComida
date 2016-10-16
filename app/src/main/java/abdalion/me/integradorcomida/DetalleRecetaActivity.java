package abdalion.me.integradorcomida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetalleRecetaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_receta);

        Bundle bundle = getIntent().getExtras();

        String nombreReceta = bundle.getString("nombre");
        String descripcionReceta = bundle.getString("descripcion");
        String pasosReceta = bundle.getString("pasos");

        TextView textViewTitulo = (TextView) findViewById(R.id.activity_detalle_receta_titulo);
        textViewTitulo.setText(nombreReceta);

        TextView textViewDescripcion = (TextView) findViewById(R.id.activity_detalle_descripcion);
        textViewDescripcion.setText(descripcionReceta);

        TextView textViewPasos = (TextView) findViewById(R.id.activity_detalle_pasos);
        textViewPasos.setText(pasosReceta);
    }
}
