<template>
    <div class="container pt-3">
        <div class="card">
            <div class="card-body">
                <div class="row">
                    <div class="col-12">
                        <h4 class="card-tittle">{{ noticia.titulo }}</h4>
                        <p class="card-text">{{ noticia.descripcion }}</p>
                        <p class="card-text blockquote-footer">{{noticia.autor.nombre}}</p>
                        <kbd class="card-text">{{noticia.categoria}}</kbd>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    export default {
        props: {
            noticia: {
                type: Object,
                required: true
            }
        }
    }

</script>

<style> 
    

</style>