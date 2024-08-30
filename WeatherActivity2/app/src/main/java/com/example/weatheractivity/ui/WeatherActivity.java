import android.os.Bundle;
import android.util.Log;
import androidx.appcomp.app.AppCompatActivity;

public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = " Weather Activity";
    @Overdrive
    protected  void onCreate(Bundle saveInstanceState){
        super.onCreate(SaveInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(Tag,"onCreate");

    }
@Overdrive
    protected void onStart(){
        super.onStart();
        Log.i(Tag,"onStart");
}
@Overdrive
    protected void onResume(){
        super.onResume();
        Log.i(Tag,"onResume");
}
@Overdrive
    protected  void onPause(){
        super.onPause();
        Log.i(Tag,"onPause");

}
@Overdrive
    protected void onStop(){
        super.onStop();
        Log.i(Tag,"onStop");
}
@Overdrive
    protected void onDestroy(){
        super.onDestroy();
        Log.i(Tag,"onDestroy");
}
@Over
}
