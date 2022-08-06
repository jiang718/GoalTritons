<template>
  <div class="homepage-hero-module">
    <div :style="fixStyle" class="filter">
      <div style="width: 400px; margin: 100px auto">
        <div style="font-size: 30px; text-align: center; padding: 30px 0; color: #333">Welcome!</div>
        <el-form ref="form" :model="form" size="normal" :rules="rules">
          <el-form-item prop="username">
            <el-input prefix-icon="el-icon-user-solid" v-model="form.email" placeholder="Enter email"></el-input>
          </el-form-item>
          <el-form-item prop="password">
            <el-input prefix-icon="el-icon-lock" v-model="form.password" show-password placeholder="Enter password"></el-input>
          </el-form-item>
          <!--        <el-form-item>-->
          <!--          <div style="display: flex">-->
          <!--            <el-input prefix-icon="el-icon-key" v-model="form.validCode" style="width: 50%;" placeholder="请输入验证码"></el-input>-->
          <!--            <ValidCode @input="createValidCode" />-->
          <!--          </div>-->
          <!--        </el-form-item>-->
          <el-form-item>
            <el-button style="width: 100%" type="primary" @click="login">Login</el-button>
          </el-form-item>
          <el-form-item><el-button type="text" @click="$router.push('/register')">Register</el-button></el-form-item>
        </el-form>
      </div>
    </div>
  </div>
</template>

<script>
import request from "../utils/request";

export default {
  name: "Login",
  data() {
    return {
      form: {}
    }
  },
  methods: {
    login() {
      request.post("/user/login", this.form).then(res => {
        if (res.code === '0') {
          this.$message({
            type: "success",
            message: "Login succeeded"
          })
          sessionStorage.setItem("user", JSON.stringify(res.data))    // 缓存用户信息
          this.$router.push("/")
        } else {
          this.$message({
            type: "error",
          message: res.msg
          })
        }
      })
    }
  }
}
</script>

<style scoped>

</style>