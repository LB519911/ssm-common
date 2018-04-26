package common.utils;

import java.util.List;

public class MyItemResult {
    long total;
    List<?> rows;

    public void setTotal(long total) {
        this.total = total;
    }

    public long getTotal() {
        return total;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }

    public List<?> getRows() {
        return rows;
    }
}
