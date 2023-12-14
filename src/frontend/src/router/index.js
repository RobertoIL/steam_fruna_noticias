import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/noticias',
      name: 'home',
      component: Home
    },
    {
      path: '/mis-noticias',
      name: 'Mis Noticias',
      component: () => import('../views/MisNoticias.vue')
    },
    
    {
      path: '/buscador',
      name: 'Buscar Noticias',
      component: () => import('../views/Buscador.vue')
    },
    {
      path: '/crear-noticia',
      name: 'Crear Noticia',
      component: () => import('../views/CrearNoticia.vue')
    },
    {
      //provisorio
      path: '/',
      name: 'Login',
      component: () => import('../views/Login.vue')
    }
  ]
})

export default router
