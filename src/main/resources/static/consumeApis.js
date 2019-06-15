new Vue({
  el: '#app',
  data () {
    return {
      info: null
    }
  },
  mounted () {
    axios
      .get('/courses/index')
      .then(response => (this.info = response.data))
  }
})