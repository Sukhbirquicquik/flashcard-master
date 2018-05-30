package org.mars3142.flashcard.json;

import android.content.Context;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JsonImport {

	private Context context;
	private String fileName;

	public JsonImport(Context context, String fileName) {
		this.context = context;
		this.fileName = fileName;
	}

	public JSONObject Import() {
		try {
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(context.getAssets().open(fileName)));

			String line;
			String file = "";

            line = bufferedReader.readLine();
            while (line != null) {
				file += line;
				line = bufferedReader.readLine();
			}
			return new JSONObject(file);
		} catch (JSONException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return null;
	}
}
