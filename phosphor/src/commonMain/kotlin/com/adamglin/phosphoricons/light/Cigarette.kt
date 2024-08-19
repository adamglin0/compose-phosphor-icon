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

public val LightGroup.Cigarette: ImageVector
    get() {
        if (_cigarette != null) {
            return _cigarette!!
        }
        _cigarette = Builder(name = "Cigarette", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 130.0f)
                lineTo(32.0f, 130.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(224.0f, 190.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(238.0f, 144.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 224.0f, 130.0f)
                close()
                moveTo(30.0f, 176.0f)
                lineTo(30.0f, 144.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(82.0f, 142.0f)
                verticalLineToRelative(36.0f)
                lineTo(32.0f, 178.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 176.0f)
                close()
                moveTo(226.0f, 176.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(94.0f, 178.0f)
                lineTo(94.0f, 142.0f)
                lineTo(224.0f, 142.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(202.77f, 61.06f)
                curveToRelative(7.81f, -13.88f, 7.91f, -21.91f, 6.62f, -26.2f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -3.93f, -5.42f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 208.0f, 18.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, true, 2.44f, 0.52f)
                arcToRelative(20.42f, 20.42f, 0.0f, false, true, 10.23f, 12.24f)
                curveToRelative(3.18f, 9.58f, 0.68f, 21.75f, -7.44f, 36.18f)
                curveToRelative(-7.81f, 13.88f, -7.91f, 21.91f, -6.62f, 26.2f)
                arcToRelative(8.94f, 8.94f, 0.0f, false, false, 3.88f, 5.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 208.0f, 110.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, true, -2.44f, -0.52f)
                arcToRelative(20.42f, 20.42f, 0.0f, false, true, -10.23f, -12.24f)
                curveTo(192.15f, 87.66f, 194.65f, 75.49f, 202.77f, 61.06f)
                close()
                moveTo(162.77f, 61.06f)
                curveToRelative(7.81f, -13.88f, 7.91f, -21.91f, 6.62f, -26.2f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, -3.93f, -5.42f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 168.0f, 18.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, true, 2.44f, 0.52f)
                arcToRelative(20.42f, 20.42f, 0.0f, false, true, 10.23f, 12.24f)
                curveToRelative(3.18f, 9.58f, 0.68f, 21.75f, -7.44f, 36.18f)
                curveToRelative(-7.81f, 13.88f, -7.91f, 21.91f, -6.62f, 26.2f)
                arcToRelative(8.94f, 8.94f, 0.0f, false, false, 3.88f, 5.4f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 168.0f, 110.0f)
                arcToRelative(5.87f, 5.87f, 0.0f, false, true, -2.44f, -0.52f)
                arcToRelative(20.42f, 20.42f, 0.0f, false, true, -10.23f, -12.24f)
                curveTo(152.15f, 87.66f, 154.65f, 75.49f, 162.77f, 61.06f)
                close()
            }
        }
        .build()
        return _cigarette!!
    }

private var _cigarette: ImageVector? = null
