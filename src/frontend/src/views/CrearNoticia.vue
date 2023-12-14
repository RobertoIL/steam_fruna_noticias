<template>
    <Navbar />
    <div class="container">
        <form @submit.prevent="addNoticia">
            <div class="input-group mt-3 mb-3">
            <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                {{ categoriaSelect }}
            </button>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" @click="seleccionarCategoria('OFERTAS')">Ofertas</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('ACTUALIZACIONES')">Actualizaciones</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('EVENTOS')">Eventos</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('JUEGOS')">Juegos</a></li>
            </ul>
            <input type="text" class="form-control" placeholder="Titulo" v-model="noticia.titulo">
        </div>
        <label for="comment">Descripción</label>
        <textarea class="form-control" rows="5" id="comment" name="text" v-model="noticia.descripcion"></textarea>
        <div class="d-flex justify-content-end">
            <button type="submit" class="btn btn-success">Guardar</button>
        </div>
        </form>
    </div>
</template>

<script>
    import axios from 'axios'
    import Navbar from '../components/Navbar.vue'
    export default {
        name: 'CrearNoticia',
        components: {
            Navbar
        },
        data() {
            return {
                categoriaSelect: 'Categoría',
                noticia: {
                    titulo: '',
                    descripcion: '',
                    categoria: this.categoriaSelect,
                    autor: sessionStorage.getItem('username')
                }
            }                
        },
        methods: {
            seleccionarCategoria(categoriaSeleccionada) {
                this.categoriaSelect = categoriaSeleccionada
            },
            async addNoticia() {
                try {
                    const response = await axios.post('http://localhost:4000/noticias/add', {
                        titulo: this.noticia.titulo,
                        descripcion: this.noticia.descripcion,
                        categoria: this.noticia.categoria,
                        autor: this.noticia.autor
                    })

                    if(response.status === 200) {
                        console.log('noticia creada con exito')
                        this.$router.push('/noticias')
                    }
                }
                catch(error) {
                    this.error = 'Error al crear noticia'
                    console.error('Error al crear noticia:', error)
                }
            }
        },

    }

</script>