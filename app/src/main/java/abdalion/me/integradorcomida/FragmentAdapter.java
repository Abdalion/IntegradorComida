package abdalion.me.integradorcomida;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by Egon on 14/10/2016.
 */

public class FragmentAdapter extends FragmentStatePagerAdapter {

    private ArrayList<Fragment> listaDeFragments;
    
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
        listaDeFragments = new ArrayList<>();

        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Astrid y Gaston", R.drawable.astridygaston));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("BoraGó", R.drawable.borago));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Central", R.drawable.central));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Dom", R.drawable.dom));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Maido", R.drawable.maido));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Mani", R.drawable.mani));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Quintonil", R.drawable.quintonil));
        listaDeFragments.add(FragmentLugar.getNewFragmentLugar("Tegui", R.drawable.tegui));

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
