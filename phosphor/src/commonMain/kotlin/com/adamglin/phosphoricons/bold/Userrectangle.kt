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

public val BoldGroup.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) {
            return _userRectangle!!
        }
        _userRectangle = Builder(name = "UserRectangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 36.0f)
                lineTo(40.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 36.0f)
                close()
                moveTo(100.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 100.0f, 128.0f)
                close()
                moveTo(128.0f, 180.0f)
                arcToRelative(59.66f, 59.66f, 0.0f, false, true, 40.85f, 16.0f)
                lineTo(87.15f, 196.0f)
                arcTo(59.66f, 59.66f, 0.0f, false, true, 128.0f, 180.0f)
                close()
                moveTo(212.0f, 196.0f)
                lineTo(199.56f, 196.0f)
                arcTo(83.46f, 83.46f, 0.0f, false, false, 165.0f, 164.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, -74.0f, 0.0f)
                arcTo(83.46f, 83.46f, 0.0f, false, false, 56.44f, 196.0f)
                lineTo(44.0f, 196.0f)
                lineTo(44.0f, 60.0f)
                lineTo(212.0f, 60.0f)
                close()
            }
        }
        .build()
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
