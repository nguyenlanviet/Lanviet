package vn.edu.usth.myweatherapp;

import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import vn.edu.usth.myweatherapp.ForecastFragment;

public class WeatherActivity extends AppCompatActivity {

    private static final String TAG = "WeatherActivity";
    private Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "onCreate() called");

        // Tạo ForecastFragment
        ForecastFragment forecastFragment;
        forecastFragment = new ForecastFragment();

        // Thêm ForecastFragment vào FrameLayout với id "container"
        getSupportFragmentManager().beginTransaction()
                .add(R.id.container, forecastFragment)  // 'container' là id của FrameLayout trong layout của bạn
                .commit();
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        this.savedInstanceState = savedInstanceState;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        // Nếu cần, bạn có thể thêm code để xử lý các fragment
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart() called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume() called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause() called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop() called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy() called");
    }
}
