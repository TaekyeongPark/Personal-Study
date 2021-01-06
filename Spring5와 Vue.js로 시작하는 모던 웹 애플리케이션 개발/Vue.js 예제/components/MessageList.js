// 컴포넌트 모듈
export default{
    name : 'MessageList',
    template :  
    `<ul>
        <li v-for = "item in items">
            {{ item.text }} - {{ item.createdAt }}
            <button @click = "deleteMessage(item)">X</button>
        </li>
    </ul>`,
    props : {
        // props는 배열과 객체를 통해 선언하며
        // 객체로 선언할 경우 타입을 지정해 에러 검출 가능
        // required는 초기값이 지정되있어야만 하는 경우 true로 지정
        items : {
            type : Array,
            required : true
        }
    },
    methods : {
        /*
        외부 사용자 메소드 연결
        $on(evnetName) 혹은 @eventName으로 이벤트를 감지하고
        $emit(eventName, args)로 이벤트를 트리거
        */
        deleteMessage(message){
            // emit을 통해 외부에 있는 delete 이벤트를 수행
            // 외부에서 delete 이벤트는 deleteMessage와 연결되어있음
            this.$emit('delete', message)
        }
    }
}