package abdalion.me.integradorcomida;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Egon on 16/10/2016.
 */

public class AdaptadorRecetasRecycler extends RecyclerView.Adapter{

    private List<Receta> listaDeRecetas;
    private Context context;

    public AdaptadorRecetasRecycler(List<Receta> listaDeRecetas, Context context) {
        this.listaDeRecetas = listaDeRecetas;
        this.context = context;
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)LayoutInflater.from(parent.getContext());
        View viewCelda = inflater.inflate(R.layout.item_receta,parent,false);
        RecetasViewHolder juguetesViewHolder = new RecetasViewHolder(viewCelda);
        return juguetesViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta unaReceta = listaDeRecetas.get(position);
        RecetasViewHolder recetasViewHolder = (RecetasViewHolder) holder;
        recetasViewHolder.cargarReceta(unaReceta);
    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }

    private class RecetasViewHolder extends RecyclerView.ViewHolder {
        private TextView textViewNombreReceta;

        public RecetasViewHolder(View view){
            super(view);
            textViewNombreReceta = (TextView)view.findViewById(R.id.item_receta_nombre);
        }

        public void cargarReceta(Receta unaReceta){
            textViewNombreReceta.setText(unaReceta.getNombre());
        }

    }
}
