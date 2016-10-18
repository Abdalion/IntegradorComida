package abdalion.me.integradorcomida;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleRecetaFragment extends Fragment {


    public DetalleRecetaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_detalle_receta, container, false);

        Bundle bundle = getArguments();

        String nombreReceta = bundle.getString("nombre");
        String descripcionReceta = bundle.getString("descripcion");
        String pasosReceta = bundle.getString("pasos");

        TextView textViewTitulo = (TextView) view.findViewById(R.id.activity_detalle_receta_titulo);
        textViewTitulo.setText(nombreReceta);

        TextView textViewDescripcion = (TextView) view.findViewById(R.id.activity_detalle_descripcion);
        textViewDescripcion.setText(descripcionReceta);

        TextView textViewPasos = (TextView) view.findViewById(R.id.activity_detalle_pasos);
        textViewPasos.setText(pasosReceta);

        return view;
    }

}
