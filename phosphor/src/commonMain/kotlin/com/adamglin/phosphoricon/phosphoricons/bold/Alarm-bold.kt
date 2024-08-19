package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Alarm-bold`: ImageVector
    get() {
        if (`_alarm-bold` != null) {
            return `_alarm-bold`!!
        }
        `_alarm-bold` = Builder(name = "Alarm-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 36.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 136.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 36.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 76.0f, -76.0f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(32.49f, 72.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -17.0f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, 17.0f)
                close()
                moveTo(240.49f, 72.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.0f, -17.0f)
                lineToRelative(32.0f, 32.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 240.49f, 72.49f)
                close()
                moveTo(176.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(128.0f, 148.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(116.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return `_alarm-bold`!!
    }

private var `_alarm-bold`: ImageVector? = null
