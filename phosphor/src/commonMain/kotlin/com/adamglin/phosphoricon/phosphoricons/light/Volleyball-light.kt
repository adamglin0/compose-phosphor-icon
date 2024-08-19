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

public val LightGroup.`Volleyball-light`: ImageVector
    get() {
        if (`_volleyball-light` != null) {
            return `_volleyball-light`!!
        }
        `_volleyball-light` = Builder(name = "Volleyball-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(211.37f, 161.89f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -97.85f, 3.18f)
                lineTo(131.46f, 134.0f)
                lineTo(217.8f, 134.0f)
                arcTo(89.49f, 89.49f, 0.0f, false, true, 211.37f, 161.89f)
                close()
                moveTo(88.3f, 47.24f)
                arcToRelative(89.54f, 89.54f, 0.0f, false, true, 27.35f, -8.39f)
                arcTo(90.0f, 90.0f, 0.0f, false, true, 167.34f, 122.0f)
                lineTo(131.46f, 122.0f)
                close()
                moveTo(217.8f, 122.0f)
                lineTo(179.34f, 122.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 138.5f, 38.62f)
                arcTo(90.15f, 90.15f, 0.0f, false, true, 217.8f, 122.0f)
                close()
                moveTo(77.92f, 53.26f)
                lineTo(97.13f, 86.53f)
                arcToRelative(102.16f, 102.16f, 0.0f, false, false, -51.79f, 77.06f)
                arcTo(89.93f, 89.93f, 0.0f, false, true, 77.92f, 53.26f)
                close()
                moveTo(57.0f, 183.19f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 46.17f, -86.26f)
                lineTo(121.07f, 128.0f)
                lineTo(77.92f, 202.74f)
                arcTo(90.59f, 90.59f, 0.0f, false, true, 57.0f, 183.19f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(89.5f, 89.5f, 0.0f, false, true, -39.7f, -9.24f)
                lineToRelative(19.22f, -33.29f)
                arcToRelative(102.13f, 102.13f, 0.0f, false, false, 92.58f, 6.34f)
                arcTo(89.91f, 89.91f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return `_volleyball-light`!!
    }

private var `_volleyball-light`: ImageVector? = null
