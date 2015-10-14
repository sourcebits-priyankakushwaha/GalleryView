package com.example.galleryviewimage;

import com.example.listviewimagesort.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.Toast;


@SuppressWarnings("deprecation")
public class MainActivity extends Activity {
	String test;
	 Gallery g;
	 public int images[] = {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5};


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		
		Gallery g = (Gallery)findViewById(R.id.gallery1); // activity_main.xml gallery is attached with java code
		
		GalleryAdapter adapter = new GalleryAdapter(this,images);
		
		g.setAdapter(adapter); 
		
		
		g.setOnItemClickListener(new OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
			    Toast.makeText(getBaseContext(),"You have selected picture " + (arg2+1) + " of colorful objects", 
			    Toast.LENGTH_SHORT).show();
			   ImageView myImage1 = new ImageView(getBaseContext());
			     myImage1.findViewById(R.id.image1);
			     myImage1.setImageResource(images[arg2]);
			}
		});
	}
}