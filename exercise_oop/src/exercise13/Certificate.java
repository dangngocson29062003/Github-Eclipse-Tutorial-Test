package exercise13;

public class Certificate {
	private String certificateID;
	private String certificateName;
	private String certificateRank;
	private String certificateDate;

	// Constructor
	public Certificate(String certificatedID, String certificateName, String certificateRank, String certificatedDate) {
		this.certificateID = certificatedID;
		this.certificateName = certificateName;
		this.certificateRank = certificateRank;
		this.certificateDate = certificatedDate;
	}
	// Getters & Setters

	public String getCertificateID() {
		return certificateID;
	}

	public void setCertificateID(String certificateID) {
		this.certificateID = certificateID;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	public String getCertificateRank() {
		return certificateRank;
	}

	public void setCertificateRank(String certificateRank) {
		this.certificateRank = certificateRank;
	}

	public String getCertificateDate() {
		return certificateDate;
	}

	public void setCertificateDate(String certificateDate) {
		this.certificateDate = certificateDate;
	}

	// Methods
	@Override
	public String toString() {
		return "ID: " + certificateID + " | " + "Name: " + certificateName + " | " + "Rank: " + certificateRank + " | "
				+ "Date: " + certificateDate + ";";
	}
}
