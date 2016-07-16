package name.wxz.modle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.vehicle_networking.R;

public class MapFindTitleLayout extends LinearLayout {

	public MapFindTitleLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
		LayoutInflater.from(context).inflate(R.layout.mapfindtitle, this);
		Button titleBack = (Button) findViewById(R.id.title_back);
        Button titlefind=(Button)findViewById(R.id.button);
		titleBack.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				((Activity) getContext()).finish();
			}
		});

		titlefind.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
//				Intent openMainActivity=new Intent("android.intent.action.MAPOIL");
//				getContext().startActivity(openMainActivity);
            }

		});



	}



}
