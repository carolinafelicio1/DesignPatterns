package br.com.aragy.iterator;

public class CollectionofAges implements Container {

	public int age[] = { 21, 38, 46, 967, 99 };


	public Iterator getIterator() {

		return new CollectionofAgeIterate();
	}

	private class CollectionofAgeIterate implements Iterator {

		int i;

		public boolean hasNext() {
			if (i < age.length) {
				return true;
			}
			return false;
		}

		public Object next() {
			if (this.hasNext()) {
				return age[i++];
			}
			return null;
		}
	}
}
