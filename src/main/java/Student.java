public class Student {
    private String sno;
    private String sname;
    private String sex;
    private int age;
    private String dept_no;

    public String getSno() {
        return sno;
    }

    public String getSname() {
        return sname;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
    }

    @Override
    public String toString() {
        return "Student [no= " + sno + ", name=" + sname + ", sex=" + sex + ", dept_no= " + dept_no + "]";
    }
}
