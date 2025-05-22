# NIMChecker - Validasi NIM Mahasiswa (Angkatan 2024) dengan Exception Handling

Program ini ditulis dalam bahasa **Java** dan bertujuan untuk memvalidasi **NIM (Nomor Induk Mahasiswa)** angkatan 2024 untuk login di web ospek kampus sebagai mahasiswa baru. Program juga mendemonstrasikan penggunaan **Exception Handling**, termasuk `try-catch-finally`, `throw`, dan `throws`.

---

## Tujuan Program

1. Memastikan NIM yang dimasukkan terdiri dari **15 digit**.
2. Dua digit pertama dari NIM harus **"24"** (misalnya tahun angkatan 2024).
3. Jika ada kesalahan, program akan memberikan **pesan error** yang sesuai.

---

## Fitur dan Komponen

- **Custom Exception**: `InvalidNIMException`
  - Dibuat khusus untuk menangani kasus NIM tidak sesuai format.
  
- **Metode Validasi**:
  - `validateNIM(String nim)`:
    - Mengecek panjang string harus 15.
    - Mengecek dua digit awal menggunakan `.startsWith("24")`.

- **Penggunaan Try-Catch**:
  - Menangani kesalahan input dan memberikan pesan kesalahan yang jelas.

---
