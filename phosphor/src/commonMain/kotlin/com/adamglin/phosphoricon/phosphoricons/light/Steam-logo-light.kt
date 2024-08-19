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

public val LightGroup.`Steam-logo-light`: ImageVector
    get() {
        if (`_steam-logo-light` != null) {
            return `_steam-logo-light`!!
        }
        `_steam-logo-light` = Builder(name = "Steam-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(116.38f, 184.17f)
                lineToRelative(61.21f, -49.93f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, -47.83f, -47.83f)
                lineTo(85.33f, 140.85f)
                lineTo(43.0f, 98.49f)
                arcToRelative(89.63f, 89.63f, 0.0f, true, true, -3.53f, 13.43f)
                lineToRelative(38.44f, 38.44f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, 38.5f, 33.81f)
                close()
                moveTo(122.57f, 114.17f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, false, 27.25f, 27.25f)
                lineToRelative(-24.0f, 19.58f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 103.0f, 138.18f)
                close()
                moveTo(156.0f, 130.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.0f, 22.0f, 0.0f, false, true, 156.0f, 130.0f)
                close()
                moveTo(100.0f, 150.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, -14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 100.0f, 150.0f)
                close()
            }
        }
        .build()
        return `_steam-logo-light`!!
    }

private var `_steam-logo-light`: ImageVector? = null
