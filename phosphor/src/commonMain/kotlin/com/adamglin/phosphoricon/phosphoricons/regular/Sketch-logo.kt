package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Sketch-logo`: ImageVector
    get() {
        if (`_sketch-logo` != null) {
            return `_sketch-logo`!!
        }
        `_sketch-logo` = Builder(name = "Sketch-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 98.73f)
                lineToRelative(-56.0f, -64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 184.0f, 32.0f)
                lineTo(72.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.0f, 2.73f)
                lineToRelative(-56.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.17f, 10.73f)
                lineToRelative(112.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.7f, 0.0f)
                lineToRelative(112.0f, -120.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 246.0f, 98.73f)
                close()
                moveTo(222.37f, 96.0f)
                lineTo(180.0f, 96.0f)
                lineTo(144.0f, 48.0f)
                horizontalLineToRelative(36.37f)
                close()
                moveTo(74.58f, 112.0f)
                lineToRelative(30.13f, 75.33f)
                lineTo(34.41f, 112.0f)
                close()
                moveTo(164.18f, 112.0f)
                lineTo(128.0f, 202.46f)
                lineTo(91.82f, 112.0f)
                close()
                moveTo(96.0f, 96.0f)
                lineToRelative(32.0f, -42.67f)
                lineTo(160.0f, 96.0f)
                close()
                moveTo(181.42f, 112.0f)
                horizontalLineToRelative(40.17f)
                lineToRelative(-70.3f, 75.33f)
                close()
                moveTo(75.63f, 48.0f)
                lineTo(112.0f, 48.0f)
                lineTo(76.0f, 96.0f)
                lineTo(33.63f, 96.0f)
                close()
            }
        }
        .build()
        return `_sketch-logo`!!
    }

private var `_sketch-logo`: ImageVector? = null
