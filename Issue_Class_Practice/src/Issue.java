
public class Issue {

	private int issueNumber;
	private int numberOfAds;
	private int adRevenue;

	public Issue() {
		issueNumber = 1;
		numberOfAds = 0;
		adRevenue = 0;
	}

	public Issue(int number, int numadds, int revenue) {
		issueNumber = number;
		numberOfAds = numadds;
		adRevenue = revenue;
	}

	public Issue(int number, int numadds) {
		issueNumber = number;
		numberOfAds = numadds;
		adRevenue = numberOfAds * 50;

	}

	public int getIssueNumber() {
		return issueNumber;
	}

	public void setIssueNumber(int issueNumber) {
		this.issueNumber = issueNumber;
	}

	public int getNumberOfAds() {
		return numberOfAds;
	}

	public void setNumberOfAds(int numberOfAds) {
		this.numberOfAds = numberOfAds;
	}

	public int getAdRevenue() {
		return adRevenue;
	}

	public void setAdRevenue(int adRevenue) {
		this.adRevenue = adRevenue;
	}

	public static void dysplayMotto() {
		System.out.println("Everything that you need to know");
	}

	public static void main(String[] args) {

		Issue One = new Issue();
		Issue IssueTwo = new Issue(30, 321);
		Issue IssueThree = new Issue(11, 123, 150);

		System.out.println(" Issue 1 Values");
		System.out.println(One.getIssueNumber());
		System.out.println(One.getNumberOfAds());
		System.out.println(One.getAdRevenue());

		System.out.println(" Issue 2 Values");
		System.out.println(IssueTwo.getIssueNumber());
		System.out.println(IssueTwo.getNumberOfAds());
		System.out.println(IssueTwo.getAdRevenue());

		System.out.println(" Issue 3 Values");
		System.out.println(IssueThree.getIssueNumber());
		System.out.println(IssueThree.getNumberOfAds());
		System.out.println(IssueThree.getAdRevenue());

		Issue.dysplayMotto();

		System.out.println("this is just a test - just cheking");
	}

}
