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

public val LightGroup.Handwaving: ImageVector
    get() {
        if (_handwaving != null) {
            return _handwaving!!
        }
        _handwaving = Builder(name = "Handwaving", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.44f, 101.0f)
                lineTo(201.13f, 71.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -45.58f, 1.0f)
                lineTo(136.47f, 39.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -46.14f, 2.19f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 49.88f, 73.0f)
                lineToRelative(3.29f, 5.7f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -23.69f, 39.0f)
                lineTo(69.5f, 187.0f)
                arcToRelative(85.44f, 85.44f, 0.0f, false, false, 52.21f, 40.08f)
                arcToRelative(86.71f, 86.71f, 0.0f, false, false, 22.4f, 3.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 74.33f, -129.0f)
                close()
                moveTo(215.44f, 163.16f)
                arcTo(74.0f, 74.0f, 0.0f, false, true, 79.89f, 181.0f)
                lineToRelative(-40.0f, -69.32f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 24.25f, -14.0f)
                lineTo(83.36f, 131.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 10.39f, -6.0f)
                lineTo(60.27f, 67.0f)
                arcTo(14.0f, 14.0f, 0.0f, true, true, 84.52f, 53.0f)
                lineToRelative(31.17f, 54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.2f, 3.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.0f, -0.81f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.2f, -8.2f)
                lineTo(101.83f, 59.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 24.25f, -14.0f)
                lineToRelative(34.2f, 59.23f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, -6.4f, 59.13f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.94f, -6.73f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 7.76f, -46.26f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.6f, -7.8f)
                lineTo(166.49f, 91.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 24.25f, -14.0f)
                lineToRelative(17.31f, 30.0f)
                arcTo(73.53f, 73.53f, 0.0f, false, true, 215.44f, 163.14f)
                close()
                moveTo(186.18f, 32.22f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 193.52f, 28.0f)
                arcToRelative(57.59f, 57.59f, 0.0f, false, true, 35.32f, 27.0f)
                lineToRelative(0.33f, 0.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -10.39f, 6.0f)
                lineToRelative(-0.33f, -0.57f)
                arcToRelative(45.69f, 45.69f, 0.0f, false, false, -28.0f, -21.43f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 186.18f, 32.22f)
                close()
                moveTo(79.32f, 235.71f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.42f, 1.0f)
                arcTo(117.79f, 117.79f, 0.0f, false, true, 41.79f, 203.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.4f, -6.0f)
                arcToRelative(105.48f, 105.48f, 0.0f, false, false, 26.14f, 30.29f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 79.32f, 235.71f)
                close()
            }
        }
        .build()
        return _handwaving!!
    }

private var _handwaving: ImageVector? = null
