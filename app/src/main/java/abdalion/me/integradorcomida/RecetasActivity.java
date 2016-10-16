package abdalion.me.integradorcomida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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

        adaptadorRecetasRecycler = new AdaptadorRecetasRecycler(listaDeRecetas,this);

        recyclerViewRecetas.setAdapter(adaptadorRecetasRecycler);


    }
}
