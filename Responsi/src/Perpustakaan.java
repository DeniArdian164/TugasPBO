public class Perpustakaan {
    private String id;
    private String memberId;
    private String memberName;
    private String bookId;
    private String bookName;

    public Perpustakaan(String id, String memberId, String memberName, String bookId, String bookName) {
        this.id = id;
        this.memberId = memberId;
        this.memberName = memberName;
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public String getId() {
        return id;
    }

    public String getMemberId() {
        return memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public String getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }
}