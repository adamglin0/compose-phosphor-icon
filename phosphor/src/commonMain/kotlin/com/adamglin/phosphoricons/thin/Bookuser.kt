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

public val ThinGroup.BookUser: ImageVector
    get() {
        if (_bookUser != null) {
            return _bookUser!!
        }
        _bookUser = Builder(name = "BookUser", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 76.0f)
                lineTo(160.0f, 76.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -32.0f, 19.54f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 96.0f, 76.0f)
                lineTo(24.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(20.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(96.0f, 204.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(236.0f, 80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 76.0f)
                close()
                moveTo(96.0f, 196.0f)
                lineTo(28.0f, 196.0f)
                lineTo(28.0f, 84.0f)
                lineTo(96.0f, 84.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                verticalLineToRelative(97.4f)
                arcTo(35.93f, 35.93f, 0.0f, false, false, 96.0f, 196.0f)
                close()
                moveTo(228.0f, 196.0f)
                lineTo(160.0f, 196.0f)
                arcToRelative(35.94f, 35.94f, 0.0f, false, false, -28.0f, 13.41f)
                lineTo(132.0f, 112.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, -28.0f)
                horizontalLineToRelative(68.0f)
                close()
                moveTo(92.8f, 45.6f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 70.4f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.4f, 4.8f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -57.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -6.4f, -4.8f)
                close()
            }
        }
        .build()
        return _bookUser!!
    }

private var _bookUser: ImageVector? = null
