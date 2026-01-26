package exercise2;

import java.util.ArrayList;
import java.util.List;

public class DocumentManagement {
	List<Document> documents;

	/* Constructor */
	public DocumentManagement() {
		this.documents = new ArrayList<>();
	}

	/* Methods */
	public void addDocument(Document document) {
		this.documents.add(document);
	}

	public boolean deleteDocument(String id) {
		Document currentDoc = this.documents.stream().filter(item -> item.id.matches(id)).findFirst().orElse(null);
		if (currentDoc == null) {
			return false;
		}
		this.documents.remove(currentDoc);
		return true;
	}

	public void showInfo() {
		this.documents.forEach(item -> System.out.println(item.toString()));
	}

	public void searchBook() {
		this.documents.stream().filter(item -> item instanceof Book)
				.forEach(item -> System.out.println(item.toString()));
	}

	public void searchMagazine() {
		this.documents.stream().filter(item -> item instanceof Magazine)
				.forEach(item -> System.out.println(item.toString()));
	}

	public void searchNewspaper() {
		this.documents.stream().filter(item -> item instanceof Newspaper)
				.forEach(item -> System.out.println(item.toString()));
	}
}
