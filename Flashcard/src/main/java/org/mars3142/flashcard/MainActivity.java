package org.mars3142.flashcard;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.json.JSONObject;
import org.mars3142.flashcard.json.JsonImport;

public class MainActivity extends FragmentActivity implements View.OnClickListener{

    JSONObject jsonObject;
    TextView question;
    TextView answer;
    EditText your_answer;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

        question = (TextView) findViewById(R.id.question);
        answer = (TextView) findViewById(R.id.answer);
        your_answer = (EditText) findViewById(R.id.your_answer);

        findViewById(R.id.button_left).setOnClickListener(this);
        findViewById(R.id.button_right).setOnClickListener(this);

		try {
			jsonObject = new JsonImport(this, "default_01.json").Import();
		} catch (Exception e) {
			e.printStackTrace();
        }

        question.setText("1 * 1 = ");
        answer.setText("1");
	}

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button_left:
                break;

            case R.id.button_right:
                break;
        }
    }

    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
