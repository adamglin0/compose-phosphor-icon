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

public val ThinGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 52.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, -16.0f, 6.13f)
                lineTo(172.0f, 44.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -47.93f, -1.8f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 84.0f, 60.0f)
                verticalLineToRelative(78.0f)
                lineTo(72.75f, 119.94f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -41.62f, 23.92f)
                curveTo(64.44f, 214.12f, 82.17f, 236.0f, 128.0f, 236.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, 84.0f, -84.0f)
                lineTo(212.0f, 76.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 188.0f, 52.0f)
                close()
                moveTo(204.0f, 152.0f)
                arcToRelative(76.09f, 76.09f, 0.0f, false, true, -76.0f, 76.0f)
                curveToRelative(-37.29f, 0.0f, -53.59f, -11.51f, -89.71f, -87.71f)
                lineToRelative(-0.15f, -0.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, -16.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.07f, 0.12f)
                lineToRelative(18.68f, 30.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 92.0f, 152.0f)
                lineTo(92.0f, 60.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.0f, 44.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(172.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
