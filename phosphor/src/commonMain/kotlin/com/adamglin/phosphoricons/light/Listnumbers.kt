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

public val LightGroup.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) {
            return _listNumbers!!
        }
        _listNumbers = Builder(name = "ListNumbers", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(216.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 128.0f)
                close()
                moveTo(104.0f, 70.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(216.0f, 186.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(42.68f, 53.37f)
                lineTo(50.0f, 49.71f)
                verticalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.68f, -5.37f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.36f, 10.74f)
                close()
                moveTo(72.0f, 202.0f)
                horizontalLineTo(52.0f)
                lineToRelative(21.48f, -28.74f)
                arcTo(21.5f, 21.5f, 0.0f, false, false, 77.79f, 157.0f)
                arcTo(21.75f, 21.75f, 0.0f, false, false, 69.0f, 142.38f)
                arcToRelative(22.86f, 22.86f, 0.0f, false, false, -31.35f, 4.31f)
                arcToRelative(22.18f, 22.18f, 0.0f, false, false, -3.28f, 5.92f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.28f, 4.11f)
                arcToRelative(9.87f, 9.87f, 0.0f, false, true, 1.48f, -2.67f)
                arcToRelative(10.78f, 10.78f, 0.0f, false, true, 14.78f, -2.0f)
                arcToRelative(9.89f, 9.89f, 0.0f, false, true, 4.0f, 6.61f)
                arcToRelative(9.64f, 9.64f, 0.0f, false, true, -2.0f, 7.28f)
                lineToRelative(-0.06f, 0.09f)
                lineTo(35.2f, 204.41f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 214.0f)
                horizontalLineTo(72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
