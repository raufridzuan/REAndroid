package my.edu.my.session1;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class VerifyInput extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_verify_input);
	
		Button buttonOK = (Button)findViewById(R.id.verifyButton);
        buttonOK.setOnClickListener(buttonOKListener);
    
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_verify_input, menu);
		return true;
	}

	private OnClickListener buttonOKListener = new OnClickListener()
    {
    	public void onClick(View v)
    	{
    		EditText inputData= (EditText)findViewById(R.id.inputBox);
    		
    		String TTT = "554D3230313330333236";
	    	StringBuilder output1 = new StringBuilder();
	    	for (int i =0; i < TTT.length(); i+=2){
	    		String str = TTT.substring(i, i+2);
	    		output1.append((char)Integer.parseInt(str,16));
	    	}
	    	
    		//String givenAnswer = "1";
	    	Log.i("The answer: ", output1.toString());
    		if(output1.toString().equals(inputData.getText().toString())){
    			Toast.makeText(getBaseContext(), 
        				"Well done! Good job!",
        				Toast.LENGTH_LONG).show();	
    			Log.i("Given Text Success", inputData.getText().toString());
    			
    		}
    		else{ //fail
    			Toast.makeText(getBaseContext(), 
    					"Try again..",
        				Toast.LENGTH_LONG).show();
    			Log.i("Given Text Fail", inputData.getText().toString());
    			
    		}
    		
    		    		
    	}
    };
}
