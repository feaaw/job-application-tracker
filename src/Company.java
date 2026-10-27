public class Company {
    private String name;
    private String jobType;
    private String applyDate;
    private String interviewDate;
    private String status;
    private String memo;

    // コンストラクタ
    public Company(String name, String jobType, String applyDate, String interviewDate, String status, String memo) {
        this.name = name;
        this.jobType = jobType;
        this.applyDate = applyDate;
        this.interviewDate = interviewDate;
        this.status = status;
        this.memo = memo;
    }

    // ゲッター
    public String getName() { return name; }
    public String getJobType() { return jobType; }
    public String getApplyDate() { return applyDate; }
    public String getInterviewDate() { return interviewDate; }
    public String getStatus() { return status; }
    public String getMemo() { return memo; }

    //セッター
    public void setStatus(String status) { this.status = status;}
    public void setInterviewDate(String interviewDate) {
        this.interviewDate = interviewDate;
    }

    // 一覧表示用
    @Override
    public String toString() {
        return String.format("%-20s %-15s %-12s %-12s %-12s %s", 
        name, jobType, applyDate, interviewDate.isEmpty() ? "未定" : interviewDate, status, 
        status, memo.isEmpty() ? "" : "[ " + memo + " ]");
    }
}