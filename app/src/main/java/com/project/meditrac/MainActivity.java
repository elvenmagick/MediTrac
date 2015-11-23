package com.project.meditrac;
import android.os.Bundle;  
import android.app.Activity;  
import android.view.Menu;  
import android.view.MenuItem;  
import android.widget.Toast;
import com.parse.Parse;

public class MainActivity extends Activity {  
	Login Login = new Login();
    @Override  
    protected void onCreate(Bundle savedInstanceState) {  
        super.onCreate(savedInstanceState);  
        setContentView(R.layout.activity_main);
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "30l5dACBVGA3oC8xiyzcqOCmoFbbKMkW1TvhnGwP", "3smPQrNBOaX5v1jEiIiV9VzdkLnikM26x3CpBpDH");
    }  
    @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
        // Inflate the menu; this adds items to the action bar if it is present.  
        getMenuInflater().inflate(R.menu.main, menu);//Menu Resource, Menu  
        return true;  
    }  
    @Override  
    public boolean onOptionsItemSelected(MenuItem item) {  
        switch (item.getItemId()) {  
            case R.id.login:  
              Toast.makeText(getApplicationContext(),"Item 1 Selected",Toast.LENGTH_LONG).show();
              //Login.LoginHandler();
            return true;     
           case R.id.button2:  
                Toast.makeText(getApplicationContext(),"Item 2 Selected",Toast.LENGTH_LONG).show();  
              return true;     
            case R.id.button3:  
                Toast.makeText(getApplicationContext(),"Item 3 Selected",Toast.LENGTH_LONG).show();  
              return true;     
              default:  
                return super.onOptionsItemSelected(item);  
        }  
    }  
}  