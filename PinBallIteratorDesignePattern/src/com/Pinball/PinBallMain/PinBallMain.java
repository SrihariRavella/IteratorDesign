package com.Pinball.PinBallMain;

import com.Pinball.PinBallCollectionIterator.PinBallCollectionIterator;
import com.Pinball.iterator.pinBallIterator;

public class PinBallMain {
	
	public static void main(String[] args) {
		PinBallCollectionIterator itr = new PinBallCollectionIterator();
		
		pinBallIterator pinBallIterator = itr.getPinBallIterator();
		
		while(pinBallIterator.hasNextPinBallMachine()) {
			Object nextPinBallMachine = pinBallIterator.nextPinBallMachine();
			System.out.println(nextPinBallMachine.toString());
		}
	}

}
