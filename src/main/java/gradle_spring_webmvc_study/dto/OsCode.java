package gradle_spring_webmvc_study.dto;

public class OsCode {
    private String code;
    private String label;

    
    public OsCode() {
        // TODO Auto-generated constructor stub
    }

    public OsCode(String code, String label) {
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
   
}
