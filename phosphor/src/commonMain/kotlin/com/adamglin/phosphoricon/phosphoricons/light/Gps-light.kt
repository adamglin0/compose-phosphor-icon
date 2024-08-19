package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Gps-light`: ImageVector
    get() {
        if (`_gps-light` != null) {
            return `_gps-light`!!
        }
        `_gps-light` = Builder(name = "Gps-light", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 122.0f)
                horizontalLineTo(213.77f)
                arcTo(86.12f, 86.12f, 0.0f, false, false, 134.0f, 42.23f)
                verticalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(42.23f)
                arcTo(86.12f, 86.12f, 0.0f, false, false, 42.23f, 122.0f)
                horizontalLineTo(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(42.23f)
                arcTo(86.12f, 86.12f, 0.0f, false, false, 122.0f, 213.77f)
                verticalLineTo(240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(213.77f)
                arcTo(86.12f, 86.12f, 0.0f, false, false, 213.77f, 134.0f)
                horizontalLineTo(240.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(128.0f, 202.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, 74.0f, -74.0f)
                arcTo(74.09f, 74.09f, 0.0f, false, true, 128.0f, 202.0f)
                close()
            }
        }
        .build()
        return `_gps-light`!!
    }

private var `_gps-light`: ImageVector? = null
