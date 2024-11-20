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

public val RegularGroup.Park: ImageVector
    get() {
        if (_park != null) {
            return _park!!
        }
        _park = Builder(name = "Park", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 192.0f)
                lineTo(200.0f, 192.0f)
                lineTo(200.0f, 168.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.76f, -9.94f)
                lineToRelative(-32.0f, -128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, 0.0f)
                lineToRelative(-32.0f, 128.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 168.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(24.0f)
                lineTo(120.0f, 192.0f)
                lineTo(120.0f, 176.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(120.0f, 144.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(40.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(16.0f)
                lineTo(40.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(16.0f)
                lineTo(24.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(232.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(192.0f, 65.0f)
                lineToRelative(21.75f, 87.0f)
                horizontalLineToRelative(-43.5f)
                close()
                moveTo(64.0f, 144.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(16.0f)
                lineTo(64.0f, 160.0f)
                close()
                moveTo(64.0f, 176.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(16.0f)
                lineTo(64.0f, 192.0f)
                close()
                moveTo(116.0f, 96.0f)
                arcTo(28.0f, 28.0f, 0.0f, true, false, 88.0f, 68.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 116.0f, 96.0f)
                close()
                moveTo(116.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 56.0f)
                close()
            }
        }
        .build()
        return _park!!
    }

private var _park: ImageVector? = null
