/***********************************************************************
 * Module:  客户.java
 * Author:  Administrator
 * Purpose: Defines the Class 客户
 ***********************************************************************/

import java.util.*;

/** @pdOid 4efb245c-6c51-4fc9-8c58-5ef6200e2dda */
public class 客户 {
   /** @pdOid 3da582c2-9db2-4709-977d-5c5adf797608 */
   public java.lang.String 客户编号;
   /** @pdOid bd425187-ccd4-4023-8804-109414387c48 */
   public java.lang.String 简称;
   /** @pdOid 4a253331-bd01-4dac-90f0-76b5e8218897 */
   public java.lang.String 名称;
   /** @pdOid 805a558a-8950-4c08-9ed7-63558c4a5e75 */
   public java.lang.String 联系人;
   /** @pdOid f6f5129a-905a-4e5d-8aad-b3d4e9c9e9ff */
   public java.lang.String 地址;
   /** @pdOid d47e3c1f-87ac-46e4-867f-9e1e1e6caf69 */
   public java.lang.String 邮编;
   /** @pdOid 57784da9-93ef-4bd9-b700-04a3392d8c1e */
   public java.lang.String 区号;
   /** @pdOid af994288-b1e8-4e8f-b0d4-85038aa3da3a */
   public java.lang.String 地区;
   /** @pdOid 45da97fd-e4f5-45ac-9f6b-571e79008469 */
   public java.lang.String 电话;
   /** @pdOid 214d7c30-73fb-4643-b9c9-57cb4e700e85 */
   public java.lang.String 传真;
   /** @pdOid 793e5692-9a45-4023-a5c7-45791b07ee09 */
   public java.lang.String 开户行;
   /** @pdOid 86aae0cf-37f1-4033-b1ac-7fff96a9457a */
   public java.lang.String 开户行邮编;
   /** @pdOid b42e9269-53d7-46ff-894d-d62aef0bf67f */
   public java.lang.String 银行账号;
   /** @pdOid de501784-462b-4e98-8060-1675a4cfb08a */
   public java.lang.String 税号;
   /** @pdOid 17b02152-b98d-41ad-88a4-5a43d8c33255 */
   public java.lang.String 性质;
   /** @pdOid 0be6b4ad-1807-46b8-88b4-7ee0776a1d64 */
   public java.lang.String 业务部门;
   /** @pdOid 84fbb173-6947-4106-824b-49c2bc51932c */
   public java.lang.String 信誉度;
   
   /** @pdRoleInfo migr=no name=收款单 assc=客户收款单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<收款单> 收款单;
   /** @pdRoleInfo migr=no name=销售单 assc=客户销售单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售单> 销售单;
   /** @pdRoleInfo migr=no name=销售订单 assc=客户销售订单 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<销售订单> 销售订单;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<收款单> get收款单() {
      if (收款单 == null)
         收款单 = new java.util.HashSet<收款单>();
      return 收款单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator收款单() {
      if (收款单 == null)
         收款单 = new java.util.HashSet<收款单>();
      return 收款单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new收款单 */
   public void set收款单(java.util.Collection<收款单> new收款单) {
      removeAll收款单();
      for (java.util.Iterator iter = new收款单.iterator(); iter.hasNext();)
         add收款单((收款单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new收款单 */
   public void add收款单(收款单 new收款单) {
      if (new收款单 == null)
         return;
      if (this.收款单 == null)
         this.收款单 = new java.util.HashSet<收款单>();
      if (!this.收款单.contains(new收款单))
      {
         this.收款单.add(new收款单);
         new收款单.set客户(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old收款单 */
   public void remove收款单(收款单 old收款单) {
      if (old收款单 == null)
         return;
      if (this.收款单 != null)
         if (this.收款单.contains(old收款单))
         {
            this.收款单.remove(old收款单);
            old收款单.set客户((客户)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll收款单() {
      if (收款单 != null)
      {
         收款单 old收款单;
         for (java.util.Iterator iter = getIterator收款单(); iter.hasNext();)
         {
            old收款单 = (收款单)iter.next();
            iter.remove();
            old收款单.set客户((客户)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<销售单> get销售单() {
      if (销售单 == null)
         销售单 = new java.util.HashSet<销售单>();
      return 销售单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售单() {
      if (销售单 == null)
         销售单 = new java.util.HashSet<销售单>();
      return 销售单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售单 */
   public void set销售单(java.util.Collection<销售单> new销售单) {
      removeAll销售单();
      for (java.util.Iterator iter = new销售单.iterator(); iter.hasNext();)
         add销售单((销售单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售单 */
   public void add销售单(销售单 new销售单) {
      if (new销售单 == null)
         return;
      if (this.销售单 == null)
         this.销售单 = new java.util.HashSet<销售单>();
      if (!this.销售单.contains(new销售单))
      {
         this.销售单.add(new销售单);
         new销售单.set客户(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售单 */
   public void remove销售单(销售单 old销售单) {
      if (old销售单 == null)
         return;
      if (this.销售单 != null)
         if (this.销售单.contains(old销售单))
         {
            this.销售单.remove(old销售单);
            old销售单.set客户((客户)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售单() {
      if (销售单 != null)
      {
         销售单 old销售单;
         for (java.util.Iterator iter = getIterator销售单(); iter.hasNext();)
         {
            old销售单 = (销售单)iter.next();
            iter.remove();
            old销售单.set客户((客户)null);
         }
      }
   }
   /** @pdGenerated default getter */
   public java.util.Collection<销售订单> get销售订单() {
      if (销售订单 == null)
         销售订单 = new java.util.HashSet<销售订单>();
      return 销售订单;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator销售订单() {
      if (销售订单 == null)
         销售订单 = new java.util.HashSet<销售订单>();
      return 销售订单.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new销售订单 */
   public void set销售订单(java.util.Collection<销售订单> new销售订单) {
      removeAll销售订单();
      for (java.util.Iterator iter = new销售订单.iterator(); iter.hasNext();)
         add销售订单((销售订单)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new销售订单 */
   public void add销售订单(销售订单 new销售订单) {
      if (new销售订单 == null)
         return;
      if (this.销售订单 == null)
         this.销售订单 = new java.util.HashSet<销售订单>();
      if (!this.销售订单.contains(new销售订单))
      {
         this.销售订单.add(new销售订单);
         new销售订单.set客户(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old销售订单 */
   public void remove销售订单(销售订单 old销售订单) {
      if (old销售订单 == null)
         return;
      if (this.销售订单 != null)
         if (this.销售订单.contains(old销售订单))
         {
            this.销售订单.remove(old销售订单);
            old销售订单.set客户((客户)null);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll销售订单() {
      if (销售订单 != null)
      {
         销售订单 old销售订单;
         for (java.util.Iterator iter = getIterator销售订单(); iter.hasNext();)
         {
            old销售订单 = (销售订单)iter.next();
            iter.remove();
            old销售订单.set客户((客户)null);
         }
      }
   }

}