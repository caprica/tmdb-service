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

package uk.co.caprica.tmdb.service;

import uk.co.caprica.tmdb.domain.Configuration;
import uk.co.caprica.tmdb.domain.Movie;
import uk.co.caprica.tmdb.domain.MovieSearchResults;

/**
 *
 */
public interface TmdbService {

    /**
     *
     *
     * @return
     */
    Configuration configuration();

    /**
     *
     *
     * @param query
     * @param year
     * @return
     */
    MovieSearchResults search(String query, Integer year);

    /**
     *
     *
     * @param id
     * @return
     */
    Movie movie(Integer id);
}
