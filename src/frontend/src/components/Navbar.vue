<template>
    <main>
        <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
            <div class="container-fluid">
                <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link active" href="/noticias">Noticias</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/buscador">Buscar Noticias</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/mis-noticias">Mis Noticias</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/crear-noticia">Crear Noticia</a>
                </li>
                </ul>
                <PanelUsuario />
            </div>
            </nav>
        </main>

</template>

<script>
    import PanelUsuario from './PanelUsuario.vue';
    export default {
        name: 'Navbar',
        components: {
            PanelUsuario
        }
    }
</script>

