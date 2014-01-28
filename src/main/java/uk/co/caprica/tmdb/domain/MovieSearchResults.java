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

import java.util.Iterator;
import java.util.List;

import javax.xml.bind.annotation.XmlAttribute;

import com.google.common.base.Objects;

/**
 *
 */
public final class MovieSearchResults implements Iterable<MovieSearchResult> {

    private Integer page;

    private List<MovieSearchResult> results;

    @XmlAttribute(name="total_pages")
    private Integer totalPages;

    @XmlAttribute(name="total_results")
    private Integer totalResults;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public List<MovieSearchResult> getResults() {
        return results;
    }

    public void setResults(List<MovieSearchResult> results) {
        this.results = results;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(Integer totalResults) {
        this.totalResults = totalResults;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            page,
            results,
            totalPages,
            totalResults
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MovieSearchResults)) {
            return false;
        }
        MovieSearchResults other = (MovieSearchResults)obj;
        return
            Objects.equal(page        , other.page        ) &&
            Objects.equal(results     , other.results     ) &&
            Objects.equal(totalPages  , other.totalPages  ) &&
            Objects.equal(totalResults, other.totalResults);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("page"        , page        )
            .add("results"     , results     )
            .add("totalPages"  , totalPages  )
            .add("totalResults", totalResults)
            .toString();
    }

    @Override
    public Iterator<MovieSearchResult> iterator() {
        return results.iterator();
    }
}
