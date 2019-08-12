package dev.sumana.cmappings.model.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class CommentDTO {
    @NotNull
    @NotEmpty
    private String content;

    @NotNull
    @Size(min = 5, max = 150)
    private Long authorEmail;

    @NotNull
    private Long postId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getAuthorEmail() {
        return authorEmail;
    }

    public void setAuthorEmail(Long authorEmail) {
        this.authorEmail = authorEmail;
    }

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }
}
