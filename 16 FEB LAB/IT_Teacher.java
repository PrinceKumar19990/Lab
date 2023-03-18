package LAB16Feb;


class Teacher{
	String collage_name="Vijay";
	String designation="Senior Professor";
	void work() {
		System.out.println("Im Teaching in "+collage_name);
		System.out.println("My designation is "+designation);
	}
}
class Math_Teacher extends Teacher{
	String name="Pooja";
	String subject="Mathematics";
	void Math() {
		System.out.println("Hello I am "+name+","+"I am Teacher of "+subject);
	}
}
class Soft_Skill_Teacher extends Teacher{
	String name="Mohit";
	String subject="Soft Skill";
	void SoftSkill() {
		System.out.println("Hello I am "+name+","+"I am Teacher of "+subject);
	}
}
public class IT_Teacher extends Teacher{
	String name="Anamika";
	String subject="IT";
	void IT() {
		System.out.println("Hello I am "+name+","+"I am Teacher of "+subject);
	}
	public static void main(String[] args) {
		Math_Teacher m=new Math_Teacher();
		Soft_Skill_Teacher s=new Soft_Skill_Teacher();
		IT_Teacher it=new IT_Teacher();
		m.Math();
		m.work();
		s.SoftSkill();
		s.work();
		it.IT();
		it.work();
		
	}
}
