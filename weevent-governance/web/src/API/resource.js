import BaseModel from './BaseModel'
import api from './api.json'
import weBaseAPI from './weBaseAPI'

class ResoruceService extends BaseModel {
  login (data) {
    return this.request(api.login, data)
  }
  loginOut (data) {
    return this.request(api.loginOut, data)
  }
  topicList (data) {
    return this.request(api.topicList, data)
  }
  openTopic (data) {
    return this.request(api.openTopic, data)
  }
  topicState (data) {
    return this.request(api.topicState, data)
  }
  subscription (data) {
    return this.request(api.subscription, data)
  }
  addServer (data) {
    return this.request(api.addServer, data)
  }
  updateServer (data) {
    return this.request(api.updateServer, data)
  }
  getServer (data) {
    return this.request(api.getServer, data)
  }
  deleteServer (data) {
    return this.request(api.deleteServer, data)
  }
  getAll (data) {
    return this.request(weBaseAPI.getAll, data)
  }
  nodeList (data) {
    return this.request(weBaseAPI.nodeList, data)
  }
  general (data) {
    return this.request(weBaseAPI.general, data)
  }
  transDaily (data) {
    return this.request(weBaseAPI.transDaily, data)
  }
  transList (data) {
    return this.request(weBaseAPI.transList, data)
  }
  blockList (data) {
    return this.request(weBaseAPI.blockList, data)
  }
  blockByNumber (data) {
    return this.request(weBaseAPI.blockByNumber, data)
  }
  getEvent (data) {
    return this.request(weBaseAPI.getEvent, data)
  }
  checkExsit (data) {
    return this.request(api.checkExsit, data)
  }
  register (data) {
    return this.request(api.register, data)
  }
  forget (data) {
    return this.request(api.forget, data)
  }
  update (data) {
    return this.request(api.update, data)
  }
  reset (data) {
    return this.request(api.reset, data)
  }
}

export default new ResoruceService()
