package abdalion.me.integradorcomida;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.List;

import static abdalion.me.integradorcomida.R.id.activity_recetas_recyclerViewContainer;

public class RecetasActivity extends AppCompatActivity implements ListaRecyclerFragment.Escuchable{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recetas);

        FragmentManager fragmentManager = getSupportFragmentManager();

        fragmentManager.beginTransaction()
                .add(R.id.activity_recetas_recyclerViewContainer, new ListaRecyclerFragment())
                .commit();

    }


    //FALTA SETTEAR EL BUNDLE
    @Override
    public void onClickItem(Receta receta) {
        DetalleRecetaFragment detalleRecetaFragment = new DetalleRecetaFragment();
        Bundle bundle = new Bundle();
        bundle.putString("nombre", receta.getNombre());
        bundle.putString("descripcion", receta.getDescripcion());
        bundle.putString("pasos", receta.getPasos());

        detalleRecetaFragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.activity_recetas_recyclerViewContainer, detalleRecetaFragment)
                .commit();
    }
}
