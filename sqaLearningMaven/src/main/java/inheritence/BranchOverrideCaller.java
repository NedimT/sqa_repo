package inheritence;

public class BranchOverrideCaller {
    public static void main(String args[]){
    	Branch braObj = new Branch(1,"branch 1st",1);
    	BranchOverriding braOverObj = new BranchOverriding(2,"branchOver caller one",2);
        System.out.println("Branch obj timing="+braObj.getTiming()+", address ="+
    	                    braObj.getAddress()+", emp count="+braObj.getTotalEmployees());
        System.out.println("Branch objOver timing="+braOverObj.getTiming()+", address ="+
                braOverObj.getAddress()+", emp count="+braOverObj.getTotalEmployees());
        braObj.withdrawMoney(77);
        braOverObj.withdrawMoney(88);
    }
}
