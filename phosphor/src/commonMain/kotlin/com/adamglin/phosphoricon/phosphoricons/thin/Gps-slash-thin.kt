package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Gps-slash-thin`: ImageVector
    get() {
        if (`_gps-slash-thin` != null) {
            return `_gps-slash-thin`!!
        }
        `_gps-slash-thin` = Builder(name = "Gps-slash-thin", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(211.9f, 132.0f)
                arcToRelative(83.08f, 83.08f, 0.0f, false, true, -7.24f, 30.38f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.65f, 2.37f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, true, -1.63f, -0.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -5.28f)
                arcTo(76.06f, 76.06f, 0.0f, false, false, 103.62f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -2.56f, -7.57f)
                arcTo(83.56f, 83.56f, 0.0f, false, true, 124.0f, 44.1f)
                lineTo(124.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(132.0f, 44.1f)
                arcTo(84.11f, 84.11f, 0.0f, false, true, 211.9f, 124.0f)
                lineTo(240.0f, 124.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 128.0f)
                close()
                moveTo(211.0f, 213.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.92f, 5.38f)
                lineToRelative(-23.56f, -25.91f)
                arcTo(83.81f, 83.81f, 0.0f, false, true, 132.0f, 211.9f)
                lineTo(132.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 211.9f)
                arcTo(84.11f, 84.11f, 0.0f, false, true, 44.1f, 132.0f)
                lineTo(16.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(44.1f, 124.0f)
                arcTo(84.24f, 84.24f, 0.0f, false, true, 68.6f, 68.61f)
                lineTo(45.0f, 42.69f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 51.0f, 37.31f)
                lineTo(184.77f, 184.5f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(176.13f, 186.84f)
                lineTo(74.0f, 74.53f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 102.1f, 112.31f)
                close()
            }
        }
        .build()
        return `_gps-slash-thin`!!
    }

private var `_gps-slash-thin`: ImageVector? = null
