package abdalion.me.integradorcomida;


import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.maps.model.LatLng;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLugar extends Fragment {

    private LatLng latLng;


    public FragmentLugar() {
        // Required empty public constructor
    }

    public static FragmentLugar getNewFragmentLugar(String nombre, Integer backgroundID, String latLng) {
        FragmentLugar fragmentLugar = new FragmentLugar();
        Bundle bundle = new Bundle();
        bundle.putString("nombre", nombre);
        bundle.putInt("backgroundID", backgroundID);
        bundle.putString("latlng", latLng);
        fragmentLugar.setArguments(bundle);
        return fragmentLugar;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_lugar, container, false);

        Bundle bundle = getArguments();

        final String nombre = bundle.getString("nombre");
        Integer backgroundID = bundle.getInt("backgroundID");


        String[] latlong =  bundle.getString("latlng").split(",");
        final double latitud = Double.parseDouble(latlong[0]);
        final double longitud = Double.parseDouble(latlong[1]);

        this.latLng = new LatLng(latitud, longitud);

        TextView textView = (TextView) fragment.findViewById(R.id.fragment_lugar_tv_nombre);
        textView.setText(nombre);

        ImageView imageView = (ImageView) fragment.findViewById(R.id.fragment_lugar_iv_background);
        imageView.setImageResource(backgroundID);

        Button botonRecetas = (Button) fragment.findViewById(R.id.fragment_lugar_btn_comollegar);
        botonRecetas.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent mapa = new Intent(getActivity(), MapsActivity.class);
                Bundle bundle = new Bundle();
                bundle.putDouble("latitud", latitud);
                bundle.putDouble("longitud", longitud);
                bundle.putString("nombre", nombre);
                mapa.putExtras(bundle);
                startActivity(mapa);
            }
        });

        return fragment;
    }





}
