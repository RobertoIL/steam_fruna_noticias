<template>
    <Navbar />
    <div class="container">
        <Noticia v-for="noticia in noticias" :key="noticia.id" :noticia="noticia" />
    </div>
    
</template>

<script>
    import Navbar from '../components/Navbar.vue'
    import Noticia from '../components/Noticia.vue'

    export default {
        name: 'Mis Noticias',
        components: {
        Navbar,
        Noticia
    },
        data() {
            return {
                noticias: []
            }
        },
        beforeMount() {
            this.getMyNoticias()
        },
        
        methods: {
            getMyNoticias() {
                const username = sessionStorage.getItem('username')
                const url = `http://localhost:4000/noticias/autor?username=${username}`;
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