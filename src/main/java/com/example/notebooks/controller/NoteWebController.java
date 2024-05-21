package com.example.notebooks.controller;

import com.example.notebooks.model.Note;
import com.example.notebooks.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/notes")
public class NoteWebController {
    @Autowired
    private NoteService noteService;

    @GetMapping
    public String getAllNotes(Model model) {
        List<Note> notes = noteService.getAllNotes();
        model.addAttribute("notes", notes);
        return "notes";
    }
}
