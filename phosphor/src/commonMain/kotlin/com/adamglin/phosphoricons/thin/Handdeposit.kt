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

public val ThinGroup.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) {
            return _handDeposit!!
        }
        _handDeposit = Builder(name = "HandDeposit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 25.66f)
                lineTo(124.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(116.0f, 25.66f)
                lineTo(90.83f, 50.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineToRelative(32.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineToRelative(32.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, 5.66f)
                close()
                moveTo(188.0f, 125.78f)
                lineTo(188.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(160.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(92.9f)
                lineToRelative(-3.27f, -5.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 135.22f, 208.0f)
                arcToRelative(1.22f, 1.22f, 0.0f, false, false, 0.12f, 0.19f)
                lineToRelative(22.26f, 34.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.69f, -4.38f)
                lineToRelative(-22.2f, -33.9f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 169.86f, 188.0f)
                lineToRelative(0.12f, 0.19f)
                lineToRelative(10.67f, 16.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.35f, -2.19f)
                lineTo(188.0f, 135.47f)
                arcToRelative(78.83f, 78.83f, 0.0f, false, true, 32.0f, 63.18f)
                lineTo(220.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(228.0f, 198.65f)
                arcTo(86.84f, 86.84f, 0.0f, false, false, 188.0f, 125.78f)
                close()
                moveTo(80.0f, 84.0f)
                lineTo(64.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 96.0f)
                lineTo(52.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(60.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(80.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
