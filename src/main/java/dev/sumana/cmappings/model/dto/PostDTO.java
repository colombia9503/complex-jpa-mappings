package dev.sumana.cmappings.model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PostDTO {

    @NotNull
    @NotEmpty
    @Size(min = 5, max = 100)
    private String title;

    @NotNull
    @NotEmpty
    private String authorEmail;

    @NotNull
    @NotEmpty
    @Size(min = 25, max = 250)
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
