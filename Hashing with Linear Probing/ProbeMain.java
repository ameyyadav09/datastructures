class ProbeMain {
	public static void main (String [] args) {
		Probe p = new Probe(11);
		p.insert("11" , "106");
		p.insert("5" , "82");
		p.insert("5" , "10");
		p.insert("5" , "101");
		p.insert("7" , "02");
		p.insert("8" , "02");
		p.insert("11" , "02");
		p.insert("12" , "02");
		p.insert("6" , "02");
		p.insert("541" , "02");
		p.insert("456" , "02");
		p.print();
		System.out.println();
		p.insert("25" , "02");
		p.insert("59" , "02");
		// p.insert("14" , "02");
		// p.insert("256" , "02");
		// p.insert("369" , "02");
		// p.insert("478" , "02");
		// p.insert("896" , "02");
		System.out.println();
		p.remove("7");
		p.print();
		System.out.println();
		p.remove("11");
		p.print();
		System.out.println();
		p.remove("80");
		p.print();
	}
}