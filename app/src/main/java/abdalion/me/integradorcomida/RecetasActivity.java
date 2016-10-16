package abdalion.me.integradorcomida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.List;

public class RecetasActivity extends AppCompatActivity {

    private RecyclerView recyclerViewRecetas;
    private AdaptadorRecetasRecycler adaptadorRecetasRecycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        List<Receta> listaDeRecetas = Receta.obtenerListaDeRecetas();

        recyclerViewRecetas = (RecyclerView)findViewById(R.id.activity_recetas_recyclerView);

        recyclerViewRecetas.setHasFixedSize(true);

        recyclerViewRecetas.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));

        adaptadorRecetasRecycler = new AdaptadorRecetasRecycler(listaDeRecetas);
        adaptadorRecetasRecycler.setListener(new ListenerRecetas());

        recyclerViewRecetas.setAdapter(adaptadorRecetasRecycler);


    }

    private class ListenerRecetas implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            int posicion = recyclerViewRecetas.getChildAdapterPosition(view);
            List<Receta>listaDeRecetas = adaptadorRecetasRecycler.getListaDeRecetas();
            Receta recetaClickeada = listaDeRecetas.get(posicion);
            Intent intent = new Intent(RecetasActivity.this, DetalleRecetaActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("nombre", recetaClickeada.getNombre());
            bundle.putString("descripcion", recetaClickeada.getDescripcion());
            bundle.putString("pasos", recetaClickeada.getPasos());

            intent.putExtras(bundle);
            startActivity(intent);

        }
    }
}
