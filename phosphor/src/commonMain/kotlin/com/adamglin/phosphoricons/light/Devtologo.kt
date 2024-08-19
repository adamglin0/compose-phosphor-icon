package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Devtologo: ImageVector
    get() {
        if (_devtologo != null) {
            return _devtologo!!
        }
        _devtologo = Builder(name = "Devtologo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 58.0f)
                lineTo(24.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 10.0f, 72.0f)
                lineTo(10.0f, 184.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(232.0f, 198.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(246.0f, 72.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 232.0f, 58.0f)
                close()
                moveTo(234.0f, 184.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(24.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(22.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(232.0f, 70.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(126.0f, 102.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(126.0f, 134.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(120.0f, 166.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(114.0f, 96.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(213.78f, 97.62f)
                lineTo(195.78f, 161.62f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.56f, 0.0f)
                lineToRelative(-18.0f, -64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 11.56f, -3.24f)
                lineTo(190.0f, 137.84f)
                lineToRelative(12.22f, -43.46f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 11.56f, 3.24f)
                close()
                moveTo(64.0f, 90.0f)
                lineTo(56.0f, 90.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 30.0f, -30.0f)
                lineTo(94.0f, 120.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 64.0f, 90.0f)
                close()
                moveTo(82.0f, 136.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -18.0f, 18.0f)
                lineTo(62.0f, 154.0f)
                lineTo(62.0f, 102.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 18.0f, 18.0f)
                close()
            }
        }
        .build()
        return _devtologo!!
    }

private var _devtologo: ImageVector? = null
