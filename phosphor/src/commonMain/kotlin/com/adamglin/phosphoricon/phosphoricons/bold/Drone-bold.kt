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

public val BoldGroup.`Drone-bold`: ImageVector
    get() {
        if (`_drone-bold` != null) {
            return `_drone-bold`!!
        }
        `_drone-bold` = Builder(name = "Drone-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(42.06f, 109.94f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 67.88f, -67.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 93.0f, 59.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 59.0f, 93.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, 17.0f)
                close()
                moveTo(163.0f, 59.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 197.0f, 93.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.0f, 17.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -67.88f, -67.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                close()
                moveTo(196.94f, 146.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 163.0f, 197.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 67.88f, -67.88f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 197.0f, 146.06f)
                close()
                moveTo(93.0f, 197.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, true, 59.0f, 163.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 67.88f, 67.88f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -17.0f, -17.0f)
                close()
                moveTo(164.0f, 109.0f)
                lineTo(164.0f, 147.0f)
                lineToRelative(24.49f, 24.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, 17.0f)
                lineTo(147.0f, 164.0f)
                lineTo(109.0f, 164.0f)
                lineTo(84.49f, 188.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -17.0f)
                lineTo(92.0f, 147.0f)
                lineTo(92.0f, 109.0f)
                lineTo(67.51f, 84.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                lineTo(109.0f, 92.0f)
                lineTo(147.0f, 92.0f)
                lineToRelative(24.48f, -24.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(116.0f, 140.0f)
                horizontalLineToRelative(24.0f)
                lineTo(140.0f, 116.0f)
                lineTo(116.0f, 116.0f)
                close()
            }
        }
        .build()
        return `_drone-bold`!!
    }

private var `_drone-bold`: ImageVector? = null
