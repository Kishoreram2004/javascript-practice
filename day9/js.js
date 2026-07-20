
const addExpense = (amount)=>{
    setExpense(amount);
}

const getExpense = ()=>{
    return parseInt(localStorage.getItem("expense"));
}

const setExpense = (amount) =>[
    localStorage.setItem("expense", JSON.stringify(getExpense()+amount))
]