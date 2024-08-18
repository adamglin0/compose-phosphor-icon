package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Jeep: ImageVector
    get() {
        if (_jeep != null) {
            return _jeep!!
        }
        _jeep = Builder(name = "Jeep", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 88.0f)
                horizontalLineToRelative(-9.53f)
                lineToRelative(-9.29f, -43.35f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 205.53f, 32.0f)
                lineTo(50.47f, 32.0f)
                arcTo(16.08f, 16.08f, 0.0f, false, false, 34.82f, 44.65f)
                lineTo(25.53f, 88.0f)
                lineTo(16.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(64.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(80.0f, 176.0f)
                horizontalLineToRelative(96.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(232.0f, 104.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(50.47f, 48.0f)
                lineTo(205.53f, 48.0f)
                lineToRelative(8.57f, 40.0f)
                lineTo(41.9f, 88.0f)
                close()
                moveTo(64.0f, 200.0f)
                lineTo(40.0f, 200.0f)
                lineTo(40.0f, 176.0f)
                lineTo(64.0f, 176.0f)
                close()
                moveTo(192.0f, 200.0f)
                lineTo(192.0f, 176.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                close()
                moveTo(216.0f, 160.0f)
                lineTo(152.0f, 160.0f)
                lineTo(152.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                lineTo(120.0f, 160.0f)
                lineTo(120.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(32.0f)
                lineTo(40.0f, 160.0f)
                lineTo(40.0f, 104.0f)
                lineTo(216.0f, 104.0f)
                close()
                moveTo(56.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 132.0f)
                close()
                moveTo(176.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 132.0f)
                close()
            }
        }
        .build()
        return _jeep!!
    }

private var _jeep: ImageVector? = null
