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

public val BoldGroup.`Headlights-bold`: ImageVector
    get() {
        if (`_headlights-bold` != null) {
            return `_headlights-bold`!!
        }
        `_headlights-bold` = Builder(name = "Headlights-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(176.0f, 92.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 80.0f)
                close()
                moveTo(240.0f, 164.0f)
                lineTo(176.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(240.0f, 116.0f)
                lineTo(176.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(148.0f, 64.0f)
                lineTo(148.0f, 192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(88.0f, 212.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 4.0f, 127.37f)
                curveTo(4.34f, 81.4f, 42.43f, 44.0f, 88.9f, 44.0f)
                lineTo(128.0f, 44.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 148.0f, 64.0f)
                close()
                moveTo(124.0f, 68.0f)
                lineTo(88.9f, 68.0f)
                curveTo(55.57f, 68.0f, 28.25f, 94.71f, 28.0f, 127.54f)
                arcTo(60.0f, 60.0f, 0.0f, false, false, 88.0f, 188.0f)
                horizontalLineToRelative(36.0f)
                close()
            }
        }
        .build()
        return `_headlights-bold`!!
    }

private var `_headlights-bold`: ImageVector? = null
