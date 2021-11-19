package com.mkasprowiczdev.filmbase.film;

import com.mkasprowiczdev.filmbase.filmcast.FilmCastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;

@RestController
@RequestMapping("/api/film")
public class FilmController {

    @Autowired
    FilmService filmService;

    @Autowired
    FilmCastService filmCastService;

    @GetMapping("/all")
    public LinkedList<Film> getFilms() {
        return filmService.getFilms();
    }

    @GetMapping("/{Id}")
    public Film getFilm(@PathVariable long Id) {
        return filmService.getFilm(Id);
    }

    @GetMapping("/ranking/{page}")
    public LinkedList<Film> getRankingRange(@PathVariable int page) {
        return filmService.getFilmRanking(page);
    }

    @PostMapping("/add")
    public void addFilm(@RequestBody Film film) {
        filmService.addFilm(film);
    }

    // TODO: 15.11.2021 put and delete
}
