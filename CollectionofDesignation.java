package br.com.aragy.iterator;

public class CollectionofDesignation implements Container {
	
	public String designation[] = { "Java Programmer and Content Writer", "CEO", 
			"Professorora", "Manager","Escola/Faculdade" };
	
	public Iterator getIterator() {

		return new CollectionofDesignationIterate();
	}

	private class CollectionofDesignationIterate implements Iterator {

		int i;

		public boolean hasNext() {
			if (i < designation.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return designation[i++];
			}
			return null;
		}
	}

	

}
