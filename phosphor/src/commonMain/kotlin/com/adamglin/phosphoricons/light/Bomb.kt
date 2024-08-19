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

public val LightGroup.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                arcToRelative(54.1f, 54.1f, 0.0f, false, true, -3.57f, 17.77f)
                curveTo(234.06f, 68.69f, 226.72f, 74.0f, 216.0f, 74.0f)
                curveToRelative(-12.91f, 0.0f, -21.76f, -12.38f, -31.12f, -25.49f)
                curveTo(174.67f, 34.21f, 163.09f, 18.0f, 144.0f, 18.0f)
                curveToRelative(-15.74f, 0.0f, -27.35f, 8.22f, -33.57f, 23.77f)
                arcToRelative(65.36f, 65.36f, 0.0f, false, false, -4.0f, 16.23f)
                horizontalLineTo(88.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 74.0f, 72.0f)
                verticalLineTo(82.83f)
                arcTo(86.0f, 86.0f, 0.0f, false, false, 112.0f, 246.0f)
                horizontalLineToRelative(1.55f)
                arcTo(86.0f, 86.0f, 0.0f, false, false, 150.0f, 82.83f)
                verticalLineTo(72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(118.53f)
                arcToRelative(51.39f, 51.39f, 0.0f, false, true, 3.15f, -12.0f)
                curveToRelative(4.38f, -10.74f, 11.69f, -16.0f, 22.32f, -16.0f)
                curveToRelative(12.91f, 0.0f, 21.75f, 12.38f, 31.12f, 25.49f)
                curveTo(185.33f, 69.79f, 196.91f, 86.0f, 216.0f, 86.0f)
                curveToRelative(15.74f, 0.0f, 27.35f, -8.22f, 33.57f, -23.77f)
                arcTo(66.46f, 66.46f, 0.0f, false, false, 254.0f, 40.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 248.0f, 34.0f)
                close()
                moveTo(138.0f, 72.0f)
                verticalLineTo(86.66f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.6f, 5.49f)
                arcToRelative(74.0f, 74.0f, 0.0f, true, true, -59.2f, 0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 86.0f, 86.66f)
                verticalLineTo(72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(48.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 138.0f, 72.0f)
                close()
                moveTo(105.0f, 202.08f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 104.0f, 214.0f)
                arcToRelative(6.74f, 6.74f, 0.0f, false, true, -1.0f, -0.08f)
                arcTo(55.48f, 55.48f, 0.0f, false, true, 58.08f, 169.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.84f, -2.0f)
                arcTo(43.29f, 43.29f, 0.0f, false, false, 105.0f, 202.08f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
