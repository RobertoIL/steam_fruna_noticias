<template>
    <div class="container pt-3">
        <div class="card">
            <div class="card-body">
                <div class="row">
                    <div class="col-11">
                        <h4 class="card-tittle">{{ noticia.titulo }}</h4>
                        <p class="card-text">{{ noticia.descripcion }}</p>
                        <p class="card-text blockquote-footer">{{noticia.autor.nombre}}</p>
                        <kbd class="card-text">{{noticia.categoria}}</kbd>
                    </div>
                    <div class="col-1">
                        <button class="btn" data-bs-toggle="modal" :data-bs-target="'#myModal' + noticia.id">
                            <span class="material-symbols-outlined">
                            delete
                            </span>
                        </button>
                        
                    </div>
                </div>
            </div>
        </div>
    </div>

        <!-- The Modal -->
        <div class="modal modal-sm fade" :id="'myModal'+ noticia.id">
        <div class="modal-dialog">
            <div class="modal-content">

            <!-- Modal Header -->
                <div class="modal-header">
                    <h4 class="modal-title">Eliminar noticia</h4>
                    <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
                </div>

                <!-- Modal body -->
                <div class="modal-body">
                    <p>¡Esta accion es irreversible!</p>
                </div>

                <!-- Modal footer -->
                <div class="modal-footer">
                    <button class="btn btn-danger" @click="eliminarNoticia(noticia.id)">Eliminar</button>
                    <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Regresar</button>
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
        },
        methods: {
            eliminarNoticia(id) {
                this.$emit('eliminarNoticia', id)    
            }
        }
    }

</script>
