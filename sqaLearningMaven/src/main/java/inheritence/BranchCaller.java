package inheritence;

public class BranchCaller {
    public static void main(String args[]) {
    	Branch acc1 = new Branch(1,"1 first st", 1);
    	Branch acc2 = new Branch(2,"2 first st", 2);
    	Branch acc3 = new Branch(3,"3 first st", 3);
    	Branch acc4 = new Branch(4,"4 first st", 4);
    	
    	System.out.println("acc1 timing= "+acc1.getTiming()+", address="+
    	                   acc1.getAddress()+", empcount="+acc1.getTotalEmployees());
    	System.out.println("acc2 timing= "+acc2.getTiming()+", address="+
                acc2.getAddress()+", empcount="+acc2.getTotalEmployees());
    	System.out.println("acc3 timing= "+acc3.getTiming()+", address="+
                acc3.getAddress()+", empcount="+acc3.getTotalEmployees());
    	System.out.println("acc4 timing= "+acc4.getTiming()+", address="+
                acc4.getAddress()+", empcount="+acc4.getTotalEmployees());
    	

    }
}
