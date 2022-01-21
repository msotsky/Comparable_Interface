public class Applicant implements Comparable<Applicant>{
    private int yearExp;
    private String name;

    public Applicant(String name, int yearExp){
        this.name = name;
        this.yearExp = yearExp;
    }

    public String getName(){
        return this.name;
    }

    public int geatYearExp(){
        return this.yearExp;
    }

    //Comparing applicants based on year of experience
    public int compareTo(Applicant other){
        return this.yearExp - other.yearExp;
    }
}
