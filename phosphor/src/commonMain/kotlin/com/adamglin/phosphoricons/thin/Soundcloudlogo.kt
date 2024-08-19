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

public val ThinGroup.Soundcloudlogo: ImageVector
    get() {
        if (_soundcloudlogo != null) {
            return _soundcloudlogo!!
        }
        _soundcloudlogo = Builder(name = "Soundcloudlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(12.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(48.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 48.0f, 92.0f)
                close()
                moveTo(80.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(76.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 80.0f, 84.0f)
                close()
                moveTo(112.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(108.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(116.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 112.0f, 52.0f)
                close()
                moveTo(219.27f, 109.46f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 144.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(67.75f, 67.75f, 0.0f, false, true, 67.66f, 61.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.22f, 3.53f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 208.0f, 188.0f)
                lineTo(144.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 11.27f, -86.54f)
                close()
            }
        }
        .build()
        return _soundcloudlogo!!
    }

private var _soundcloudlogo: ImageVector? = null
