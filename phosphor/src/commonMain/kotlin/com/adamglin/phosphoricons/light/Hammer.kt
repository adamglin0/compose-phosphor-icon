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

public val LightGroup.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.92f, 113.4f)
                lineTo(182.47f, 45.49f)
                arcToRelative(94.12f, 94.12f, 0.0f, false, false, -133.0f, 0.06f)
                lineTo(35.68f, 59.78f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.63f, 8.35f)
                lineTo(58.0f, 54.0f)
                arcTo(82.0f, 82.0f, 0.0f, false, true, 78.55f, 39.0f)
                lineToRelative(49.0f, 49.0f)
                lineTo(30.09f, 185.4f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 19.81f)
                lineTo(50.78f, 225.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineTo(168.0f, 128.46f)
                lineToRelative(33.42f, 33.42f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(28.68f, -28.69f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 249.92f, 113.4f)
                close()
                moveTo(62.1f, 217.41f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineTo(38.58f, 196.72f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.83f)
                lineTo(108.0f, 124.46f)
                lineTo(131.51f, 148.0f)
                close()
                moveTo(163.76f, 115.73f)
                lineTo(140.0f, 139.49f)
                lineTo(116.48f, 116.0f)
                lineToRelative(23.76f, -23.76f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -8.49f)
                lineTo(90.54f, 34.0f)
                arcTo(82.07f, 82.07f, 0.0f, false, true, 174.0f, 54.0f)
                lineToRelative(45.62f, 45.93f)
                lineTo(188.0f, 131.49f)
                lineToRelative(-15.76f, -15.76f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 163.76f, 115.73f)
                close()
                moveTo(241.42f, 124.73f)
                lineTo(212.73f, 153.43f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.83f, 0.0f)
                lineTo(196.49f, 140.0f)
                lineToRelative(31.56f, -31.57f)
                lineToRelative(13.37f, 13.46f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 241.42f, 124.7f)
                close()
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
