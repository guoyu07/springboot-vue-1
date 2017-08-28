<template>
  <div id="app">
    <vue-progress-bar></vue-progress-bar>

    <my-header></my-header>

    <router-view></router-view>

    <!--<my-footer></my-footer>-->
  </div>
</template>

<script>
  import MyHeader from '@/components/Header'
  import MyFooter from '@/components/Footer'

  export default {
    name: 'app',
    data() {
      return {}
    },
    components: {
      MyHeader,
      MyFooter
    },
    mounted() {
      this.$Progress.finish()
    },
    created() {
      this.$Progress.start();
      this.$router.beforeEach((to, from, next) => {
        if (to.meta.progress !== undefined) {
          let meta = to.meta.progress;
          this.$Progress.parseMeta(meta)
        }
        this.$Progress.start();
        next()
      });
      this.$router.afterEach((to, from) => {
        this.$Progress.finish()
      })
    }
  }
</script>

<style>
  body {
    margin: 0;
    padding: 0;
  }
</style>
