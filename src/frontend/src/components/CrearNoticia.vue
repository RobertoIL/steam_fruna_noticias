<template>
    <div class="container">
        <div class="input-group mt-3 mb-3">
            <button type="button" class="btn btn-primary dropdown-toggle" data-bs-toggle="dropdown">
                {{ categoria }}
            </button>
            <ul class="dropdown-menu">
                <li><a class="dropdown-item" @click="seleccionarCategoria('Ofertas')">Ofertas</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('Actualizaciones')">Actualizaciones</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('Eventos')">Eventos</a></li>
                <li><a class="dropdown-item" @click="seleccionarCategoria('Juegos')">Juegos</a></li>
            </ul>
            <input type="text" class="form-control" placeholder="Titulo">
        </div>
        <label for="comment">Descripción</label>
        <textarea class="form-control" rows="5" id="comment" name="text"></textarea>
        <div class="d-flex justify-content-end"><button class="btn btn-success">Guardar</button></div>
    </div>
</template>

<script>
    export default {
        name: 'CrearNoticia',
        data() {
            return {
                categoria: 'Categoría'
            }
            
            
        },
        methods: {
            seleccionarCategoria(categoriaSeleccionada) {
                this.categoria = categoriaSeleccionada
            }
        }

    }

</script>