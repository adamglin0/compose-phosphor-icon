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

public val ThinGroup.Yarn: ImageVector
    get() {
        if (_yarn != null) {
            return _yarn!!
        }
        _yarn = Builder(name = "Yarn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 220.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-64.79f, 0.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 228.0f)
                lineToRelative(104.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(91.5f, 91.5f, 0.0f, false, true, 52.43f, 16.44f)
                arcToRelative(219.41f, 219.41f, 0.0f, false, false, -36.38f, 19.18f)
                arcTo(218.63f, 218.63f, 0.0f, false, false, 87.63f, 45.35f)
                arcTo(91.31f, 91.31f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(77.85f, 50.91f)
                arcToRelative(210.45f, 210.45f, 0.0f, false, true, 59.0f, 25.6f)
                arcToRelative(220.83f, 220.83f, 0.0f, false, false, -26.07f, 21.77f)
                arcTo(177.81f, 177.81f, 0.0f, false, false, 50.81f, 78.0f)
                arcTo(92.59f, 92.59f, 0.0f, false, true, 77.85f, 50.91f)
                close()
                moveTo(46.44f, 85.46f)
                arcToRelative(169.84f, 169.84f, 0.0f, false, true, 58.47f, 18.73f)
                arcToRelative(221.81f, 221.81f, 0.0f, false, false, -20.84f, 25.32f)
                arcToRelative(138.5f, 138.5f, 0.0f, false, false, -47.36f, -12.94f)
                arcTo(91.36f, 91.36f, 0.0f, false, true, 46.44f, 85.46f)
                close()
                moveTo(55.76f, 184.9f)
                arcTo(91.54f, 91.54f, 0.0f, false, true, 36.0f, 128.0f)
                curveToRelative(0.0f, -1.16f, 0.0f, -2.3f, 0.07f, -3.45f)
                arcToRelative(130.5f, 130.5f, 0.0f, false, true, 43.46f, 11.67f)
                arcTo(218.37f, 218.37f, 0.0f, false, false, 55.76f, 184.9f)
                close()
                moveTo(61.88f, 191.9f)
                arcTo(213.32f, 213.32f, 0.0f, false, true, 187.79f, 58.13f)
                arcToRelative(92.71f, 92.71f, 0.0f, false, true, 21.28f, 26.42f)
                arcToRelative(179.87f, 179.87f, 0.0f, false, false, -119.53f, 127.0f)
                arcTo(92.65f, 92.65f, 0.0f, false, true, 61.88f, 191.9f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(91.62f, 91.62f, 0.0f, false, true, -31.0f, -5.37f)
                arcTo(171.82f, 171.82f, 0.0f, false, true, 212.59f, 91.84f)
                arcToRelative(91.29f, 91.29f, 0.0f, false, true, 7.28f, 31.28f)
                arcTo(140.54f, 140.54f, 0.0f, false, false, 128.69f, 220.0f)
                close()
                moveTo(219.92f, 131.55f)
                arcToRelative(92.13f, 92.13f, 0.0f, false, true, -82.81f, 88.0f)
                arcTo(132.58f, 132.58f, 0.0f, false, true, 219.92f, 131.55f)
                close()
            }
        }
        .build()
        return _yarn!!
    }

private var _yarn: ImageVector? = null
