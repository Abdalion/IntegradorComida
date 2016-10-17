package abdalion.me.integradorcomida;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListaRecyclerFragment extends Fragment {

    private RecyclerView recyclerViewRecetas;
    private AdaptadorRecetasRecycler adaptadorRecetasRecycler;


    public ListaRecyclerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lista_recycler, container, false);

        List<Receta> listaDeRecetas = Receta.obtenerListaDeRecetas();

        recyclerViewRecetas = (RecyclerView)view.findViewById(R.id.activity_recetas_recyclerView);

        recyclerViewRecetas.setHasFixedSize(true);

        recyclerViewRecetas.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        adaptadorRecetasRecycler = new AdaptadorRecetasRecycler(listaDeRecetas, getContext());

        adaptadorRecetasRecycler.setListener(new ListenerRecetas());

        recyclerViewRecetas.setAdapter(adaptadorRecetasRecycler);


        return view;
    }

    private class ListenerRecetas implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            int posicion = recyclerViewRecetas.getChildAdapterPosition(view);
            List<Receta> listaDeRecetas = adaptadorRecetasRecycler.getListaDeRecetas();
            Receta recetaClickeada = listaDeRecetas.get(posicion);
            Intent intent = new Intent(getContext(), DetalleRecetaActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("nombre", recetaClickeada.getNombre());
            bundle.putString("descripcion", recetaClickeada.getDescripcion());
            bundle.putString("pasos", recetaClickeada.getPasos());

            intent.putExtras(bundle);
            startActivity(intent);

        }
    }

}
