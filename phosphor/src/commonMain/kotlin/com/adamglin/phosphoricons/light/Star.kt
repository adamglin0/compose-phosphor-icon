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

public val LightGroup.Star: ImageVector
    get() {
        if (_star != null) {
            return _star!!
        }
        _star = Builder(name = "Star", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.28f, 97.87f)
                arcTo(14.18f, 14.18f, 0.0f, false, false, 224.76f, 88.0f)
                lineToRelative(-60.25f, -4.87f)
                lineToRelative(-23.22f, -56.2f)
                arcToRelative(14.37f, 14.37f, 0.0f, false, false, -26.58f, 0.0f)
                lineTo(91.49f, 83.11f)
                lineTo(31.24f, 88.0f)
                arcToRelative(14.18f, 14.18f, 0.0f, false, false, -12.52f, 9.89f)
                arcTo(14.43f, 14.43f, 0.0f, false, false, 23.0f, 113.32f)
                lineTo(69.0f, 152.93f)
                lineToRelative(-14.0f, 59.25f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, 5.59f, 15.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 15.91f, 0.6f)
                lineTo(128.0f, 196.12f)
                lineToRelative(51.58f, 31.71f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 15.91f, -0.6f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, false, 5.59f, -15.0f)
                lineToRelative(-14.0f, -59.25f)
                lineTo(233.0f, 113.32f)
                arcTo(14.43f, 14.43f, 0.0f, false, false, 237.28f, 97.87f)
                close()
                moveTo(225.14f, 104.24f)
                lineTo(176.45f, 146.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.92f, 5.92f)
                lineToRelative(14.88f, 62.79f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, -0.95f, 2.57f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, true, -2.6f, 0.1f)
                lineTo(131.14f, 184.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.28f, 0.0f)
                lineTo(70.14f, 217.61f)
                arcToRelative(2.24f, 2.24f, 0.0f, false, true, -2.6f, -0.1f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, -1.0f, -2.57f)
                lineToRelative(14.88f, -62.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.92f, -5.92f)
                lineToRelative(-48.69f, -42.0f)
                arcToRelative(2.37f, 2.37f, 0.0f, false, true, -0.73f, -2.65f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 2.07f, -1.65f)
                lineToRelative(63.92f, -5.16f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, -3.69f)
                lineToRelative(24.63f, -59.6f)
                arcToRelative(2.35f, 2.35f, 0.0f, false, true, 4.38f, 0.0f)
                lineToRelative(24.63f, 59.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, 3.69f)
                lineToRelative(63.92f, 5.16f)
                arcToRelative(2.28f, 2.28f, 0.0f, false, true, 2.07f, 1.65f)
                arcTo(2.37f, 2.37f, 0.0f, false, true, 225.14f, 104.24f)
                close()
            }
        }
        .build()
        return _star!!
    }

private var _star: ImageVector? = null
