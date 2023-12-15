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
            <button type="submit" class="btn btn-success" @click="seleccionarAutor">Guardar</button>
        </div>
        </form>
    </div>
</template>

<script>
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
                    autor: ''
                }
            }                
        },
        methods: {
            seleccionarCategoria(categoriaSeleccionada) {
                this.categoriaSelect = categoriaSeleccionada
                this.noticia.categoria = categoriaSeleccionada
                console.log(this.noticia.categoria)
            },
            addNoticia() {
                fetch('http://localhost:4000/noticias/add', {
                    method: 'POST',
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(this.noticia)
                })
                .then(response => {
                    if(response.ok) {
                        return response.json()
                    } else {
                        throw new Error('Error en la solicitud')
                    }
                })
                .then(data => {
                    console.log('Datos recibidos: ', data)
                    this.$router.push('/noticias')
                })
                .catch(error => {
                    console.error('Error en la solicitud:', error)
                })
                

            },
            seleccionarAutor() {
                this.noticia.autor = sessionStorage.getItem('username')
            }
            
        },

    }

</script>