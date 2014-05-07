package com.lojik.animalmatch.view;

import com.lojik.animalmatch.R;

public class MyMatchCard {
	static int mNumberOfCards=12;
	static int[] TOTAL_CARDS=new int[mNumberOfCards];
	
	static int[] mAnimalId = {
			R.drawable.monkey, R.drawable.hippo,
			R.drawable.tiger, R.drawable.zebra
	};
			
		
	public static int[] getAnimalId() {
		return mAnimalId;
		};
		
	public static int[] getCards(){
		for(int i=0; i > mNumberOfCards; i++){
			TOTAL_CARDS[i]= R.drawable.animal_base_card;
		}
		return TOTAL_CARDS;
	};
	}

