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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Objects;

/**
 *
 */
public final class ImageConfiguration {

    @JsonProperty("base_url")
    private String baseUrl;

    @JsonProperty("secure_base_url")
    private String secureBaseUrl;

    @JsonProperty("logo_sizes")
    private List<String> logoSizes;

    @JsonProperty("poster_sizes")
    private List<String> posterSizes;

    @JsonProperty("backdrop_sizes")
    private List<String> backdropSizes;

    @JsonProperty("profile_sizes")
    private List<String> profileSizes;

    @JsonProperty("still_sizes")
    private List<String> stillSizes;

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getSecureBaseUrl() {
        return secureBaseUrl;
    }

    public void setSecureBaseUrl(String secureBaseUrl) {
        this.secureBaseUrl = secureBaseUrl;
    }

    public List<String> getPosterSizes() {
        return posterSizes;
    }

    public void setPosterSizes(List<String> posterSizes) {
        this.posterSizes = posterSizes;
    }

    public List<String> getBackdropSizes() {
        return backdropSizes;
    }

    public void setBackdropSizes(List<String> backdropSizes) {
        this.backdropSizes = backdropSizes;
    }

    public List<String> getProfileSizes() {
        return profileSizes;
    }

    public void setProfileSizes(List<String> profileSizes) {
        this.profileSizes = profileSizes;
    }

    public List<String> getLogoSizes() {
        return logoSizes;
    }

    public void setLogoSizes(List<String> logoSizes) {
        this.logoSizes = logoSizes;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            baseUrl,
            secureBaseUrl,
            logoSizes,
            posterSizes,
            backdropSizes,
            profileSizes,
            stillSizes
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImageConfiguration)) {
            return false;
        }
        ImageConfiguration other = (ImageConfiguration) obj;
        return
            Objects.equal(logoSizes    , other.logoSizes    ) &&
            Objects.equal(baseUrl      , other.baseUrl      ) &&
            Objects.equal(secureBaseUrl, other.secureBaseUrl) &&
            Objects.equal(posterSizes  , other.posterSizes  ) &&
            Objects.equal(backdropSizes, other.backdropSizes) &&
            Objects.equal(profileSizes , other.profileSizes ) &&
            Objects.equal(stillSizes   , other.stillSizes   );
    }

    @Override
    public String toString() {
        return Objects.toStringHelper(this)
            .add("baseUrl"      , baseUrl      )
            .add("secureBaseUrl", secureBaseUrl)
            .add("logoSizes"    , logoSizes    )
            .add("posterSizes"  , posterSizes  )
            .add("backdropSizes", backdropSizes)
            .add("profileSizes" , profileSizes )
            .add("stillSizes"   , stillSizes   )
            .toString();
    }
}
