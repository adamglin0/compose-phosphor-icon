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

public val ThinGroup.Batterychargingvertical: ImageVector
    get() {
        if (_batterychargingvertical != null) {
            return _batterychargingvertical!!
        }
        _batterychargingvertical = Builder(name = "Batterychargingvertical", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.4f, 133.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.18f, 3.89f)
                lineToRelative(-16.0f, 32.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 128.0f, 172.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, true, -1.79f, -0.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.79f, -5.37f)
                lineTo(137.53f, 140.0f)
                lineTo(112.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, -5.79f)
                lineToRelative(16.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.16f, 3.58f)
                lineTo(118.47f, 132.0f)
                lineTo(144.0f, 132.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 147.4f, 133.9f)
                close()
                moveTo(96.0f, 12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(96.0f, 4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(196.0f, 56.0f)
                lineTo(196.0f, 224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(80.0f, 244.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(60.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 196.0f, 56.0f)
                close()
                moveTo(188.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(80.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 56.0f)
                lineTo(68.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _batterychargingvertical!!
    }

private var _batterychargingvertical: ImageVector? = null
