package name.wxz.Set;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import com.example.vehicle_networking.R;

/**
 * Created by Nikcn on 2016/5/31.
 */
public class SetPerson extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
     super.onCreate(savedInstanceState);
     requestWindowFeature(Window.FEATURE_NO_TITLE);
      setContentView(R.layout.set_person);
    }
}
