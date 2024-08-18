package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Circle-half-tilt`: ImageVector
    get() {
        if (`_circle-half-tilt` != null) {
            return `_circle-half-tilt`!!
        }
        `_circle-half-tilt` = Builder(name = "Circle-half-tilt", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(201.54f, 54.46f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 54.46f, 201.54f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 201.54f, 54.46f)
                close()
                moveTo(184.0f, 195.87f)
                arcToRelative(87.16f, 87.16f, 0.0f, false, true, -16.0f, 10.5f)
                lineTo(168.0f, 99.31f)
                lineToRelative(16.0f, -16.0f)
                close()
                moveTo(104.0f, 163.31f)
                lineTo(120.0f, 147.31f)
                verticalLineToRelative(68.28f)
                arcToRelative(88.37f, 88.37f, 0.0f, false, true, -16.0f, -3.0f)
                close()
                moveTo(88.0f, 206.37f)
                arcToRelative(87.0f, 87.0f, 0.0f, false, true, -16.3f, -10.76f)
                lineTo(88.0f, 179.31f)
                close()
                moveTo(136.0f, 131.31f)
                lineTo(152.0f, 115.31f)
                verticalLineToRelative(97.32f)
                arcToRelative(88.37f, 88.37f, 0.0f, false, true, -16.0f, 3.0f)
                close()
                moveTo(40.0f, 128.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 184.3f, 60.39f)
                lineTo(60.38f, 184.31f)
                arcTo(87.34f, 87.34f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(200.0f, 178.59f)
                lineTo(200.0f, 77.41f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, true, 0.0f, 101.18f)
                close()
            }
        }
        .build()
        return `_circle-half-tilt`!!
    }

private var `_circle-half-tilt`: ImageVector? = null
