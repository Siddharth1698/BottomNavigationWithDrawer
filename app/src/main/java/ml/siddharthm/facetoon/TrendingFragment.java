package ml.siddharthm.facetoon;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class TrendingFragment extends Fragment {
    private  TextView textView,textView2,textView3,textView4,textView5,textView6,textView7,textView8;


    public TrendingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_trending, container, false);
        textView= (TextView)view. findViewById(R.id.textView32);
        textView2= (TextView)view. findViewById(R.id.textView4);
        textView3= (TextView)view. findViewById(R.id.textView22);
        textView4= (TextView)view. findViewById(R.id.textView7);
        textView5= (TextView)view. findViewById(R.id.textView3);
        textView6= (TextView)view. findViewById(R.id.textView2);
        textView7= (TextView)view. findViewById(R.id.textView6);
        textView8 = (TextView)view. findViewById(R.id.textView5);
        Typeface typeface = Typeface.createFromAsset(getActivity().getAssets(), "nexa_bold.otf");

        textView.setTypeface(typeface);
        textView2.setTypeface(typeface);
        textView3.setTypeface(typeface);
        textView4.setTypeface(typeface);
        textView5.setTypeface(typeface);
        textView6.setTypeface(typeface);
        textView8.setTypeface(typeface);

        Typeface typeface2 = Typeface.createFromAsset(getActivity().getAssets(), "nexa_light.otf");
        textView7.setTypeface(typeface2);



        return view;
    }

}
