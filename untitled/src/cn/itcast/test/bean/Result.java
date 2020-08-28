package cn.itcast.test.bean;

/**
 * Demo Class
 *
 * @author cat77
 * @date 8/27/2020
 */
public class Result {
    String Status;
    Account data;

    public void setStatus(String status) {
        Status = status;
    }

    public void setData(Account data) {
        this.data = data;
    }

    public String getStatus() {
        return Status;
    }

    public Account getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "Status='" + Status + '\'' +
                ", data=" + data +
                '}';
    }
}
