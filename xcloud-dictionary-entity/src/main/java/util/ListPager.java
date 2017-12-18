package util;

import java.util.List;

public class ListPager {
    public static final Integer PAGE_SIZE = 10;

    public static <T> ListPage<T> createListPage(int currentPage, int pageSize,
            int totalSize, T items) {
        int totalPage = calculateTotalPage(totalSize, pageSize);
        int validedCurrentPage = validCurrentPage(currentPage, totalPage);
        return new ListPage(validedCurrentPage, pageSize, totalSize, items);
    }

    public static int page2From(int page, int pageSize) {
        if (page < 1)
            return 0;

        return ((page - 1) * pageSize);
    }

    public static int getValidPage(int wantPage, int totalSize, int pageSize) {
        int totalPage = calculateTotalPage(totalSize, pageSize);
        return validCurrentPage(wantPage, totalPage);
    }

    private static int calculateTotalPage(int totalSize, int pageSize) {
        int rawPage = totalSize / pageSize;
        return ((totalSize % pageSize == 0) ? rawPage : rawPage + 1);
    }

    private static int validCurrentPage(int currentPage, int totalPage) {
        if (currentPage < 1)
            return 1;

        if (currentPage > totalPage)
            return totalPage;

        return currentPage;
    }

    public static <O> List<O> getItemsOfPage(int ipage, int isize, List<O> lists) {
        if ((lists == null) || (lists.size() == 0))
            return null;

        int page = ipage;
        int size = isize;
        if (page < 1)
            page = 1;

        if (size <= 0)
            size = 10;

        int from = (page - 1) * size;

        if (from >= lists.size()) {
            from = lists.size() - size;
            if (from < 0)
                from = 0;
        }

        int end = from + size;
        if (end >= lists.size())
            end = lists.size();

        return lists.subList(from, end);
    }
}
