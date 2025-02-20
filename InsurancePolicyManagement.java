import java.util.*;

class Policy {
    String policyNumber;
    String policyholderName;
    Date expiryDate;
    String coverageType;
    double premiumAmount;

    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType,
            double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public String toString() {
        return "Policy Number: " + policyNumber + ", Policyholder: " + policyholderName +
                ", Expiry Date: " + expiryDate + ", Coverage: " + coverageType +
                ", Premium: $" + premiumAmount;
    }
}

public class InsurancePolicyManagement {
    Map policiesHashMap = new HashMap();
    Map policiesLinkedHashMap = new LinkedHashMap();
    Map policiesTreeMap = new TreeMap();

    public void addPolicy(Policy policy) {
        policiesHashMap.put(policy.policyNumber, policy);
        policiesLinkedHashMap.put(policy.policyNumber, policy);
        policiesTreeMap.put(policy.expiryDate, policy);
    }

    public Policy getPolicyByNumber(String policyNumber) {
        return (Policy) policiesHashMap.get(policyNumber);
    }

    public void listPoliciesExpiringSoon() {
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 30);
        Date next30Days = calendar.getTime();

        for (Object entry : policiesTreeMap.entrySet()) {
            Map.Entry mapEntry = (Map.Entry) entry;
            Date expiry = (Date) mapEntry.getKey();
            if (expiry.after(today) && expiry.before(next30Days)) {
                System.out.println(mapEntry.getValue());
            }
        }
    }

    public void listPoliciesByHolder(String holderName) {
        for (Object entry : policiesLinkedHashMap.entrySet()) {
            Map.Entry mapEntry = (Map.Entry) entry;
            Policy policy = (Policy) mapEntry.getValue();
            if (policy.policyholderName.equals(holderName)) {
                System.out.println(policy);
            }
        }
    }

    public void removeExpiredPolicies() {
        Date today = new Date();
        Iterator iterator = policiesTreeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            Date expiry = (Date) entry.getKey();
            if (expiry.before(today)) {
                Policy policy = (Policy) entry.getValue();
                policiesHashMap.remove(policy.policyNumber);
                policiesLinkedHashMap.remove(policy.policyNumber);
                iterator.remove();
                System.out.println("Removed expired policy: " + policy.policyNumber);
            }
        }
    }

    public static void main(String[] args) {
        InsurancePolicyManagement system = new InsurancePolicyManagement();

        system.addPolicy(new Policy("P001", "John Doe", new Date(2024 - 1900, 6, 15), "Health", 500.0));
        system.addPolicy(new Policy("P002", "Alice Brown", new Date(2024 - 1900, 7, 10), "Auto", 750.0));
        system.addPolicy(new Policy("P003", "John Doe", new Date(2023 - 1900, 5, 20), "Home", 1000.0));

        System.out.println("Retrieve Policy by Number (P001):");
        System.out.println(system.getPolicyByNumber("P001"));

        System.out.println("\nPolicies Expiring in the Next 30 Days:");
        system.listPoliciesExpiringSoon();

        System.out.println("\nPolicies for John Doe:");
        system.listPoliciesByHolder("John Doe");

        System.out.println("\nRemoving Expired Policies...");
        system.removeExpiredPolicies();
    }
}
