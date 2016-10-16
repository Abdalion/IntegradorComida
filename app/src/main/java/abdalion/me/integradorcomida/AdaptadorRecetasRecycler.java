package abdalion.me.integradorcomida;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Egon on 16/10/2016.
 */

public class AdaptadorRecetasRecycler extends RecyclerView.Adapter {

    public Context context;
    public ArrayList<Receta> listaDeRecetas;

    public AdaptadorRecetasRecycler(ArrayList<Receta> listaDeRecetas, Context context) {
        this.context = context;
        this.listaDeRecetas = listaDeRecetas;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = (LayoutInflater)LayoutInflater.from(parent.getContext());
        View viewDeLaCelda = inflater.inflate(R.layout.item_receta,parent,false);
        RecetasHolder recetasHolder = new RecetasHolder(viewDeLaCelda);
        return recetasHolder;

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Receta unaReceta = listaDeRecetas.get(position);
        RecetasHolder recetasHolder = (RecetasHolder) holder;
        recetasHolder.cargarReceta(unaReceta);
    }

    @Override
    public int getItemCount() {
        return listaDeRecetas.size();
    }

    private class RecetasHolder extends RecyclerView.ViewHolder {
        private TextView textNombreReceta;

        public RecetasHolder(View view){
            super(view);
            textNombreReceta = (TextView)view.findViewById(R.id.item_receta_nombre);
        }

        public void cargarReceta(Receta unaReceta){
            textNombreReceta.setText(unaReceta.getNombre());
        }

    }

}
