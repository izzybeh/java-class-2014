package com.example.saccounter2;

import android.app.Activity;
import android.app.ActionBar;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.os.Build;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        final EditText etCounter = (EditText)findViewById(R.id.eTxtCnt);
        Button btnAdd = (Button)findViewById(R.id.btnAdd);
        Button btnSub = (Button)findViewById(R.id.btnSub);
        Button btnReset = (Button)findViewById(R.id.btnReset);
        
        btnReset.setOnClickListener(new OnClickListener()
        {
        	public void OnClick(View v)
        	{
        		etCounter.setText("0");
        	}

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
        });
        
        btnAdd.setOnClickListener(new OnClickListener()
        {
        	public void OnClick(View v)
        	{
        		etCounter.setText(String.valueOf(Integer.parseInt(etCounter.getText().toString())+1));
        	}

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
        });
        
        btnSub.setOnClickListener(new OnClickListener()
        {
        	public void OnClick(View v)
        	{
        		etCounter.setText(String.valueOf(Integer.parseInt(etCounter.getText().toString())-1));
        	}

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
        });

        if (savedInstanceState == null) {
            getFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    }

}