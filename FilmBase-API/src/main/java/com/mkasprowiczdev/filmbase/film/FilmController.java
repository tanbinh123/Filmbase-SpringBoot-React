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

    @GetMapping("/{id}")
    public Film getFilm(@PathVariable long Id) {
        return filmService.getFilm(Id);
    }

    @PostMapping("/add")
    public void addFilm(@RequestBody Film film) {
        filmService.addFilm(film);
    }

    // TODO: 15.11.2021 put and delete
}