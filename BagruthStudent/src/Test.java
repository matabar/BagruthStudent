public class Test {

	public static Node<?>[] schoolMonths(School school) {
		Node<Student>[] arr = school.getAr();
		Node<?>[] students = new Node<?>[12];
		int i = 0;
		int month;
		Node<Student> st;
		Node<?> add;
		for (int j = 0; j < arr.length; j++) {
			st = (Node<Student>) arr[j];
			while (st != null) {
				month = st.getValue().getBirthDay().getMonth() - 1;
				if (students[month] == null) {
					students[month] = new Node<Student>(st.getValue());
				} else {
					add = students[month];
					while (add.hasNext())
						add = add.getNext();
					add.setNext(new Node(add.getValue()));
					add = add.getNext();
					add = st;
				}
				st= st.getNext();
			}
		}
		return students;
	}

	public static void main(String[] args) {
		Node<?>[] ar_ = new Node<?>[6];
		ar_[0] = new Node<Student>(new Student("moshe", new Birth(2001, 9, 15)));
		School a = new School((Node<Student>[]) ar_);
		ar_ = schoolMonths(a);
		System.out.println(ar_[8].getValue());
	}

}
