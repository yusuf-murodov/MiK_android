package me.modernpage.data.local.entity.relation;

import androidx.room.Embedded;
import androidx.room.Relation;

import me.modernpage.data.local.entity.Comment;
import me.modernpage.data.local.entity.Profile;

public class CommentRelation {
    @Embedded
    private Comment comment;

    @Relation(
            entity = Profile.class,
            parentColumn = "OWNER_ID",
            entityColumn = "PID")
    private Profile owner;

//    @Relation(
//            entity = Post.class,
//            parentColumn = "POST_ID",
//            entityColumn = "PID")
//    private Post post;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public Profile getOwner() {
        return owner;
    }

    public void setOwner(Profile owner) {
        this.owner = owner;
    }

//    public Post getPost() {
//        return post;
//    }
//
//    public void setPost(Post post) {
//        this.post = post;
//    }

    @Override
    public String toString() {
        return "CommentOwnerPost{" +
                "comment=" + comment +
                ", owner=" + owner +
                '}';
    }
}
