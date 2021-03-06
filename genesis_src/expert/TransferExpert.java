/*  1:   */ package expert;
/*  2:   */ 
/*  3:   */ import bridge.reps.entities.Entity;
/*  4:   */ import bridge.reps.entities.Relation;
/*  5:   */ import connections.AbstractWiredBox;
/*  6:   */ import connections.Connections;
/*  7:   */ import connections.Ports;
/*  8:   */ import utils.Mark;
/*  9:   */ 
/* 10:   */ public class TransferExpert
/* 11:   */   extends AbstractWiredBox
/* 12:   */ {
/* 13:   */   public TransferExpert()
/* 14:   */   {
/* 15:16 */     setName("Transfer expert");
/* 16:17 */     Connections.getPorts(this).addSignalProcessor("process");
/* 17:   */   }
/* 18:   */   
/* 19:   */   public void process(Object object)
/* 20:   */   {
/* 21:21 */     if (!(object instanceof Entity)) {
/* 22:22 */       return;
/* 23:   */     }
/* 24:24 */     Entity t = (Entity)object;
/* 25:25 */     Mark.say(new Object[] {Boolean.valueOf(false), "Entering TransferExpert" });
/* 26:26 */     if ((t.relationP()) && (t.isAPrimed("transfer")))
/* 27:   */     {
/* 28:27 */       Relation r = (Relation)t;
/* 29:28 */       Connections.getPorts(this).transmit("viewer", r);
/* 30:   */     }
/* 31:   */     else
/* 32:   */     {
/* 33:31 */       Connections.getPorts(this).transmit("next", t);
/* 34:   */     }
/* 35:   */   }
/* 36:   */ }


/* Location:           C:\Yuya\Development\Genesis\genesis.jar
 * Qualified Name:     expert.TransferExpert
 * JD-Core Version:    0.7.0.1
 */