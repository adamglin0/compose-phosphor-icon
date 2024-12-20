package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.BracketsAngle: ImageVector
    get() {
        if (_bracketsAngle != null) {
            return _bracketsAngle!!
        }
        _bracketsAngle = Builder(name = "BracketsAngle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.75f, 44.3f)
                lineTo(33.48f, 128.0f)
                lineToRelative(53.27f, 83.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -2.46f, 11.05f)
                arcTo(7.91f, 7.91f, 0.0f, false, true, 80.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.76f, -3.71f)
                lineToRelative(-56.0f, -88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -8.59f)
                lineToRelative(56.0f, -88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.5f, 8.59f)
                close()
                moveTo(238.75f, 123.71f)
                lineTo(182.75f, 35.71f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.5f, 8.59f)
                lineTo(222.52f, 128.0f)
                lineToRelative(-53.27f, 83.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.46f, 11.05f)
                arcTo(7.91f, 7.91f, 0.0f, false, false, 176.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.76f, -3.71f)
                lineToRelative(56.0f, -88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 238.75f, 123.71f)
                close()
            }
        }
        .build()
        return _bracketsAngle!!
    }

private var _bracketsAngle: ImageVector? = null
