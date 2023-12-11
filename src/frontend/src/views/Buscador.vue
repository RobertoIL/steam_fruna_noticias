<template>
    <div>
        <Navbar />
        <div class="container">
            <div class="container">
                <div class="input-group mt-3 mb-3">
                    <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                    {{ categoria }}
                    </button>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" @click="seleccionarCategoria('Título')">Título</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('Autor')">Autor</a></li>
            </ul>
            <input type="text" class="form-control" :placeholder= "'Ingrese ' + categoria">
        </div>
    </div>
        </div>
    </div>
</template>

<script>
    import Navbar from '../components/Navbar.vue'
    import Noticia from '../components/Noticia.vue'

    export default {
        name: 'Buscar Noticias',
        components: {
            Navbar,
            Noticia
        },
        data() {
            return {
                categoria: 'Título'
            }
        },
        methods: {
            seleccionarCategoria(categoriaSeleccionada) {
                this.categoria = categoriaSeleccionada
            }
        }
    }
</script>