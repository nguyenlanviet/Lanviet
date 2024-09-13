import vn.edu.usth.myweatherapp.WeatherAndForecastFragment;

public class WeatherPagerAdapter extends FragmentPagerAdapter {

    public WeatherPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        // Trả về một instance mới của WeatherAndForecastFragment
        return new WeatherAndForecastFragment();
    }

    @Override
    public int getCount() {
        // Trả về số lượng trang (ở đây là 3)
        return 3;
    }
}
