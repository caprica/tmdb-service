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
public final class Cast extends Person {

    @JsonProperty("cast_id")
    private Integer castId;

    private String character;

    public Integer getCastId() {
        return castId;
    }

    public void setCastId(Integer castId) {
        this.castId = castId;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            super.hashCode(),
            castId,
            character
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Cast)) {
            return false;
        }
        Cast other = (Cast)obj;
        return
            Objects.equal(castId   , other.castId   ) &&
            Objects.equal(character, other.character);
    }

    @Override
    public String toString() {
        return super.toStringHelper()
            .add("castId"   , castId   )
            .add("character", character)
            .toString();
    }
}
