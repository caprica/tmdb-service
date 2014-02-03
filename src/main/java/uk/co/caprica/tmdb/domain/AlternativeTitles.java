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

import java.util.List;

import com.google.common.base.Objects;

/**
 *
 */
public final class AlternativeTitles {

    private Integer id;

    private List<Title> titles;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Title> getTitles() {
        return titles;
    }

    public void setTitles(List<Title> titles) {
        this.titles = titles;
    }

    public String getTitle(String country) {
        for (Title title : titles) {
            if (country.equals(title.getCountry())) {
                return title.getTitle();
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            id,
            titles
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AlternativeTitles)) {
            return false;
        }
        AlternativeTitles other = (AlternativeTitles)obj;
        return
            Objects.equal(id    , other.id    ) &&
            Objects.equal(titles, other.titles);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("id"    , id    )
            .add("titles", titles)
            .toString();
    }
}
