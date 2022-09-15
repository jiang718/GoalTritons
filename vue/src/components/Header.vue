<template>
  <div style="height: 60px; line-height: 70px; border-bottom: 1px solid #ccc; display: flex">
    <div style="flex: 2; padding-left: 11%; display: flex; flex-direction: row">
      <img src="../../public/logo.svg" alt="logo" style="width: 40px; margin-top: -4px" @click="$router.push('/')"/>
      <h1 style="margin-left: 15px; align-self: center;" @click="$router.push('/')"> Go<span style="opacity: 50%">al</span> Tritons</h1><br>
    </div>
    <div style="width: 500px; display: flex; flex-direction: row; align-items: center;">
      <el-autocomplete
          placeholder=""
          style="margin-top: -5px; margin-right: 15px; width: 260px"
      />
      <el-popover
          placement="bottom"
          trigger="hover"
          width="415px"
      >
        <template #reference>
          <div style="position: relative; display: inline-block">
            <p style="font-size: 16px; font-weight: 600; color: black; z-index: 2; position: relative; margin-left: 7px; padding-top: 5px">
              {{ getDate() }}
            </p>
<!--            <el-avatar :size="30" style="position: absolute; top: 10px; left: 10px; z-index: 1; display: inline;-->
<!--              background-color: transparent; margin-right: 17px" shape="square">-->
            <img src="/calendar.svg" alt="calendar" style="position: absolute; top: 21px; left: 0px; z-index: 1; width: 32px; display: inline;">
<!--            </el-avatar>-->
          </div>
        </template>
        <template #default>
          <span style="font-weight: 600; color: #1e4460">UCSD Career and Networking Fairs</span>
          <Calendar />
        </template>
      </el-popover>

      <h2 style="margin-left: 45px">About Us</h2>

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

<script>
import Calendar from "../views/Calendar.vue";
import request from "../utils/request";


export default {
  name: "Header",
  components: {
    Calendar
  },
  methods: {
    getDate() {
      const today = new Date();
      return String(today.getDate()).padStart(2, '0');
    }
  },
  // props: ['user'],
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
  src: url('../../public/WorkSans/WorkSans-Bold.woff');
}
@font-face { font-family: work-sans-semi;
  src: url('../../public/WorkSans/WorkSans-Semibold.woff');
}
h1{
  color: white;
  font-weight: 700;
  font-size: 26px;
  font-family: work-sans;
  line-height: 141%;
}
h2{
  color: white;
  font-weight: 600;
  font-size: 20px;
  font-family: work-sans-semi;
  line-height: 141%;
}
.day {
  position: absolute;
}
.el-input--small {
  height: 30px;
  font-size: 5px;
}
</style>