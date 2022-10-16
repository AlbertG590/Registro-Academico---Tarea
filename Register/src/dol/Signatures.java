package dol;

import java.io.Serializable;

public class Signatures implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8847061751197449773L;
	private String signature;
	private String studentsInSignature;
	private String signaturegrade;
	public Signatures() {
		super();

	}
	public String getSignature() {
		return signature;
	}
	public void setSignature(String signature) {
		this.signature = signature;
	}
	public String getStudentsInSignature() {
		return studentsInSignature;
	}
	public void setStudentsInSignature(String studentsInSignature) {
		this.studentsInSignature = studentsInSignature;
	}
	public String getSignaturegrade() {
		return signaturegrade;
	}
	public void setSignaturegrade(String signaturegrade) {
		this.signaturegrade = signaturegrade;
	}

}
