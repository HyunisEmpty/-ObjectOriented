public class StudentScores {
	private final int MAX_STUDENTS = 100;
	private Student[] student;
	private int numStudents;

	public StudentScores() {
		student = new Student[MAX_STUDENTS];
		numStudents = 0;
	}

	public void add(String name, int score) {
		if (numStudents >= MAX_STUDENTS)
			return; // not enough space to add new student score
		student[numStudents].setName(name);
		student[numStudents].setScore(score);
		numStudents++;
	}

	public String getHighest() {
		if (numStudents == 0)
			return null;

		int highest = 0;

		for (int i = 1; i < numStudents; i++)
			if (student[i].getScore() > student[highest].getScore())
				highest = i;

		return student[highest].getName();
	}

	public String getLowest() {
		if (numStudents == 0)
			return null;

		int lowest = 0;

		for (int i = 1; i < numStudents; i++)
			if (student[i].getScore() < student[lowest].getScore())
				lowest = i;

		return student[lowest].getName();
	}
}