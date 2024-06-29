package behavioral.Iterator;

public class NameRepository implements Container {
	public String names[] = { "John", "Jane", "Jack", "Jill" };
	public int salary[] = { 3000, 4000, 5000, 6000 };

	@Override
	public Iterator getIterator() {
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int nameIndex;
		int salaryIndex;

		@Override
		public boolean hasNext() {
			return nameIndex < names.length;
		}

		@Override
		public Object next() {
			if (this.hasNext()) {
				return names[nameIndex++] + " " + salary[salaryIndex++];
			}
			return null;
		}
	}
}
