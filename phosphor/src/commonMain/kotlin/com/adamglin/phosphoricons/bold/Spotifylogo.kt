package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) {
            return _spotifyLogo!!
        }
        _spotifyLogo = Builder(name = "SpotifyLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(194.59f, 127.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.24f, 4.93f)
                arcToRelative(106.7f, 106.7f, 0.0f, false, false, -100.7f, 0.0f)
                arcTo(11.83f, 11.83f, 0.0f, false, true, 72.0f, 134.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -5.66f, -22.58f)
                arcToRelative(130.61f, 130.61f, 0.0f, false, true, 123.3f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 194.59f, 127.64f)
                close()
                moveTo(178.59f, 163.64f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.23f, 5.0f)
                arcToRelative(73.0f, 73.0f, 0.0f, false, false, -68.72f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.28f, -21.18f)
                arcToRelative(97.0f, 97.0f, 0.0f, false, true, 91.28f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 178.59f, 163.64f)
                close()
            }
        }
        .build()
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
