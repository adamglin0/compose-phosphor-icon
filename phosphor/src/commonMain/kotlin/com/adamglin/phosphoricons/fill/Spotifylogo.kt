package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.SpotifyLogo: ImageVector
    get() {
        if (_spotifyLogo != null) {
            return _spotifyLogo!!
        }
        _spotifyLogo = Builder(name = "SpotifyLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(159.07f, 169.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.81f, 3.33f)
                arcToRelative(42.79f, 42.79f, 0.0f, false, false, -40.52f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.48f, -14.14f)
                arcToRelative(59.33f, 59.33f, 0.0f, false, true, 55.48f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 159.07f, 169.74f)
                close()
                moveTo(175.07f, 141.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.82f, 3.3f)
                arcToRelative(77.07f, 77.07f, 0.0f, false, false, -72.48f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.52f, -14.12f)
                arcToRelative(93.0f, 93.0f, 0.0f, false, true, 87.52f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 175.06f, 141.76f)
                close()
                moveTo(191.07f, 113.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.83f, 3.29f)
                arcToRelative(110.62f, 110.62f, 0.0f, false, false, -104.46f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.54f, -14.12f)
                arcToRelative(126.67f, 126.67f, 0.0f, false, true, 119.54f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 191.06f, 113.76f)
                close()
            }
        }
        .build()
        return _spotifyLogo!!
    }

private var _spotifyLogo: ImageVector? = null
