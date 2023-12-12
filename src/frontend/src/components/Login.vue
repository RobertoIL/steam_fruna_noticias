<template>
    <main>
        <div class="alert alert-danger alert-dismissible">
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
            <strong>Avertencia!</strong> Primero debes identificarte como usuario
        </div>
        <div class="container">
            <form @submit.prevent="login">
                <div class="mb-3 mt-3">
                    <label for="text" class="form-label">Username:</label>
                    <input type="username" class="form-control" id="username" placeholder="Enter username" name="email" v-model="username">
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Password:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd" v-model="password">
                </div>
                
                <button type="submit" class="btn btn-primary">Login</button>
            </form>
            <div v-if="error" class="alert alert-danger" role="alert">
                {{ error }}
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
                loggedIn: false,
                error: ''
            }
        },
        methods: {
            async login() {
                try{
                    const response = await axios.post('http://localhost:4000/api/login', {
                        username: this.username,
                        password: this.password
                    })
                
                if (response.status === 200){
                    this.loggedIn = true;
                }
                else{
                    this.error = 'Credenciales incorrectas'
                }
            } catch(error){
                this.error = 'Error al iniciar sesion'
                console.error('Error al iniciar sesion:', error)
            }

            }
        }
    }
</script>