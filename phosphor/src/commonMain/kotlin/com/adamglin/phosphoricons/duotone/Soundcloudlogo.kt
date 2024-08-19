package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.Soundcloudlogo: ImageVector
    get() {
        if (_soundcloudlogo != null) {
            return _soundcloudlogo!!
        }
        _soundcloudlogo = Builder(name = "Soundcloudlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(248.0f, 152.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(48.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 71.64f, 64.73f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 248.0f, 152.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(8.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(48.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 88.0f)
                close()
                moveTo(80.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(72.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 80.0f)
                close()
                moveTo(112.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(104.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(120.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 112.0f, 48.0f)
                close()
                moveTo(222.84f, 106.34f)
                arcTo(80.0f, 80.0f, 0.0f, false, false, 144.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                arcToRelative(63.76f, 63.76f, 0.0f, false, true, 63.68f, 57.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.44f, 7.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 208.0f, 184.0f)
                lineTo(144.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 14.84f, -93.66f)
                close()
            }
        }
        .build()
        return _soundcloudlogo!!
    }

private var _soundcloudlogo: ImageVector? = null
