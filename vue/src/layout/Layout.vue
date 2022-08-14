<template>
  <div>
      <!--    头部-->
      <Header :user="user"/>

      <!--    主体-->
      <div style="display: flex">
        <!--      侧边栏-->
        <Aside style="width: 15%; margin-left: 0.5%; margin-right: 2%; margin-top: 2%"/>
        <!--      内容区域-->
        <router-view style="flex: 1; margin-left: 3%; max-width: 75%; margin-top: 2%"/>
      </div>
  </div>
</template>

<script>
import Header from "../components/Header.vue";
import request from "../utils/request";
import Aside from "../components/Aside.vue";

export default {
  name: "Layout",
  components: {
    Header,
    Aside
  },
  data() {
    return {
      user: {}
    }
  }
}
</script>

<style scoped>

</style>