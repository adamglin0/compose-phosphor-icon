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

public val LightGroup.PictureInPicture: ImageVector
    get() {
        if (_pictureInPicture != null) {
            return _pictureInPicture!!
        }
        _pictureInPicture = Builder(name = "PictureInPicture", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 50.0f)
                lineTo(40.0f, 50.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                lineTo(26.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(216.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 50.0f)
                close()
                moveTo(38.0f, 192.0f)
                lineTo(38.0f, 64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(216.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(58.0f)
                lineTo(136.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(66.0f)
                lineTo(40.0f, 194.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 192.0f)
                close()
                moveTo(216.0f, 194.0f)
                lineTo(142.0f, 194.0f)
                lineTo(142.0f, 134.0f)
                horizontalLineToRelative(76.0f)
                verticalLineToRelative(58.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 216.0f, 194.0f)
                close()
            }
        }
        .build()
        return _pictureInPicture!!
    }

private var _pictureInPicture: ImageVector? = null
