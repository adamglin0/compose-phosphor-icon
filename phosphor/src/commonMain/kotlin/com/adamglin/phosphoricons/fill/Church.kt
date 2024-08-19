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

public val FillGroup.Church: ImageVector
    get() {
        if (_church != null) {
            return _church!!
        }
        _church = Builder(name = "Church", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.12f, 145.14f)
                lineTo(192.0f, 123.47f)
                lineTo(192.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, -7.0f)
                lineTo(136.0f, 67.36f)
                lineTo(136.0f, 48.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(136.0f, 32.0f)
                lineTo(136.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 32.0f)
                lineTo(104.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(120.0f, 67.36f)
                lineTo(68.0f, 97.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.0f, 7.0f)
                verticalLineToRelative(19.47f)
                lineTo(27.88f, 145.14f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 152.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(112.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(232.0f, 152.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 228.12f, 145.14f)
                close()
                moveTo(64.0f, 208.0f)
                lineTo(40.0f, 208.0f)
                lineTo(40.0f, 156.53f)
                lineToRelative(24.0f, -14.4f)
                close()
                moveTo(216.0f, 208.0f)
                lineTo(192.0f, 208.0f)
                lineTo(192.0f, 142.13f)
                lineToRelative(24.0f, 14.4f)
                close()
            }
        }
        .build()
        return _church!!
    }

private var _church: ImageVector? = null
