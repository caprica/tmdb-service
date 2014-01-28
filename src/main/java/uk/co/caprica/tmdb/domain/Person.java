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

import javax.xml.bind.annotation.XmlAttribute;

import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;

/**
 *
 */
public abstract class Person implements Comparable<Person> {

    private Integer id;

    private String name;

    private Integer order;

    @XmlAttribute(name="profile_path")
    private String profilePath;

    public final Integer getId() {
        return id;
    }

    public final void setId(Integer id) {
        this.id = id;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final Integer getOrder() {
        return order;
    }

    public final void setOrder(Integer order) {
        this.order = order;
    }

    public final String getProfilePath() {
        return profilePath;
    }

    public final void setProfilePath(String profilePath) {
        this.profilePath = profilePath;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(
            id,
            name,
            order,
            profilePath
        );
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person)obj;
        return
            Objects.equal(id         , other.id         ) &&
            Objects.equal(name       , other.name       ) &&
            Objects.equal(order      , other.order      ) &&
            Objects.equal(profilePath, other.profilePath);
    }

    protected ToStringHelper toStringHelper() {
        return Objects.toStringHelper(this)
            .add("id"         , id         )
            .add("name"       , name       )
            .add("order"      , order      )
            .add("profilePath", profilePath);
    }

    @Override
    public final int compareTo(Person o) {
        return order.compareTo(o.order);
    }
}
