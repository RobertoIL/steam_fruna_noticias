<template>
    <main>
        <div class="container my-5">
            <div class="row">
                <div class="col-4">
                </div>

                <div class="col-4">
                    <h2 class="text-center">Iniciar sesión</h2>
                    <form @submit.prevent="login">
                    <div class="mb-3 mt-3">
                        <label for="text" class="form-label">Nombre de usuario:</label>
                        <input type="username" class="form-control" id="username" placeholder="" name="email" v-model="username" required>
                    </div>
                    <div class="mb-3">
                        <label for="pwd" class="form-label">Contraseña:</label>
                        <input type="password" class="form-control" id="pwd" placeholder="" name="pswd" v-model="password">
                    </div>
                
                    <div class="row">
                        <button type="submit" class="btn btn-primary">Login</button>                    
                    </div>
                    <a href="/register">No tengo cuenta</a>
                    </form> 

                    <div v-if="error" class="alert alert-danger" role="alert">
                        {{ error }}
                    </div>
                </div>
                <div class="col-4">
                </div>
            </div>
    </div>
    </main>
</template>

<script>
    import axios from 'axios';

    export default {
        name: 'Login',

        data() {
            return {
                username: '',
                password: '',
                error: ''
            }
        },
        methods: {
            async login() {
                try {
                    const response = await axios.post('http://localhost:4000/api/login', {
                        username: this.username,
                        password: this.password
                    });
                
                if (response.status === 200){
                    console.log('Login exitoso')
                    sessionStorage.setItem('username', this.username)
                    this.$router.push('/noticias')
                }
                else if(response.status === 401) {
                    this.error = 'Credenciales incorrectas'
                }
                else { 
                    this.error = 'Error al iniciar sesión. Por favor, intenta de nuevo más tarde.'
                }
            } catch(error){
                this.error = 'Error al iniciar sesión. Por favor, intenta de nuevo más tarde.'
                console.error('Error al iniciar sesion:', error)
            }

            }
        }
    }
</script>