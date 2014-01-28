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
public final class Images {

    private Integer id;

    private List<Image> backdrops;

    private List<Image> posters;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Image> getBackdrops() {
        return backdrops;
    }

    public void setBackdrops(List<Image> backdrops) {
        this.backdrops = backdrops;
    }

    public List<Image> getPosters() {
        return posters;
    }

    public void setPosters(List<Image> posters) {
        this.posters = posters;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            id,
            backdrops,
            posters
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Images)) {
            return false;
        }
        Images other = (Images)obj;
        return
            Objects.equal(id       , other.id       ) &&
            Objects.equal(backdrops, other.backdrops) &&
            Objects.equal(posters  , other.posters  );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("id"       , id       )
            .add("backdrops", backdrops)
            .add("posters"  , posters  )
            .toString();
    }
}
