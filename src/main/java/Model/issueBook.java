package Model;

public class issueBook {

    private String issueID;
    private String borrowMember;
    private String borrowBook;
    private String issueDate;
    private String dueDate;

    public issueBook(String issueID, String borrowMember, String borrowBook,
                     String issueDate, String dueDate) {
        this.issueID = issueID;
        this.borrowMember = borrowMember;
        this.borrowBook = borrowBook;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }

    public issueBook() {
    }

    public String getIssueID() { return issueID; }
    public String getBorrowMember() { return borrowMember; }
    public String getBorrowBook() { return borrowBook; }
    public String getIssueDate() { return issueDate; }
    public String getDueDate() { return dueDate; }

    public void setIssueID(String issueID) {
        this.issueID = issueID;
    }

    public void setBorrowMember(String borrowMember) {
        this.borrowMember = borrowMember;
    }

    public void setBorrowBook(String borrowBook) {
        this.borrowBook = borrowBook;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "issueBook{" +
                "issueID='" + issueID + '\'' +
                ", borrowMember='" + borrowMember + '\'' +
                ", borrowBook='" + borrowBook + '\'' +
                ", issueDate='" + issueDate + '\'' +
                ", dueDate='" + dueDate + '\'' +
                '}';
    }
}
