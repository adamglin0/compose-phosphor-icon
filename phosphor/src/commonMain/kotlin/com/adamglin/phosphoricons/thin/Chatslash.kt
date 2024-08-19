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

public val ThinGroup.Chatslash: ImageVector
    get() {
        if (_chatslash != null) {
            return _chatslash!!
        }
        _chatslash = Builder(name = "Chatslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineTo(53.5f, 52.0f)
                horizontalLineTo(40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 64.0f)
                verticalLineTo(224.0f)
                arcToRelative(11.89f, 11.89f, 0.0f, false, false, 6.93f, 10.88f)
                arcTo(12.09f, 12.09f, 0.0f, false, false, 40.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 7.74f, -2.87f)
                lineTo(81.49f, 204.0f)
                horizontalLineTo(191.68f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 1.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, -6.69f)
                close()
                moveTo(80.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.61f, 1.0f)
                lineTo(42.57f, 227.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 224.0f)
                verticalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(60.78f)
                lineTo(184.41f, 196.0f)
                close()
                moveTo(228.0f, 64.0f)
                verticalLineTo(186.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                verticalLineTo(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                horizontalLineTo(105.79f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 64.0f)
                close()
            }
        }
        .build()
        return _chatslash!!
    }

private var _chatslash: ImageVector? = null
