package programmingJava8AndAbove;

public class Notes {
    private Integer id;

    public Notes(int i, String note1, Long i1) {
        this.id =i;
        this.tagName = note1;
        this.tagId = i1;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    private String tagName;
    private Long tagId;

}
