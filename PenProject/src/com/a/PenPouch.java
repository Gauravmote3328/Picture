package com.a;

public class PenPouch {

	public Pen getPendetails() {
		Pen p = new Pen();
		// p.NumofRefills = 2;
		p.setNumofRefills(2);
		// p.Colour = "Black";
		p.setColour("Black");
		// p.type = "Ball pen";
		p.setType("Ball Pen");
		return p;

	}

	public Allpen getAllPenDetails() {
		Allpen all = new Allpen();
		// Pen pen2 = new Pen();
		// all.pen2.NumofRefills = 1;
		all.pen2.setNumofRefills(1);
		// all.pen2.Colour = "Black";
		all.pen2.setColour("Balck");
		// all.pen2.type = "Ink pen";
		all.pen2.setType("Ink Pen");

		Pen pen3 = new Pen();
		// all.pen3.NumofRefills = 0;
		all.pen3.setNumofRefills(8);
		// all.pen3.Colour = "Blue";
		all.pen3.setColour("Blue");
		// all.pen3.type = "Gel Pen";
		all.pen3.setType("Gel Pen");
		return all;

	}
}
