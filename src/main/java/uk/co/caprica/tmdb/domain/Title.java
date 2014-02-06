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
public final class Title {

    @JsonProperty("iso_3166_1")
    private String country;

    private String title;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            country,
            title
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Title)) {
            return false;
        }
        Title other = (Title)obj;
        return
            Objects.equal(country, other.country) &&
            Objects.equal(title  , other.title  );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("country", country)
            .add("title"  , title  )
            .toString();
    }
}
