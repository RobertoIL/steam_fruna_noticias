<template>
    <Navbar />
 
    <MiNoticia v-for="noticia in noticias" :key="noticia.id" :noticia="noticia" @eliminarNoticia="deleteNoticia($event)" />
    
    
</template>

<script>
    import Navbar from '../components/Navbar.vue'
    import MiNoticia from '../components/MiNoticia.vue'

    export default {
        name: 'Mis Noticias',
        components: {
        Navbar,
        MiNoticia
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
            },
            deleteNoticia(id){
                const url = `http://localhost:4000/noticias/delete/${id}`
                fetch(url, {
                    method: 'DELETE'
                })
                .then(res => {
                    if (res.ok) {
                        this.getMyNoticias()
                        window.location.reload()
                    }
                    else {
                        console.error("Error al eliminar la noticia")
                    }
                })
                .catch(error => {
                    console.error('Error al procesar la solicitud:', error)
                })
            }
        }
    }
</script>