# Sanger - Aplikasi Pemesanan Biji Kopi ☕

Aplikasi mobile untuk mempermudah proses pemesanan biji kopi berkualitas langsung dari petani dan pelaku usaha di Indonesia.

## 📜 Tentang Proyek

**Sanger** adalah sebuah aplikasi mobile berbasis Android yang dikembangkan sebagai solusi modern atas tantangan yang sering dihadapi oleh para pelaku usaha dan pecinta kopi, yaitu kesulitan untuk mendapatkan akses terhadap biji kopi berkualitas secara praktis dan efisien. Proses pencarian dan pembelian yang seringkali masih bersifat manual memakan banyak waktu dan tenaga.

Untuk mengatasi masalah tersebut, **Sanger** hadir sebagai sebuah platform modern yang dirancang untuk mempermudah proses pemesanan biji kopi secara online. Melalui aplikasi ini, pengguna dapat dengan mudah mencari, memilih, dan memesan beragam jenis biji kopi terbaik langsung dari genggaman mereka, untuk kemudian diantarkan langsung ke lokasi tujuan.

Proyek ini dikembangkan untuk memenuhi tugas akhir mata kuliah **Pemrograman Berbasis Mobile**.

## ✨ Fitur Utama

Aplikasi Sanger dilengkapi dengan berbagai fitur untuk memberikan pengalaman pengguna yang lengkap:

* **Splash Screen & Alur Onboarding:** Pengalaman pertama yang mulus bagi pengguna baru dengan alur perkenalan aplikasi yang informatif.
* **Autentikasi Pengguna:** Sistem registrasi dan login yang aman menggunakan Firebase Authentication.
* **Manajemen Profil:**
    * Melihat data profil personal.
    * Mengedit informasi profil (nama, email, biodata).
    * Mengganti foto profil dengan mengunggah gambar dari galeri perangkat.
* **Alur Pemesanan:**
    * Keranjang Belanja (`CartActivity`).
    * Pilihan Metode Pembayaran (`PaymentMethodActivity`).
    * Konfirmasi Keberhasilan Pembayaran (`PaymentSuccessActivity`).
* **Integrasi Peta (Direncanakan):** Meminta akses lokasi untuk fitur pengantaran.

---

## 📱 Appium Test Automation

Proyek ini menggunakan **Appium** untuk mengotomatisasi pengujian aplikasi mobile. Dirancang untuk menguji fitur-fitur utama dari aplikasi secara otomatis di perangkat Android/iOS.

---

### 📂 Informasi File APK

**app-debug.apk** adalah file aplikasi Sanger kami. Berikut adalah source code Mobile App dari Sanger: https://github.com/twosecondz/SANGER

---

### 🚀 Cara Menjalankan Test

#### 1. Persiapan

* Install Appium:

```bash
npm install -g appium@1.22.3
```

* Install Appium Doctor untuk cek dependensi:

```bash
npm install -g appium-doctor
appium-doctor
```

* Install dependencies project:

```bash
npm install
```

#### 2. Jalankan Appium Server

```bash
appium
```

#### 3. Jalankan Tes

Klik kanan pada code > Run As > Pilih jenis file (java)


---

### 🧪Teknologi yang Digunakan

* **Appium V.01** – Mobile test automation framework
* **WebDriver** – Untuk interaksi UI
* **Emulator** – Android
* **AndroidStudio** - Emulator

---

### ⚙️ Desired Capabilities

Contoh konfigurasi (JSON):

```json
{
  "platformName": "Android",
  "appium:appPackage": "com.example.sangerfinal",
  "appium:deviceName": "emulator-5554",
  "appium:automationName": "UiAutomator2",
  "appium:appActivity": "com.example.sangerfinal.SplashActivity",
  "appium:noReset": true
}
```

---

### 📸 Screenshot


## 👥 Tim Pengembang

Proyek ini dikerjakan oleh:

* **M. Ihsan Rizqullah Adfa** - `2208107010029`
* **M. Syahidal Akbar Zas** - `2208107010045`

---
