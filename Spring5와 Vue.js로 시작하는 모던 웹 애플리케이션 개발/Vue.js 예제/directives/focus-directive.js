// 전역 사용자 디렉티브 등록

Vue.directive('focus',{
    inserted : function(el){
        el.focus()
    }
})