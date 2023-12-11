<template>
    <Navbar />
    <div class="login">
        <Login />
    </div>
    
</template>

<script>
    import Navbar from '../components/Navbar.vue'
    import Noticia from '../components/Noticia.vue'
    import Login from '../components/Login.vue'

    export default {
        name: 'Mis Noticias',
        components: {
            Navbar,
            Noticia,
            Login
        },
        data() {

        },
        
        methods: {
            
        }
    }
</script>