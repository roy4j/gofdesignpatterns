package gof.dp11;

import gof.dp11.systemone.Library;
import gof.dp11.systemthree.Cafeteria;
import gof.dp11.systemtwo.Admin;

public class EmployeeRelease {

    private Library library;
    private Cafeteria cafeteria;
    private Admin admin;

    public EmployeeRelease() {
        this.library = new Library();
        this.cafeteria = new Cafeteria();
        this.admin = new Admin();
    }

    public boolean releaseEmployee(String empId) {
        if (library.booksPending(empId)) {
            return false;
        } else if (cafeteria.dueAmount(empId) > 0) {
            return false;
        } else if (admin.issuedAccessCard(empId)
                || admin.issuedLaptop(empId) || admin.issuedOthers(empId)) {
            return false;
        }
        return true;
    }
}