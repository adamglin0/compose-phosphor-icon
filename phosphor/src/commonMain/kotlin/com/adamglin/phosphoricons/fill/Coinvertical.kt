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

public val FillGroup.CoinVertical: ImageVector
    get() {
        if (_coinVertical != null) {
            return _coinVertical!!
        }
        _coinVertical = Builder(name = "CoinVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(198.51f, 56.09f)
                curveTo(186.44f, 35.4f, 169.92f, 24.0f, 152.0f, 24.0f)
                lineTo(104.0f, 24.0f)
                curveTo(86.08f, 24.0f, 69.56f, 35.4f, 57.49f, 56.09f)
                curveTo(46.21f, 75.42f, 40.0f, 101.0f, 40.0f, 128.0f)
                reflectiveCurveToRelative(6.21f, 52.58f, 17.49f, 71.91f)
                curveTo(69.56f, 220.6f, 86.08f, 232.0f, 104.0f, 232.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(17.92f, 0.0f, 34.44f, -11.4f, 46.51f, -32.09f)
                curveTo(209.79f, 180.58f, 216.0f, 155.0f, 216.0f, 128.0f)
                reflectiveCurveTo(209.79f, 75.42f, 198.51f, 56.09f)
                close()
                moveTo(199.79f, 120.0f)
                horizontalLineToRelative(-32.0f)
                arcToRelative(152.78f, 152.78f, 0.0f, false, false, -9.68f, -48.0f)
                lineTo(188.7f, 72.0f)
                curveTo(194.82f, 85.38f, 198.86f, 102.0f, 199.79f, 120.0f)
                close()
                moveTo(179.19f, 56.0f)
                lineTo(150.46f, 56.0f)
                arcToRelative(83.13f, 83.13f, 0.0f, false, false, -12.0f, -16.0f)
                lineTo(152.0f, 40.0f)
                curveTo(162.0f, 40.0f, 171.4f, 46.0f, 179.19f, 56.0f)
                close()
                moveTo(152.0f, 216.0f)
                lineTo(138.49f, 216.0f)
                arcToRelative(83.13f, 83.13f, 0.0f, false, false, 12.0f, -16.0f)
                horizontalLineToRelative(28.73f)
                curveTo(171.4f, 210.0f, 162.0f, 216.0f, 152.0f, 216.0f)
                close()
                moveTo(188.7f, 184.0f)
                lineTo(158.12f, 184.0f)
                arcToRelative(152.78f, 152.78f, 0.0f, false, false, 9.68f, -48.0f)
                horizontalLineToRelative(32.0f)
                curveTo(198.86f, 154.0f, 194.82f, 170.62f, 188.7f, 184.0f)
                close()
            }
        }
        .build()
        return _coinVertical!!
    }

private var _coinVertical: ImageVector? = null
