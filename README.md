tmdb-service
============

Simple service to access themoviedb.org public web services.

This service is used by applications that need to find the unique identifier
of a movie in themoviedb.org based on a title and optional year.

It is *not* a wrapper around the *full* API of the themoviedb.org web-services,
it exposes only those services useful for identifying movies.

Usage is trivial:
```
TmdbService movieService = new JaxrsTmdbService(apiKey, requestsPerSecondLimit);
MovieSearchResults searchResults = movieService.search("Total Recall", 1990);
Movie movie = movieService.movie(27205);
```

The service implements a simple request rate-limiting restriction. This is
specified by the `requestsPerSecondLimit` in the above code fragment.

The current limit enforced by themoviedb.org is 30 requests per ten seconds,
this service normalises that to three requests per second.

Access to themoviedb.org public web-services requires an application-specific
API key. To use this service in your own application you must register at
themoviedb.org web-site and request your own API key.
