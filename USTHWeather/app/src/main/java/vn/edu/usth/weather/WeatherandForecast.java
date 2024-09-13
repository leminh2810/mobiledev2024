package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link WeatherandForecast#newInstance} factory method to
 * create an instance of this fragment.
 */
public class WeatherandForecast extends Fragment {

    // Add WeatherFragment
    Fragment weatherFragment = new WeatherFragment();
    FragmentTransaction transaction = getChildFragmentManager().beginTransaction();
        transaction.add(R.id.weather_container, weatherFragment);

    // Add ForecastFragment
    Fragment forecastFragment = new ForecastFragment();
        transaction.add(R.id.forecast_container, forecastFragment);
        transaction.commit();

        return view;
}


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment WeatherandForecast.
     */
    // TODO: Rename and change types and number of parameters
    public static WeatherandForecast newInstance(String param1, String param2) {
        WeatherandForecast fragment = new WeatherandForecast();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weatherand_forecast, container, false);
    }
}