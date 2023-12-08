package com.modulo.steam_fruna_noticias.model;

public enum Reacciones {
    LIKE {
        @Override
        public String toString() {
            return "LIKE";
        }
    },DISLIKE {
        @Override
        public String toString() {
            return "DISLIKE";
        }
    }
}
