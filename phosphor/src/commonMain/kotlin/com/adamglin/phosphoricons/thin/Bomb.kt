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

public val ThinGroup.Bomb: ImageVector
    get() {
        if (_bomb != null) {
            return _bomb!!
        }
        _bomb = Builder(name = "Bomb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 36.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                curveToRelative(0.0f, 1.47f, -0.42f, 36.0f, -28.0f, 36.0f)
                curveToRelative(-13.94f, 0.0f, -23.08f, -12.79f, -32.75f, -26.33f)
                curveTo(172.83f, 35.09f, 162.06f, 20.0f, 144.0f, 20.0f)
                curveToRelative(-14.86f, 0.0f, -25.82f, 7.79f, -31.71f, 22.51f)
                arcTo(63.73f, 63.73f, 0.0f, false, false, 108.22f, 60.0f)
                horizontalLineTo(88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 76.0f, 72.0f)
                verticalLineTo(84.08f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 112.0f, 244.0f)
                horizontalLineToRelative(1.51f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 148.0f, 84.08f)
                verticalLineTo(72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(116.24f)
                curveToRelative(0.92f, -9.42f, 5.45f, -32.0f, 27.76f, -32.0f)
                curveToRelative(13.94f, 0.0f, 23.08f, 12.79f, 32.75f, 26.33f)
                curveTo(187.17f, 68.91f, 197.94f, 84.0f, 216.0f, 84.0f)
                curveToRelative(14.86f, 0.0f, 25.82f, -7.79f, 31.71f, -22.51f)
                arcTo(64.27f, 64.27f, 0.0f, false, false, 252.0f, 40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 248.0f, 36.0f)
                close()
                moveTo(140.0f, 72.0f)
                verticalLineTo(86.66f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.4f, 3.66f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, -60.8f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 84.0f, 86.66f)
                verticalLineTo(72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 140.0f, 72.0f)
                close()
                moveTo(104.66f, 204.05f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 104.0f, 212.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.66f, -0.05f)
                arcToRelative(53.46f, 53.46f, 0.0f, false, true, -43.29f, -43.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.9f, -1.32f)
                arcTo(45.31f, 45.31f, 0.0f, false, false, 104.66f, 204.05f)
                close()
            }
        }
        .build()
        return _bomb!!
    }

private var _bomb: ImageVector? = null
