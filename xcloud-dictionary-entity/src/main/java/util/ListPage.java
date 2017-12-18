package util;

public class ListPage<T> {
    private int currentPage = 1;
    private int nextPage;
    private int prevPage;
    private int pageSize = 10;
    private int totalItems;
    private boolean hasNext;
    private boolean hasPrev;
    private boolean isFirst;
    private boolean isEnd;
    private boolean isCurrent;
    private int from;
    private int totalPage;
    private T items;

    ListPage(int validedCurrentPage, int pageSize, int totalItems, T items) {
        this.currentPage = ((validedCurrentPage < 0) ? 1 : validedCurrentPage);
        this.pageSize = ((pageSize < 0) ? 10 : pageSize);
        this.totalItems = ((totalItems < 0) ? 0 : totalItems);
        this.items = items;
        initState();
    }

    public ListPage(int page) {
        this.currentPage = ((page < 0) ? 1 : page);
    }

    public ListPage(int page, int pageSize) {
        this.currentPage = ((page < 0) ? 1 : page);
        this.pageSize = ((pageSize < 0) ? 10 : pageSize);
    }

    private void initState() {
        if (this.totalItems == 0)
            this.currentPage = 0;

        this.totalPage = (this.totalItems / this.pageSize + ((this.totalItems
                % this.pageSize == 0) ? 0 : 1));

        if (this.currentPage > totalPage)
            this.currentPage = totalPage;

        this.hasNext = (this.currentPage < this.totalPage);
        if (this.hasNext)
            this.nextPage = (this.currentPage + 1);

        this.hasPrev = (this.currentPage > 1);
        if (this.hasPrev)
            this.prevPage = (this.currentPage - 1);

        this.from = (((this.currentPage - 1 < 0) ? 0 : this.currentPage - 1) * this.pageSize);
        this.isFirst = ((this.currentPage == 1) || (this.currentPage == 0));
        this.isEnd = (this.currentPage == this.totalPage);
        this.isCurrent = (this.currentPage == this.currentPage);
    }

    public String toString() {
        return "currentPage=" + this.currentPage + "\n" + "pageSize="
                + this.pageSize + "\n" + "totalPage=" + this.totalPage + "\n"
                + "hasNext=" + this.hasNext + "\n" + "hasPrev=" + this.hasPrev
                + "\n" + "from=" + this.from + "\n" + "isFirst=" + this.isFirst
                + "\n" + "isEnd=" + this.isEnd + "\n" + "isCurrent="
                + this.isCurrent + "\n" + "totalItems=" + this.totalItems
                + "\n";
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public int getNextPage() {
        return this.nextPage;
    }

    public int getPrevPage() {
        return this.prevPage;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public int getTotalItems() {
        return this.totalItems;
    }

    public void setTotalItems(int totalItems) {
        this.totalItems = ((totalItems < 0) ? 0 : totalItems);
        initState();
    }

    public boolean isHasNext() {
        return this.hasNext;
    }

    public boolean isHasPrev() {
        return this.hasPrev;
    }

    public boolean getIsFirst() {
        return this.isFirst;
    }

    public boolean getIsEnd() {
        return this.isEnd;
    }

    public boolean isCurrent() {
        return this.isCurrent;
    }

    public int getFrom() {
        return this.from;
    }

    public T getItems() {
        return this.items;
    }

    public void setItems(T items) {
        this.items = items;
    }
}
