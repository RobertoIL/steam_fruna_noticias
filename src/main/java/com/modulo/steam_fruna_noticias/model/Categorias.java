package com.modulo.steam_fruna_noticias.model;

public enum Categorias {
    JUEGOS {
        @Override
        public String toString() {
            return "Juegos";
        }
    },
    HARDWARE {
        @Override
        public String toString() {
            return "Hardware";
        }
    },
    SOFTWARE {
        @Override
        public String toString() {
            return "Software";
        }
    },
    EVENTOS {
        @Override
        public String toString() {
            return "Eventos";
        }
    }
}

