create tablespace pembayaranspp90492
datafile 'E:\Dokumen\Kuliah\Semester 4\Basis Data\Praktikum\Save sql\pembayaranspp90492.dbf'
size 30m;

create user mohrifqi_90492
identified by mohamad
default tablespace pembayaranspp90492
quota 30m on pembayaranspp90492;

grant all privileges to mohrifqi_90492;

conn mohrifqi_90492/mohamad

Create table Pembayaran_spp_90492
(
Id_spp number(16) not null,
Npm_mahasiswa number(15),
Id_bank integer,
Tanggal_spp date,
Bulan_spp number(2),
Nominal_spp integer,
Denda_spp integer,
Konfirmasi_pembayaran_spp char(5),
Constraint PK_pembayaran_spp primary key (Id_spp),
Constraint FK_npm_mahasiswa foreign key (Npm_mahasiswa)
References Mahasiswa_90492(Npm_mahasiswa),
Constraint FK_id_bank foreign key (Id_bank)
References Bank_90492(Id_bank)
);

Create table Bank_90492
(
Id_bank integer not null,
Nama_bank varchar(15),
Constraint PK_bank primary key(Id_bank)
);

Create table Mahasiswa_90492
(
Npm_mahasiswa number(15) not null,
Nama_mahasiswa varchar2(20),
Jenis_kelamin_mahasiswa char(2),
Alamat_mahasiswa Varchar2(100),
Constraint PK_mahasiswa primary key (Npm_mahasiswa)
);

select a.npm_mahasiswa, a.nama_mahasiswa, a.jenis_kelamin_mahasiswa, a.alamat_mahasiswa, b.id_spp, b.tanggal_spp, b.bulan_spp, b.npm90492_nominal_spp, b.denda_spp, b.konfirmasi_pembayaran_spp, c.id_bank, c.nama_bank
from mahasiswa_90492 a join pembayaran_spp_90492 b on
a.npm_mahasiswa = b.npm_mahasiswa
join bank_90492 c
on b.id_bank = c.id_bank
where b.NPM_Mahasiswa=1;

create view daftar_status as 
select a.nama_mahasiswa, b.tanggal_spp, b.konfirmasi_pembayaran_spp, c.nama_bank
from mahasiswa_90492 a join pembayaran_spp_90492 b
on a.npm_mahasiswa = b.npm_mahasiswa
join bank_90492 c
on b.id_bank = c.id_bank;