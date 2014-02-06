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
public final class Language {

    @JsonProperty("iso_639_1")
    private String languageCode;

    private String name;

    public String getLanguageCode() {
        return languageCode;
    }

    public void setLanguageCode(String languageCode) {
        this.languageCode = languageCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            languageCode,
            name
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Language)) {
            return false;
        }
        Language other = (Language)obj;
        return
            Objects.equal(languageCode, other.languageCode) &&
            Objects.equal(name        , other.name        );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("languageCode", languageCode)
            .add("name"        , name        )
            .toString();
    }
}
