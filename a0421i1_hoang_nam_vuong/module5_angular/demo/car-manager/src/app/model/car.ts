export class Car {
    id: number;
    name: string;
    type: string;
    start: string;
    end: string;
    phone: string;
    email: string;
    time: string;
    
    
    constructor(id: number, name: string,  type: string,  start: string, end: string, phone: string, email: string, time: string) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.start = start;
        this.end = end;
        this.phone = phone;
        this.email = email;
        this.time = time;
    }
    
    }