<template>
    <main>
        <div class="container my-5">
            <div class="row">
                <div class="col-4">
                </div>

                <div class="col-4">
                    <h2 class="text-center">Crear cuenta</h2>
                    <form @submit.prevent="register">
                    <div class="mb-3 mt-3">
                        <label for="text" class="form-label">Nombre de usuario:</label>
                        <input type="username" class="form-control" id="username" placeholder="" name="email" v-model="username" required>
                    </div>
                    <div class="mb-3 mt-3">
                        <label for="text" class="form-label">Nombre:</label>
                        <input type="username" class="form-control" id="nombre" placeholder="" name="email" v-model="nombre" required>
                    </div>
                    <div class="mb-3 mt-3">
                        <label for="email" class="form-label">Email:</label>
                        <input type="username" class="form-control" id="email" placeholder="" name="email" v-model="email" required>
                    </div>
                    <div class="mb-3">
                        <label for="pwd" class="form-label">Contraseña:</label>
                        <input type="password" class="form-control" id="pwd" placeholder="" name="pswd" v-model="password">
                    </div>
                    <div class="mb-3">
                        <label for="pwd" class="form-label">Confirme contraseña:</label>
                        <input type="password" class="form-control" id="pwd" placeholder="" name="pswd" v-model="confirmPassword">
                    </div>
                
                    <div class="row">
                        <button type="submit" class="btn btn-primary">Register</button>                    
                    </div>
                    <a href="/">Ya tengo cuenta</a>
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
    import axios from 'axios'
    export default {
        name: 'Register',

        data() {
            return {
                username: '',
                nombre: '',
                email: '',
                password: '',
                confirmPassword: ''
            }
        },
        methods: {
            async register() {
                try {
                    const response = await axios.post('http://localhost:4000/api/register', {
                        username: this.username,
                        nombre: this.nombre,
                        email: this.email,
                        password: this.password,
                        'password-confirm': this.confirmPassword
                    });
                
                if (response.status === 200){
                    console.log('Registro exitoso')
                    sessionStorage.setItem('username', this.username)
                    this.$router.push('/noticias')
                }
                else if(response.status === 401) {
                    this.error = 'Credenciales incorrectas'
                }
                else { 
                    this.error = 'Error al registrar. Por favor, intenta de nuevo más tarde.'
                }
            } catch(error){
                this.error = 'Error al registrar. Por favor, intenta de nuevo más tarde.'
                console.error('Error al registrar:', error)
            }

            }
        }
    }

</script>