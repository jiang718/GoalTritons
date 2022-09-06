<template>
  <div style="height: 50px; line-height: 50px; border-bottom: 1px solid #ccc; display: flex">
    <div style="flex: 2; padding-left: 20.8%; padding-top: 8px"><h1>Go Triton</h1></div>
    <div style="width: 450px">
      <el-autocomplete
          placeholder="Please input"
          style="margin-right: 15px; width: 260px"
      />
      <el-popover
          placement="bottom"
          trigger="click"
          width="415px"
      >
        <template #reference>
          <el-avatar :size="30" style="position: relative; top: 10px; background-color: transparent; margin-right: 40px" shape="square">
            <img src="../assets/calendar.svg" alt="calendar"/>
          </el-avatar>
        </template>
        <template #default>
          <Calendar />
        </template>
      </el-popover>

<!--      <el-button text @click="showDialogForm(true)" style="background-color: #F4CE71; font-family: work-sans; font-size: 14px">Subscribe</el-button>-->

<!--      <el-dialog v-model="dialogFormVisible" title="Subscription" @closed="showDialogForm(false)">-->
<!--        <div>Get notifications right after each update</div>-->
<!--        <el-form ref="form" :model="form" size="normal" >-->
<!--          <el-form-item prop="username">-->
<!--            <p>Username</p>-->
<!--            <el-input prefix-icon="el-icon-user-solid" v-model="form.username"></el-input>-->
<!--          </el-form-item>-->
<!--          <el-form-item prop="email">-->
<!--            <p>Email</p>-->
<!--            <el-input prefix-icon="el-icon-user-solid" v-model="form.email"></el-input>-->
<!--          </el-form-item>-->
<!--        </el-form>-->
<!--        <template #footer>-->
<!--          <span class="dialog-footer">-->
<!--            <el-button @click="showDialogForm(false)" style="font-size: 15px; font-weight: 600">Cancel</el-button>-->
<!--            <el-button type="primary" @click="subscribe" style="font-size: 15px; font-weight: 600">Subscribe</el-button>-->
<!--          </span>-->
<!--        </template>-->
<!--      </el-dialog>-->
<!--      <el-dropdown>-->
<!--        <span class="el-dropdown-link">-->
<!--          <el-avatar :size="30" style="position: relative; top: 10px">-->
<!--            <img src="../assets/avatar.png" alt="err" />-->
<!--          </el-avatar>-->
<!--           {{ user.username }}-->
<!--          <i class="el-icon-arrow-down el-icon&#45;&#45;right"></i>-->
<!--        </span>-->
<!--        <template #dropdown>-->
<!--          <el-dropdown-menu>-->
<!--            <el-dropdown-item>Your Profile</el-dropdown-item>-->
<!--            <el-dropdown-item>Change Password</el-dropdown-item>-->
<!--            <el-dropdown-item @click="$router.push('/login')"> {{ getStatus(user.username) }} </el-dropdown-item>-->
<!--          </el-dropdown-menu>-->
<!--        </template>-->
<!--      </el-dropdown>-->
    </div>
  </div>
</template>

<script lang="ts">
import Calendar from "../views/Calendar.vue";
import request from "../utils/request";


export default {
  name: "Header",
  components: {
    Calendar
  },
  props: ['user'],
  data() {
    return {
      // user: {},
      // dialogFormVisible: false,
      // form: {}
    }
  }
  // created() {
  //   let str = sessionStorage.getItem("user") || "{}"
  //   this.user = JSON.parse(str)
  // }

}
</script>

<style>
@font-face { font-family: work-sans;
  src: url('../assets/WorkSans/WorkSans-Bold.woff');
}
h1{
  color: #F4CE71;
  font-weight: 700;
  font-size: 26px;
  font-family: work-sans;
  line-height: 32px;
}
.el-input--small {
  height: 30px;
  font-size: 5px;
}
</style>