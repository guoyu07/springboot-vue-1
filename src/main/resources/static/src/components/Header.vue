<template>
  <div class="container">
    <el-menu class="el-menu" :defaultActive="active" mode="horizontal" :router="true">
      <el-menu-item index="/">
        <i class="fa fa-home" aria-hidden="true"></i>&nbsp; Home
      </el-menu-item>
      <el-menu-item index="/createArticle">
        <i class="fa fa-book" aria-hidden="true"></i>&nbsp; CreateArticle
      </el-menu-item>
      <el-menu-item index="/signup" class="pull-right">
        <i class="fa fa-user" aria-hidden="true"></i>&nbsp; Signup
      </el-menu-item>
      <el-menu-item index="/login" class="pull-right">
        <i class="fa  fa-key" aria-hidden="true"></i>&nbsp; Login
      </el-menu-item>
    </el-menu>
  </div>
</template>

<script>
  export default {
    name: 'Header',
    data() {
      return {
        active: '/'
      }
    }
  }
</script>

<style scoped>
  .container {
    padding: 0 5%;
    background-color: #eef1f6;
  }

  .pull-right {
    float: right;
  }
</style>
