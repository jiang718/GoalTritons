<template>
  <div style="height: 60px; line-height: 70px; border-bottom: 1px solid #ccc; display: flex">
    <div style="flex: 2; padding-left: 11%; display: flex; flex-direction: row">
      <img src="../../public/logo.svg" alt="logo" style="width: 40px; margin-top: -4px" @click="$router.push('/')"/>
      <h1 style="margin-left: 15px; align-self: center;" @click="$router.push('/')"> Go<span style="opacity: 50%">al</span> Tritons</h1><br>
    </div>
    <div style="width: 500px; display: flex; flex-direction: row; align-items: center;">
      <el-autocomplete placeholder="" style="margin-top: -5px; margin-right: 15px; width: 260px" v-model="state1"
        :fetch-suggestions="querySearch" :trigger-on-focus="false" clearable class="inline-input w-50"
        @select="handleSelect" />
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

<script lang="ts">
import Calendar from "../views/Calendar.vue";
import request from "../utils/request";
import routePathes from "./routePathes/routePathes.json";
import { onMounted, ref } from 'vue';

interface InsiteRoute {
  value: string
  link: string
  prompt: string
}

const state1 = ref('')

let siteRoutes = ref<InsiteRoute[]>([])



export default {
  name: "Header",
  components: {
    Calendar
  },
  // props: ['user'],
  data() {
    return {
      // user: {},
      // dialogFormVisible: false,
      // form: {}
      state1: '',
      siteRoutes: [] as InsiteRoute[],
      jsonData: routePathes,

    }
  },
  methods: {
    getDate() {
      const today = new Date();
      return today.getDate().toString();
    },
    loadAll() {
      console.log("loading");
      return this.jsonData.pathes;
    },
    querySearch(queryString: string, cb: any) {
      const noResultPrompt = `No results for \" ${queryString} \": Search from all UCSD sites`;
      const googleSearchPrompt = `Search ${queryString} from all UCSD sites`;

      const filter_results = this.siteRoutes.value.filter(this.createFilter(queryString));
      filter_results.push({ value: googleSearchPrompt, link: '', prompt: queryString });
      const results = filter_results.length !== 0 ? filter_results : [{ value: noResultPrompt, link: '', prompt: queryString }];

      // call callback function to return suggestions
      console.log("results: ", results);
      cb(results)
    },
    createFilter(queryString: string) {
      console.log("here: ", queryString);
      return (route: InsiteRoute) => {
        return (
          route.value.toLowerCase().indexOf(queryString.toLowerCase()) !== -1
        )
      }
    },
    handleSelect(item: InsiteRoute) {
      if (item.link === '') {
        window.open(`https://www.google.com/search?q=site%3Aucsd.edu+${item.prompt}`);
      } else {
        this.$router.push(item.link);
        console.log(item);
      }

    }

  },
  mounted() {
    this.siteRoutes.value = this.loadAll();
    console.log("routes: ", this.siteRoutes.value);
    console.log(this.jsonData.pathes[0]);
  }
  // created() {
  //   let str = sessionStorage.getItem("user") || "{}"
  //   this.user = JSON.parse(str)
  // }


}
</script>

<style>
@font-face {
  font-family: work-sans;
  src: url('/WorkSans/WorkSans-Bold.woff');
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

h2 {
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