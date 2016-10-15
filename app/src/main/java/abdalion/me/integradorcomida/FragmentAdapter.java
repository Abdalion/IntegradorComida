package abdalion.me.integradorcomida;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.google.android.gms.maps.model.LatLng;

import java.util.ArrayList;

/**
 * Created by Egon on 101.54/101.50/-31.30101.56.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> listaDeFragments;
    
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        listaDeFragments = new ArrayList<>();

        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Astrid y Gaston", R.drawable.astridygaston, "-34.578411, -58.413194"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("BoraGó", R.drawable.borago, "-33.404293, -70.598505"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Central", R.drawable.central, "-12.131663, -77.027850"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Dom", R.drawable.dom, "-23.565651, -46.667321"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Maido", R.drawable.maido, "-12.124679, -77.030818"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Mani", R.drawable.mani, "-23.566733, -46.679247"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Quintonil", R.drawable.quintonil, "19.431101, -99.191832"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Tegui", R.drawable.tegui, "-34.580583, -58.437216"));

    }

    @Override
    public Fragment getItem(int position) {
        return listaDeFragments.get(position);
    }

    @Override
    public int getCount() {
        return listaDeFragments.size();
    }
}
