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

public val RegularGroup.Tractor: ImageVector
    get() {
        if (_tractor != null) {
            return _tractor!!
        }
        _tractor = Builder(name = "Tractor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 165.41f)
                lineTo(240.0f, 134.0f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, false, -11.4f, -15.32f)
                lineToRelative(-0.21f, -0.06f)
                lineTo(192.0f, 108.71f)
                lineTo(192.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(32.38f)
                lineToRelative(-24.0f, -6.5f)
                lineTo(152.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(48.0f, 88.0f)
                lineTo(40.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(68.0f, 104.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, 68.0f, 68.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(32.23f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 240.0f, 165.41f)
                close()
                moveTo(68.0f, 88.0f)
                lineTo(64.0f, 88.0f)
                lineTo(64.0f, 56.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(66.77f)
                arcTo(83.92f, 83.92f, 0.0f, false, false, 68.0f, 88.0f)
                close()
                moveTo(152.0f, 114.45f)
                lineTo(224.0f, 134.0f)
                verticalLineToRelative(20.1f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 178.06f, 176.0f)
                lineTo(152.0f, 176.0f)
                close()
                moveTo(212.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 212.0f, 208.0f)
                close()
                moveTo(68.0f, 120.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, 52.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 68.0f, 120.0f)
                close()
                moveTo(68.0f, 208.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 68.0f, 208.0f)
                close()
                moveTo(80.0f, 172.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 80.0f, 172.0f)
                close()
            }
        }
        .build()
        return _tractor!!
    }

private var _tractor: ImageVector? = null
