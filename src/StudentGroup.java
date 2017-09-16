import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		if(students.length==0)
			return null;
		else
			return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		if(students==null)
			throw new IllegalArgumentException();
		else
			this.students=students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else
			return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else
			this.students[index]=student;

	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else
		{
			
			for(int i=students.length;i>0;i--)
				students[i]=students[i-1];
			students[0]=student;
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else
		{
			students[students.length]=student;
		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else
		{
			
			for(int i=students.length;i>index;i--)
				students[i]=students[i-1];
			students[index]=student;
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else
		{
			for(int i=index;i<students.length-1;i++)
				students[i]=students[i+1];
			students[(students.length)-1]=null;
		}

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		for(int i=0;i<students.length;i++)
		{
			if(students[i]==student)
			{
				for(int j=i;j<students.length;j++)
					students[j]=students[j+1];
				students[(students.length)-1]=null;
				return;
			}
		}
		throw new IllegalStateException("Student not exist");

	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else
			for(int i=index+1;i<students.length;i++)
				students[i]=null;

	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else
		{
			for(int i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					for(int j=i+1;j<students.length;j++)
						students[j]=null;
					return;
				}
			}
		}
			
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0||index>=students.length)
			throw new IllegalArgumentException();
		else
		{
			int j=students.length-index;
			for(int i=0;i<j;i++)
				students[i]=students[i+index];
			for(int i=j;i<j+index;i++)
				students[i]=null;
		}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else
		{
			for(int i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					int index=i;
					int j=students.length-index;
					for(i=0;i<j;i++)
						students[i]=students[i+index];
					for(i=j;i<j+index;i++)
						students[i]=null;
					return;
				}
			}
		}

	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int n=students.length;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
			{
				
			}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		if(student==null)
			throw new IllegalArgumentException();
		else
			for(int i=0;i<students.length;i++)
				if(students[i]==student)
					return students[i+1];
		return null;
	}
}
