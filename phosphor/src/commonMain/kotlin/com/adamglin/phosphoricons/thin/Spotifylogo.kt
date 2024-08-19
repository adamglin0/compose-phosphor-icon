package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Spotifylogo: ImageVector
    get() {
        if (_spotifylogo != null) {
            return _spotifylogo!!
        }
        _spotifylogo = Builder(name = "Spotifylogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 228.0f, 128.0f)
                arcTo(100.11f, 100.11f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, true, true, 92.0f, -92.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, true, 128.0f, 220.0f)
                close()
                moveTo(155.54f, 167.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.41f, 1.67f)
                arcToRelative(46.73f, 46.73f, 0.0f, false, false, -44.26f, 0.0f)
                arcTo(4.07f, 4.07f, 0.0f, false, true, 104.0f, 170.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.87f, -7.54f)
                arcToRelative(55.39f, 55.39f, 0.0f, false, true, 51.74f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 155.54f, 167.87f)
                close()
                moveTo(187.54f, 111.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.41f, 1.65f)
                arcToRelative(114.67f, 114.67f, 0.0f, false, false, -108.24f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.76f, -7.06f)
                arcToRelative(122.65f, 122.65f, 0.0f, false, true, 115.76f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 187.53f, 111.87f)
                close()
                moveTo(171.54f, 139.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.41f, 1.65f)
                arcToRelative(81.0f, 81.0f, 0.0f, false, false, -76.24f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.76f, -7.06f)
                arcToRelative(89.0f, 89.0f, 0.0f, false, true, 83.76f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 171.53f, 139.88f)
                close()
            }
        }
        .build()
        return _spotifylogo!!
    }

private var _spotifylogo: ImageVector? = null
