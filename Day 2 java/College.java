class College{
    private String collegeName;
    private int totalStudents;
    public College(String collegeName,int totalStudents){
        this.collegeName=collegeName;
        this.totalStudents=totalStudents;
    }
    public String getCollegeName(){
        return collegeName;
    }
    public int getTotalStudents(){
        return totalStudents;
    }
    public static void main(String[]args){
        College c1=new College("TCE Engineering college",1500);
        System.out.println("College name is:" + c1.getCollegeName());
        System.out.println("total students are:" + c1.getTotalStudents());
    }
}
