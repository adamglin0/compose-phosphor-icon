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

public val BoldGroup.`Door-open-bold`: ImageVector
    get() {
        if (`_door-open-bold` != null) {
            return `_door-open-bold`!!
        }
        `_door-open-bold` = Builder(name = "Door-open-bold", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 212.0f)
                lineTo(212.0f, 212.0f)
                lineTo(212.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(64.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 44.0f, 40.0f)
                lineTo(44.0f, 212.0f)
                lineTo(24.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(232.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(188.0f, 212.0f)
                lineTo(172.0f, 212.0f)
                lineTo(172.0f, 44.0f)
                horizontalLineToRelative(16.0f)
                close()
                moveTo(68.0f, 44.0f)
                horizontalLineToRelative(80.0f)
                lineTo(148.0f, 212.0f)
                lineTo(68.0f, 212.0f)
                close()
                moveTo(136.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 136.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_door-open-bold`!!
    }

private var `_door-open-bold`: ImageVector? = null
