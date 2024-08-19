package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Park: ImageVector
    get() {
        if (_park != null) {
            return _park!!
        }
        _park = Builder(name = "Park", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 188.0f)
                lineTo(204.0f, 188.0f)
                lineTo(204.0f, 172.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.64f, -14.91f)
                lineToRelative(-32.0f, -128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.28f, 0.0f)
                lineToRelative(-32.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 172.0f)
                horizontalLineToRelative(20.0f)
                verticalLineToRelative(16.0f)
                lineTo(116.0f, 188.0f)
                lineTo(116.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(116.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(32.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                verticalLineToRelative(12.0f)
                lineTo(24.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(232.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(192.0f, 81.48f)
                lineTo(208.63f, 148.0f)
                lineTo(175.37f, 148.0f)
                close()
                moveTo(56.0f, 140.0f)
                lineTo(92.0f, 140.0f)
                verticalLineToRelative(12.0f)
                lineTo(56.0f, 152.0f)
                close()
                moveTo(56.0f, 176.0f)
                lineTo(92.0f, 176.0f)
                verticalLineToRelative(12.0f)
                lineTo(56.0f, 188.0f)
                close()
                moveTo(116.0f, 100.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 84.0f, 68.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 116.0f, 100.0f)
                close()
                moveTo(116.0f, 60.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 116.0f, 60.0f)
                close()
            }
        }
        .build()
        return _park!!
    }

private var _park: ImageVector? = null
