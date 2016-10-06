package nyc.c4q.dereksantos.in_class_exercises_10_5;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ChooserFragment extends Fragment {
    public static String TAG1 = "ChooseMemes";
    public static String TAG2 = "ChooseMemes";
    public static String TAG3 = "ChooseMemes";
    public static String TAG4 = "ChooseMemes";

    Button meme1, meme2, meme3, meme4;

    public ChooserFragment(){
        // default constructor
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_chooser, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        meme1 = (Button) view.findViewById(R.id.meme1_button);
        meme2 = (Button) view.findViewById(R.id.meme2_button);
        meme3 = (Button) view.findViewById(R.id.meme3_button);
        meme4 = (Button) view.findViewById(R.id.meme4_button);

        // On Clicks
        meme1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigates to meme1
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new PepeFragment(), TAG1).commit();
            }
        });
        meme2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigates to meme2
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new HarambeFragment(), TAG2).commit();
            }
        });
        meme3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigates to meme3
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new HarambinoFragment(), TAG3).commit();
            }
        });
        meme4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigates to meme4
                AppCompatActivity activity = (AppCompatActivity) getActivity();
                FragmentManager fragmentManager = activity.getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.main_container, new ArthurFragment(), TAG4).commit();
            }
        });
    }
}
