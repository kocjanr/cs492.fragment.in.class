package edu.oregonstate.kocjanryanfragments;


//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
import android.app.Fragment;
import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button mButton1;
    private Button mButton2;
    private Fragment mFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton1 = (Button)findViewById(R.id.button_1);
        mButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                changeFragment(view);

            }
        });

        mButton2 = (Button)findViewById(R.id.button_2);
        mButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                changeFragment(view);
            }
        });
    }

    public void changeFragment(View view){
        Fragment fragment;
        if(view == findViewById(R.id.button_1)){
            fragment = new Fragment1();

            FragmentManager fm = getFragmentManager();

            fm.beginTransaction().replace(R.id.fragment_container, fragment).commit();

        } else {
            fragment = new Fragment2();

            FragmentManager fm = getFragmentManager();

            fm.beginTransaction().replace(R.id.fragment_container, fragment).commit();

        }

    }
}
