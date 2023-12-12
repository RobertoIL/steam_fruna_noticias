<template>
    <div>
        <Navbar />
        <div class="container">
            
        </div>
    </div>
    
</template>

<script>
    import Navbar from '../components/Navbar.vue'
    import Noticia from '../components/Noticia.vue'

    export default {
        name: 'Noticias Populares',
        components: {
            Navbar,
            Noticia
        }
    }
    
</script>