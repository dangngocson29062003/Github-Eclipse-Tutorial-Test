package exercise8;

import java.util.ArrayList;
import java.util.List;

public class Library {
	List<LoanCard> loanCards;

	// Constructor
	public Library() {
		loanCards = new ArrayList<LoanCard>();
	}

	// Methods
	public void addLoanCard(LoanCard loanCard) {
		this.loanCards.add(loanCard);
	}

	public void deleteLoanCard(String id) {
		this.loanCards.removeIf(item -> item.getId().equals(id));
	}

	public void show() {
		this.loanCards.forEach(item -> System.out.println(item.toString()));
	}
}
