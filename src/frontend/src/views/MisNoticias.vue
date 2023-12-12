<template>
    <Navbar />
    <Login />
    
    
</template>

<script>
    import Navbar from '../components/Navbar.vue'
    import Noticia from '../components/Noticia.vue'
    import Login from '../components/Login.vue'
    import CrearNoticia from '../components/CrearNoticia.vue'

    export default {
        name: 'Mis Noticias',
        components: {
            Navbar,
            Noticia,
            Login,
            CrearNoticia
        },
        data() {

        },
        
        methods: {
            
        }
    }
</script>