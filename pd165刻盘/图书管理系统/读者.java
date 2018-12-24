/***********************************************************************
 * Module:  读者.java
 * Author:  Administrator
 * Purpose: Defines the Class 读者
 ***********************************************************************/

import java.util.*;

/** @pdOid dbe468a5-f57c-4469-8407-8cb547fb35e1 */
public class 读者 {
   /** @pdOid 84afa445-0a39-4d16-a724-425962ee3190 */
   public java.lang.String 卡号;
   /** @pdOid 27355a91-844b-440b-9f5e-35349613a998 */
   public java.lang.String 读者姓名;
   /** @pdOid 9caf4aab-60f5-4393-84cf-2462aa67ee46 */
   public double 状态;
   
   /** @pdRoleInfo migr=no name=罚金标准 assc=读者罚金 coll=java.util.Collection impl=java.util.HashSet mult=0..* */
   public java.util.Collection<罚金标准> 读者_罚金;
   /** @pdRoleInfo migr=no name=教师 assc=读者7 mult=0..1 type=Composition */
   public 教师 教师;
   /** @pdRoleInfo migr=no name=学生 assc=读者6 mult=0..1 type=Composition */
   public 学生 学生;
   /** @pdRoleInfo migr=no name=读者类别 assc=读者8 mult=0..1 side=A */
   public 读者类别 读者类别;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<罚金标准> get读者_罚金() {
      if (读者_罚金 == null)
         读者_罚金 = new java.util.HashSet<罚金标准>();
      return 读者_罚金;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIterator读者_罚金() {
      if (读者_罚金 == null)
         读者_罚金 = new java.util.HashSet<罚金标准>();
      return 读者_罚金.iterator();
   }
   
   /** @pdGenerated default setter
     * @param new读者_罚金 */
   public void set读者_罚金(java.util.Collection<罚金标准> new读者_罚金) {
      removeAll读者_罚金();
      for (java.util.Iterator iter = new读者_罚金.iterator(); iter.hasNext();)
         add读者_罚金((罚金标准)iter.next());
   }
   
   /** @pdGenerated default add
     * @param new罚金标准 */
   public void add读者_罚金(罚金标准 new罚金标准) {
      if (new罚金标准 == null)
         return;
      if (this.读者_罚金 == null)
         this.读者_罚金 = new java.util.HashSet<罚金标准>();
      if (!this.读者_罚金.contains(new罚金标准))
      {
         this.读者_罚金.add(new罚金标准);
         new罚金标准.add读者_罚金(this);      
      }
   }
   
   /** @pdGenerated default remove
     * @param old罚金标准 */
   public void remove读者_罚金(罚金标准 old罚金标准) {
      if (old罚金标准 == null)
         return;
      if (this.读者_罚金 != null)
         if (this.读者_罚金.contains(old罚金标准))
         {
            this.读者_罚金.remove(old罚金标准);
            old罚金标准.remove读者_罚金(this);
         }
   }
   
   /** @pdGenerated default removeAll */
   public void removeAll读者_罚金() {
      if (读者_罚金 != null)
      {
         罚金标准 old罚金标准;
         for (java.util.Iterator iter = getIterator读者_罚金(); iter.hasNext();)
         {
            old罚金标准 = (罚金标准)iter.next();
            iter.remove();
            old罚金标准.remove读者_罚金(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 读者类别 get读者类别() {
      return 读者类别;
   }
   
   /** @pdGenerated default parent setter
     * @param new读者类别 */
   public void set读者类别(读者类别 new读者类别) {
      if (this.读者类别 == null || !this.读者类别.equals(new读者类别))
      {
         if (this.读者类别 != null)
         {
            读者类别 old读者类别 = this.读者类别;
            this.读者类别 = null;
            old读者类别.remove读者(this);
         }
         if (new读者类别 != null)
         {
            this.读者类别 = new读者类别;
            this.读者类别.add读者(this);
         }
      }
   }

}