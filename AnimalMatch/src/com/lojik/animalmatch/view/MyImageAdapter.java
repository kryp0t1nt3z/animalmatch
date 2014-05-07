package com.lojik.animalmatch.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MyImageAdapter extends BaseAdapter {
	private Context mContext;
	int[] mAnimalId = MyMatchCard.getAnimalId();
	int[] TOTAL_CARDS = MyMatchCard.getCards();
	
	public MyImageAdapter(Context c){
		mContext = c;
	}
	
	@Override
	public int getCount() {
		return TOTAL_CARDS.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
       ImageView imageView;
		if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(TOTAL_CARDS[position]);
        return imageView;

}
}
