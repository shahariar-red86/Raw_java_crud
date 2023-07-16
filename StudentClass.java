package CRUD_raw_code_project;

public class StudentClass {
    private String name;
    private int id;
    private int contact;

    StudentClass(String name,int id,int contact){
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }

    public void setContact(int contact){
        this.contact=contact;
    }
    public int getContact(){
        return contact;
    }
    public String toString(){
        return name+"  "+id+"  "+contact;
    }
}
