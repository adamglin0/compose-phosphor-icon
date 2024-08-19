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

public val LightGroup.Soundcloudlogo: ImageVector
    get() {
        if (_soundcloudlogo != null) {
            return _soundcloudlogo!!
        }
        _soundcloudlogo = Builder(name = "Soundcloudlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(10.0f, 120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(48.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 96.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 48.0f, 90.0f)
                close()
                moveTo(80.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(74.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(86.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.0f, 82.0f)
                close()
                moveTo(112.0f, 50.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(106.0f, 192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(118.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 112.0f, 50.0f)
                close()
                moveTo(221.06f, 107.88f)
                arcTo(78.0f, 78.0f, 0.0f, false, false, 144.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                arcToRelative(65.75f, 65.75f, 0.0f, false, true, 65.67f, 59.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.83f, 5.29f)
                arcTo(34.0f, 34.0f, 0.0f, false, true, 208.0f, 186.0f)
                lineTo(144.0f, 186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 13.06f, -90.12f)
                close()
            }
        }
        .build()
        return _soundcloudlogo!!
    }

private var _soundcloudlogo: ImageVector? = null
