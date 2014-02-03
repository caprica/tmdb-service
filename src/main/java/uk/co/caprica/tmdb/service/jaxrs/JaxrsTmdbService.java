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

package uk.co.caprica.tmdb.service.jaxrs;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import uk.co.caprica.tmdb.domain.Configuration;
import uk.co.caprica.tmdb.domain.Movie;
import uk.co.caprica.tmdb.domain.MovieSearchResults;
import uk.co.caprica.tmdb.service.TmdbService;

import com.google.common.util.concurrent.RateLimiter;

/**
 *
 */
public class JaxrsTmdbService implements TmdbService {

    /**
     *
     */
    private static final String CONFIGURATION_URL = "https://api.themoviedb.org/3/configuration";

    /**
     *
     */
    private static final String MOVIE_SEARCH_URL = "https://api.themoviedb.org/3/search/movie";

    /**
     *
     */
    private static final String MOVIE_URL = "https://api.themoviedb.org/3/movie";

    /**
     *
     */
    private final String apiKey;

    /**
     *
     */
    private final Client client;

    /**
     *
     */
    private final RateLimiter rateLimiter;

    /**
     *
     *
     * @param apiKey
     * @param requestsPerSecondLimit
     */
    public JaxrsTmdbService(String apiKey, int requestsPerSecondLimit) {
        this.apiKey = apiKey;
        client = ClientBuilder.newClient();
        rateLimiter = RateLimiter.create(requestsPerSecondLimit);
    }

    @Override
    public Configuration configuration() {
        rateLimiter.acquire();
        return client
            .target(CONFIGURATION_URL)
            .queryParam("api_key", apiKey)
            .request(MediaType.APPLICATION_JSON)
            .get(Configuration.class);
    }

    @Override
    public MovieSearchResults search(String query, Integer year) {
        rateLimiter.acquire();
        return client
            .target(MOVIE_SEARCH_URL)
            .queryParam("api_key", apiKey)
            .queryParam("query", query)
            .queryParam("year", year)
            .queryParam("include_adult", false)
            .request(MediaType.APPLICATION_JSON)
            .get(MovieSearchResults.class);
    }

    @Override
    public Movie movie(Integer id) {
        rateLimiter.acquire();
        return client
            .target(MOVIE_URL)
            .path(String.valueOf(id))
            .queryParam("api_key", apiKey)
            .queryParam("append_to_response", "credits,alternative_titles")
            .request(MediaType.APPLICATION_JSON)
            .get(Movie.class);
    }
}
