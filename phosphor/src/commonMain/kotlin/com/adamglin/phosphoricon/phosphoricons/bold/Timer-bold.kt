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

public val BoldGroup.`Timer-bold`: ImageVector
    get() {
        if (`_timer-bold` != null) {
            return `_timer-bold`!!
        }
        `_timer-bold` = Builder(name = "Timer-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 44.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 96.0f, 96.0f)
                arcTo(96.11f, 96.11f, 0.0f, false, false, 128.0f, 44.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 72.0f, -72.0f)
                arcTo(72.08f, 72.08f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(164.49f, 99.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                lineToRelative(-28.0f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineToRelative(28.0f, -28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.49f, 99.51f)
                close()
                moveTo(92.0f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 104.0f, 4.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(104.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_timer-bold`!!
    }

private var `_timer-bold`: ImageVector? = null
