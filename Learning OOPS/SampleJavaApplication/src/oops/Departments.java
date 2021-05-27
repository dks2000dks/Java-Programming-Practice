package oops;

public class Departments {
    private int deptID;
    private String deptName;
    
    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    
    @Override
    public String toString() {
        return "Departments [deptID=" + deptID + ", deptName=" + deptName + "]";
    }
}
