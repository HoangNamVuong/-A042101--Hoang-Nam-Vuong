package email.model;

import java.util.List;

public class Email {
    private List<String> languages;
    private List<String> pageSizes;
    private List<String> spamFilters;
    private String signature;

    public Email() {

    }

    public Email(List<String> languages, List<String> pageSizes, List<String> spamFilters, String signature) {
        this.languages = languages;
        this.pageSizes = pageSizes;
        this.spamFilters = spamFilters;
        this.signature = signature;
    }

    public String getLanguages() {
        StringBuffer stringBuffer = new StringBuffer();
        for (String language: languages) {
            stringBuffer.append(language);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getPageSizes() {
        StringBuffer stringBuffer = new StringBuffer();
        for (String pageSize: pageSizes) {
            stringBuffer.append(pageSize);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    public void setPageSizes(List<String> pageSizes) {
        this.pageSizes = pageSizes;
    }

    public String getSpamFilters() {
        StringBuffer stringBuffer = new StringBuffer();
        for (String spamFilter: spamFilters) {
            stringBuffer.append(spamFilter);
            stringBuffer.append(" ");
        }
        return stringBuffer.toString();
    }

    public void setSpamFilters(List<String> spamFilters) {
        this.spamFilters = spamFilters;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
