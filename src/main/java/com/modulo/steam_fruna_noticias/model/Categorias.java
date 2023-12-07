package com.modulo.steam_fruna_noticias.model;

public enum Categorias {
    OFERTAS {
        @Override
        public String toString() {
            return "ofertas";
        }
    },ACTUALIZACIONES {
        @Override
        public String toString() {
            return "actualizaciones";
        }
    },EVENTOS {
        @Override
        public String toString () {
            return "eventos";
        }
    },JUEGOS {
        @Override
        public String toString() {
            return "juegos";
        }
    }

}
