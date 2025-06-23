package com.index;

class studentdetails{
	int Id;
	String name;
	String location;
	String Branch;
	String Degeree;

  studentdetails(int Id,String name,String location,String Branch,String Degeree){
	this.Id=Id;
	this.name=name;
	this.location=location;
	this.Branch=Branch;
	this.Degeree=Degeree;
}
void display() {
	if(Id>=3 && location.equals("South") && Degeree.equals("engineering")) {
		System.out.println("The id is:"+Id);
		System.out.println("Student Name:"+name);
		System.out.println("Student Location:"+location);
		System.out.println("Student Deg:"+Degeree);
		System.out.println("Student Branch:"+Branch);
	}
}
}
public class StudentArrayOfObject {
	

	public static void main(String[] args) {
		studentdetails st[]=new studentdetails[5];
		st[0]=new studentdetails(3,"SHARMILA","South","Engineering","CSE");
		st[1]=new studentdetails(4,"SUBHA","South","Engineering","CSE");
		st[2]=new studentdetails(5,"THAMIZH","South","Engineering","CSE");
		st[3]=new studentdetails(6,"SABARI","NORTH","Engineering","CSE");
		st[4]=new studentdetails(7,"ABARNA","South","Engineering","AIDS");
		
		for(int i=0; i<st.length;i++) {
			st[i].display();
		}
		
		// TODO Auto-generated method stub

	}

}
