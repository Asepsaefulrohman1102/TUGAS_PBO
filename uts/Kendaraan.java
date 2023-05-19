class Kendaraan {
        private String nama;
        private int tahunProduksi;

        public Kendaraan() {
        }

        public Kendaraan(String nama, int tahunProduksi) {
            this.nama = nama;
            this.tahunProduksi = tahunProduksi;
        }

        public String getNama() {
            return this.nama;
        }

        public void setNama(String nama) {
            this.nama = nama;
        }

        public int getTahunProduksi() {
            return this.tahunProduksi;
        }

        public void setTahunProduksi(int tahunProduksi) {
            this.tahunProduksi = tahunProduksi;
        }

        public void cetak() {
            System.out.println("Kendaraan " + this.nama + " diproduksi tahun " + this.tahunProduksi);
        }
    }

