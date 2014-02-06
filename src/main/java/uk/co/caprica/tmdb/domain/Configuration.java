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

import javax.xml.bind.annotation.XmlElement;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 *
 */
public final class Configuration {

    @XmlElement(name="images")
    private ImageConfiguration imageConfiguration;

    @JsonProperty("change_keys")
    private List<String> changeKeys;

    public ImageConfiguration getImageConfiguration() {
        return imageConfiguration;
    }

    public void setImageConfiguration(ImageConfiguration imageConfiguration) {
        this.imageConfiguration = imageConfiguration;
    }

    public List<String> getChangeKeys() {
        return changeKeys;
    }

    public void setChangeKeys(List<String> changeKeys) {
        this.changeKeys = changeKeys;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            imageConfiguration,
            changeKeys
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
        Configuration other = (Configuration)obj;
        return
            Objects.equal(imageConfiguration, other.imageConfiguration) &&
            Objects.equal(changeKeys        , other.changeKeys);
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("images"    , imageConfiguration)
            .add("changeKeys", changeKeys        )
            .toString();
    }
}
