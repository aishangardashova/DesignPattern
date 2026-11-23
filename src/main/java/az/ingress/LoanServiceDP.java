package az.ingress;

import java.time.LocalDate;

public class LoanServiceDP {


    //String name, int age, int monthsAtJob, double salary, double amount
    record Applicantion(String id, String name, int age,
                     LocalDate employmentStartDate, double monthlySalary) {}

    record LoanApplication(Applicantion applicant, double amount) {}

}
