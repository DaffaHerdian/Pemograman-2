package com.uas.hotel.controller;

import com.uas.hotel.model.Reservasi;
import com.uas.hotel.repository.ReservasiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/reservasi")
public class ReservasiController {

    @Autowired
    private ReservasiRepository reservasiRepository;

    // Menampilkan halaman form dan daftar reservasi
    @GetMapping
    public String index(Model model) {
        // Disamakan menggunakan nama "reservasi" sesuai file HTML Anda
        model.addAttribute("reservasi", new Reservasi());
        model.addAttribute("daftarReservasi", reservasiRepository.findAll());
        return "index";
    }

    // Menyimpan data pemesanan kamar ke database MySQL
    @PostMapping("/simpan")
    public String simpanReservasi(@ModelAttribute("reservasi") Reservasi reservasi, Model model) {
        try {
            // Validasi Logika Tanggal
            if (reservasi.getCheckOut().isBefore(reservasi.getCheckIn())) {
                throw new IllegalArgumentException("Tanggal Check-out tidak boleh sebelum tanggal Check-in!");
            }
            
            reservasiRepository.save(reservasi);
            return "redirect:/reservasi?sukses";
            
        } catch (IllegalArgumentException e) {
            model.addAttribute("error", e.getMessage());
            model.addAttribute("daftarReservasi", reservasiRepository.findAll());
            return "index";
        } catch (Exception e) {
            model.addAttribute("error", "Terjadi kesalahan database: " + e.getMessage());
            model.addAttribute("daftarReservasi", reservasiRepository.findAll());
            return "index";
        }
    }
}