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

public val LightGroup.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) {
            return _googlePhotosLogo!!
        }
        _googlePhotosLogo = Builder(name = "GooglePhotosLogo", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 122.0f)
                lineTo(189.18f, 122.0f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 128.0f, 18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(122.0f, 66.82f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 18.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(66.82f, 134.0f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 128.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(134.0f, 189.18f)
                arcTo(70.0f, 70.0f, 0.0f, false, false, 238.0f, 128.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 232.0f, 122.0f)
                close()
                moveTo(186.0f, 88.0f)
                arcToRelative(57.3f, 57.3f, 0.0f, false, true, -11.0f, 34.0f)
                lineTo(134.0f, 122.0f)
                lineTo(134.0f, 30.31f)
                arcTo(58.08f, 58.08f, 0.0f, false, true, 186.0f, 88.0f)
                close()
                moveTo(88.0f, 70.0f)
                arcToRelative(57.3f, 57.3f, 0.0f, false, true, 34.0f, 11.0f)
                verticalLineToRelative(41.0f)
                lineTo(30.31f, 122.0f)
                arcTo(58.08f, 58.08f, 0.0f, false, true, 88.0f, 70.0f)
                close()
                moveTo(70.0f, 168.0f)
                arcToRelative(57.3f, 57.3f, 0.0f, false, true, 11.0f, -34.0f)
                horizontalLineToRelative(41.0f)
                verticalLineToRelative(91.69f)
                arcTo(58.08f, 58.08f, 0.0f, false, true, 70.0f, 168.0f)
                close()
                moveTo(168.0f, 186.0f)
                arcToRelative(57.3f, 57.3f, 0.0f, false, true, -34.0f, -11.0f)
                lineTo(134.0f, 134.0f)
                horizontalLineToRelative(91.69f)
                arcTo(58.08f, 58.08f, 0.0f, false, true, 168.0f, 186.0f)
                close()
            }
        }
        .build()
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
