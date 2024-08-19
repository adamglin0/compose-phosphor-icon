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

public val ThinGroup.Cherries: ImageVector
    get() {
        if (_cherries != null) {
            return _cherries!!
        }
        _cherries = Builder(name = "Cherries", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 76.0f)
                arcToRelative(67.05f, 67.05f, 0.0f, false, false, -9.94f, 0.74f)
                arcToRelative(88.12f, 88.12f, 0.0f, false, false, -21.95f, -26.3f)
                curveTo(107.61f, 21.0f, 57.55f, 27.74f, 55.43f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.65f, 7.29f)
                curveTo(73.74f, 48.64f, 82.0f, 71.09f, 85.0f, 92.08f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, 56.12f, 110.29f)
                arcTo(68.0f, 68.0f, 0.0f, true, false, 176.0f, 76.0f)
                close()
                moveTo(66.62f, 35.27f)
                curveToRelative(16.0f, -0.4f, 48.0f, 1.66f, 72.47f, 21.39f)
                arcToRelative(79.89f, 79.89f, 0.0f, false, true, 18.75f, 21.82f)
                arcToRelative(68.29f, 68.29f, 0.0f, false, false, -35.0f, 23.14f)
                arcToRelative(67.44f, 67.44f, 0.0f, false, false, -29.66f, -9.4f)
                curveTo(89.88f, 67.78f, 80.83f, 48.37f, 66.62f, 35.27f)
                close()
                moveTo(88.0f, 220.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -2.09f, -119.95f)
                arcToRelative(177.82f, 177.82f, 0.0f, false, true, -1.28f, 39.8f)
                curveToRelative(-11.7f, -0.93f, -17.56f, -6.44f, -17.8f, -6.68f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                curveToRelative(0.38f, 0.37f, 9.37f, 9.17f, 26.83f, 9.17f)
                reflectiveCurveToRelative(26.45f, -8.8f, 26.83f, -9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.64f, -5.68f)
                curveToRelative(-0.25f, 0.25f, -5.65f, 5.35f, -16.43f, 6.58f)
                arcTo(183.7f, 183.7f, 0.0f, false, false, 94.0f, 100.3f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 88.0f, 220.0f)
                close()
                moveTo(176.0f, 204.0f)
                arcToRelative(59.75f, 59.75f, 0.0f, false, true, -30.24f, -8.17f)
                arcToRelative(67.86f, 67.86f, 0.0f, false, false, -16.31f, -89.68f)
                arcToRelative(60.25f, 60.25f, 0.0f, false, true, 32.22f, -20.4f)
                curveToRelative(5.17f, 11.0f, 8.49f, 23.68f, 9.93f, 38.0f)
                curveToRelative(-11.0f, -1.16f, -16.53f, -6.36f, -16.77f, -6.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                curveToRelative(0.38f, 0.37f, 9.37f, 9.17f, 26.83f, 9.17f)
                reflectiveCurveToRelative(26.45f, -8.8f, 26.83f, -9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.64f, -5.68f)
                curveToRelative(-0.26f, 0.25f, -6.0f, 5.68f, -17.55f, 6.68f)
                quadToRelative(-2.1f, -22.14f, -9.81f, -39.49f)
                arcTo(60.0f, 60.0f, 0.0f, true, true, 176.0f, 204.0f)
                close()
            }
        }
        .build()
        return _cherries!!
    }

private var _cherries: ImageVector? = null
