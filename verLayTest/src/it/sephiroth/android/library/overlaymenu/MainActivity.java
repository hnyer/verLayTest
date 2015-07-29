package it.sephiroth.android.library.overlaymenu;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

import it.sephiroth.android.library.overlaymenu.OverMenuView;

public class MainActivity extends ActionBarActivity implements
		OverMenuView.OnSelectionChangeListener,
		OverMenuView.OnMenuVisibilityChangeListener {
	// private static final String TAG = "MainActivity";
	// private ImageView mImageView;
	private OverMenuView overMenuView;
	private ImageView textView;

	// CharSequence []
	// picName={R.drawable.nose+"",R.drawable.testmouth+"",R.drawable.eye+"",R.drawable.brow+""
	// };
	CharSequence[] picName = { R.drawable.eye + "",
			R.drawable.ic_launcher + "", R.drawable.nose + "",
			R.drawable.logo_red + "", R.drawable.eye + "", R.drawable.eye + "",
			R.drawable.eye + "", R.drawable.ic_launcher + "",
			R.drawable.nose + "", R.drawable.logo_red + "",
			R.drawable.eye + "", R.drawable.eye + "", R.drawable.eye + "",
			R.drawable.ic_launcher + "", R.drawable.nose + "",
			R.drawable.logo_red + "", R.drawable.eye + "", R.drawable.eye + "",R.drawable.eye + "",
			R.drawable.ic_launcher + "", R.drawable.nose + "",
			R.drawable.logo_red + "", R.drawable.eye + "", R.drawable.eye + "",
			R.drawable.eye + "", R.drawable.ic_launcher + "",
			R.drawable.nose + "", R.drawable.logo_red + "",
			R.drawable.eye + "", R.drawable.eye + "", R.drawable.eye + "",
			R.drawable.ic_launcher + "", R.drawable.nose + "",
			R.drawable.logo_red + "", R.drawable.eye + "", R.drawable.eye + "" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// mImageView = (ImageView) findViewById(R.id.image);
		textView = (ImageView) findViewById(R.id.text);

		overMenuView = (OverMenuView) findViewById(R.id.overmenu);
		overMenuView.setEntries(picName);
		overMenuView.setOnSelectionChangedListener(this);
		overMenuView.setOnMenuVisibilityChangeListener(this);

		// try {
		// loadImage("image.jpg");
		// } catch (IOException e) {
		// e.printStackTrace();
		// }

	}

	// private void loadImage(@NonNull final String file) throws IOException {
	// final InputStream input = getAssets().open(file);
	// Bitmap bitmap = BitmapFactory.decodeStream(input);
	// mImageView.setImageBitmap(bitmap);
	// input.close();
	// }

	@Override
	public void onSelectionChanged(final int position) {
		// Log.d(TAG, "onSelectionChanged: " + position);
		// textView.setText(overMenuView.getEntries()[position]);
		textView.setImageResource(Integer.parseInt(overMenuView.getEntries()[position]
				.toString()));
	}

	@Override
	public void onVisibilityChanged(final View view, final boolean visible) {
		// Log.d(TAG, "onVisibilityChanged: " + view + ", " + visible);
	}
}
