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

public val LightGroup.Chatslash: ImageVector
    get() {
        if (_chatslash != null) {
            return _chatslash!!
        }
        _chatslash = Builder(name = "Chatslash", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineTo(49.0f, 50.0f)
                horizontalLineTo(40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 64.0f)
                verticalLineTo(224.0f)
                arcToRelative(13.86f, 13.86f, 0.0f, false, false, 8.09f, 12.69f)
                arcToRelative(13.89f, 13.89f, 0.0f, false, false, 15.0f, -2.0f)
                lineTo(82.23f, 206.0f)
                horizontalLineTo(190.8f)
                lineToRelative(12.76f, 14.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 8.88f, -8.07f)
                close()
                moveTo(80.0f, 194.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.92f, 1.46f)
                lineToRelative(-34.79f, 30.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 224.0f)
                verticalLineTo(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(59.89f)
                lineToRelative(120.0f, 132.0f)
                close()
                moveTo(230.0f, 64.0f)
                verticalLineTo(186.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                verticalLineTo(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineTo(105.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(216.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 230.0f, 64.0f)
                close()
            }
        }
        .build()
        return _chatslash!!
    }

private var _chatslash: ImageVector? = null
