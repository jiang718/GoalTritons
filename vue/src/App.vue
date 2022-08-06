<template>
<!--    <img alt="Vue logo" class="logo" src="@/assets/logo.svg" width="125" height="125" />-->
  <el-config-provider>
    <router-view />
  </el-config-provider>
</template>


<script>
import { ElConfigProvider } from 'element-plus'

export default {
  name: "App",
  components: {
    [ElConfigProvider.name]: ElConfigProvider,
  },
  data() {
    return {}
  }
}
</script>

