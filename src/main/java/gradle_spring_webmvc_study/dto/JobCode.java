package gradle_spring_webmvc_study.dto;

public class JobCode {
    private String code;
    private String label;

    public JobCode() {
        // TODO Auto-generated constructor stub
    }

    public JobCode(String code, String label) {
        this.code = code;
        this.label = label;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getCode() {
        return code;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return String.format("JobCode [code=%s, label=%s]", code, label);
    }

    /*
     * @Override public String toString() { return String.format("%s", label); }
     */

}
