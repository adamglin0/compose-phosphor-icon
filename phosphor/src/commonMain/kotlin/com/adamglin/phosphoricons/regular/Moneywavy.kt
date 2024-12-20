package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.MoneyWavy: ImageVector
    get() {
        if (_moneyWavy != null) {
            return _moneyWavy!!
        }
        _moneyWavy = Builder(name = "MoneyWavy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.24f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.75f, -0.4f)
                curveToRelative(-42.93f, 21.0f, -73.59f, 11.16f, -106.0f, 0.78f)
                curveToRelative(-34.0f, -10.89f, -69.25f, -22.14f, -117.95f, 1.64f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 69.24f)
                lineTo(8.0f, 189.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.51f, 7.19f)
                curveToRelative(42.93f, -21.0f, 73.59f, -11.16f, 106.05f, -0.78f)
                curveToRelative(19.24f, 6.15f, 38.84f, 12.42f, 61.0f, 12.42f)
                curveToRelative(17.09f, 0.0f, 35.73f, -3.72f, 56.91f, -14.06f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.49f, -7.18f)
                lineTo(247.96f, 66.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 244.24f, 60.0f)
                close()
                moveTo(232.0f, 181.67f)
                curveToRelative(-40.6f, 18.17f, -70.25f, 8.69f, -101.56f, -1.32f)
                curveToRelative(-19.24f, -6.15f, -38.84f, -12.42f, -61.0f, -12.42f)
                arcToRelative(122.0f, 122.0f, 0.0f, false, false, -45.4f, 9.0f)
                lineTo(24.04f, 74.33f)
                curveToRelative(40.6f, -18.17f, 70.25f, -8.69f, 101.56f, 1.32f)
                reflectiveCurveTo(189.14f, 96.0f, 232.0f, 79.09f)
                close()
                moveTo(128.0f, 96.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 32.0f, 32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 128.0f, 96.0f)
                close()
                moveTo(128.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 128.0f, 144.0f)
                close()
                moveTo(56.0f, 96.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(40.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                close()
                moveTo(200.0f, 160.0f)
                lineTo(200.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _moneyWavy!!
    }

private var _moneyWavy: ImageVector? = null
