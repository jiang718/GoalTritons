<template>
  <div style="width: 100%; height: 100vh; overflow: hidden">
    <div style="width: 400px; margin: 100px auto">
      <div style="font-size: 30px; text-align: center; padding: 30px 0">Sign Up for Career Resource</div>
      <el-form ref="form" :model="form" size="normal" :rules="rules">
        <el-form-item prop="username">
          <p>Username</p>
          <el-input prefix-icon="el-icon-user-solid" v-model="form.username"></el-input>
        </el-form-item>
        <el-form-item prop="email">
          <p>email</p>
          <el-input prefix-icon="el-icon-user-solid" v-model="form.email"></el-input>
        </el-form-item>
        <el-form-item prop="password">
          <p>Password</p>
          <el-input prefix-icon="el-icon-lock" v-model="form.password" show-password>Password</el-input>
        </el-form-item>
        <el-form-item prop="confirm">
          <p>Enter Password Again</p>
          <el-input prefix-icon="el-icon-lock" v-model="form.confirm" show-password>Password</el-input>
        </el-form-item>
        <el-form-item>
          <el-button style="width: 100%" type="primary" @click="register">Register</el-button>
        </el-form-item>
        <el-form-item><el-button type="text" @click="$router.push('/login')">Back to Login</el-button></el-form-item>
      </el-form>
    </div>
  </div>
</template>


<script>

import request from "../utils/request";
export default {
  name: "Register",
  data() {
    return {
      form: {},
      rules: {
        username: [
          {required: true, message: 'Username', trigger: 'blur'},
        ],
        email: [
          {required: true, message: 'Email', trigger: 'blur'},
        ],
        password: [
          {required: true, message: 'Password', trigger: 'blur'},
        ],
        confirm: [
          {required: true, message: 'Please confirm your password', trigger: 'blur'},
        ],
      }
    }
  },
  methods: {
    register() {
      if (this.form.password !== this.form.confirm) {
        this.$message({
          type: "error",
          message: 'Password does not match!'
        })
        return
      }
      if (this.form.password.length < 8) {
        this.$message({
          type: "error",
          message: "Password must contain at least 8 characters!"
        })
        return
      }

      this.$refs['form'].validate((valid) => {
        if (valid) {
          request.post("/user/register", this.form).then(res => {
            if (res.code === '0') {
              this.$message({
                type: "success",
                message: "success"
              })
              this.$router.push('/login')  //登录成功之后进行页面的跳转，跳转到主页
            } else {
              this.$message({
                type: "error",
                message: res.msg
              })
            }
          })
        }
      })
    }
  }
}
</script>

<style scoped>

</style>