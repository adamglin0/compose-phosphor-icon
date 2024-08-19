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

public val ThinGroup.Devtologo: ImageVector
    get() {
        if (_devtologo != null) {
            return _devtologo!!
        }
        _devtologo = Builder(name = "Devtologo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 60.0f)
                lineTo(24.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 12.0f, 72.0f)
                lineTo(12.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(232.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 60.0f)
                close()
                moveTo(236.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(24.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(20.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(232.0f, 68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(124.0f, 100.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(124.0f, 132.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(120.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(116.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(211.85f, 97.08f)
                lineTo(193.85f, 161.08f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.7f, 0.0f)
                lineToRelative(-18.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.7f, -2.16f)
                lineTo(190.0f, 145.23f)
                lineToRelative(14.15f, -50.31f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.7f, 2.16f)
                close()
                moveTo(64.0f, 92.0f)
                lineTo(56.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(92.0f, 120.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 64.0f, 92.0f)
                close()
                moveTo(84.0f, 136.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(60.0f, 156.0f)
                lineTo(60.0f, 100.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _devtologo!!
    }

private var _devtologo: ImageVector? = null
