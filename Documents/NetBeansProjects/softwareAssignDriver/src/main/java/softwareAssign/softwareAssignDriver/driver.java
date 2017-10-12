package softwareAssign.softwareAssignDriver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.time.*;
import softwareAssign.softwareMaven.*;

public class driver{

	public static void main(String args[]) throws ParseException {
		
        Date news1dob = null;
        Date news2dob = null;
        Date news3dob = null;
        Date news4dob = null;
		
		
        SimpleDateFormat dateformat2 = new SimpleDateFormat("dd-M-yyyy");
  
        String s1dob = "02-04-2015";        
        news1dob = dateformat2.parse(s1dob);
        
        String s2dob = "02-04-2015";        
        news1dob = dateformat2.parse(s2dob);
        
        String s3dob = "02-04-2015";        
        news1dob = dateformat2.parse(s3dob);
		
        String s4dob = "02-04-2015";        
        news1dob = dateformat2.parse(s4dob);
        
		List<Student> students = new ArrayList<Student>();
		List<Module> modules = new ArrayList<Module>();
		List<CourseProgramme> courses = new ArrayList<CourseProgramme>();
		
		Student s1 = new Student("Andrew1", 22, news1dob, 133683811);
		students.add(s1);
		Student s2 = new Student("Andrew2", 22, news2dob, 133683812);
		students.add(s2);
		Student s3 = new Student("Andrew3", 22, news3dob, 133683813);
		students.add(s3);
		Student s4 = new Student("Andrew4", 22, news4dob, 133683814);
		
		System.out.println(s1.getAge());
		System.out.println(s1.getName());	
		System.out.println(s1.getUserName());
		System.out.println(s1.getDob());
		
		System.out.println(students.size());

		Module m1 = new Module("CS&IT", "CT111", students);
		modules.add(m1);
		
		CourseProgramme c1 = new CourseProgramme("BSC", modules, LocalDate.parse("2018-09-04"), LocalDate.parse("2019-05-31"));
		courses.add(c1);
		
		
		m1.addStudent(s4);
		
		
		System.out.println(modules.get(0).getStudentList());
		
		System.out.println(students.size());
		
		System.out.println(m1.getStudentList().get(2).getID());
		
	}
	
}
