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

public val RegularGroup.`Beer-bottle`: ImageVector
    get() {
        if (`_beer-bottle` != null) {
            return `_beer-bottle`!!
        }
        `_beer-bottle` = Builder(name = "Beer-bottle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(245.66f, 42.34f)
                lineToRelative(-32.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineToRelative(1.48f, 1.47f)
                lineTo(148.65f, 64.51f)
                lineToRelative(-38.22f, 7.65f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, false, -4.09f, 2.18f)
                lineTo(23.0f, 157.66f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, 33.94f)
                lineTo(64.4f, 233.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 33.94f, 0.0f)
                lineToRelative(83.32f, -83.31f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.18f, -4.09f)
                lineToRelative(7.65f, -38.22f)
                lineToRelative(41.38f, -55.17f)
                lineToRelative(1.47f, 1.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.32f, -11.32f)
                close()
                moveTo(96.0f, 107.31f)
                lineTo(148.69f, 160.0f)
                lineTo(104.0f, 204.69f)
                lineTo(51.31f, 152.0f)
                close()
                moveTo(81.37f, 224.0f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, -5.65f, -2.34f)
                lineTo(34.34f, 180.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -11.31f)
                lineTo(40.0f, 163.31f)
                lineTo(92.69f, 216.0f)
                lineTo(87.0f, 221.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 81.37f, 224.0f)
                close()
                moveTo(177.6f, 99.2f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -1.44f, 3.23f)
                lineToRelative(-7.53f, 37.63f)
                lineTo(160.0f, 148.69f)
                lineTo(107.31f, 96.0f)
                lineToRelative(8.63f, -8.63f)
                lineToRelative(37.63f, -7.53f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, 3.23f, -1.44f)
                lineToRelative(58.45f, -43.84f)
                lineToRelative(6.19f, 6.19f)
                close()
            }
        }
        .build()
        return `_beer-bottle`!!
    }

private var `_beer-bottle`: ImageVector? = null
