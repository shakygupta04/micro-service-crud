import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { User } from './user';
import { Observable } from 'rxjs';
 
@Injectable()
export class UserService {
 
  private usersUrl: string;
  private deleteurl: string;
  private updateurl:string;
 
  constructor(private http: HttpClient) {
    this.usersUrl = 'http://localhost:8080/users';
    this.deleteurl = 'http://localhost:8080/deleteuser';
    this.updateurl='http://localhost:8080/updateuser';
  }
 

  public findAll(): Observable<User[]> {
    return this.http.get<User[]>(this.usersUrl);
  }
 
  public save(user: User) {
    return this.http.post<User>(this.usersUrl, user);
  }
  
  public delete(accountno: User["accountno"] ) {
    return this.http.delete(`${this.deleteurl}/${accountno}`);
  }

  public update(accountno: User["accountno"],user) {
    return this.http.put(`${this.updateurl}/${accountno}`,user);
  }
}