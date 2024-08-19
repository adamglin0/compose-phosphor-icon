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

public val LightGroup.Spotifylogo: ImageVector
    get() {
        if (_spotifylogo != null) {
            return _spotifylogo!!
        }
        _spotifylogo = Builder(name = "Spotifylogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(157.31f, 168.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.11f, 2.51f)
                arcToRelative(44.75f, 44.75f, 0.0f, false, false, -42.4f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.6f, -10.62f)
                arcToRelative(57.37f, 57.37f, 0.0f, false, true, 53.6f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 157.31f, 168.8f)
                close()
                moveTo(189.31f, 112.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.12f, 2.46f)
                arcToRelative(112.67f, 112.67f, 0.0f, false, false, -106.34f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.66f, -10.58f)
                arcToRelative(124.65f, 124.65f, 0.0f, false, true, 117.66f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 189.29f, 112.82f)
                close()
                moveTo(173.31f, 140.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 168.0f, 144.0f)
                arcToRelative(6.07f, 6.07f, 0.0f, false, true, -2.82f, -0.7f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, -74.36f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.64f, -10.6f)
                arcToRelative(91.0f, 91.0f, 0.0f, false, true, 85.64f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 173.3f, 140.82f)
                close()
            }
        }
        .build()
        return _spotifylogo!!
    }

private var _spotifylogo: ImageVector? = null
