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
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 *
 */
public final class Movie {

    private boolean adult;

    @JsonProperty("backdrop_path")
    private String backdropPath;

    @JsonProperty("belongs_to_collection")
    private Collection belongsToCollection;

    private Integer budget;

    private List<Name> genres;

    private String homepage;

    private Integer id;

    @JsonProperty("imdb_id")
    private String imdbId;

    @JsonProperty("original_title")
    private String originalTitle;

    private String overview;

    private Double popularity;

    @JsonProperty("poster_path")
    private String posterPath;

    @JsonProperty("production_companies")
    private List<Name> productionCompanies;

    @JsonProperty("production_countries")
    private List<Country> productionCountries;

    @JsonProperty("release_date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
    private Date releaseDate;

    private Integer revenue;

    private Integer runtime;

    @JsonProperty("spoken_languages")
    private List<Language> spokenLanguages;

    private String status;

    private String tagline;

    private String title;

    @JsonProperty("vote_average")
    private Double voteAverage;

    @JsonProperty("vote_count")
    private Integer voteCount;

    private Credits credits;

    @JsonProperty("alternative_titles")
    private AlternativeTitles alternativeTitles;

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

    public Collection getBelongsToCollection() {
        return belongsToCollection;
    }

    public void setBelongsToCollection(Collection belongsToCollection) {
        this.belongsToCollection = belongsToCollection;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    public List<Name> getGenres() {
        return genres;
    }

    public void setGenres(List<Name> genres) {
        this.genres = genres;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
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

    public List<Name> getProductionCompanies() {
        return productionCompanies;
    }

    public void setProductionCompanies(List<Name> productionCompanies) {
        this.productionCompanies = productionCompanies;
    }

    public List<Country> getProductionCountries() {
        return productionCountries;
    }

    public void setProductionCountries(List<Country> productionCountries) {
        this.productionCountries = productionCountries;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Integer getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public Integer getRuntime() {
        return runtime;
    }

    public void setRuntime(Integer runtime) {
        this.runtime = runtime;
    }

    public List<Language> getSpokenLanguages() {
        return spokenLanguages;
    }

    public void setSpokenLanguages(List<Language> spokenLanguages) {
        this.spokenLanguages = spokenLanguages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
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

    public Credits getCredits() {
        return credits;
    }

    public void setCredits(Credits credits) {
        this.credits = credits;
    }

    public AlternativeTitles getAlternativeTitles() {
        return alternativeTitles;
    }

    public void setAlternativeTitles(AlternativeTitles alternativeTitles) {
        this.alternativeTitles = alternativeTitles;
    }

    public String getPreferredTitle(String country) {
        String result = getAlternativeTitles().getTitle(country);
        if (result == null) {
            result = getTitle();
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            adult,
            backdropPath,
            belongsToCollection,
            budget,
            genres,
            homepage,
            id,
            imdbId,
            originalTitle,
            overview,
            popularity,
            posterPath,
            productionCompanies,
            productionCountries,
            releaseDate,
            revenue,
            runtime,
            spokenLanguages,
            status,
            tagline,
            title,
            voteAverage,
            voteCount,
            credits,
            alternativeTitles
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Movie)) {
            return false;
        }
        Movie other = (Movie)obj;
        return
            Objects.equal(adult              , other.adult              ) &&
            Objects.equal(backdropPath       , other.backdropPath       ) &&
            Objects.equal(belongsToCollection, other.belongsToCollection) &&
            Objects.equal(budget             , other.budget             ) &&
            Objects.equal(genres             , other.genres             ) &&
            Objects.equal(homepage           , other.homepage           ) &&
            Objects.equal(id                 , other.id                 ) &&
            Objects.equal(imdbId             , other.imdbId             ) &&
            Objects.equal(originalTitle      , other.originalTitle      ) &&
            Objects.equal(overview           , other.overview           ) &&
            Objects.equal(popularity         , other.popularity         ) &&
            Objects.equal(posterPath         , other.posterPath         ) &&
            Objects.equal(productionCompanies, other.productionCompanies) &&
            Objects.equal(productionCountries, other.productionCountries) &&
            Objects.equal(releaseDate        , other.releaseDate        ) &&
            Objects.equal(revenue            , other.revenue            ) &&
            Objects.equal(runtime            , other.runtime            ) &&
            Objects.equal(spokenLanguages    , other.spokenLanguages    ) &&
            Objects.equal(status             , other.status             ) &&
            Objects.equal(tagline            , other.tagline            ) &&
            Objects.equal(title              , other.title              ) &&
            Objects.equal(voteAverage        , other.voteAverage        ) &&
            Objects.equal(voteCount          , other.voteCount          ) &&
            Objects.equal(credits            , other.credits            ) &&
            Objects.equal(alternativeTitles  , other.alternativeTitles  );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("adult"              , adult              )
            .add("backdropPath"       , backdropPath       )
            .add("belongsToCollection", belongsToCollection)
            .add("budget"             , budget             )
            .add("genres"             , genres             )
            .add("homepage"           , homepage           )
            .add("id"                 , id                 )
            .add("imdbId"             , imdbId             )
            .add("originalTitle"      , originalTitle      )
            .add("overview"           , overview           )
            .add("popularity"         , popularity         )
            .add("posterPath"         , posterPath         )
            .add("productionCompanies", productionCompanies)
            .add("productionCountries", productionCountries)
            .add("releaseDate"        , releaseDate        )
            .add("revenue"            , revenue            )
            .add("runtime"            , runtime            )
            .add("spokenLanguages"    , spokenLanguages    )
            .add("status"             , status             )
            .add("tagline"            , tagline            )
            .add("title"              , title              )
            .add("voteAverage"        , voteAverage        )
            .add("voteCount"          , voteCount          )
            .add("credits"            , credits            )
            .add("alternativeTitles"  , alternativeTitles  )
            .toString();
    }
}
