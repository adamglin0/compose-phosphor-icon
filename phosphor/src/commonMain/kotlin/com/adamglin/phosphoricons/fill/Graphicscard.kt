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

public val FillGroup.GraphicsCard: ImageVector
    get() {
        if (_graphicsCard != null) {
            return _graphicsCard!!
        }
        _graphicsCard = Builder(name = "GraphicsCard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 48.0f)
                lineTo(16.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(8.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(24.0f, 192.0f)
                lineTo(40.0f, 192.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 192.0f)
                lineTo(72.0f, 192.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(88.0f, 192.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(120.0f, 192.0f)
                lineTo(232.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(248.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 48.0f)
                close()
                moveTo(212.0f, 120.0f)
                arcToRelative(35.81f, 35.81f, 0.0f, false, true, -5.53f, 19.16f)
                lineTo(156.84f, 89.53f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 212.0f, 120.0f)
                close()
                moveTo(116.0f, 120.0f)
                arcToRelative(35.81f, 35.81f, 0.0f, false, true, -5.53f, 19.16f)
                lineTo(60.84f, 89.53f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 116.0f, 120.0f)
                close()
                moveTo(80.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -30.47f, -55.16f)
                lineToRelative(49.63f, 49.63f)
                arcTo(35.81f, 35.81f, 0.0f, false, true, 80.0f, 156.0f)
                close()
                moveTo(140.0f, 120.0f)
                arcToRelative(35.81f, 35.81f, 0.0f, false, true, 5.53f, -19.16f)
                lineToRelative(49.63f, 49.63f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 140.0f, 120.0f)
                close()
            }
        }
        .build()
        return _graphicsCard!!
    }

private var _graphicsCard: ImageVector? = null
