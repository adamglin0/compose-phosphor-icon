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

public val FillGroup.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 172.0f)
                close()
                moveTo(120.0f, 172.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, -52.0f, -52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, true, 120.0f, 172.0f)
                close()
                moveTo(96.0f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 96.0f, 172.0f)
                close()
                moveTo(248.0f, 188.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -71.77f, 4.0f)
                lineTo(144.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(136.0f, 172.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, false, -68.0f, -68.0f)
                lineTo(40.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(48.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(160.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(152.0f, 97.88f)
                lineToRelative(24.0f, 6.5f)
                lineTo(176.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(36.71f)
                lineToRelative(36.39f, 9.86f)
                lineToRelative(0.21f, 0.06f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 240.0f, 134.0f)
                verticalLineToRelative(31.46f)
                arcTo(35.8f, 35.8f, 0.0f, false, true, 248.0f, 188.0f)
                close()
                moveTo(228.0f, 188.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 228.0f, 188.0f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null
