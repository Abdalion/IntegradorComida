package abdalion.me.integradorcomida;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentRecycleList extends Fragment {

    private RecyclerView recyclerViewJuguetes;
    private AdaptadorRecetasRecycler adaptadorRecetasRecycler;


    public FragmentRecycleList() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //Declaro la vista que va a devolver el Fragment visible
        View view = inflater.inflate(R.layout.fragment_recycle_list, container, false);

        recyclerViewJuguetes = (RecyclerView) view.findViewById(R.id.fragment_recycle_list_recyclerRecetas);

        recyclerViewJuguetes.setHasFixedSize(true);

        recyclerViewJuguetes.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));

        ArrayList<Receta> listaDeRecetas = Receta.obtenerListaDeRecetas();

        adaptadorRecetasRecycler = new AdaptadorRecetasRecycler(listaDeRecetas,getContext());

        recyclerViewJuguetes.setAdapter(adaptadorRecetasRecycler);

        return view;
    }

}
