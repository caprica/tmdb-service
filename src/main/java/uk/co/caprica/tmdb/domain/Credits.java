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
public final class Credits {

    private List<Cast> cast;

    private List<Crew> crew;

    public List<Cast> getCast() {
        return cast;
    }

    public void setCast(List<Cast> cast) {
        this.cast = cast;
    }

    public List<Crew> getCrew() {
        return crew;
    }

    public void setCrew(List<Crew> crew) {
        this.crew = crew;
    }

    public Crew getCrew(String job) {
        for (Crew c : crew) {
            if (job.equals(c.getJob())) {
                return c;
            }
        }
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            cast,
            crew
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Credits)) {
            return false;
        }
        Credits other = (Credits)obj;
        return
            Objects.equal(cast, other.cast) &&
            Objects.equal(crew, other.crew);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("cast", cast)
            .add("crew", crew)
            .toString();
    }
}
