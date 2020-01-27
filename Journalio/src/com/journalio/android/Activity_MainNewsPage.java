package com.journalio.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.TextView;

public class Activity_MainNewsPage extends Activity {

	TextView mypost_tv,trending_tv,myprofile_tv;
	Button bttn_base_0, bttn_base_1;
	
	Context ctx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_news_page_layout);
		
		ctx = Activity_MainNewsPage.this;
		
		//Reference ui elements
		trending_tv = (TextView)findViewById(R.id.nav_tv_0);
		mypost_tv = (TextView )findViewById(R.id.nav_tv_1);
		
		myprofile_tv = (TextView)findViewById(R.id.nav_tv_2);
		
		
		bttn_base_0=(Button)findViewById(R.id.base_bttn_0);
		
		bttn_base_1=(Button)findViewById(R.id.base_bttn_1);
		
		bttn_base_0.setText(getResources().getString(R.string.get_your_account_for_more_features));
		
		//move to my post page when my post button is clicked
				mypost_tv.setOnClickListener(new OnClickListener() {

				            @Override
				            public void onClick(View v) {

				                     Intent activity_mypost_intent = new Intent(Activity_MainNewsPage.this,Activity_MyPost.class);
				                     
				                   //  activity_mypost_intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				                     startActivity(activity_mypost_intent);
				            }
				        }); 
		
		//move to profile page when profile button is clicked
		myprofile_tv.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                     Intent activity_profile_intent = new Intent(Activity_MainNewsPage.this,Activity_Profile.class);
                     
                    // activity_profile_intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                     startActivity(activity_profile_intent);
            }
        }); 
		
		
		
		for(int x=0; x<3; x++) {
			
			//because we are in the Activity_MainNewsPage,
			//turn off all the views under the tv except 
			//the first one.
			if(x==0){//trending
				nav_V(3, "nav_v_", x).setVisibility(View.VISIBLE);
			}else{
				nav_V(3, "nav_v_", x).setVisibility(View.GONE);
				
			}
			
		}
		
		
	}
	
	
	public TextView nav_TV(int total_num_i, String prefix_str, int tv_i){

		String[] textView_tv_ids = new String[total_num_i];

		TextView[] textView_full_IDs = new TextView[total_num_i];

		textView_tv_ids[tv_i] = prefix_str+Integer.toString(tv_i);

		int textView_tv_ID = ctx.getResources().getIdentifier(textView_tv_ids[tv_i], "id", "com.journalio.android");
		textView_full_IDs[tv_i] = (TextView)findViewById(textView_tv_ID);

		return textView_full_IDs[tv_i];
	}
	
	public View nav_V(int total_num_i, String prefix_str, int v_i){

		String[] view_ids = new String[total_num_i];

		View[] view_full_IDs = new View[total_num_i];

		view_ids[v_i] = prefix_str+Integer.toString(v_i);

		int view_ID = ctx.getResources().getIdentifier(view_ids[v_i], "id", "com.journalio.android");
		view_full_IDs[v_i] = (View)findViewById(view_ID);

		return view_full_IDs[v_i];
	}
	
}
