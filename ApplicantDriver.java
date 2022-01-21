public class ApplicantDriver {
    
    public static void main(String[] args){

        Applicant[] applications = {new Applicant("Jane",15), 
        new Applicant("Same", 5), new Applicant("John",10), new Applicant("Kelly", 20)};

        Applicant a1 = new Applicant("Jessie" , 3);
        Applicant a2 = new Applicant("Marry", 7);

        Seeker<Applicant> seek = new Seeker<>();

        System.out.println(a1.getName() + 
        (seek.isSmallest(applications, a1)? " is" : " is not") + " the least experienced");

        System.out.println(a2.getName() + 
        (seek.isSmallest(applications, a2)? " is" : " is not") + " the least experienced");
    }

}
