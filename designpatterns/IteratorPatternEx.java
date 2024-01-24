package designpatterns;

/*Kavya Bai Mahendrakar*/

interface Iterator{
	boolean hasNext();
	Object next();
}

interface Container{
	Iterator getIterator();
}

class CollectionOfNames implements Container{
	
	public String names[] = {"A","B","C","D","E","F"};

	@Override
	public Iterator getIterator() {
		// TODO Auto-generated method stub
		return new CollectionNamesIterator();
	}
	private class CollectionNamesIterator implements Iterator{
		int i;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if(i<names.length)
				return true;
			else
				return false;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			if(this.hasNext()) {
				return names[i++];
			}
			return null;
		}
		
	}
}
public class IteratorPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionOfNames collectionOfNames = new CollectionOfNames();
		for(Iterator iterator = collectionOfNames.getIterator();iterator.hasNext();) {
			String name = (String) iterator.next();
			System.out.println(name);
		}

	}

}
