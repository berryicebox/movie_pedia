package com.pedia.movie.user.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

//CREATE TABLE users
//(
//  id INT AUTO_INCREMENT PRIMARY KEY,
//    name VARCHAR(50) NOT NULL,
//    email VARCHAR(100) NOT NULL UNIQUE,
//    password VARCHAR(100) NOT NULL,
//    followers INT DEFAULT 0,
//    following INT DEFAULT 0,
//    ratings_count INT DEFAULT 0,
//    comments_count INT DEFAULT 0,
//    wish_count INT DEFAULT 0,
//    watching_count INT DEFAULT 0,
//    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
//);
@Entity
@Data
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;

    // 초기값 0
    @Column(columnDefinition = "int default 0")
    private Integer followers = 0;
    @Column(columnDefinition = "int default 0")
    private Integer followings = 0;
    @Column(columnDefinition = "int default 0")
    private Integer ratingsCount = 0;
    @Column(columnDefinition = "int default 0")
    private Integer commentsCount = 0;
    @Column(columnDefinition = "int default 0")
    private Integer wishCount = 0;
    @Column(columnDefinition = "int default 0")
    private Integer watchingCount = 0;
    // 현재 시간
    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "follower")
    private List<Follow> followingUsers;

    @OneToMany(mappedBy = "following")
    private List<Follow> followerUsers;

    // 생성 시간 자동 저장
    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDateTime.now();
    }

    void changeName(String name) {
        this.name = name;
    }

    void changePassword(String password) {
        this.password = password;
    }

    void incrementFollowers() {
        this.followers++;
    }

    void decrementFollowers() {
        this.followers--;
    }

    void incrementFollowing() {
        this.followings++;
    }

    void decrementFollowings() {
        this.followings--;
    }

    void incrementRatingsCount() {
        this.ratingsCount++;
    }

    void decrementRatingsCount() {
        this.ratingsCount--;
    }

    void incrementCommentsCount() {
        this.commentsCount++;
    }

    void decrementCommentsCount() {
        this.commentsCount--;
    }

    void incrementWishCount() {
        this.wishCount++;
    }

    void decrementWishCount() {
        this.wishCount--;
    }

    void incrementWatchingCount() {
        this.watchingCount++;
    }

    void decrementWatchingCount() {
        this.watchingCount--;
    }

}
