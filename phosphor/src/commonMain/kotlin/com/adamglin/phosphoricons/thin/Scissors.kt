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

public val ThinGroup.Scissors: ImageVector
    get() {
        if (_scissors != null) {
            return _scissors!!
        }
        _scissors = Builder(name = "Scissors", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.0f, 110.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.05f, -5.56f)
                lineTo(229.74f, 59.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.52f, 6.61f)
                lineToRelative(-67.67f, 46.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.56f, -1.0f)
                close()
                moveTo(235.3f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.56f, 1.0f)
                lineTo(136.0f, 132.85f)
                lineTo(88.47f, 165.38f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -5.84f, -8.0f)
                curveToRelative(0.45f, 0.45f, 0.89f, 0.92f, 1.31f, 1.4f)
                lineToRelative(45.0f, -30.78f)
                lineToRelative(-45.0f, -30.78f)
                curveToRelative(-0.42f, 0.48f, -0.86f, 1.0f, -1.31f, 1.4f)
                arcToRelative(31.86f, 31.86f, 0.0f, true, true, 5.84f, -8.0f)
                lineToRelative(49.69f, 34.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(96.09f, 65.76f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 235.3f, 196.0f)
                close()
                moveTo(77.0f, 93.0f)
                arcToRelative(24.42f, 24.42f, 0.0f, false, false, 2.82f, -3.38f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 77.0f, 93.0f)
                close()
                moveTo(84.0f, 180.0f)
                arcToRelative(23.75f, 23.75f, 0.0f, false, false, -4.15f, -13.49f)
                lineToRelative(0.0f, -0.06f)
                lineToRelative(0.0f, 0.0f)
                arcTo(24.5f, 24.5f, 0.0f, false, false, 77.0f, 163.0f)
                arcTo(24.0f, 24.0f, 0.0f, true, false, 77.0f, 197.0f)
                horizontalLineToRelative(0.0f)
                arcTo(23.85f, 23.85f, 0.0f, false, false, 84.0f, 180.0f)
                close()
            }
        }
        .build()
        return _scissors!!
    }

private var _scissors: ImageVector? = null
