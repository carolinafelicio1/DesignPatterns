package br.com.aragy.iterator;
;

public class CollectionofAddress implements Container {
	
	public String address[] = { "Céu", "Coordenação", "ProReitoria", "Trabalho", "Campo Grande" };
	
	public Iterator getIterator() {

		return new CollectionofAddressIterate();
	}

	private class CollectionofAddressIterate implements Iterator {

		int i;

		public boolean hasNext() {
			if (i < address.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return address[i++];
			}
			return null;
		}
	
	}

}
