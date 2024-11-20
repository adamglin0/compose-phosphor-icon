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

public val LightGroup.StarAndCrescent: ImageVector
    get() {
        if (_starAndCrescent != null) {
            return _starAndCrescent!!
        }
        _starAndCrescent = Builder(name = "StarAndCrescent", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.73f, 201.06f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, true, 0.0f, -146.12f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.69f)
                arcTo(93.0f, 93.0f, 0.0f, false, false, 112.0f, 34.0f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, false, 0.0f, 188.0f)
                arcToRelative(93.0f, 93.0f, 0.0f, false, false, 42.73f, -10.25f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -10.69f)
                close()
                moveTo(112.0f, 210.0f)
                arcTo(82.0f, 82.0f, 0.0f, true, true, 138.81f, 50.47f)
                arcToRelative(94.0f, 94.0f, 0.0f, false, false, 0.0f, 155.06f)
                arcTo(81.4f, 81.4f, 0.0f, false, true, 112.0f, 210.0f)
                close()
                moveTo(250.38f, 122.49f)
                lineTo(222.77f, 110.58f)
                lineTo(220.37f, 79.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.61f, -3.36f)
                lineTo(190.37f, 99.67f)
                lineToRelative(-28.93f, -7.16f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.61f, 8.87f)
                lineTo(170.5f, 128.0f)
                lineToRelative(-15.67f, 26.62f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.61f, 8.87f)
                lineToRelative(28.93f, -7.16f)
                lineToRelative(19.39f, 23.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.61f, -3.36f)
                lineToRelative(2.4f, -31.0f)
                lineToRelative(27.61f, -11.91f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -11.0f)
                close()
                moveTo(214.69f, 135.84f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.61f, 5.0f)
                lineToRelative(-1.53f, 19.83f)
                lineToRelative(-12.33f, -14.94f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -4.63f, -2.18f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, -1.44f, 0.18f)
                lineToRelative(-18.74f, 4.63f)
                lineTo(182.64f, 131.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -6.08f)
                lineToRelative(-10.23f, -17.37f)
                lineToRelative(18.74f, 4.63f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.07f, -2.0f)
                lineToRelative(12.33f, -14.94f)
                lineToRelative(1.53f, 19.83f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.61f, 5.0f)
                lineTo(232.86f, 128.0f)
                close()
            }
        }
        .build()
        return _starAndCrescent!!
    }

private var _starAndCrescent: ImageVector? = null
