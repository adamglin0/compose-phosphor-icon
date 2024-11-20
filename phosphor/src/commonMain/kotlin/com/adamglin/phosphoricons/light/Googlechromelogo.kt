package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.GoogleChromeLogo: ImageVector
    get() {
        if (_googleChromeLogo != null) {
            return _googleChromeLogo!!
        }
        _googleChromeLogo = Builder(name = "GoogleChromeLogo", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 38.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 77.33f, 44.0f)
                lineTo(128.0f, 82.0f)
                arcToRelative(46.07f, 46.07f, 0.0f, false, false, -44.93f, 36.17f)
                lineTo(56.91f, 72.87f)
                arcTo(89.91f, 89.91f, 0.0f, false, true, 128.0f, 38.0f)
                close()
                moveTo(162.0f, 128.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, true, -34.0f, -34.0f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 162.0f, 128.0f)
                close()
                moveTo(38.0f, 128.0f)
                arcTo(89.4f, 89.4f, 0.0f, false, true, 49.5f, 84.0f)
                lineToRelative(38.66f, 67.0f)
                curveToRelative(0.06f, 0.1f, 0.13f, 0.18f, 0.19f, 0.27f)
                arcTo(45.94f, 45.94f, 0.0f, false, false, 142.0f, 171.83f)
                lineToRelative(-26.17f, 45.34f)
                arcTo(90.13f, 90.13f, 0.0f, false, true, 38.0f, 128.0f)
                close()
                moveTo(129.16f, 218.0f)
                lineTo(167.84f, 151.0f)
                lineTo(168.05f, 150.59f)
                arcTo(45.9f, 45.9f, 0.0f, false, false, 159.0f, 94.0f)
                horizontalLineToRelative(52.37f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -82.16f, 124.0f)
                close()
            }
        }
        .build()
        return _googleChromeLogo!!
    }

private var _googleChromeLogo: ImageVector? = null
