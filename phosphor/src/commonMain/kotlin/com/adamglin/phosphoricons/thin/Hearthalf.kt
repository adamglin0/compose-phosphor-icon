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

public val ThinGroup.Hearthalf: ImageVector
    get() {
        if (_hearthalf != null) {
            return _hearthalf!!
        }
        _hearthalf = Builder(name = "Hearthalf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.74f, 52.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 167.26f, 45.0f)
                curveTo(150.09f, 48.21f, 136.19f, 57.57f, 128.0f, 71.12f)
                curveTo(118.0f, 54.21f, 99.46f, 44.0f, 78.0f, 44.0f)
                arcToRelative(58.07f, 58.07f, 0.0f, false, false, -58.0f, 58.0f)
                curveToRelative(0.0f, 28.59f, 18.0f, 58.47f, 53.4f, 88.79f)
                arcToRelative(333.81f, 333.81f, 0.0f, false, false, 52.7f, 36.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.9f, 0.48f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.89f, -0.49f)
                horizontalLineToRelative(0.0f)
                arcToRelative(328.8f, 328.8f, 0.0f, false, false, 40.54f, -26.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -4.88f, -6.33f)
                arcTo(343.7f, 343.7f, 0.0f, false, true, 132.0f, 217.09f)
                lineTo(132.0f, 80.85f)
                curveTo(138.24f, 66.26f, 151.58f, 56.07f, 168.74f, 52.86f)
                close()
                moveTo(124.0f, 217.08f)
                curveToRelative(-21.73f, -13.0f, -96.0f, -61.16f, -96.0f, -115.08f)
                arcTo(50.06f, 50.06f, 0.0f, false, true, 78.0f, 52.0f)
                curveToRelative(20.83f, 0.0f, 38.39f, 11.0f, 46.0f, 28.8f)
                close()
                moveTo(232.11f, 100.0f)
                lineToRelative(-0.44f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.56f)
                arcToRelative(49.88f, 49.88f, 0.0f, false, false, -21.92f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.44f, -6.65f)
                arcToRelative(57.88f, 57.88f, 0.0f, false, true, 25.43f, 41.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 232.11f, 100.0f)
                close()
                moveTo(226.88f, 137.81f)
                curveToRelative(-5.5f, 11.0f, -13.55f, 22.32f, -23.94f, 33.56f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.88f, -5.43f)
                curveToRelative(9.88f, -10.68f, 17.5f, -21.35f, 22.66f, -31.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.16f, 3.58f)
                close()
            }
        }
        .build()
        return _hearthalf!!
    }

private var _hearthalf: ImageVector? = null
