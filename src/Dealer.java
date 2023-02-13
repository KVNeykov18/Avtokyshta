public class Dealer {
    private int dealerId;
    private String dealerCompanyName;
    private String dealerFirstName;

    public void Dealer(){
        this.dealerId = 1;
        this.dealerCompanyName = "GoshoPatkata";
        this.dealerFirstName = "Gosho Patkanov";
    }

    public Dealer(int dealerId, String dealerCompanyName, String dealerFirstName) {
        this.dealerId = dealerId;
        this.dealerCompanyName = dealerCompanyName;
        this.dealerFirstName = dealerFirstName;
    }

    public int getDealerId() {
        return dealerId;
    }

    public void setDealerId(int dealerId) {
        this.dealerId = dealerId;
    }

    public String getDealerCompanyName() {
        return dealerCompanyName;
    }

    public void setDealerCompanyName(String dealerCompanyName) {
        this.dealerCompanyName = dealerCompanyName;
    }

    public String getDealerFirstName() {
        return dealerFirstName;
    }

    public void setDealerFirstName(String dealerFirstName) {
        this.dealerFirstName = dealerFirstName;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "dealerId=" + dealerId +
                ", dealerCompanyName='" + dealerCompanyName + '\'' +
                ", dealerFirstName='" + dealerFirstName + '\'' +
                '}';
    }

    public void add(Dealer dealers) {

    }
}
