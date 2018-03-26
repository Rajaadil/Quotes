package com.madhatters.quotes;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager viewPager=findViewById(R.id.Vpager);
        TabLayout tabLayout=findViewById(R.id.Tblayout);
        tabLayout.setupWithViewPager(viewPager);
        pagerAdapter adapter=new pagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }
    public class  pagerAdapter extends FragmentPagerAdapter{
               private String[] pageTitles={"Today ","Random","previous",};
        public pagerAdapter(FragmentManager fm) {
            super(fm);
        }
        @Override
        public Fragment getItem(int position) {
        switch (position){
            case 0:
                return PagerFragment.newInstance("Ayyat of the day","Random Ayyat","Previous Ayyats");
            case 1:
                return PagerFragment.newInstance("Haidth of the day","Randon Haidth","Previous Haidth");
            case 2: // Fragment # 1 - This will show SecondFragment
                return PagerFragment.newInstance("Nobel quote of the day","Random quote","previous quote");
            default:
                return null;
        }
        }
        @Override
        public int getCount() {
            return 3;
        }
        @Override
        public CharSequence getPageTitle(int position) {
            return pageTitles[position];
        }
    }
    }


