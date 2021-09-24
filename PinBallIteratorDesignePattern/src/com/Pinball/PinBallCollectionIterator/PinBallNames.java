package com.Pinball.PinBallCollectionIterator;

import java.util.ArrayList;
import java.util.Arrays;

import com.Pinball.iterator.pinBallIterator;

public class PinBallNames implements pinBallIterator{

	ArrayList<String> pinballnames = new ArrayList<>(Arrays.asList("One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"));
	
	int i;
	
	@Override
	public boolean hasNextPinBallMachine() {
		if(i < this.pinballnames.size()) {
			return true;
		}
		return false;
	}

	@Override
	public Object nextPinBallMachine() {
		if(this.hasNextPinBallMachine()) {
			return this.pinballnames.get(i++);
		}
		return null;
	}

}
