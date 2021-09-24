package com.Pinball.PinBallCollectionIterator;

import com.Pinball.PinBallContainer.PinBall;
import com.Pinball.iterator.pinBallIterator;

public class PinBallCollectionIterator implements PinBall{

	@Override
	public pinBallIterator getPinBallIterator() {
		return new PinBallNames();
	}

}
