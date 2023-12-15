<template>
    <div>
        <Navbar />
        <div class="container pt-5">
            <Noticia v-for="noticia in noticias" :key="noticia.id" :noticia="noticia" />
            
            
        </div>
    </div>
   
</template>

<script>
    import Navbar from '../components/Navbar.vue'
    import Noticia from '../components/Noticia.vue'

    export default {
        name: 'Home',
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
            this.getNoticias()
        },
        methods: {
            getNoticias() {
                fetch('http://localhost:4000/noticias/')
                .then(res => res.json())
                .then(data => {
                    this.noticias = data
                    console.log(data)
                })
            }
            
            }
        }
    
</script>
    
<style>

</style>