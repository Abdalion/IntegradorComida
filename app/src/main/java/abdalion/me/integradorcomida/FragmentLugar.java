package abdalion.me.integradorcomida;


import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLugar extends Fragment {


    public FragmentLugar() {
        // Required empty public constructor
    }

    public static FragmentLugar getNewFragmentLugar(String nombre, Integer backgroundID) {
        FragmentLugar fragmentLugar = new FragmentLugar();
        Bundle bundle = new Bundle();
        bundle.putString("nombre", nombre);
        bundle.putInt("backgroundID", backgroundID);
        fragmentLugar.setArguments(bundle);
        return fragmentLugar;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View fragment = inflater.inflate(R.layout.fragment_lugar, container, false);

        Bundle bundle = getArguments();
        String nombre = bundle.getString("nombre");
        Integer backgroundID = bundle.getInt("backgroundID");
        Drawable drawable = getResources().getDrawable(backgroundID);

        TextView textView = (TextView) fragment.findViewById(R.id.fragment_lugar_tv_nombre);
        textView.setText(nombre);

        ImageView imageView = (ImageView) fragment.findViewById(R.id.fragment_lugar_iv_background);
        imageView.setBackground(drawable);

        return fragment;
    }

}