/*
 * This file is part of tmdb-service.
 *
 * media-scanner is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * tmdb-service is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with tmdb-service.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Copyright 2014 Caprica Software Limited.
 */

package uk.co.caprica.tmdb.domain;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import uk.co.caprica.tmdb.domain.adapter.DateAdapter;

import com.google.common.base.Objects;

/**
 *
 */
public final class MovieSearchResult {

    private boolean adult;

    @XmlAttribute(name="backdrop_path")
    private String backdropPath;

    private Integer id;

    @XmlAttribute(name="original_title")
    private String originalTitle;

    private Double popularity;

    @XmlAttribute(name="poster_path")
    private String posterPath;

    @XmlAttribute(name="release_date")
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date releaseDate;

    private String title;

    @XmlAttribute(name="vote_average")
    private Double voteAverage;

    @XmlAttribute(name="vote_count")
    private Integer voteCount;

    public boolean isAdult() {
        return adult;
    }

    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public String getBackdropPath() {
        return backdropPath;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdropPath = backdropPath;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public Double getPopularity() {
        return popularity;
    }

    public void setPopularity(Double popularity) {
        this.popularity = popularity;
    }

    public String getPosterPath() {
        return posterPath;
    }

    public void setPosterPath(String posterPath) {
        this.posterPath = posterPath;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(Double voteAverage) {
        this.voteAverage = voteAverage;
    }

    public Integer getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(Integer voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            adult,
            backdropPath,
            id,
            originalTitle,
            popularity,
            posterPath,
            releaseDate,
            title,
            voteAverage,
            voteCount
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Configuration)) {
            return false;
        }
        MovieSearchResult other = (MovieSearchResult)obj;
        return
            Objects.equal(adult        , other.adult        ) &&
            Objects.equal(backdropPath , other.backdropPath ) &&
            Objects.equal(id           , other.id           ) &&
            Objects.equal(originalTitle, other.originalTitle) &&
            Objects.equal(popularity   , other.popularity   ) &&
            Objects.equal(posterPath   , other.posterPath   ) &&
            Objects.equal(releaseDate  , other.releaseDate  ) &&
            Objects.equal(title        , other.title        ) &&
            Objects.equal(voteAverage  , other.voteAverage  ) &&
            Objects.equal(voteCount    , other.voteCount    );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("adult"        , adult        )
            .add("backdropPath" , backdropPath )
            .add("id"           , id           )
            .add("originalTitle", originalTitle)
            .add("popularity"   , popularity   )
            .add("posterPath"   , posterPath   )
            .add("releaseDate"  , releaseDate  )
            .add("title"        , title        )
            .add("voteAverage"  , voteAverage  )
            .add("voteCount"    , voteCount    )
            .toString();
    }
}
