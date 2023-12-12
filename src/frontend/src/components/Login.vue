<template>
    <main>
        <div class="alert alert-danger alert-dismissible">
            <button type="button" class="btn-close" data-bs-dismiss="alert"></button>
            <strong>Login!</strong> Para ver tus noticias primero debes iniciar sesión
        </div>
        <div class="container">
            <form action="">
                <div class="mb-3 mt-3">
                    <label for="email" class="form-label">Email:</label>
                    <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
                </div>
                <div class="mb-3">
                    <label for="pwd" class="form-label">Password:</label>
                    <input type="password" class="form-control" id="pwd" placeholder="Enter password" name="pswd">
                </div>
                
                <button type="submit" class="btn btn-primary">Login</button>
            </form>
    </div>
    </main>
</template>

<script>
    export default {
        name: 'Login',

        data() {
            return {
                username: '',
                password: '',
                loggedIn: false
            }
        },
        methods: {
            login() {
                if (this.validarCredenciales()) {
                    this.loggedIn = true
                }
                else {
                    
                }

            },
            validarCredenciales() {
                return this.username === 'username' && this.password === 'password';
            }
        }
    }
</script>