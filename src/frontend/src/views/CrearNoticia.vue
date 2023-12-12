<template>
    <Navbar />
    <div class="container">
        <form @submit.prevent="addNoticia">
            <div class="input-group mt-3 mb-3">
            <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                {{ categoriaSelect }}
            </button>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" @click="seleccionarCategoria('Ofertas')">Ofertas</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('Actualizaciones')">Actualizaciones</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('Eventos')">Eventos</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('Juegos')">Juegos</a></li>
            </ul>
            <input type="text" class="form-control" placeholder="Titulo" v-model="noticia.titulo">
        </div>
        <label for="comment">Descripción</label>
        <textarea class="form-control" rows="5" id="comment" name="text" v-model="noticia.descripcion"></textarea>
        <div class="d-flex justify-content-end"><input class="btn btn-success" type="submit" value="Guardar"></div>
        </form>
    </div>
</template>

<script>
    import Navbar from '../components/Navbar.vue'
    import Login from '../components/Login.vue'
    export default {
        name: 'CrearNoticia',
        components: {
            Navbar,
            Login
        },
        data() {
            return {
                categoriaSelect: 'Categoría',
                noticia: {
                    titulo: '',
                    descripcion: '',
                    categoria: this.categoriaSelect,
                    autor: ''
                }
            }                
        },
        methods: {
            seleccionarCategoria(categoriaSeleccionada) {
                this.categoriaSelect = categoriaSeleccionada
            },
            addNoticia() {
                fetch('http://localhost:4000/noticias/add',{
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(this.noticia)
                })
                .then(data => {
                    console.log(data)
                    this.$router.push("/")
                })
            }
        },

    }

</script>