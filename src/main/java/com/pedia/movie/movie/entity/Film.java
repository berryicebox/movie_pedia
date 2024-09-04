package com.pedia.movie.movie.entity;

import com.pedia.movie.user.entity.Rating;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Data
@Table(name = "films")
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Long movieCd;

    @Column(unique = true, nullable = false)
    private Long movieId;

    @Column(nullable = false)
    private String title;

    private LocalDate releaseDate;

    private String originCountry;

    private String posterPath;

    private String originalTitle;

    @Column(columnDefinition = "TEXT")
    private String overview;

    private String backdropPath;

    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FilmImg> filmImgSet;

    @OneToMany(mappedBy = "film", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<FilmVideo> filmVideoSet;

    @OneToMany(mappedBy = "film", cascade= CascadeType.ALL, orphanRemoval = true)
    private List<Rating> ratings;

    // 평균 평점 계산 메서드
    public double getAverageRating() {
        if (ratings == null || ratings.isEmpty()) {
            return 0.0;
        }
        return ratings.stream()
                .mapToDouble(Rating::getScore)
                .average()
                .orElse(0.0);
    }

    // 평가 총 수 계산 메서드
    public int getRatingCount() {
        return ratings.size();
    }
}
