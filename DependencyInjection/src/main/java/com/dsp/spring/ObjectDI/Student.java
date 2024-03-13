package com.dsp.spring.ObjectDI;

import javax.sound.midi.VoiceStatus;

public class Student {

	/*
	 * MathCheat math = new MathCheat();
	 * math.mahCheat();
	 */
	private int id;
	
	private MathCheat mathCheat;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}
	
	public void cheating() {
		mathCheat.mathCheat();
		System.out.println("Id : " + id);
	}
}
