<template>
    <div class="card">
        <div class="card-body">
            <div class="row">
                <div class="col-11">
                    <h4 class="card-tittle">{{ noticia.titulo }}</h4>
                    <p class="card-text">{{ noticia.descripcion }}</p>
                    <p class="card-text blockquote-footer">{{noticia.autor}}</p>
                    <kbd class="card-text">{{noticia.categoria}}</kbd>
                </div>
                <div class="col-1">
                    <button class="btn">
                        <span class="material-symbols-outlined">
                            thumb_up
                        </span>
                        <pre>{{ noticia.cantLikes }}</pre>
                    </button>
                    <button class="btn">
                        <span class="material-symbols-outlined">
                        thumb_down
                        </span>
                        <pre>{{ noticia.cantDislikes }}</pre>
                    </button>
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