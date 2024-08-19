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

public val BoldGroup.`Stool-bold`: ImageVector
    get() {
        if (`_stool-bold` != null) {
            return `_stool-bold`!!
        }
        `_stool-bold` = Builder(name = "Stool-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 64.0f)
                lineTo(204.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 72.0f, 84.0f)
                horizontalLineToRelative(2.0f)
                lineTo(52.15f, 222.13f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.7f, 3.74f)
                lineTo(83.1f, 180.0f)
                horizontalLineToRelative(89.8f)
                lineToRelative(7.25f, 45.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.7f, -3.74f)
                lineTo(182.0f, 84.0f)
                horizontalLineToRelative(2.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 204.0f, 64.0f)
                close()
                moveTo(76.0f, 44.0f)
                lineTo(180.0f, 44.0f)
                lineTo(180.0f, 60.0f)
                lineTo(76.0f, 60.0f)
                close()
                moveTo(169.11f, 156.0f)
                lineTo(86.89f, 156.0f)
                lineTo(98.25f, 84.0f)
                horizontalLineToRelative(59.5f)
                close()
            }
        }
        .build()
        return `_stool-bold`!!
    }

private var `_stool-bold`: ImageVector? = null
