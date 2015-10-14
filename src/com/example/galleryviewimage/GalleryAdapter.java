package com.example.galleryviewimage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;


//This is the custom adapter to fetch the data source(gallery) where c is creating view ,image with 1 title string array

public class GalleryAdapter extends BaseAdapter {

		Context context;
		int pics[] ;
	
		String test;

		public GalleryAdapter(Context c , int img[]) //constructor taking context as a parameter
		{
			this.context=c;
			this.pics = img;
		}
		
		@Override
		public int getCount() {
		    return pics.length;
		}


		@Override
		public Object getItem(int arg0) {
		    return arg0;
		}

		@Override
		public long getItemId(int arg0) {
		    return arg0;
		}


		@Override
		public View getView(int arg0, View arg1, ViewGroup arg2) {
			//LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
			
			//View display = inflater.inflate(R.layout.activity_main,arg2,false);
			
		    ImageView myImage =  new ImageView(context);
		   // myImage.findViewById(R.id.gallery1);
		    myImage.setImageResource(pics[arg0]);
		    myImage.setScaleType(ImageView.ScaleType.FIT_XY);
		    myImage.setLayoutParams(new Gallery.LayoutParams(150,120));
		    return myImage;
		}
}
