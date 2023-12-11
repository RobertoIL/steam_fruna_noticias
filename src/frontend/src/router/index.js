import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/mis-noticias',
      name: 'Mis Noticias',
      component: () => import('../views/MisNoticias.vue')
    },
    {
      path: '/populares',
      name: 'Noticias populares',
      component: () => import('../views/NoticiasPopulares.vue')
    },
    {
      path: '/buscador',
      name: 'Buscar Noticias',
      component: () => import('../views/Buscador.vue')
    }
  ]
})

export default router
