package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Mailbox: ImageVector
    get() {
        if (_mailbox != null) {
            return _mailbox!!
        }
        _mailbox = Builder(name = "Mailbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(64.0f, 160.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(88.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 100.0f, 148.0f)
                close()
                moveTo(244.0f, 116.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(140.0f, 196.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 196.0f)
                lineTo(32.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 116.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 76.0f, 52.0f)
                horizontalLineToRelative(80.0f)
                lineTo(156.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(180.0f, 36.0f)
                lineTo(180.0f, 52.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 244.0f, 116.0f)
                close()
                moveTo(116.0f, 172.0f)
                lineTo(116.0f, 116.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -80.0f, 0.0f)
                verticalLineToRelative(56.0f)
                close()
                moveTo(220.0f, 116.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -40.0f, -40.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(156.0f, 76.0f)
                lineTo(125.93f, 76.0f)
                arcTo(63.7f, 63.7f, 0.0f, false, true, 140.0f, 116.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(80.0f)
                close()
            }
        }
        .build()
        return _mailbox!!
    }

private var _mailbox: ImageVector? = null
