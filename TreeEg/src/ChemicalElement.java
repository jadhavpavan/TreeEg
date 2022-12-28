
public class ChemicalElement {
	
	int atomicNumber;
	String atomicName;
	String atomicFormula;
	float atomicWeight;
	
	ChemicalElement left,right;
	
	
	public ChemicalElement(int atomicNumber, String atomicName, String atomicFormula, float atomicWeight) {
		super();
		this.atomicNumber = atomicNumber;
		this.atomicName = atomicName;
		this.atomicFormula = atomicFormula;
		this.atomicWeight = atomicWeight;
	}
	public ChemicalElement() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ChemicalElement [atomicNumber=" + atomicNumber + ", atomicName=" + atomicName + ", atomicFormula="
				+ atomicFormula + ", atomicWeight=" + atomicWeight + "]";
	}
}
