<template class="el-footer">
  <div style="background-color: #2D5878; color: white; height: 325px; width: 84%; margin-left: 240px">
    <div style="margin-left: 5%; padding-top: 3%; height: 275px">
      <h2 style="font-size: 26px">Our Mission</h2>
    </div>
    <div class="container" style="height: 75px; background-color: #1E4460">
      <h2 style="text-align: left; margin-left: 10%; margin-top: 5%">2022 by Go Triton</h2>
      <div style="text-align: right; margin-top: 5%; margin-right: 15%">
        <h2>Contact Us</h2>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Footer"
}
</script>

<style scoped>
@font-face { font-family: work-sans;
  src: url('../assets/WorkSans/WorkSans-Bold.woff');
}

.container {
  display: grid;
  grid-template-columns: 1fr 1fr;
  text-align: right;
  padding-left: 0px;
}

h2{
  font-family: work-sans;
  font-style: normal;
  font-size: 16px;
  font-weight: 700;
}
</style>