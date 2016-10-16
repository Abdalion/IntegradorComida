package abdalion.me.integradorcomida;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DondeComerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donde_comer);

        FragmentManager fragmentManager = getSupportFragmentManager();

        FragmentAdapterViewPager fragmentAdapter = new FragmentAdapterViewPager(fragmentManager);

        ViewPager viewPager = (ViewPager) findViewById(R.id.activity_donde_comer_viewpager);

        viewPager.setAdapter(fragmentAdapter);
    }
}
