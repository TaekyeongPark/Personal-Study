// 전역 필터 등록

// Intel.DateTimeFormat을 이용
const formatter = new Intl.DateTimeFormat('en-us',{
    year : 'numeric', month : 'long', week : 'long', day : 'numeric',
    hour : 'numeric', minute : 'numeric', second : 'numeric'
})
Vue.filter('datetime', function(value){
    if(!value) return ;
    return formatter.format(value)
})