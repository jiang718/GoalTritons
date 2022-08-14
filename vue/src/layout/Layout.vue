<template>
  <div>
      <!--    头部-->
      <Header :user="user"/>

      <!--    主体-->
      <div style="display: flex">
        <!--      侧边栏-->
        <Aside style="width: 200px; margin-left: 5px; margin-right: 20px"/>
        <!--      内容区域-->
        <router-view style="flex: 1"/>
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