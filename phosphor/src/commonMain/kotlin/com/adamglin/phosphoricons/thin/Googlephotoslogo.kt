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

public val ThinGroup.GooglePhotosLogo: ImageVector
    get() {
        if (_googlePhotosLogo != null) {
            return _googlePhotosLogo!!
        }
        _googlePhotosLogo = Builder(name = "GooglePhotosLogo", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 124.0f)
                lineTo(185.68f, 124.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 128.0f, 20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(124.0f, 70.32f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 20.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(70.32f, 132.0f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 128.0f, 236.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(132.0f, 185.68f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 236.0f, 128.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 124.0f)
                close()
                moveTo(188.0f, 88.0f)
                arcToRelative(59.28f, 59.28f, 0.0f, false, true, -12.0f, 36.0f)
                lineTo(132.0f, 124.0f)
                lineTo(132.0f, 28.13f)
                arcTo(60.08f, 60.08f, 0.0f, false, true, 188.0f, 88.0f)
                close()
                moveTo(88.0f, 68.0f)
                arcToRelative(59.28f, 59.28f, 0.0f, false, true, 36.0f, 12.0f)
                verticalLineToRelative(44.0f)
                lineTo(28.13f, 124.0f)
                arcTo(60.08f, 60.08f, 0.0f, false, true, 88.0f, 68.0f)
                close()
                moveTo(68.0f, 168.0f)
                arcToRelative(59.28f, 59.28f, 0.0f, false, true, 12.0f, -36.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(95.87f)
                arcTo(60.08f, 60.08f, 0.0f, false, true, 68.0f, 168.0f)
                close()
                moveTo(168.0f, 188.0f)
                arcToRelative(59.28f, 59.28f, 0.0f, false, true, -36.0f, -12.0f)
                lineTo(132.0f, 132.0f)
                horizontalLineToRelative(95.87f)
                arcTo(60.08f, 60.08f, 0.0f, false, true, 168.0f, 188.0f)
                close()
            }
        }
        .build()
        return _googlePhotosLogo!!
    }

private var _googlePhotosLogo: ImageVector? = null
