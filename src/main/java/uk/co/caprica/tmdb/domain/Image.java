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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 *
 */
public final class Image {

    private String filePath;

    private Integer width;

    private Integer height;

    @JsonProperty("iso_639_1")
    private String languageCode;

    @JsonProperty("aspect_ratio")
    private Double aspectRatio;

    @JsonProperty("vote_average")
    private Double voteAverage;

    @JsonProperty("vote_count")
    private Integer voteCount;

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public Double getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(Double aspectRatio) {
        this.aspectRatio = aspectRatio;
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
            filePath,
            width,
            height,
            languageCode,
            aspectRatio,
            voteAverage,
            voteCount
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Image)) {
            return false;
        }
        Image other = (Image)obj;
        return
            Objects.equal(filePath    , other.filePath    ) &&
            Objects.equal(width       , other.width       ) &&
            Objects.equal(height      , other.height      ) &&
            Objects.equal(languageCode, other.languageCode) &&
            Objects.equal(aspectRatio , other.aspectRatio ) &&
            Objects.equal(voteAverage , other.voteAverage ) &&
            Objects.equal(voteCount   , other.voteCount   );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("filePath"    , filePath    )
            .add("width"       , width       )
            .add("height"      , height      )
            .add("languageCode", languageCode)
            .add("aspectRatio" , aspectRatio )
            .add("voteAverage" , voteAverage )
            .add("voteCount"   , voteCount   )
            .toString();
    }
}
