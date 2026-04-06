package Assigment_13.Q1_;

class BankAccountUser implements Runnable {
    private String userType;

    public BankAccountUser(String userType) {
        this.userType = userType;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(userType + " checking balance | Priority: "
                    + Thread.currentThread().getPriority());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
