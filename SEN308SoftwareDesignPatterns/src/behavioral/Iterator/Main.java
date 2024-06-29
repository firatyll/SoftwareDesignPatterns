package behavioral.Iterator;

public class Main {
	public static void main(String[] args) {
        NameRepository namesRepository = new NameRepository();

        for (Iterator iter = namesRepository.getIterator(); iter.hasNext(); ) {
            String info = (String) iter.next();
            System.out.println("Name: " + info);
        }
    }
}
