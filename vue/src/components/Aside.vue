<template>
  <el-row class="tac">
    <el-col :span="12">
      <b class="mb-2" style="font-size: 20px; margin-left: 3px">Career Path</b>
      <el-menu
          style="width: 210px; min-height: calc(100vh - 50px)"
          active-text-color="#ffd04b"
          background-color="#545c64"
          class="el-menu-vertical-demo"
          default-active="1"
          text-color="#fff"
          @open="handleOpen"
          @close="handleClose"
      >
        <el-menu-item index="1">
<!--          <el-icon><icon-menu /></el-icon>-->
          <span>Being F-1 Student</span>
        </el-menu-item>
        <el-menu-item index="2">
<!--          <el-icon><icon-menu /></el-icon>-->
          <span>Learn about Career</span>
        </el-menu-item>
        <el-sub-menu index="3">
          <template #title>
<!--            <el-icon><location /></el-icon>-->
            <span>Networking</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="3-1" class="sub1">Why Networking</el-menu-item>
          </el-menu-item-group>
          <el-sub-menu index="3-2">
            <template #title>Networking Methods</template>
            <el-menu-item index="3-2-1" class="sub2">everyday routing</el-menu-item>
            <el-menu-item index="3-2-2" class="sub2">online platforms</el-menu-item>
            <el-menu-item index="3-2-3" class="sub2">on-campus orgs</el-menu-item>
          </el-sub-menu>
          <el-menu-item-group>
            <el-menu-item index="3-3" class="sub1">Maintain Networks</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>
        <el-menu-item index="4">
<!--          <el-icon><setting /></el-icon>-->
          <span>Internship & Jobs</span>
        </el-menu-item>
        <el-menu-item index="5">
<!--          <el-icon><setting /></el-icon>-->
          <span>Resume & Cover Letter</span>
        </el-menu-item>
        <el-menu-item index="6">
<!--          <el-icon><setting /></el-icon>-->
          <span>Internship Prep</span>
        </el-menu-item>
        <el-menu-item index="7">
<!--          <el-icon><setting /></el-icon>-->
          <span>Applying for CPT/OPT</span>
        </el-menu-item>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script lang="ts">

import {
  Document,
  Menu as IconMenu,
  Location,
  Setting,
} from '@element-plus/icons'

export default {
  name: "Aside",
  data() {
    return {
    }
  }
}
const handleOpen = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
const handleClose = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
</script>

<style scoped>
.sub1{
  font-size: 15px;
}
.sub2{
  font-size: 12px;
}
.el-menu-item{
  text-align: left;
}
.el-sub-menu__title{
  text-size: 12px;
}
.el-col-12 {
  max-width: 100%;
  flex: 0 0 50%;
}
</style>