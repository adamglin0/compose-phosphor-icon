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

public val ThinGroup.GasCan: ImageVector
    get() {
        if (_gasCan != null) {
            return _gasCan!!
        }
        _gasCan = Builder(name = "GasCan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 28.0f)
                lineTo(123.31f, 28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -8.48f, 3.51f)
                lineTo(101.66f, 44.69f)
                lineTo(88.49f, 31.51f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(60.69f, 85.66f)
                lineTo(47.52f, 98.83f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 44.0f, 107.31f)
                lineTo(44.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(53.17f, 66.83f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, 0.0f)
                lineTo(96.0f, 50.34f)
                lineTo(66.34f, 80.0f)
                close()
                moveTo(204.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(56.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(52.0f, 107.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.17f, -2.82f)
                lineToRelative(16.0f, -16.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(35.31f, -35.31f)
                horizontalLineToRelative(0.0f)
                lineToRelative(16.0f, -16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 123.31f, 36.0f)
                lineTo(200.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(180.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(136.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(40.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 64.0f)
                close()
                moveTo(178.4f, 123.2f)
                lineTo(134.67f, 156.0f)
                lineToRelative(43.73f, 32.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.8f, 6.4f)
                lineTo(128.0f, 161.0f)
                lineTo(82.4f, 195.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.8f, -6.4f)
                lineTo(121.33f, 156.0f)
                lineTo(77.6f, 123.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.8f, -6.4f)
                lineTo(128.0f, 151.0f)
                lineToRelative(45.6f, -34.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.8f, 6.4f)
                close()
            }
        }
        .build()
        return _gasCan!!
    }

private var _gasCan: ImageVector? = null
