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

public val LightGroup.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.14f, 75.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.79f, -1.43f)
                lineToRelative(-1.41f, 0.4f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -54.07f, -30.52f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, false, -77.74f, 0.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 35.06f, 74.63f)
                lineToRelative(-1.41f, -0.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.49f, 7.14f)
                lineTo(56.71f, 211.21f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 70.34f, 222.0f)
                lineTo(185.66f, 222.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.63f, -10.79f)
                lineTo(229.84f, 81.37f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 228.14f, 75.66f)
                close()
                moveTo(76.0f, 54.0f)
                arcToRelative(29.54f, 29.54f, 0.0f, false, true, 14.0f, 3.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.68f, -4.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 58.56f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.67f, 4.0f)
                arcTo(29.6f, 29.6f, 0.0f, false, true, 180.0f, 54.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 29.39f, 23.94f)
                lineTo(168.32f, 89.67f)
                lineToRelative(-35.12f, -14.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -10.4f, 0.0f)
                lineToRelative(-35.12f, 14.0f)
                lineTo(46.61f, 77.94f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 76.0f, 54.0f)
                close()
                moveTo(161.44f, 99.84f)
                lineTo(146.75f, 210.0f)
                horizontalLineToRelative(-37.5f)
                lineTo(94.56f, 99.84f)
                lineToRelative(32.7f, -13.08f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.48f, 0.0f)
                close()
                moveTo(68.44f, 208.46f)
                lineTo(40.18f, 88.58f)
                lineToRelative(42.39f, 12.11f)
                lineTo(97.15f, 210.0f)
                lineTo(70.34f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 68.39f, 208.46f)
                close()
                moveTo(187.66f, 208.46f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 1.54f)
                lineTo(158.85f, 210.0f)
                lineToRelative(14.58f, -109.31f)
                lineToRelative(42.39f, -12.11f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
