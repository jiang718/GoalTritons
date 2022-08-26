<template>
  <el-row class="tac">
    <el-col :span="12">
      <h5 class="menu">Path to Approach</h5>
      <h5 class="menu">Your Career</h5>
      <el-menu
          style="width: 240px; min-height: calc(100vh - 50px)"
          class="el-menu-vertical-demo"
          default-active="0"
          @open="handleOpen"
          @close="handleClose"
      >
        <el-sub-menu index="1">
          <template #title>
            <!--            <el-icon><location /></el-icon>-->
            <span class="mod">Being F-1 Student</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="1-1" class="sub1">F-1 Visa Limitation</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="1-2" class="sub1">After Graduation</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>
        <el-sub-menu index="2">
          <template #title>
            <!--            <el-icon><location /></el-icon>-->
            <span class="mod">Learn about Careers</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="2-1" class="sub1">New to Career Planning</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="2-2" class="sub1">Learn about Your Career</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>
        <el-sub-menu index="3">
          <template #title>
<!--            <el-icon><location /></el-icon>-->
            <span class="mod">Networking</span>
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
          <span class="mod">Internship & Jobs</span>
        </el-menu-item>
        <el-sub-menu index="5">
          <template #title>
            <!--            <el-icon><location /></el-icon>-->
            <span class="mod" @click="$router.push('/resume#resumeTop')">Resume/CV & Cover Letter</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="5-1" class="sub1" @click="$router.push('/resume#resume-vs-cv')">Resume vs. CV</el-menu-item>
          </el-menu-item-group>
          <el-sub-menu index="5-2">
            <template #title ><span class="sub1" @click="$router.push('/resume#resume-breakdown')">Resume Breakdown</span></template>
            <el-menu-item index="5-2-1" class="sub2" @click="$router.push('/resume#resume-components')">Resume Components</el-menu-item>
            <el-menu-item index="5-2-2" class="sub2" @click="$router.push('/resume#resume-essentials')">Resume Essentials</el-menu-item>
            <el-menu-item index="5-2-3" class="sub2" @click="$router.push('/resume#sample-resumes-anchor')">Sample Resumes</el-menu-item>
            <el-menu-item index="5-2-4" class="sub2" @click="$router.push('/resume#polish-resume')">Polish Your Resume</el-menu-item>
          </el-sub-menu>
          <el-menu-item-group>
            <el-menu-item index="5-3" class="sub1" @click="$router.push('/resume#cv-breakdown')">CV Breakdown</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="5-4" class="sub1" @click="$router.push('/resume#cover-letter')">Cover Letter</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
              <el-menu-item index="5-5" class="sub1" @click="$router.push('/resume#more-resources')">More Resources</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>
        <el-sub-menu index="6">
          <template #title>
            <!--            <el-icon><location /></el-icon>-->
            <span class="mod" @click="$router.push('/interview')">Interview Prep</span>
          </template>
          <el-menu-item-group>
            <el-menu-item index="6-1" class="sub1">Why Interview</el-menu-item>
          </el-menu-item-group>
          <el-sub-menu index="6-2">
            <template #title><span class="sub1">Interview Questions</span></template>
            <el-menu-item index="6-2-1" class="sub2">Define Yourself</el-menu-item>
            <el-menu-item index="6-2-2" class="sub2">Behavioral</el-menu-item>
            <el-menu-item index="6-2-3" class="sub2">Technical</el-menu-item>
          </el-sub-menu>
          <el-menu-item-group>
            <el-menu-item index="6-3" class="sub1">Interview Steps</el-menu-item>
          </el-menu-item-group>
          <el-menu-item-group>
            <el-menu-item index="6-4" class="sub1">How to Master</el-menu-item>
          </el-menu-item-group>
        </el-sub-menu>
        <el-menu-item index="7">
<!--          <el-icon><setting /></el-icon>-->
          <span class="mod">Applying for CPT/OPT</span>
        </el-menu-item>
      </el-menu>
    </el-col>
  </el-row>
</template>

<script lang="ts">

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
.mod {
  font-size: 15px;
  color: #1E4460;
}
.sub1{
  font-size: 13px;
  color: #1E4460;
}
.sub2{
  font-size: 12px;
  color: #1E4460;
}
.el-menu-item{
  text-align: left;
}
.el-sub-menu__title{
  text-size: 12px;
}
.el-col {
  max-width: 100%;
  flex: 0 0 50%;
}
.menu {
  font-size: 20px;
  margin-left: 3px;
  margin-bottom: 3px;
  text-align: center;
  color: #1E4460;
}
</style>