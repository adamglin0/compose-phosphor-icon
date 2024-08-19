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

public val BoldGroup.Devtologo: ImageVector
    get() {
        if (_devtologo != null) {
            return _devtologo!!
        }
        _devtologo = Builder(name = "Devtologo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 52.0f)
                lineTo(24.0f, 52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 4.0f, 72.0f)
                lineTo(4.0f, 184.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(232.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(252.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 232.0f, 52.0f)
                close()
                moveTo(228.0f, 180.0f)
                lineTo(28.0f, 180.0f)
                lineTo(28.0f, 76.0f)
                lineTo(228.0f, 76.0f)
                close()
                moveTo(108.0f, 156.0f)
                lineTo(108.0f, 100.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(120.0f, 168.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 108.0f, 156.0f)
                close()
                moveTo(160.46f, 103.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 23.08f, -6.6f)
                lineTo(188.0f, 112.32f)
                lineToRelative(4.46f, -15.62f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.08f, 6.6f)
                lineToRelative(-16.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -23.08f, 0.0f)
                close()
                moveTo(52.0f, 168.0f)
                lineTo(64.0f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                verticalLineToRelative(-8.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 64.0f, 88.0f)
                lineTo(52.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 168.0f)
                close()
                moveTo(64.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _devtologo!!
    }

private var _devtologo: ImageVector? = null
