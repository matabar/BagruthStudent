
public class School {
	private Node<Student>[] ar;

	public School(Node<Student>[] ar_) {
		setAr(ar_);
	}

	public Node<Student>[] getAr() {
		return this.ar;
	}

	public void setAr(Node<Student>[] ar) {
		this.ar = ar;
	}
}
