import java.util.*;

public class Test {
    public static void main(String[] args) {
        StoreManagement manager = new StoreManagement("./input/Staffs.txt", "./input/Timekeeping.txt",
                "./input/Invoices.txt", "./input/InvoiceDetails.txt",
                "./input/Drinks.txt");

        manager.writeFile("Req1.txt", manager.getStaffs());

        ArrayList<SeasonalStaff> Req2 = manager.getTopFiveSeasonalStaffsHighSalary();
        manager.writeFile("Req2.txt", Req2);

        ArrayList<FullTimeStaff> Req3 = manager.getFullTimeStaffsHaveSalaryGreaterThan(15000000);
        manager.writeFile("Req3.txt", Req3);

        double Req4 = manager.totalInQuarter(1);
        manager.writeFile("Req4.txt", Req4);

        Staff Req5 = manager.getStaffHighestBillInMonth(6);
        manager.writeFile("Req5.txt", Req5);
    }

}
