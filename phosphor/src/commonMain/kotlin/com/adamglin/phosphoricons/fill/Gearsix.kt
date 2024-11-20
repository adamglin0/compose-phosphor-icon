package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.GearSix: ImageVector
    get() {
        if (_gearSix != null) {
            return _gearSix!!
        }
        _gearSix = Builder(name = "GearSix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.94f, 107.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.89f, -5.4f)
                lineToRelative(-29.83f, -17.0f)
                lineToRelative(-0.12f, -33.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.83f, -6.08f)
                arcToRelative(111.91f, 111.91f, 0.0f, false, false, -36.72f, -20.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.46f, 0.59f)
                lineTo(128.0f, 41.85f)
                lineTo(97.88f, 25.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -6.47f, -0.6f)
                arcTo(111.92f, 111.92f, 0.0f, false, false, 54.73f, 45.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.83f, 6.07f)
                lineToRelative(-0.15f, 33.65f)
                lineToRelative(-29.83f, 17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.89f, 5.4f)
                arcToRelative(106.47f, 106.47f, 0.0f, false, false, 0.0f, 41.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.89f, 5.4f)
                lineToRelative(29.83f, 17.0f)
                lineToRelative(0.12f, 33.63f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.83f, 6.08f)
                arcToRelative(111.91f, 111.91f, 0.0f, false, false, 36.72f, 20.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.46f, -0.59f)
                lineTo(128.0f, 214.15f)
                lineTo(158.12f, 231.0f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, 3.9f, 1.0f)
                arcToRelative(8.09f, 8.09f, 0.0f, false, false, 2.57f, -0.42f)
                arcToRelative(112.1f, 112.1f, 0.0f, false, false, 36.68f, -20.73f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.83f, -6.07f)
                lineToRelative(0.15f, -33.65f)
                lineToRelative(29.83f, -17.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.89f, -5.4f)
                arcTo(106.47f, 106.47f, 0.0f, false, false, 237.94f, 107.21f)
                close()
                moveTo(128.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 168.0f)
                close()
            }
        }
        .build()
        return _gearSix!!
    }

private var _gearSix: ImageVector? = null
