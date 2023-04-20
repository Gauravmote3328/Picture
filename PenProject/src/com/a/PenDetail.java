package com.a;

public class PenDetail {

	public static void main(String[] args) {
		PenPouch pp = new PenPouch();
		Pen p = pp.getPendetails();

		System.out.println(p.getNumoffRefills() + " " + p.getColour() + " " + p.getType());

		// Pen pen1 = pen.getPendetails();
		// System.out.println(pp.getNumofRefills() + " " + pd.getColour + " " +
		// pd.getType);

		// Allpen all = pd.allPenDetails();
		// System.out.println(all.pd.getNumofRefills + " " + all.pd.geyColour + " " +
		// all.pd.getType);
		// System.out.println(all.pd.getNumofRefills + " " + all.pd.getColour + " " +
		// all.pd.getType);

		Allpen all = pp.getAllPenDetails();
		System.out.println(all.pen2.getNumoffRefills() + " " + all.pen2.getColour() + " " + all.pen2.getType());
		System.out.println(all.pen3.getNumoffRefills() + " " + all.pen3.getColour() + " " + all.pen3.getType());
	}
}
