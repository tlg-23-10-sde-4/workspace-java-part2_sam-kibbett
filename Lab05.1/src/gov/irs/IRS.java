package gov.irs;

public interface IRS {
    //methods for IRSEnum, was implemented from IRSEnum
    public void collectTaxes();
    public void register(TaxPayer payer);

    // static factory method to obtain the instance
    public static IRS getInstance() {
        return IRSEnum.INSTANCE;
    }
}
