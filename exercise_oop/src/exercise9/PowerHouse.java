package exercise9;

import java.util.ArrayList;
import java.util.List;

public class PowerHouse {
	List<Receipt> receipts;

	// Constructor
	public PowerHouse() {
		receipts = new ArrayList<Receipt>();
	}

	// Methods
	public void addReceipt(Receipt receipt) {
		this.receipts.add(receipt);
		System.out.println("Add successfully");
	}

	public void deleteReceipt(String meterNumber) {
		this.receipts.removeIf(item -> item.getCustomer().getMeterNumber().equals(meterNumber));
		System.out.println("Delete successfully");
	}

	public void updateReceipt(String meterNumber, int oldNumber, int newNumber) {
		Receipt receipt = this.receipts.stream().filter(item -> item.getCustomer().getMeterNumber().equals(meterNumber))
				.findFirst().orElse(null);
		if (receipt == null) {
			System.out.println("Not found");
		}
		receipt.setOldNumber(oldNumber);
		receipt.setNewNumber(newNumber);
		System.out.println("Update successfully");
	}

	public void show() {
		this.receipts
				.forEach(item -> System.out.println(item.toString() + " | " + "Total payment: " + item.caculate()));
	}
}
