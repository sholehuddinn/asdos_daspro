## Prameter JoptionPane

Selamat datang di repositori sholehuddinn.git. Kali ini kita belajar JOptionPane yang katanya agak susah ya... , jadi mari kita ulas di sini dengan asik dan menarik. 

>Jadi JOptionPane ini ada 4 tipe ya teman-teman. Tapi jangan lupa `import javax.swing.JOptionPane;`

## 1. showMessageDialog

`JOptionPane.showMessageDialog(Component parentComponent, Object message, String title, int messageType)`

- `parentComponent:` komponen induk dari dialog (biasanya di isi `null`)
- `message:` Pesan yang akan ditampilkan dalam dialog.
- `title:` judul dialog
- `messageType:` jenis Pesan 

> Untuk  `messageType` bisa dilihat di bawah

## 2. showConfirmDialog

`JOptionPane.showConfirmDialog(Component parentComponent, Object message, String title, int optionType, int messageType)`

- `parentComponent:` komponen induk dari dialog (biasanya di isi `null`)
- `message:` Pesan yang akan ditampilkan dalam dialog.
- `title:` judul dialog
- `optionType:` opsi yang ditampilkan dalam dialog
- `messageType:` jenis Pesan

>untuk `optionType` bisa dilihat di bawah

## 3. showInputDialog
`showInputDialog(Component parentComponent, Object message, String title, int messageType)`

- `parentComponent:` komponen induk dari dialog (biasanya di isi `null`)
- `message:` Pesan yang akan ditampilkan dalam dialog.
- `title:` judul dialog
- `messageType:` jenis Pesan

> oh iya di JOptionPane jumlah parameternya berbeda-beda ya temen-temen ( 4/5/7 )

## 4. showOptionsDialog

`showOptionDialog(Component parentComponent, Object message, String title, int optionType, int messageType, Icon icon, Object[] options, Object initialValue)`

- `parentComponent:` komponen induk dari dialog (biasanya di isi `null`)
- `message:` Pesan yang akan ditampilkan dalam dialog.
- `title:` judul dialog
- `optionType:` opsi yang ditampilkan dalam dialog
- `messageType:` jenis Pesan
- `icon:` biasanya di isi `null`
- `option:` opsi tersedia (berupa array)
- `initialValue:` nilai awal yang di pilih

> jangan lupa mampir ke [github ku](https://github.com/sholehuddinn) untuk mendapatkan source code yang lain dari java dasar

***


## optionType

1. **`JOptionPane.YES_NO_OPTION`** 
2. **`JOptionPane.YES_NO_CANCEL_OPTION`** 
3. **`JOptionPane.OK_CANCEL_OPTION`** 
4. **`JOptionPane.DEFAULT_OPTION`** hanya menampilkan tombol `ok`

***

## messageType

## 1. JOptionPane.ERROR_MESSAGE

- Menampilkan dialog dengan ikon error (biasanya ikon tanda silang berwarna merah).
- Cocok untuk pesan kesalahan atau peringatan penting

```java
JOptionPane.showMessageDialog(null, "Terjadi kesalahan saat memproses data.", "Error", JOptionPane.ERROR_MESSAGE);
```

## 2. JOptionPane.INFORMATION_MESSAGE

- Menampilkan dialog dengan ikon informasi (biasanya ikon "i" atau bulat berwarna biru).
- Cocok untuk menampilkan informasi atau pemberitahuan penting

```java
JOptionPane.showMessageDialog(null, "Proses berhasil!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
```

## 3. JOptionPane.WARNING_MESSAGE

- Menampilkan dialog dengan ikon peringatan (biasanya ikon segitiga dengan tanda seru kuning).
- Cocok untuk memberikan peringatan kepada pengguna.

```java
JOptionPane.showMessageDialog(null, "Anda akan menghapus data, yakin?", "Peringatan", JOptionPane.WARNING_MESSAGE);
```

## 4. JOptionPane.QUESTION_MESSAGE

- Menampilkan dialog dengan ikon pertanyaan (biasanya tanda tanya dalam bulatan).
- Cocok untuk meminta konfirmasi atau menanyakan sesuatu

```java
JOptionPane.showMessageDialog(null, "Apakah Anda yakin ingin keluar?", "Pertanyaan", JOptionPane.QUESTION_MESSAGE);
```

## 5. JOptionPane.PLAIN_MESSAGE

- Menampilkan dialog tanpa ikon apa pun.
- Cocok untuk pesan sederhana yang tidak memerlukan ikon.

```java
JOptionPane.showMessageDialog(null, "Ini adalah pesan tanpa ikon.", "Pesan", JOptionPane.PLAIN_MESSAGE);
```

