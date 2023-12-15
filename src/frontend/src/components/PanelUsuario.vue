<template>
    <div class="d-flex flex-row-reverse border">
        <div class="p-2">
            <a href="/" @click="reset()" class="text-white">
                <span class="material-symbols-outlined">
                    logout
                    </span>
            </a>
        </div>
        <div class="p-2">
            <code class="text-white">{{ username }}</code>
        </div>
        <div class="p-2 text-white">
            <span class="material-symbols-outlined">
                person
            </span>
        </div>
    </div>

</template>

<script>
    export default {
        data() {
            return {
                username: sessionStorage.getItem('username')
            }
            
        },
        methods: {
            reset() {
                sessionStorage.setItem('username', '')
            }
        }
    }
</script>