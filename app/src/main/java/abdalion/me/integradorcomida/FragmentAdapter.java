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
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("BoraGó", R.drawable.borago, "-31,151"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Central", R.drawable.central, "-31,151"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Dom", R.drawable.dom, "-31,151"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Maido", R.drawable.maido, "-31,151"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Mani", R.drawable.mani, "-31,151"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Quintonil", R.drawable.quintonil, "-31,151"));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Tegui", R.drawable.tegui, "-31,151"));

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
