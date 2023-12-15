<template>
    <Navbar />
    <div class="container pt-3">
        <form class="d-flex" @submit.prevent="buscarNoticia">
            <input class="form-control me-2" type="text" placeholder="Buscar noticias" v-model="titulo">
            <button class="btn btn-dark" type="submit">
                <span class="material-symbols-outlined">
                search
                </span>
            </button>
      </form>
    </div>

    <Noticia v-for="noticia in noticias" :key="noticia.id" :noticia="noticia"/>

        
    
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
                titulo: '',
                noticias: []
            }
        },
        methods: {
            async buscarNoticia() {
                const titulo = this.titulo
                const url = `http://localhost:4000/noticias/buscar/titulo?titulo=${titulo}`;
                fetch(url)
                .then(res => res.json())
                .then(data => {
                    this.noticias = data
                    console.log(data)
                })
            }
        }
    }
</script>