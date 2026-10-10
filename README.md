# PBO-BANK-ACCOUNT# PBO-BANK-ACCOUNT 🏦
# Aplikasi Manajemen Bank Sederhana

Program ini merupakan aplikasi sederhana berbasis Java yang
mensimulasikan pengelolaan nasabah dan rekening bank. Program
menggunakan empat class, yaitu `Account`, `Customer`, `Bank`, dan
`Main`.

## Fitur

-   Menyimpan data nama depan dan nama belakang nasabah.
-   Menambahkan nasabah ke dalam bank.
-   Menyimpan beberapa rekening untuk setiap nasabah.
-   Melihat saldo rekening.
-   Melakukan deposit atau penyetoran saldo.
-   Melakukan penarikan saldo dengan validasi jumlah penarikan.

## Struktur File

``` text
.
├── Account.java
├── Bank.java
├── Customer.java
└── Main.java
```

### `Account.java`

Mengelola saldo rekening bank.

Method utama: - `Account(double balance)`: membuat rekening dengan saldo
awal. - `getBalance()`: mengambil saldo saat ini. -
`deposit(double amount)`: menambahkan saldo jika jumlahnya lebih dari
nol. - `withdraw(double amount)`: mengurangi saldo jika jumlahnya lebih
dari nol dan tidak melebihi saldo yang tersedia.

### `Customer.java`

Menyimpan informasi nasabah dan daftar rekeningnya.

Method utama: - `Customer(String firstName, String lastName)`: membuat
nasabah. - `getFirstName()`: mengambil nama depan. - `getLastName()`:
mengambil nama belakang. - `setAccount(Account account)`: menambahkan
rekening ke nasabah. - `getAccount(int index)`: mengambil rekening
berdasarkan indeks. - `getNumOfAccounts()`: mengambil jumlah rekening
nasabah.

Setiap objek `Customer` dapat menyimpan maksimal **5 rekening**.

### `Bank.java`

Mengelola daftar nasabah bank.

Method utama: - `addCustomer(String firstName, String lastName)`:
menambahkan nasabah. - `getNumOfCustomers()`: mengambil jumlah
nasabah. - `getCustomer(int index)`: mengambil nasabah berdasarkan
indeks.

Objek `Bank` dapat menyimpan maksimal **10 nasabah**.

### `Main.java`

Merupakan titik awal program (`main`). Contoh penggunaan di dalamnya: 1.
Membuat objek bank. 2. Menambahkan seorang nasabah. 3. Membuat dua
rekening dengan saldo awal Rp5.000.000 dan Rp2.000.000. 4. Menambahkan
kedua rekening ke nasabah. 5. Menampilkan nama nasabah dan jumlah
rekening. 6. Melakukan deposit Rp2.000.000 ke rekening pertama. 7.
Melakukan penarikan Rp150.000 dari rekening pertama. 8. Menampilkan
saldo setelah transaksi.

## Persyaratan

-   Java Development Kit (JDK) terpasang.
-   Keempat file `.java` berada di direktori yang sama.

## Cara Menjalankan

Buka terminal atau command prompt di direktori yang berisi file Java,
lalu kompilasi:

``` bash
javac Account.java Customer.java Bank.java Main.java
```

Jalankan program:

``` bash
java Main
```

## Gambaran Hasil

Berdasarkan nilai yang digunakan di `Main.java`, hasil utamanya akan
menunjukkan:

-   Nasabah: Rasyad Al-Kautsar
-   Jumlah rekening: 2
-   Saldo awal rekening pertama: Rp5.000.000
-   Saldo setelah deposit Rp2.000.000: Rp7.000.000
-   Saldo setelah penarikan Rp150.000: Rp6.850.000

Angka saldo ditampilkan menggunakan `double` secara langsung, sehingga
format angka di terminal dapat menyertakan `.0`.
